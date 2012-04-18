package capstone.project.client;

import java.io.ByteArrayOutputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClientActivity extends Activity {

	EditText textOut;
	TextView textIn;
	int CAMERA_PIC_REQUEST = 1234;
	
	
	Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			CharSequence c = (CharSequence) msg.obj;
			textIn.setText(c);
		}
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		textOut = (EditText) findViewById(R.id.textout);
		Button buttonSend = (Button) findViewById(R.id.send);
		textIn = (TextView) findViewById(R.id.textin);
		buttonSend.setOnClickListener(buttonSendOnClickListener);
	}

	Button.OnClickListener buttonSendOnClickListener = new Button.OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);  
		}
	};
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == CAMERA_PIC_REQUEST) {
	    	Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
	    	
	    	ByteArrayOutputStream baos = new ByteArrayOutputStream();  
	    	thumbnail.compress(Bitmap.CompressFormat.PNG, 100, baos); //bm is the bitmap object
	    	byte[] b = baos.toByteArray();  
	    	
			TCPThread t = new TCPThread(mHandler, b);
			new Thread(t).start();
	    }
	} 
}
