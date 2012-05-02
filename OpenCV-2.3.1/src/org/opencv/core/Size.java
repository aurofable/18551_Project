package org.opencv.core;

/**
 * Template class for specfying the size of an image or rectangle. The class
 * includes two members called "width" and "height". The structure can be
 * converted to and from the old OpenCV structures "CvSize" and "CvSize2D32f".
 * The same set of arithmetic and comparison operations as for "Point_" is
 * available.
 *
 * OpenCV defines the following "Size_<>" aliases:
 *
 * @see <a href="http://opencv.itseez.com/modules/core/doc/basic_structures.html#size">org.opencv.core.Size_</a>
 */
public class Size {

    public double width, height;

    public Size(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Size() {
        this(0, 0);
    }

    public Size(Point p) {
        width = p.x;
        height = p.y;
    }

    public Size(double[] vals) {
        set(vals);
    }

    public void set(double[] vals) {
        if (vals != null) {
            width = vals.length > 0 ? vals[0] : 0;
            height = vals.length > 1 ? vals[1] : 0;
        } else {
            width = 0;
            height = 0;
        }
    }

    public double area() {
        return width * height;
    }

    public Size clone() {
        return new Size(width, height);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Size)) return false;
        Size it = (Size) obj;
        return width == it.width && height == it.height;
    }

    @Override
    public String toString() {
        return (int)width + "x" + (int)height;
    }

}
