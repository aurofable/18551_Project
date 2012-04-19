package capstone.project.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Overlay extends View {

	public Bitmap image;
	public static Paint paint = new Paint();
	public static Matrix mat = new Matrix();
	
	public Overlay(Context context) {
        super(context);
    }
    
    public Overlay(Context context, AttributeSet attrs) {
    	super(context, attrs);
    }
    
    public Overlay(Context context, AttributeSet attrs, int defStyle) {
    	super(context, attrs, defStyle);
    }
    
    public void setBitmap(Bitmap image) {
    	if (image != null)
    		image = Bitmap.createScaledBitmap(image, getWidth(), getHeight(), false);
    	if (this.image != null) this.image.recycle();
    	this.image = image;
    }
    
    public void cleanBitmap() {
    	if (this.image != null) this.image.recycle();
    	this.image = null;
    }
    
    public Bitmap getBitmap() {
    	return this.image;
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
    	if (image != null) {
    		canvas.drawBitmap(image, mat, paint);
    	}
    }
}
