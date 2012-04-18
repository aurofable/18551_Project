package capstone.project.client;

import android.app.Activity;
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
			TCPThread t = new TCPThread(mHandler, textOut.getText().toString());
			new Thread(t).start();
		}
	};
}
