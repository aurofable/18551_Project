
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.calib3d;

import org.opencv.core.Mat;

// C++: class StereoBM
/**
 * Class for computing stereo correspondence using the block matching algorithm.
 *
 * The class is a C++ wrapper for the associated functions. In particular,
 * "StereoBM.operator()" is the wrapper for "StereoBM.operator()".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm">org.opencv.calib3d.StereoBM</a>
 */
public class StereoBM {

    protected final long nativeObj;
    protected StereoBM(long addr) { nativeObj = addr; }


    public static final int
            PREFILTER_NORMALIZED_RESPONSE = 0,
            PREFILTER_XSOBEL = 1,
            BASIC_PRESET = 0,
            FISH_EYE_PRESET = 1,
            NARROW_PRESET = 2;


    //
    // C++:   StereoBM::StereoBM()
    //

/**
 * The constructors.
 *
 * The constructors initialize "StereoBM" state. You can then call
 * "StereoBM.operator()" to compute disparity for a specific stereo pair.
 *
 * Note: In the C API you need to deallocate "CvStereoBM" state when it is not
 * needed anymore using "cvReleaseStereoBMState(&stereobm)".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-stereobm">org.opencv.calib3d.StereoBM.StereoBM</a>
 */
    public   StereoBM()
    {

        nativeObj = StereoBM_0();

        return;
    }


    //
    // C++:   StereoBM::StereoBM(int preset, int ndisparities = 0, int SADWindowSize = 21)
    //

/**
 * The constructors.
 *
 * The constructors initialize "StereoBM" state. You can then call
 * "StereoBM.operator()" to compute disparity for a specific stereo pair.
 *
 * Note: In the C API you need to deallocate "CvStereoBM" state when it is not
 * needed anymore using "cvReleaseStereoBMState(&stereobm)".
 *
 * @param preset specifies the whole set of algorithm parameters, one of:
 *   * BASIC_PRESET - parameters suitable for general cameras
 *   * FISH_EYE_PRESET - parameters suitable for wide-angle cameras
 *   * NARROW_PRESET - parameters suitable for narrow-angle cameras
 *
 * After constructing the class, you can override any parameters set by the
 * preset.
 * @param ndisparities the disparity search range. For each pixel algorithm will
 * find the best disparity from 0 (default minimum disparity) to "ndisparities".
 * The search range can then be shifted by changing the minimum disparity.
 * @param SADWindowSize the linear size of the blocks compared by the algorithm.
 * The size should be odd (as the block is centered at the current pixel).
 * Larger block size implies smoother, though less accurate disparity map.
 * Smaller block size gives more detailed disparity map, but there is higher
 * chance for algorithm to find a wrong correspondence.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-stereobm">org.opencv.calib3d.StereoBM.StereoBM</a>
 */
    public   StereoBM(int preset, int ndisparities, int SADWindowSize)
    {

        nativeObj = StereoBM_1(preset, ndisparities, SADWindowSize);

        return;
    }

/**
 * The constructors.
 *
 * The constructors initialize "StereoBM" state. You can then call
 * "StereoBM.operator()" to compute disparity for a specific stereo pair.
 *
 * Note: In the C API you need to deallocate "CvStereoBM" state when it is not
 * needed anymore using "cvReleaseStereoBMState(&stereobm)".
 *
 * @param preset specifies the whole set of algorithm parameters, one of:
 *   * BASIC_PRESET - parameters suitable for general cameras
 *   * FISH_EYE_PRESET - parameters suitable for wide-angle cameras
 *   * NARROW_PRESET - parameters suitable for narrow-angle cameras
 *
 * After constructing the class, you can override any parameters set by the
 * preset.
 * @param ndisparities the disparity search range. For each pixel algorithm will
 * find the best disparity from 0 (default minimum disparity) to "ndisparities".
 * The search range can then be shifted by changing the minimum disparity.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-stereobm">org.opencv.calib3d.StereoBM.StereoBM</a>
 */
    public   StereoBM(int preset, int ndisparities)
    {

        nativeObj = StereoBM_2(preset, ndisparities);

        return;
    }

/**
 * The constructors.
 *
 * The constructors initialize "StereoBM" state. You can then call
 * "StereoBM.operator()" to compute disparity for a specific stereo pair.
 *
 * Note: In the C API you need to deallocate "CvStereoBM" state when it is not
 * needed anymore using "cvReleaseStereoBMState(&stereobm)".
 *
 * @param preset specifies the whole set of algorithm parameters, one of:
 *   * BASIC_PRESET - parameters suitable for general cameras
 *   * FISH_EYE_PRESET - parameters suitable for wide-angle cameras
 *   * NARROW_PRESET - parameters suitable for narrow-angle cameras
 *
 * After constructing the class, you can override any parameters set by the
 * preset.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-stereobm">org.opencv.calib3d.StereoBM.StereoBM</a>
 */
    public   StereoBM(int preset)
    {

        nativeObj = StereoBM_3(preset);

        return;
    }


    //
    // C++:  void StereoBM::operator()(Mat left, Mat right, Mat& disparity, int disptype = CV_16S)
    //

/**
 * Computes disparity using the BM algorithm for a rectified stereo pair.
 *
 * The method executes the BM algorithm on a rectified stereo pair. See the
 * "stereo_match.cpp" OpenCV sample on how to prepare images and call the
 * method. Note that the method is not constant, thus you should not use the
 * same "StereoBM" instance from within different threads simultaneously.
 *
 * @param left Left 8-bit single-channel or 3-channel image.
 * @param right Right image of the same size and the same type as the left one.
 * @param disparity a disparity
 * @param disptype Type of the output disparity map, "CV_16S" (default) or
 * "CV_32F".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-operator">org.opencv.calib3d.StereoBM.operator()</a>
 */
    public  void compute(Mat left, Mat right, Mat disparity, int disptype)
    {

        compute_0(nativeObj, left.nativeObj, right.nativeObj, disparity.nativeObj, disptype);

        return;
    }

/**
 * Computes disparity using the BM algorithm for a rectified stereo pair.
 *
 * The method executes the BM algorithm on a rectified stereo pair. See the
 * "stereo_match.cpp" OpenCV sample on how to prepare images and call the
 * method. Note that the method is not constant, thus you should not use the
 * same "StereoBM" instance from within different threads simultaneously.
 *
 * @param left Left 8-bit single-channel or 3-channel image.
 * @param right Right image of the same size and the same type as the left one.
 * @param disparity a disparity
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereobm-operator">org.opencv.calib3d.StereoBM.operator()</a>
 */
    public  void compute(Mat left, Mat right, Mat disparity)
    {

        compute_1(nativeObj, left.nativeObj, right.nativeObj, disparity.nativeObj);

        return;
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

    // C++:   StereoBM::StereoBM()
    private static native long StereoBM_0();

    // C++:   StereoBM::StereoBM(int preset, int ndisparities = 0, int SADWindowSize = 21)
    private static native long StereoBM_1(int preset, int ndisparities, int SADWindowSize);
    private static native long StereoBM_2(int preset, int ndisparities);
    private static native long StereoBM_3(int preset);

    // C++:  void StereoBM::operator()(Mat left, Mat right, Mat& disparity, int disptype = CV_16S)
    private static native void compute_0(long nativeObj, long left_nativeObj, long right_nativeObj, long disparity_nativeObj, int disptype);
    private static native void compute_1(long nativeObj, long left_nativeObj, long right_nativeObj, long disparity_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
