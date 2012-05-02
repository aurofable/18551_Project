package capstone.project.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class TCPThread implements Runnable {

	private static final String TAG = "Capstone::TCPThread";

	/* Variables */
	private String ipAdd = "128.237.123.216";
	private int port = 8888;

	/* Data and Processing */
	private byte[] inData, outData;
	private Handler handler;

	/* Networking */
	private Socket socket;
	private DataOutputStream dataOutputStream;
	private DataInputStream dataInputStream;

	/**
	 * The constructor takes in a handler that is used to return the data to the
	 * UI Thread. It also takes in the byte array that is the JPEG encoded
	 * image.
	 * 
	 * @param handler
	 * @param data
	 */
	public TCPThread(String ipAdd, int port, Handler handler, byte[] data) {
		this.handler = handler;
		this.outData = data;
		this.ipAdd = ipAdd;
		this.port = 8888;
	}
	
	public TCPThread(Handler handler, byte[] data) {
		this.handler = handler;
		this.outData = data;
	}

	/**
	 * updateDisplay updates the display by sending the image back to the UI
	 * thread.
	 * 
	 * @param c
	 */
	private void updateDisplay(Bitmap b) {
		Message msg = new Message();
		msg.obj = b;
		msg.arg1 = 1;
		handler.sendMessage(msg);
	}
	
	private void updateAns(String s) {
		Message msg = new Message();
		msg.obj = s;
		msg.arg1 = 0;
		handler.sendMessage(msg);
	}

	@Override
	/**
	 * run is the main method used for sending the image to the server
	 */
	public void run() {
		try {

			// Gets the socket, might need to run ipconfig/ifconfig here
			socket = new Socket(ipAdd, port);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());

			// Send over the size of the file first, for allocation
			Log.i(TAG, "Sending over data size of size: " + outData.length);
			dataOutputStream.writeInt(outData.length);
			// if using matlab server remove above
			// http://rss.acs.unt.edu/Rdoc/library/R.matlab/html/1._The_Matlab_server_running_in_Matlab.html

			// Sending over actual image
			dataOutputStream.write(outData);
			Log.i(TAG, "Data sent!");

			// Receive data
			Thread.sleep((long) 0.1);
			int length = dataInputStream.readInt();
			inData = new byte[length];
			Log.i(TAG, "Received allocation size: " + length);
			Log.i(TAG, "Reading Data... ");
			dataInputStream.readFully(inData);
			Log.i(TAG, "Received Data... Displaying");
			
			// Converting and displaying bitmap
			Bitmap bitmap =  BitmapFactory.decodeByteArray(inData, 0, length);
			updateDisplay(bitmap);
			
			// Receiving Answer
			String ans = dataInputStream.readLine();
			updateAns(ans);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (dataOutputStream != null) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (dataInputStream != null) {
				try {
					dataInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
