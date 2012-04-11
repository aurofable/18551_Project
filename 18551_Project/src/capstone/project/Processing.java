package capstone.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

public class Processing implements Runnable{
	
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
	private String 		text, eigenText, dataText, meanText;
	private Handler		handler;
	
	public Processing(Handler handler, boolean viewBinImage, int width, int height, byte[] data){
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
		this.handler = handler;
	}
	
	public long getProcTime() {
		return timeTaken;
	}
	
	public Bitmap process(Bitmap bitmap) {
		Mat rot = new Mat();
		Mat res = new Mat();
		Log.i(TAG, "Started Processing...");
		long start = System.currentTimeMillis();
		
		rgba = Utils.bitmapToMat(bitmap);
		System.out.println("RGBA Size: w" + rgba.width() + " h" + rgba.height());
		if (viewBinaryImage) {
			temp = getBinaryImage(rgba);
			rot = getRotatedImage(temp);
			Imgproc.resize(rot, rot, new Size(rgba.width(), rgba.height()));
			Imgproc.cvtColor(rot, rot, Imgproc.COLOR_GRAY2RGBA, 4);
		}
		else {
			rot = getRotatedImage(rgba);
		}
		
		res = getCC(rot);
		postProcess(res);
		
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
	
	// Spatial recognition
	// Bag of words (visual)
	// historgram of oriented gradients
	// histogram matching techniques (chi square), not euclidean
	// predist2 matlab function 'try and figure out which option is better'
	// histogram equalization
	// text on boost pg 12
	// vertical projection profile, horizontal profile
	// image registration
	// lda, pca
	// interesting get the letter.....
	// hnm, crf

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
	 * Does not seem to work too well on words....need a finer kernel size
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
    	// Use camera parameters to get focus distance, length etc to vary kernel size
    	// words need to be big for our thing to work....currently
    	Size gKernelSize = new Size(17, 17);
    	double sigma = 10;
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
		
		// Writing binaryImage to sdcard for debugging
		Log.i(TAG, "Writing binaryImage");
		Mat binOut = new Mat();
		Imgproc.cvtColor(binaryImage, binOut, Imgproc.COLOR_GRAY2RGBA, 4);
		Bitmap bmp = Bitmap.createBitmap(binOut.cols(), binOut.rows(), Bitmap.Config.ARGB_8888);
		Utils.matToBitmap(binOut, bmp);
		storeBinImage(bmp);
		Log.i(TAG, "Writing binaryImage Done");

		// Running PCA
    	Mat eigenVecs = new Mat();
    	Mat mean = new Mat();
    	Mat res = new Mat();
    	int maxComponents = 2;
    	
    	int pixelNo = binaryImage.rows()*binaryImage.cols() - Core.countNonZero(binaryImage);
    	Mat data = new Mat(pixelNo, 2, CvType.CV_16SC1);
    	double[] pixel;
    	int rowCnt = 0;
    	for (int i = 0; i < binaryImage.width(); i++) {
    		for (int j = 0; j < binaryImage.height(); j++) {
    			pixel = binaryImage.get(j, i);
    			if (Double.compare(0, pixel[0]) == 0) {
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
    	System.out.println("Data has " + Core.countNonZero(binaryImage) + " non-zero members");
    	
    	// RECHECK TO MAKE SURE THE EIGENVECTORS ARE SCALED CORRECTLY
    	double[] div1 = eigenVecs.get(0, 0);
    	double[] div2 = eigenVecs.get(1, 0);
    	//double[] mean1 = mean.get(0, 0);
    	//double[] mean2 = mean.get(0, 1);
    	//double angle = Math.atan2((div1[0] + mean1[0])*1944, (div2[0] + mean2[0])*2592);
    	double angle = Math.atan2((div1[0])*1944, (div2[0])*2592);
    	double angleDeg = Math.toDegrees(angle);
    	text = "Angle is: " + angleDeg + " in degrees and " + angle + " in rad";
    	eigenText = "EigenVec: " + printMat(eigenVecs);
    	meanText = "MeanVec: " + printMat(mean);
    	//dataText = printData(data);
    	Point center = new Point(m.width()/2, m.height()/2);
    	//Point center = new Point(0, 0);
    	Mat rot = Imgproc.getRotationMatrix2D(center, angleDeg, 1);
    	Imgproc.warpAffine(m, res, rot, res.size());
    	return res;
	}
	
	private Mat getCC(Mat m) {
		// Assuming that rot mat is not grayscale
		Log.i(TAG, "Finding CCs...");
		Mat temp = new Mat();
		Mat hierarchy = new Mat();
		List<Mat> contoursAll = new LinkedList<Mat>();
		List<Mat> contours = new LinkedList<Mat>();
		List<Mat> rects = new LinkedList<Mat>();
		
		// Converting to single channel grayscale
		Imgproc.cvtColor(m, temp, Imgproc.COLOR_BGR2GRAY, 1); // Grayscale to single channel
		
		// Downsampling
		//Size downSize = new Size(m.width()/4, m.height()/4);
    	//Imgproc.resize(temp, temp, downSize);
    	//Imgproc.equalizeHist(temp, temp);
		
		Imgproc.findContours(temp, contoursAll, hierarchy, 1, 2);
		
		// Removing insignificant contours
		int numContours = 0;
		for (Mat contour : contoursAll) {
			double thresholdArea = 75*75;
			if (Imgproc.contourArea(contour) > thresholdArea) {
				System.out.println("Size of Contours: " + contour.size());
				contours.add(contour);
				numContours++;
			}
		}
		
		System.out.println("Number of Contours is: " + numContours);
		System.out.println("Contours size: " + contours.size());
		System.out.println("Contours channel: " + contours.get(0).channels());
		System.out.println("Contours depth: " + contours.get(0).depth());
		System.out.println("SAMPLE COORD ELEM: " + Arrays.toString(contours.get(0).get(0, 0)));
		
		
		Imgproc.drawContours(m, contours, -1, new Scalar(0, 255, 0, 255), 5);
		
		for (Mat contour : contours) {
			Mat approxCurve = new Mat();
			Imgproc.approxPolyDP(contour, approxCurve, 3, true);
			System.out.println("Size of approx Contours: " + approxCurve.size());
			List<Point> polygon = new LinkedList<Point>();
			for (int i = 0; i < approxCurve.height(); i++) {
				//System.out.println("Elem of contours: " + Arrays.toString(approxCurve.get(i, 0)));
				double[] coord = approxCurve.get(i, 0);
				System.out.println("THIS IS THE COORD: " + Arrays.toString(coord));
				Point p = new Point(coord[0], coord[1]);
				polygon.add(p);
			}
			
			// Drawing the Rect
			Rect rect = Imgproc.boundingRect(polygon);
			System.out.println("Size of rect: " + rect.size());
			Mat rectPoints = getAllPointsRect(rect);
			rects.add(rectPoints);
			System.out.println("Size of res Mat: " + rectPoints.size());
		}
		
		Imgproc.drawContours(m, rects, -1, new Scalar(255, 0, 0), 5);
		
		
		
		//Imgproc.cvtColor(temp, temp, Imgproc.COLOR_GRAY2RGBA, 4);
		Log.i(TAG, "Found CCs...");
		return m;
	}
	
	// Gets all the points of a rect, as opposed to just its four corners
	// Returns it as a point vector (Column mat)
	private Mat getAllPointsRect(Rect rect) {
		int numPoints = 2*rect.height + 2*rect.width;
		Mat res = new Mat(numPoints, 1, CvType.CV_32SC2);
		
		System.out.println("Mat channel: " + res.channels());
		System.out.println("Mat depth: " + res.depth());
		
		int rowCnt = 0;
		double x = rect.x;
		double y = rect.y;
		
		// Counter clock
		
		// left edge
		for (int i = 0; i < rect.height; i++) {
			y++;
			double[] coord = {x, y};
			res.put(rowCnt, 0, coord);
			rowCnt++;
		}
		
		// bottom edge
		for (int i = 0; i < rect.width; i++) {
			x++;
			double[] coord = {x, y};
			res.put(rowCnt, 0, coord);
			rowCnt++;
		}
		
		// right edge
		for (int i = 0; i < rect.height; i++) {
			y--;
			double[] coord = {x, y};
			res.put(rowCnt, 0, coord);
			rowCnt++;
		}
		
		// top edge
		for (int i = 0; i < rect.width; i++) {
			x--;
			double[] coord = {x, y};
			res.put(rowCnt, 0, coord);
			rowCnt++;
		}
		
		System.out.println("NumPoints and rowCnt match: " + (rowCnt == numPoints));
		if (rowCnt != numPoints) System.out.println("NumPoints: " + numPoints + "rowCnt: " + rowCnt);
		return res;
	}
	
	private Mat getBoxes(Mat m) {
		
		return null;
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
	
	private void postProcess(Mat m) {
		Core.putText(m, text, new Point(20, 150), 3, 1, new Scalar(255, 0, 0, 255), 2);
		Core.putText(m, eigenText, new Point(20, 200), 3, 1, new Scalar(255, 0, 0, 255), 2);
		Core.putText(m, meanText, new Point(20, 250), 3, 1, new Scalar(255, 0, 0, 255), 2);
	}
	
	private void updateDisplay(Bitmap bitmap) {
		Message msg = new Message();
		msg.obj = bitmap;
		msg.arg1 = 1;
		handler.sendMessage(msg);
	}

	@Override
	public void run() {
		storeImg();
		
		Bitmap bitmap = getImgBitmap();
		updateDisplay(bitmap);
		
		bitmap = process(bitmap);
		updateDisplay(bitmap);
	}
}
