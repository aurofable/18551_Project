
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;



// C++: class CvGBTreesParams
/**
 * GBT training parameters.
 *
 * The structure contains parameters for each sigle decision tree in the
 * ensemble, as well as the whole model characteristics. The structure is
 * derived from "CvDTreeParams" but not all of the decision tree parameters are
 * supported: cross-validation, pruning, and class priorities are not used.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtreesparams">org.opencv.ml.CvGBTreesParams</a>
 */
public class CvGBTreesParams {

    protected final long nativeObj;
    protected CvGBTreesParams(long addr) { nativeObj = addr; }


    //
    // C++: int CvGBTreesParams::weak_count
    //

    public  int get_weak_count()
    {

        int retVal = get_weak_count_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvGBTreesParams::weak_count
    //

    public  void set_weak_count(int weak_count)
    {

        set_weak_count_0(nativeObj, weak_count);

        return;
    }


    //
    // C++: int CvGBTreesParams::loss_function_type
    //

    public  int get_loss_function_type()
    {

        int retVal = get_loss_function_type_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvGBTreesParams::loss_function_type
    //

    public  void set_loss_function_type(int loss_function_type)
    {

        set_loss_function_type_0(nativeObj, loss_function_type);

        return;
    }


    //
    // C++: float CvGBTreesParams::subsample_portion
    //

    public  float get_subsample_portion()
    {

        float retVal = get_subsample_portion_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvGBTreesParams::subsample_portion
    //

    public  void set_subsample_portion(float subsample_portion)
    {

        set_subsample_portion_0(nativeObj, subsample_portion);

        return;
    }


    //
    // C++: float CvGBTreesParams::shrinkage
    //

    public  float get_shrinkage()
    {

        float retVal = get_shrinkage_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvGBTreesParams::shrinkage
    //

    public  void set_shrinkage(float shrinkage)
    {

        set_shrinkage_0(nativeObj, shrinkage);

        return;
    }


/**
 * By default the following constructor is used:
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtreesparams-cvgbtreesparams">org.opencv.ml.CvGBTreesParams.CvGBTreesParams</a>
 */
public CvGBTreesParams() {
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

    // C++: int CvGBTreesParams::weak_count
    private static native int get_weak_count_0(long nativeObj);

    // C++: void CvGBTreesParams::weak_count
    private static native void set_weak_count_0(long nativeObj, int weak_count);

    // C++: int CvGBTreesParams::loss_function_type
    private static native int get_loss_function_type_0(long nativeObj);

    // C++: void CvGBTreesParams::loss_function_type
    private static native void set_loss_function_type_0(long nativeObj, int loss_function_type);

    // C++: float CvGBTreesParams::subsample_portion
    private static native float get_subsample_portion_0(long nativeObj);

    // C++: void CvGBTreesParams::subsample_portion
    private static native void set_subsample_portion_0(long nativeObj, float subsample_portion);

    // C++: float CvGBTreesParams::shrinkage
    private static native float get_shrinkage_0(long nativeObj);

    // C++: void CvGBTreesParams::shrinkage
    private static native void set_shrinkage_0(long nativeObj, float shrinkage);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
