
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;



// C++: class CvANN_MLP_TrainParams
/**
 * Parameters of the MLP training algorithm. You can initialize the structure by
 * a constructor or the individual parameters can be adjusted after the
 * structure is created.
 *
 * The back-propagation algorithm parameters:
 *
 * The RPROP algorithm parameters (see [RPROP93] for details):
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-trainparams">org.opencv.ml.CvANN_MLP_TrainParams</a>
 */
public class CvANN_MLP_TrainParams {

    protected final long nativeObj;
    protected CvANN_MLP_TrainParams(long addr) { nativeObj = addr; }


    public static final int
            BACKPROP = 0,
            RPROP = 1;


    //
    // C++: CvTermCriteria CvANN_MLP_TrainParams::term_crit
    //

    // Return type 'CvTermCriteria' is not supported, skipping the function


    //
    // C++: void CvANN_MLP_TrainParams::term_crit
    //

    // Unknown type 'CvTermCriteria' (I), skipping the function


    //
    // C++: int CvANN_MLP_TrainParams::train_method
    //

    public  int get_train_method()
    {

        int retVal = get_train_method_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::train_method
    //

    public  void set_train_method(int train_method)
    {

        set_train_method_0(nativeObj, train_method);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::bp_dw_scale
    //

    public  double get_bp_dw_scale()
    {

        double retVal = get_bp_dw_scale_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::bp_dw_scale
    //

    public  void set_bp_dw_scale(double bp_dw_scale)
    {

        set_bp_dw_scale_0(nativeObj, bp_dw_scale);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::bp_moment_scale
    //

    public  double get_bp_moment_scale()
    {

        double retVal = get_bp_moment_scale_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::bp_moment_scale
    //

    public  void set_bp_moment_scale(double bp_moment_scale)
    {

        set_bp_moment_scale_0(nativeObj, bp_moment_scale);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw0
    //

    public  double get_rp_dw0()
    {

        double retVal = get_rp_dw0_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw0
    //

    public  void set_rp_dw0(double rp_dw0)
    {

        set_rp_dw0_0(nativeObj, rp_dw0);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_plus
    //

    public  double get_rp_dw_plus()
    {

        double retVal = get_rp_dw_plus_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_plus
    //

    public  void set_rp_dw_plus(double rp_dw_plus)
    {

        set_rp_dw_plus_0(nativeObj, rp_dw_plus);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_minus
    //

    public  double get_rp_dw_minus()
    {

        double retVal = get_rp_dw_minus_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_minus
    //

    public  void set_rp_dw_minus(double rp_dw_minus)
    {

        set_rp_dw_minus_0(nativeObj, rp_dw_minus);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_min
    //

    public  double get_rp_dw_min()
    {

        double retVal = get_rp_dw_min_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_min
    //

    public  void set_rp_dw_min(double rp_dw_min)
    {

        set_rp_dw_min_0(nativeObj, rp_dw_min);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_max
    //

    public  double get_rp_dw_max()
    {

        double retVal = get_rp_dw_max_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_max
    //

    public  void set_rp_dw_max(double rp_dw_max)
    {

        set_rp_dw_max_0(nativeObj, rp_dw_max);

        return;
    }


/**
 * The constructors.
 *
 * By default the RPROP algorithm is used:
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-trainparams-cvann-mlp-trainparams">org.opencv.ml.CvANN_MLP_TrainParams.CvANN_MLP_TrainParams</a>
 */
public CvANN_MLP_TrainParams() {
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

    // C++: int CvANN_MLP_TrainParams::train_method
    private static native int get_train_method_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::train_method
    private static native void set_train_method_0(long nativeObj, int train_method);

    // C++: double CvANN_MLP_TrainParams::bp_dw_scale
    private static native double get_bp_dw_scale_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::bp_dw_scale
    private static native void set_bp_dw_scale_0(long nativeObj, double bp_dw_scale);

    // C++: double CvANN_MLP_TrainParams::bp_moment_scale
    private static native double get_bp_moment_scale_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::bp_moment_scale
    private static native void set_bp_moment_scale_0(long nativeObj, double bp_moment_scale);

    // C++: double CvANN_MLP_TrainParams::rp_dw0
    private static native double get_rp_dw0_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw0
    private static native void set_rp_dw0_0(long nativeObj, double rp_dw0);

    // C++: double CvANN_MLP_TrainParams::rp_dw_plus
    private static native double get_rp_dw_plus_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_plus
    private static native void set_rp_dw_plus_0(long nativeObj, double rp_dw_plus);

    // C++: double CvANN_MLP_TrainParams::rp_dw_minus
    private static native double get_rp_dw_minus_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_minus
    private static native void set_rp_dw_minus_0(long nativeObj, double rp_dw_minus);

    // C++: double CvANN_MLP_TrainParams::rp_dw_min
    private static native double get_rp_dw_min_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_min
    private static native void set_rp_dw_min_0(long nativeObj, double rp_dw_min);

    // C++: double CvANN_MLP_TrainParams::rp_dw_max
    private static native double get_rp_dw_max_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_max
    private static native void set_rp_dw_max_0(long nativeObj, double rp_dw_max);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
