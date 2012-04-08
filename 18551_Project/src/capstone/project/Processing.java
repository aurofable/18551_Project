package capstone.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

public class Processing {
	
	private static final String TAG             = "Capstone::Processing";
	
	private byte[]		img;
	private Mat 		yuv;
	private Mat			rgba;
	private	Mat			graySubmat;
	private Mat 		temp;
	private int			width, height;
	private long 		timeTaken;
	private String 		imageName;
	private boolean 	viewBinaryImage;
	private String 		text, eigenText, dataText;
	
	public Processing(boolean viewBinImage, int width, int height, byte[] data){
		viewBinaryImage = viewBinImage;
		this.img = data;
		this.width = width;
		this.height = height;
		yuv = new Mat(height + height/2, width, CvType.CV_8UC1);
		graySubmat = yuv.submat(0, height, 0, width);
		rgba = new Mat();
		temp = new Mat();
		Log.i(TAG, "Instantiated new " + this.getClass());
		this.imageName = "temp.jpg";
	}
	
	public long getProcTime() {
		return timeTaken;
	}
	
	public Bitmap process() {
		Mat res = new Mat();
		Log.i(TAG, "Started Processing...");
		long start = System.currentTimeMillis();
		
		storeImg();
		Bitmap bitmap = getImgBitmap();
		rgba = Utils.bitmapToMat(bitmap);
		if (viewBinaryImage) {
			temp = getBinaryImage(rgba);
			res = getRotatedImage(temp);
			Imgproc.resize(res, res, new Size(rgba.width(), rgba.height()));
			Imgproc.cvtColor(res, res, Imgproc.COLOR_GRAY2RGBA, 4);
			Core.putText(res, text, new Point(20, 150), 3, 1, new Scalar(255, 0, 0, 255), 2);
			Core.putText(res, eigenText, new Point(20, 200), 3, 1, new Scalar(255, 0, 0, 255), 2);
		}
		else {
			res = getRotatedImage(rgba);
		}
		//writeData();

    	long end = System.currentTimeMillis();
    	this.timeTaken = end - start;
    	
		Log.i(TAG, "Finished Processing...took " + timeTaken + "ms");
		if (Utils.matToBitmap(res, bitmap)) {
			System.out.println("Returning bitmap....");
			return bitmap;
		}
		bitmap.recycle();
		return null;
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
	
	/**
	 * getbinaryImage takes in a Mat and returns
	 * the binary image as a Mat (single channel)
	 * @return
	 */
	private Mat getBinaryImage(Mat m) {
		Mat temp = new Mat();
		
		// Converting to single channel grayscale
		Imgproc.cvtColor(m, temp, Imgproc.COLOR_BGR2GRAY, 1); // Grayscale to single channel
		
		// Downsampling
		Size downSize = new Size(m.width()/4, m.height()/4);
    	Imgproc.resize(temp, temp, downSize);
    	Imgproc.equalizeHist(temp, temp);
    	
    	// Blurring
    	// Getting the gaussian kernel and blurring it
    	Size gKernelSize = new Size(15, 15);
    	double sigma = 30;
    	Imgproc.GaussianBlur(temp, temp, gKernelSize, sigma);
    	
    	// Thresholding
    	// Block Size needs to be odd
    	Imgproc.adaptiveThreshold(temp, temp, 255, Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, Imgproc.THRESH_BINARY, 43, 0);

    	// Eroding and dilating to remove noise
    	Mat kernel = new Mat();
    	Imgproc.dilate(temp, temp, kernel);
    	Imgproc.erode(temp, temp, kernel);
    	Imgproc.dilate(temp, temp, kernel);
    	Imgproc.erode(temp, temp, kernel);
    	
    	return temp;
	}
	
	private Mat getRotatedImage(Mat m) {
		
		Mat binaryImage;
		if (viewBinaryImage) {
			binaryImage = m;
		}
		else binaryImage = getBinaryImage(m);

		// Running PCA
    	Mat eigenVecs = new Mat();
    	Mat mean = new Mat();
    	Mat res = new Mat();
    	int maxComponents = 2;
    	
    	int pixelNo = Core.countNonZero(binaryImage);
    	Mat data = new Mat(pixelNo, 2, CvType.CV_16SC1);
    	double[] pixel;
    	int rowCnt = 0;
    	for (int i = 0; i < binaryImage.width(); i++) {
    		for (int j = 0; j < binaryImage.height(); j++) {
    			pixel = binaryImage.get(j, i);
    			if (Double.compare(255, pixel[0]) == 0) {
    				double[] elemJ = {j};
    				double[] elemI = {i};
    				data.put(rowCnt, 0, elemJ);
    				data.put(rowCnt, 1, elemI);
    				rowCnt++;
    			}
    		}
    	}
    	Core.PCACompute(data, mean, eigenVecs, maxComponents);
    	System.out.println("Data has " + rowCnt + " members");
    	
    	double[] div1 = eigenVecs.get(0, 0);
    	double[] div2 = eigenVecs.get(0, 1);
    	double angle = Math.atan2(div1[0], div2[0]);
    	double angleDeg = Math.toDegrees(angle);
    	text = "Angle is: " + angleDeg + " in degrees and " + angle + " in rad";
    	eigenText = "EigenVec: " + printMat(eigenVecs);
    	//dataText = printData(data);
    	//Point center = new Point(m.width()/2, m.height()/2);
    	Point center = new Point(0, 0);
    	Mat rot = Imgproc.getRotationMatrix2D(center, angleDeg, 1);
    	Imgproc.warpAffine(m, res, rot, res.size());
    	if (!viewBinaryImage) {
    		Core.putText(res, text, new Point(20, 150), 3, 1, new Scalar(255, 0, 0, 255), 2);
    		Core.putText(res, eigenText, new Point(20, 200), 3, 1, new Scalar(255, 0, 0, 255), 2);
    	}
    	return res;
	}
	
	private String printMat(Mat m) {
		String res = "";
		for (int i = 0; i < m.height(); i++) {
			res = res + "{";
			for (int j = 0; j < m.width(); j++) {
				double[] pixel = m.get(i, j);
				res = res + Arrays.toString(pixel);
			}
			res = res + "},";
		}
		return res;
	}
	
	private String printData(Mat data) {
		String res = "[";
		for (int i = 0; i < data.height(); i++) {
			res = res + "[";
			for (int j = 0; j < data.width(); j++) {
				double[] pixel = data.get(i, j);
				res = res + Arrays.toString(pixel);
			}
			res = res + "];";
		}
		return res + "]";
	}
	
	private void writeData() {
		File data = new File(Environment.getExternalStorageDirectory(), "data.txt");
		if (data.exists()) {
			data.delete();
		}
		
		try {
			FileWriter writer = new FileWriter(data);
			writer.append(dataText);
			writer.flush();
			writer.close();
		}
		catch (IOException e) {
			Log.e(TAG, "Exception writing to sdcard data");
		}
	
	}
	
	private void storeBinImage(Bitmap b) {
		File photo = new File(Environment.getExternalStorageDirectory(), "bin.jpg");
		if (photo.exists()) {
			photo.delete();
		}
		try {
			FileOutputStream fos = new FileOutputStream(photo.getPath());
			b.compress(Bitmap.CompressFormat.JPEG, 100, fos);
			fos.flush();
			fos.close();
		}
		catch (IOException e) {
			Log.e(TAG, "Exception writing to sdcard");
		}
	}
}
