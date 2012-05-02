package capstone.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.googlecode.tesseract.android.TessBaseAPI;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class Processing implements Runnable{
	
	private static final String TAG             = "Capstone::Processing";
	private static final String path = Environment.getExternalStorageDirectory() + "/transOpticPrototype/";
	
	private int			mode;
	private byte[]		img;
	private int			width, height;
	private long 		timeTaken;
	private String 		imageName;
	private boolean 	viewBinaryImage;
	private String 		text, eigenText, dataText, meanText;
	private Handler		handler;
	private String lang = "eng";
	
	public Processing(Handler handler, int mode, boolean viewBinImage, int width, int height, byte[] data){
		this.mode = mode;
		viewBinaryImage = viewBinImage;
		this.img = data;
		this.width = width;
		this.height = height;
		Log.i(TAG, "Instantiated new " + this.getClass());
		this.imageName = "temp.jpg";
		this.handler = handler;
	}
	
	public long getProcTime() {
		return timeTaken;
	}
	
	public void process(Bitmap bitmap) {
		Log.i(TAG, "Started Processing...");
		long start = System.currentTimeMillis();
		
		
		Log.i(TAG, "Started OCR...");
		TessBaseAPI baseApi = new TessBaseAPI();
		baseApi.setDebug(true);
		
		
		baseApi.init(path, lang);
		Log.i(TAG, "Setting bitmap...");
		baseApi.setImage(bitmap);
		String answer = baseApi.getUTF8Text();
		baseApi.end();
		Log.i(TAG, "Done OCR...");
		
		//Log.v(TAG, "OCRED TEXT: " + answer);

		if ( lang.equalsIgnoreCase("eng") ) {
			answer = answer.replaceAll("[^a-zA-Z0-9]+", " ");
		}

		answer = answer.trim();

		/*
		if ( answer.length() != 0 ) {
			_field.setText(_field.getText().toString().length() == 0 ? recognizedText : _field.getText() + " " + recognizedText);
			_field.setSelection(_field.getText().toString().length());
		}
		*/
		
		sendAnswer(answer);
		

    	long end = System.currentTimeMillis();
    	this.timeTaken = end - start;
    	
		Log.i(TAG, "Finished Processing...took " + timeTaken + "ms");
		Log.i(TAG, "Answer is:  " + answer);
	}

	/**
	 * storeImg stores the image onto the sdcard.
	 * Necessary as there seems to be no good way to read in the 
	 * jpeg compressed byte array as a bitmap.
	 */
	private void storeImg() {
		File photo = new File(Environment.getExternalStorageDirectory(), imageName);
		if (photo.exists()) {
			photo.delete();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(photo.getPath());
			fos.write(img);
			fos.close();
		}
		catch (IOException e) {
			Log.e(TAG, "Exception writing to sdcard");
		}
	}
	
	/**
	 * getImgBitmap just gets the bitmap from storage
	 * @return the bitmap from storage card
	 */
	private Bitmap getImgBitmap() {
		File imageFile = new File(Environment.getExternalStorageDirectory(), imageName);
		if (!imageFile.exists()) return null;
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inPreferredConfig = Bitmap.Config.ARGB_8888;
		Bitmap bitmap = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
		return bitmap;
	}
	
	private void updateDisplay(Bitmap bitmap) {
		Message msg = new Message();
		msg.obj = bitmap;
		msg.arg1 = 1;
		handler.sendMessage(msg);
	}
	
	private void sendAnswer(String ans) {
		Message msg = new Message();
		msg.obj = ans;
		msg.arg1 = 0;
		handler.sendMessage(msg);
	}
	
	@Override
	public void run() {
		Log.i(TAG, "Started Running...");
		/* Store the image onto the sdcard */
		storeImg();
		
		/* Get the bitmap from the sdcard */
		Bitmap bitmap = getImgBitmap();
		
		/* Send the bitmap over for an initial display after taking picture */
		updateDisplay(bitmap);
		process(bitmap);
		Log.i(TAG, "Done Running...");
	}
}
