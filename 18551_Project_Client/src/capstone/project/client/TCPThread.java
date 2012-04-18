package capstone.project.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import android.os.Handler;
import android.os.Message;

public class TCPThread implements Runnable {

	private Handler		handler;
	private String		data;
	
	Socket socket = null;
	DataOutputStream dataOutputStream = null;
	DataInputStream dataInputStream = null;
	
	public TCPThread(Handler handler, String send) {
		this.handler = handler;
		this.data = send;
	}
	
	private void updateDisplay(CharSequence c) {
		Message msg = new Message();
		msg.obj = c;
		//msg.arg1 = 1;
		handler.sendMessage(msg);
	}
	
	
	@Override
	public void run() {
		try {
			socket = new Socket("128.237.120.224", 8888); // need to run ipconfig/ifconfig to get the ip here 
			dataOutputStream = new DataOutputStream(socket
					.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream.writeUTF(data);
			updateDisplay(dataInputStream.readUTF());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (dataOutputStream != null) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (dataInputStream != null) {
				try {
					dataInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
