package capstone.project.client;

import java.io.*;
import java.net.*;
import android.app.Activity;

public class ClientActivity extends Activity {

	public static void main(String argv[]) throws Exception {
		String sentence;
		String modifiedSentence;
		
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("hostname", 6789);
		
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		sentence = inFromUser.readLine();
		
		outToServer.writeBytes(sentence + '\n');
		
		modifiedSentence = inFromServer.readLine();
		
		System.out.println("From Server:" + modifiedSentence);
		
		clientSocket.close();
	}
}
