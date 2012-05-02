
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;



// C++: class CvEMParams
/**
 * Parameters of the EM algorithm. All parameters are public. You can initialize
 * them by a constructor and then override some of them directly if you want.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvemparams">org.opencv.ml.CvEMParams</a>
 */
public class CvEMParams {

    protected final long nativeObj;
    protected CvEMParams(long addr) { nativeObj = addr; }


    //
    // C++: int CvEMParams::nclusters
    //

    public  int get_nclusters()
    {

        int retVal = get_nclusters_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvEMParams::nclusters
    //

    public  void set_nclusters(int nclusters)
    {

        set_nclusters_0(nativeObj, nclusters);

        return;
    }


    //
    // C++: int CvEMParams::cov_mat_type
    //

    public  int get_cov_mat_type()
    {

        int retVal = get_cov_mat_type_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvEMParams::cov_mat_type
    //

    public  void set_cov_mat_type(int cov_mat_type)
    {

        set_cov_mat_type_0(nativeObj, cov_mat_type);

        return;
    }


    //
    // C++: int CvEMParams::start_step
    //

    public  int get_start_step()
    {

        int retVal = get_start_step_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvEMParams::start_step
    //

    public  void set_start_step(int start_step)
    {

        set_start_step_0(nativeObj, start_step);

        return;
    }


    //
    // C++: CvTermCriteria CvEMParams::term_crit
    //

    // Return type 'CvTermCriteria' is not supported, skipping the function


    //
    // C++: void CvEMParams::term_crit
    //

    // Unknown type 'CvTermCriteria' (I), skipping the function


/**
 * The constructors
 *
 * The default constructor represents a rough rule-of-the-thumb:
 *
 * With another contstructor it is possible to override a variety of parameters
 * from a single number of mixtures (the only essential problem-dependent
 * parameter) to initial values for the mixture parameters.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvemparams-cvemparams">org.opencv.ml.CvEMParams.CvEMParams</a>
 */
public CvEMParams() {
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

    // C++: int CvEMParams::nclusters
    private static native int get_nclusters_0(long nativeObj);

    // C++: void CvEMParams::nclusters
    private static native void set_nclusters_0(long nativeObj, int nclusters);

    // C++: int CvEMParams::cov_mat_type
    private static native int get_cov_mat_type_0(long nativeObj);

    // C++: void CvEMParams::cov_mat_type
    private static native void set_cov_mat_type_0(long nativeObj, int cov_mat_type);

    // C++: int CvEMParams::start_step
    private static native int get_start_step_0(long nativeObj);

    // C++: void CvEMParams::start_step
    private static native void set_start_step_0(long nativeObj, int start_step);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
