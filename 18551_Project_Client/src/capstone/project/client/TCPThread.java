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
	private byte[]		data;
	
	Socket socket = null;
	DataOutputStream dataOutputStream = null;
	DataInputStream dataInputStream = null;
	
	public TCPThread(Handler handler, byte[] data) {
		this.handler = handler;
		this.data = data;
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
			int done = 1234;
			long sleeptime = (long) 0.0001;
			socket = new Socket("128.237.120.224", 8888); // need to run ipconfig/ifconfig to get the ip here 
			dataOutputStream = new DataOutputStream(socket
					.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
			
			// Send over the size of the file first, for allocation
			System.out.println("Sending over data size: " + data.length);
			dataOutputStream.writeByte(data.length);
			
			// Wait for response
			while (dataInputStream.read() != done) {
				try {
					Thread.sleep(sleeptime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Response OK! Sending over picture");
			// Send picture over
			dataOutputStream.flush(); // ensure channel is clear
			dataOutputStream.write(data);
			
			System.out.println("Picture sent!");
			// Update display with output from server
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
