package capstone.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.FrameLayout.LayoutParams;

public class CameraActivity extends Activity {
	
	private static final String TAG             = "Capstone::Main";
	
	/* CameraActivity Variables */
	private Camera 			mCamera;
	private Preview 		mPreview;
	private Overlay 		mOverlay;
	private TouchView 		mView;
	private Button 			buttonProc, buttonBinImage, buttonReset;
	private TextView 		textAns;
	
	private Rect 			rec	= new Rect();
	private int 			mScreenHeight;
	private int 			mScreenWidth;
		
	// Random
	private boolean binaryImage;
	private int 	mode;
	
	private static final String path = Environment.getExternalStorageDirectory() + "/transOpticPrototype/";
	private String lang = "eng";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Hide the window title.
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
		//getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().setFormat(PixelFormat.UNKNOWN);
		setContentView(R.layout.main);
		
		// Create an instance of Camera
        mCamera = getCameraInstance();
        Camera.Parameters mParameters = mCamera.getParameters();
        mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_AUTO);
        //mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_ON);
        mCamera.setParameters(mParameters);
        
        // Create our Preview view and set it as the content of our activity.
        mPreview = new Preview(this, mCamera);
        FrameLayout preview = (FrameLayout) findViewById(R.id.preview);
        preview.addView(mPreview);
        
        // Create our touchview
        // Setting up the bounding box
		// get the window width and height to display buttons
		// according to device screen size
		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		mScreenHeight = displaymetrics.heightPixels;
		mScreenWidth = displaymetrics.widthPixels;
		mView = new TouchView(this);
		FrameLayout touchview = (FrameLayout) findViewById(R.id.touchview);
		touchview.addView(mView);
		
		Drawable mButtonDrawable = this.getResources().
		getDrawable(R.id.buttonBinaryImage);
		LayoutParams lp = new LayoutParams(preview.getLayoutParams());
		lp.setMargins((int)((double)mScreenWidth*.85),
				(int)((double)mScreenHeight*.70) ,
				(int)((double)mScreenWidth*.85)+mButtonDrawable.
				getMinimumWidth(), 
				(int)((double)mScreenHeight*.70)+mButtonDrawable.
				getMinimumHeight());
		preview.setLayoutParams(lp);
		
		// rec is used for onInterceptTouchEvent. I pass this from the
		// highest to lowest layer so that when this area of the screen
		// is pressed, it ignores the TouchView events and passes it to
		// this activity so that the button can be pressed.
		rec.set((int)((double)mScreenWidth*.85),
				(int)((double)mScreenHeight*.10) ,
				(int)((double)mScreenWidth*.85)+mButtonDrawable.getMinimumWidth(), 
				(int)((double)mScreenHeight*.70)+mButtonDrawable.getMinimumHeight());
		mButtonDrawable = null;
		mView.setRec(rec);
        
        // Create our Overlay
        mOverlay = new Overlay(this);
        preview.addView(mOverlay);
        mPreview.setOverlay(mOverlay);
        
        // Setting buttons
		buttonProc = (Button) findViewById(R.id.buttonProc);
		buttonBinImage = (Button) findViewById(R.id.buttonBinaryImage);
		buttonReset = (Button) findViewById(R.id.buttonReset);
		buttonProc.setOnClickListener(snapAndProcess());
		buttonBinImage.setOnClickListener(switchBinaryImage());
		buttonReset.setOnClickListener(reset());
		
		// Setting textview
		textAns = (TextView) findViewById(R.id.answer);
		
		// Setup for OCR
		setup();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	/*
    	Toast t = null;
    	switch (item.getItemId()) {
        case R.id.SimpleCorr:     
        	t = Toast.makeText(this, "Using a simple correlation", Toast.LENGTH_SHORT);
        	mode = 0;
            break;
        case R.id.CorrFilter:     
        	t = Toast.makeText(this, "Using correlation filter", Toast.LENGTH_SHORT);
        	mode = 2;
            break;
        case R.id.SVM: 
        	t = Toast.makeText(this, "Using an SVM", Toast.LENGTH_SHORT); // NEED TO MAKE THIS
        	mode = 3;
            break;
        default: return true;
        
    	}
    	t.setGravity(Gravity.TOP, 0, 0);
		t.show();
		*/
    	return true;
    }
    
    public static Camera getCameraInstance() {
    	Camera c = null;
    	try {
    		c = Camera.open();
    	}
    	catch (Exception e) {
    		
    	}
    	return c;
    }
    
    public void showBitmap(Bitmap b) {
    	mOverlay.setBitmap(b);
    	mOverlay.invalidate();
    }
    
    /*
     * Call-backs as necessary
     */
    private ShutterCallback getShutterCB() {
    	return new ShutterCallback() {
			@Override
			public void onShutter() {
				Toast t = Toast.makeText(CameraActivity.this, "SNAP!...Analyzing", Toast.LENGTH_LONG);
				t.setGravity(Gravity.TOP, 0, 0);
				t.show();
			}
    	};
    }
    
    private PictureCallback getPictCBjpg() {
    	return new PictureCallback() {
			@Override
			public void onPictureTaken(byte[] data, Camera c) {
				if (data == null) return;
				Processing p = new Processing(mHandler, mode, binaryImage, mPreview.getWidth(), mPreview.getHeight(), data);
				new Thread(p).start();
			}
    	};
    }
    
    private PictureCallback getRawCB() {
    	return new PictureCallback() {
			@Override
			public void onPictureTaken(byte[] data, Camera c) {
				// do nothing
			}
    	};
    }

	private Button.OnClickListener snapAndProcess() {
		return new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				mCamera.autoFocus(new AutoFocusCallback() {
					@Override
					public void onAutoFocus(boolean success, Camera camera) {
						mCamera.takePicture(getShutterCB(), getRawCB(), getPictCBjpg());
					}
				});
			}
		};
	}
	
	private Button.OnClickListener autoFocusAndFlash() {
		return new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonProc.setEnabled(false);
				mCamera.autoFocus(new AutoFocusCallback() {
					@Override
					public void onAutoFocus(boolean arg0, Camera arg1) {
						buttonProc.setEnabled(true);
					}
				});
			}
		};
	}
	
	private Button.OnClickListener switchBinaryImage() {
		return new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonProc.setEnabled(false);
				Toast t;
				if (!binaryImage) {
					buttonBinImage.setText("Normal Image");
					t = Toast.makeText(CameraActivity.this, "Displaying Binary Image now", Toast.LENGTH_SHORT);
				}
				else {
					buttonBinImage.setText("Binary Image");
					t = Toast.makeText(CameraActivity.this, "Displaying Normal Image now", Toast.LENGTH_SHORT);
				}
				binaryImage = !binaryImage;
				buttonProc.setEnabled(true);
				t.setGravity(Gravity.TOP, 0, 0);
				t.show();
			}
		};
	}
	
	private Button.OnClickListener reset() {
		return new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				showBitmap(null);
				textAns.setText("");
				Toast t = Toast.makeText(CameraActivity.this, "RESET!", Toast.LENGTH_SHORT);
				t.setGravity(Gravity.TOP, 0, 0);
				t.show();
			}
		};
	}
	
	public void toasts(int data) {
		Toast.makeText(this, "Native code returned: " + data, Toast.LENGTH_LONG).show();
	}
	
	Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			
			switch (msg.arg1) {
				case 0:
					String ans = (String) msg.obj;
					textAns.setText(ans);
					break;
				case 1:
					Bitmap b = (Bitmap) msg.obj;
					showBitmap(b);
					break;
				default:
			}
		}
	};
	
	/**
	 * setup sets up the required data for the Tesseract OCR engine
	 */
	private void setup() {
		String[] paths = new String[] { path, path + "tessdata/" };
		for (String path : paths) {
			File dir = new File(path);
			if (!dir.exists()) {
				if (!dir.mkdirs()) {
					Log.i(TAG, "ERROR: Creating dir " + path + " on sdcard failed");
					return;
				} else {
					Log.i(TAG, "Created directory " + path + " on sdcard");
				}
			}
		}
		
		if (!(new File(path + "tessdata/" + lang + ".traineddata")).exists()) {
			Log.i(TAG, path + "tessdata/" + lang + ".traineddata does not exist!");
			try {

				AssetManager assetManager = getAssets();
				InputStream in = assetManager.open("tessdata/eng.traineddata");
				//GZIPInputStream gin = new GZIPInputStream(in);
				OutputStream out = new FileOutputStream(path
						+ "tessdata/eng.traineddata");

				// Transfer bytes from in to out
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				in.close();
				out.close();

				Log.i(TAG, "Copied " + lang + " traineddata");
			} catch (IOException e) {
				Log.i(TAG, "Was unable to copy " + lang + " traineddata " + e.toString());
			}
		}
	}
}