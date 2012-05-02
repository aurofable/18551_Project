
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;



// C++: class CvRTParams
/**
 * Training parameters of random trees.
 *
 * The set of training parameters for the forest is a superset of the training
 * parameters for a single tree. However, random trees do not need all the
 * functionality/features of decision trees. Most noticeably, the trees are not
 * pruned, so the cross-validation parameters are not used.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtparams">org.opencv.ml.CvRTParams</a>
 */
public class CvRTParams {

    protected final long nativeObj;
    protected CvRTParams(long addr) { nativeObj = addr; }


    //
    // C++: bool CvRTParams::calc_var_importance
    //

    public  boolean get_calc_var_importance()
    {

        boolean retVal = get_calc_var_importance_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvRTParams::calc_var_importance
    //

    public  void set_calc_var_importance(boolean calc_var_importance)
    {

        set_calc_var_importance_0(nativeObj, calc_var_importance);

        return;
    }


    //
    // C++: int CvRTParams::nactive_vars
    //

    public  int get_nactive_vars()
    {

        int retVal = get_nactive_vars_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvRTParams::nactive_vars
    //

    public  void set_nactive_vars(int nactive_vars)
    {

        set_nactive_vars_0(nativeObj, nactive_vars);

        return;
    }


    //
    // C++: CvTermCriteria CvRTParams::term_crit
    //

    // Return type 'CvTermCriteria' is not supported, skipping the function


    //
    // C++: void CvRTParams::term_crit
    //

    // Unknown type 'CvTermCriteria' (I), skipping the function


public CvRTParams() {
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

    // C++: bool CvRTParams::calc_var_importance
    private static native boolean get_calc_var_importance_0(long nativeObj);

    // C++: void CvRTParams::calc_var_importance
    private static native void set_calc_var_importance_0(long nativeObj, boolean calc_var_importance);

    // C++: int CvRTParams::nactive_vars
    private static native int get_nactive_vars_0(long nativeObj);

    // C++: void CvRTParams::nactive_vars
    private static native void set_nactive_vars_0(long nativeObj, int nactive_vars);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
