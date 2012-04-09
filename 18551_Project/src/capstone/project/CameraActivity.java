package capstone.project;

import org.opencv.android.Utils;
import org.opencv.core.Mat;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class CameraActivity extends Activity {
	
	/* CameraActivity Variables */
	private Camera 			mCamera;
	private Preview 		mPreview;
	private Overlay 		mOverlay;
	private Button 			buttonProc, buttonBinImage, buttonReset;
		
	// Random
	private boolean binaryImage;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Hide the window title.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
    
    /*
     * Call-backs as necessary
     */
    private ShutterCallback getShutterCB() {
    	return new ShutterCallback() {
			@Override
			public void onShutter() {
				Toast.makeText(CameraActivity.this, "SNAP!...Analyzing", Toast.LENGTH_SHORT).show();
			}
    	};
    }
    
    private PictureCallback getPictCBjpg() {
    	return new PictureCallback() {
			@Override
			public void onPictureTaken(byte[] data, Camera c) {
				if (data == null) return;
				Processing p = new Processing(binaryImage, mPreview.getWidth(), mPreview.getHeight(), data);
				Bitmap temp = p.process();
				mOverlay.setBitmap(temp);
				mOverlay.invalidate();
				Toast.makeText(CameraActivity.this, "Done...Took " + p.getProcTime()/1000 + "s !", Toast.LENGTH_LONG).show();
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
				if (!binaryImage) buttonBinImage.setText("Normal Image");
				else buttonBinImage.setText("Binary Image");
				binaryImage = !binaryImage;
				buttonProc.setEnabled(true);
			}
		};
	}
	
	private Button.OnClickListener reset() {
		return new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				mOverlay.setBitmap(null);
				mOverlay.invalidate();
				Toast.makeText(CameraActivity.this, "RESET!", Toast.LENGTH_SHORT).show();
			}
		};
	}
	
	public void toasts(int data) {
		Toast.makeText(this, "Native code returned: " + data, Toast.LENGTH_LONG).show();
	}
}