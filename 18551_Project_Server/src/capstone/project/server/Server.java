package capstone.project.server;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class Server {

	public static void main(String[] args) {

		int count = 0;
		ServerSocket serverSocket = null;
		Socket socket = null;
		DataInputStream dataInputStream = null;
		DataOutputStream dataOutputStream = null;

		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("Listening :8888");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			try {
				int done = 1234;
				byte[] data;
				socket = serverSocket.accept();
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream = new DataOutputStream(socket
						.getOutputStream());
				System.out.println("ip: " + socket.getInetAddress());
				System.out.println("message: " + count);

				// Receive the length for allocation
				int length = dataInputStream.readInt();
				System.out.println("Received allocation size: " + length);
				data = new byte[length];

				// Tell them to send it over
				System.out.println("Requesting data... ");
				dataOutputStream.writeInt(done);

				// Receive data
				System.out.println("Reeading Data... ");
				dataInputStream.readFully(data);
				System.out.println("Received Data... ");

				// Save it
				InputStream in = new ByteArrayInputStream(data);
				BufferedImage image = ImageIO.read(in);
				ImageIO.write(image, "jpg", new File("C:/Users/James/Desktop/server/received.jpg"));

				dataOutputStream.writeUTF("Hello! " + count);
				count++;
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

				if (dataInputStream != null) {
					try {
						dataInputStream.close();
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
			}
		}
	}
}