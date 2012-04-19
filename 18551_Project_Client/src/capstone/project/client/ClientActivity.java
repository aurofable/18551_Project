package capstone.project.client;

import java.io.ByteArrayOutputStream;
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ClientActivity extends Activity {

	/* CameraActivity Variables */
	private Overlay 		overlay;
	private Button 			buttonStart, buttonReset;
	private TextView		ansView;
	
	int CAMERA_PIC_REQUEST = 1234;
	String path = Environment.getExternalStorageDirectory() + "/send.jpg";
	
	
	Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			
			switch (msg.arg1) {
			case 0:
				String s = (String) msg.obj;
				if (s != null) ansView.setText(s);
				break;
			case 1:
				Bitmap b = (Bitmap) msg.obj;
				showBitmap(b);
				break;
				
			}
		}
	};
	
	public void showBitmap(Bitmap b) {
    	overlay.setBitmap(b);
    	overlay.invalidate();
    }

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Create our Overlay
        overlay = new Overlay(this);
        FrameLayout overlayView = (FrameLayout) findViewById(R.id.overlay);
        overlayView.addView(overlay);
        
        // Creating our answer view
        ansView = (TextView) findViewById(R.id.answer);

		buttonStart = (Button) findViewById(R.id.takePicture);
		buttonStart.setOnClickListener(buttonSendOnClickListener);
		buttonReset = (Button) findViewById(R.id.reset);
		buttonReset.setOnClickListener(buttonResetOnClickListener);
	}

	Button.OnClickListener buttonSendOnClickListener = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			overlay.cleanBitmap();
			File file = new File(path);
			Uri outputFileUri = Uri.fromFile(file);
			Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
			startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
		}
	};
	
	Button.OnClickListener buttonResetOnClickListener = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			overlay.cleanBitmap(); // not clearing bitmap?
			ansView.setText("");
		}
	};
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == CAMERA_PIC_REQUEST) {
	    	
	    	BitmapFactory.Options opt = new BitmapFactory.Options();
	    	opt.inSampleSize = 2; // reduce size?
	    	Bitmap bitmap = BitmapFactory.decodeFile(path, opt);
	    	showBitmap(bitmap);
	    	
	    	ByteArrayOutputStream baos = new ByteArrayOutputStream();  
	    	bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos); //bm is the bitmap object
	    	byte[] b = baos.toByteArray();  
			TCPThread t = new TCPThread(mHandler, b);
			new Thread(t).start();
	    }
	} 
}
