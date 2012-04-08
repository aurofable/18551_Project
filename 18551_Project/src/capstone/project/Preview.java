package capstone.project;

import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Preview extends SurfaceView implements SurfaceHolder.Callback {
	private static final String TAG             = "Capstone::Preview";
		
	public SurfaceHolder 	holder;
	public Camera 			camera;
	public Overlay 			overlay;
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
            Camera.Parameters params = camera.getParameters();
            List<Camera.Size> sizes = params.getSupportedPreviewSizes();
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

            params.setPreviewSize(frameWidth, frameHeight);
            camera.setParameters(params);
            try {
				camera.setPreviewDisplay(holder);
			} catch (IOException e) {
				// do nothing
			}
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
}
