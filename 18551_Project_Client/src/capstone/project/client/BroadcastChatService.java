package capstone.project.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;

/**
 * This class does all the work for sending and receiving broadcast packets. 
 * It has a thread that listens for incoming packets.
 */
public class BroadcastChatService {
    // Debugging
    private static final String TAG = "BcastChatService";
    private static final boolean D = true;

    // Member fields
    private final Handler mHandler;
    private ComThread mConnectedThread;

    Context mContext ;
    /**
     * Constructor. Prepares a new Broadcast service.
     * @param context  The UI Activity Context
     * @param handler  A Handler to send messages back to the UI Activity
     */
    public BroadcastChatService(Context context, Handler handler) {
        //mAdapter = BluetoothAdapter.getDefaultAdapter();
    	mContext = context;
        mHandler = handler;
    }

    
    /**
     * Start the chat service. Specifically start ComThread to begin 
     * listening incoming broadcast packets. 
     */
    public synchronized void start() {
        if (D) Log.d(TAG, "start");
        
        mConnectedThread = new ComThread();
        mConnectedThread.start();
    }


    /**
     * Stop thread
     */
    public synchronized void stop() {
        if (D) Log.d(TAG, "stop");
        if (mConnectedThread != null) {mConnectedThread.cancel(); mConnectedThread = null;}
    }


    public void write(byte[] out) {

        mConnectedThread.write(out);
    }

    
    /**
     * This thread handles all incoming and outgoing transmissions.
     */    
    private class ComThread extends Thread {
        
    	private static final int BCAST_PORT = 2562;
    	DatagramSocket mSocket ;
    	InetAddress myBcastIP, myLocalIP ;
    	
        public ComThread() {
        	
        	try { 
        		   myBcastIP 	= getBroadcastAddress();
        		   if(D)Log.d(TAG,"my bcast ip : "+myBcastIP);
        		   
        		   myLocalIP 	= getLocalAddress();
        		   if(D)Log.d(TAG,"my local ip : "+myLocalIP);
        		   
        		   mSocket 		= new DatagramSocket(BCAST_PORT); 
        		   mSocket.setBroadcast(true); 
        	   
        	     } catch (IOException e) { 
        	    	 Log.e(TAG, "Could not make socket", e); 
        	     } 
        }
        

        public void run() {
        	
    		try {
    			
    			byte[] buf = new byte[1024]; 
    			
    			//Listen on socket to receive messages 
    			while (true) { 
	    			DatagramPacket packet = new DatagramPacket(buf, buf.length); 
	    			mSocket.receive(packet); 
	
	    			InetAddress remoteIP = packet.getAddress();
	    			if(remoteIP.equals(myLocalIP))
	    				continue;
	
	    			String s = new String(packet.getData(), 0, packet.getLength()); 
	    			if(D)Log.d(TAG, "Received response " + s); 
	
	    			// Send the obtained bytes to the UI Activity
	    			mHandler.obtainMessage(BroadcastChat.MESSAGE_READ,-1,-1, s)
	    			.sendToTarget();              
	    		} 
			} catch (IOException e) {
    			e.printStackTrace();
			}
        }

        
        /**
          * Write broadcast packet.
          */
        public void write(byte[] buffer) {

            try {
            	String data = new String (buffer);

                DatagramPacket packet = new DatagramPacket(data.getBytes(), data.length(), 
                		myBcastIP, BCAST_PORT);
                
                mSocket.send(packet); 
                // Share the sent message back to the UI Activity
                mHandler.obtainMessage(BroadcastChat.MESSAGE_WRITE, -1, -1, buffer)
                        .sendToTarget();
            } catch (Exception e) {
                Log.e(TAG, "Exception during write", e);
            }
        }


        /** 
         * Calculate the broadcast IP we need to send the packet along. 
         */ 
        private InetAddress getBroadcastAddress() throws IOException {
          WifiManager mWifi = (WifiManager) mContext.getSystemService(Context.WIFI_SERVICE);
          
          WifiInfo info = mWifi.getConnectionInfo();
  		  if(D)Log.d(TAG,"\n\nWiFi Status: " + info.toString());
  		
    	  // DhcpInfo  is a simple object for retrieving the results of a DHCP request
          DhcpInfo dhcp = mWifi.getDhcpInfo(); 
          if (dhcp == null) { 
            Log.d(TAG, "Could not get dhcp info"); 
            return null; 
          } 
       
          
          int broadcast = (dhcp.ipAddress & dhcp.netmask) | ~dhcp.netmask; 
          byte[] quads = new byte[4]; 
          for (int k = 0; k < 4; k++) 
            quads[k] = (byte) ((broadcast >> k * 8) & 0xFF);
          
          // Returns the InetAddress corresponding to the array of bytes. 
          return InetAddress.getByAddress(quads);  // The high order byte is quads[0].
        }  
        
        
        private InetAddress getLocalAddress()throws IOException {
        	
			try {
			    for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
			        NetworkInterface intf = en.nextElement();
			        for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
			            InetAddress inetAddress = enumIpAddr.nextElement();
			            if (!inetAddress.isLoopbackAddress()) {
			                //return inetAddress.getHostAddress().toString();
			            	return inetAddress;
			            }
			        }
			    }
			} catch (SocketException ex) {
			    Log.e(TAG, ex.toString());
			}
			return null;
        }
        
        
        public void cancel() {
            try {
                mSocket.close();
            } catch (Exception e) {
                Log.e(TAG, "close() of connect socket failed", e);
            }
        }
    }    
}

