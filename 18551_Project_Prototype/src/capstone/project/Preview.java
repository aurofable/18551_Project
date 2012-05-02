package capstone.project;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Preview extends SurfaceView implements SurfaceHolder.Callback {
	private static final String TAG             = "Capstone::Preview";
		
	public SurfaceHolder 	holder;
	public Camera 			camera;
	public Camera.Parameters parameters;
	public Overlay 			overlay;
	private byte[] 			buffer;
	private int 			frameWidth, frameHeight;
	
	public Preview(Context context, Camera camera) {
        super(context);
        this.camera = camera;
      
        // Install a SurfaceHolder.Callback so we get notified when the
        // underlying surface is created and destroyed.
        holder = getHolder();
        holder.addCallback(this);
        holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }
    
    public void setOverlay(Overlay overlay) {
    	this.overlay = overlay;
    }
    
    public Overlay getOverlay() {
    	return this.overlay;
    }
    
    public int getFrameWidth() {
    	return frameWidth;
    }
    
    public int getFrameHeight() {
    	return frameHeight;
    }

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
		if (camera != null) {
			parameters = camera.getParameters();
			parameters.set("orientation","landscape");
            List<Camera.Size> sizes = parameters.getSupportedPreviewSizes();
            frameWidth = width;
            frameHeight = height;

            // selecting optimal camera preview size
            {
                double minDiff = Double.MAX_VALUE;
                for (Camera.Size size : sizes) {
                    if (Math.abs(size.height - height) < minDiff) {
                        frameWidth = size.width;
                        frameHeight = size.height;
                        minDiff = Math.abs(size.height - height);
                    }
                }
            }

            parameters.setPreviewSize(frameWidth, frameHeight);
            camera.setParameters(parameters);
            try {
				camera.setPreviewDisplay(holder);
			} catch (IOException e) {
				// do nothing
			}
			updateBufferSize();
            camera.startPreview();
        }
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		if (camera == null) {
			camera = CameraActivity.getCameraInstance();
		}
		try {
			camera.setPreviewDisplay(holder);
			updateBufferSize();
			camera.addCallbackBuffer(buffer);
			camera.setPreviewCallbackWithBuffer(new PreviewCallback() {
				public synchronized void onPreviewFrame(byte[] data, Camera c) {

					if (camera != null) { // there was a race condition when onStop() was called..
						camera.addCallbackBuffer(buffer); // it was consumed by the call, add it back
					}
				}
			});
			
			camera.startPreview();
		} catch (IOException e) {
			camera.release();
			camera = null;
		}
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		camera.stopPreview();
    	camera.release();
    	camera = null;
	}
	
	public Bitmap getPic(int x, int y, int width, int height) {
		System.gc(); 
		Bitmap b = null;
		Size s = parameters.getPreviewSize();

		YuvImage yuvimage = new YuvImage(buffer, ImageFormat.NV21, s.width, s.height, null);
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		yuvimage.compressToJpeg(new Rect(x, y, width, height), 100, outStream); // make JPG
		b = BitmapFactory.decodeByteArray(outStream.toByteArray(), 0, outStream.size()); // decode JPG
		yuvimage = null;
		outStream = null;
		System.gc();
		return b;
	}
	
	private void updateBufferSize() {
		buffer = null;
		System.gc();
		// prepare a buffer for copying preview data to
		int h = camera.getParameters().getPreviewSize().height;
		int w = camera.getParameters().getPreviewSize().width;
		int bitsPerPixel = ImageFormat.getBitsPerPixel(camera.getParameters().getPreviewFormat());
		buffer = new byte[w * h * bitsPerPixel / 8];
		//Log.i("surfaceCreated", "buffer length is " + mBuffer.length + " bytes");
	}
}
