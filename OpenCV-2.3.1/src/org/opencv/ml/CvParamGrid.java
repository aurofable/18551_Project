
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;



// C++: class CvParamGrid
/**
 * The structure represents the logarithmic grid range of statmodel parameters.
 * It is used for optimizing statmodel accuracy by varying model parameters, the
 * accuracy estimate being computed by cross-validation.
 *
 * The grid determines the following iteration sequence of the statmodel
 * parameter values:
 *
 * (min_val, min_val*step, min_val*(step)^2, dots, min_val*(step)^n),
 *
 * where n is the maximal index satisfying
 *
 * min_val * step ^n < max_val
 *
 * The grid is logarithmic, so "step" must always be greater then 1.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvparamgrid">org.opencv.ml.CvParamGrid</a>
 */
public class CvParamGrid {

    protected final long nativeObj;
    protected CvParamGrid(long addr) { nativeObj = addr; }


    public static final int
            SVM_C = 0,
            SVM_GAMMA = 1,
            SVM_P = 2,
            SVM_NU = 3,
            SVM_COEF = 4,
            SVM_DEGREE = 5;


    //
    // C++: double CvParamGrid::min_val
    //

    public  double get_min_val()
    {

        double retVal = get_min_val_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvParamGrid::min_val
    //

    public  void set_min_val(double min_val)
    {

        set_min_val_0(nativeObj, min_val);

        return;
    }


    //
    // C++: double CvParamGrid::max_val
    //

    public  double get_max_val()
    {

        double retVal = get_max_val_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvParamGrid::max_val
    //

    public  void set_max_val(double max_val)
    {

        set_max_val_0(nativeObj, max_val);

        return;
    }


    //
    // C++: double CvParamGrid::step
    //

    public  double get_step()
    {

        double retVal = get_step_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvParamGrid::step
    //

    public  void set_step(double step)
    {

        set_step_0(nativeObj, step);

        return;
    }


/**
 * The constructors.
 *
 * The full constructor initializes corresponding members. The default
 * constructor creates a dummy grid:
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvparamgrid-cvparamgrid">org.opencv.ml.CvParamGrid.CvParamGrid</a>
 */
public CvParamGrid() {
    nativeObj = n_newObj();
}

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
        super.finalize();
    }



    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++: double CvParamGrid::min_val
    private static native double get_min_val_0(long nativeObj);

    // C++: void CvParamGrid::min_val
    private static native void set_min_val_0(long nativeObj, double min_val);

    // C++: double CvParamGrid::max_val
    private static native double get_max_val_0(long nativeObj);

    // C++: void CvParamGrid::max_val
    private static native void set_max_val_0(long nativeObj, double max_val);

    // C++: double CvParamGrid::step
    private static native double get_step_0(long nativeObj);

    // C++: void CvParamGrid::step
    private static native void set_step_0(long nativeObj, double step);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
