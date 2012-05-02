
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import org.opencv.core.Mat;

// C++: class BackgroundSubtractorMOG
/**
 * Gaussian Mixture-based Backbround/Foreground Segmentation Algorithm.
 *
 * The class implements the algorithm described in P. KadewTraKuPong and R.
 * Bowden, *An improved adaptive background mixture model for real-time tracking
 * with shadow detection*, Proc. 2nd European Workshp on Advanced Video-Based
 * Surveillance Systems, 2001: http://personal.ee.surrey.ac.uk/Personal/R.Bowden/publications/avbs01/avbs01.pdf
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog">org.opencv.video.BackgroundSubtractorMOG : public BackgroundSubtractor</a>
 */
public class BackgroundSubtractorMOG {

    protected final long nativeObj;
    protected BackgroundSubtractorMOG(long addr) { nativeObj = addr; }


    //
    // C++:   BackgroundSubtractorMOG::BackgroundSubtractorMOG()
    //

/**
 * The contructors
 *
 * Default constructor sets all parameters to default values.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog-backgroundsubtractormog">org.opencv.video.BackgroundSubtractorMOG.BackgroundSubtractorMOG</a>
 */
    public   BackgroundSubtractorMOG()
    {

        nativeObj = BackgroundSubtractorMOG_0();

        return;
    }


    //
    // C++:   BackgroundSubtractorMOG::BackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio, double noiseSigma = 0)
    //

/**
 * The contructors
 *
 * Default constructor sets all parameters to default values.
 *
 * @param history Length of the history.
 * @param nmixtures Number of Gaussian mixtures.
 * @param backgroundRatio Background ratio.
 * @param noiseSigma Noise strength.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog-backgroundsubtractormog">org.opencv.video.BackgroundSubtractorMOG.BackgroundSubtractorMOG</a>
 */
    public   BackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio, double noiseSigma)
    {

        nativeObj = BackgroundSubtractorMOG_1(history, nmixtures, backgroundRatio, noiseSigma);

        return;
    }

/**
 * The contructors
 *
 * Default constructor sets all parameters to default values.
 *
 * @param history Length of the history.
 * @param nmixtures Number of Gaussian mixtures.
 * @param backgroundRatio Background ratio.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog-backgroundsubtractormog">org.opencv.video.BackgroundSubtractorMOG.BackgroundSubtractorMOG</a>
 */
    public   BackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio)
    {

        nativeObj = BackgroundSubtractorMOG_2(history, nmixtures, backgroundRatio);

        return;
    }


    //
    // C++:  void BackgroundSubtractor::operator()(Mat image, Mat& fgmask, double learningRate = 0)
    //

/**
 * Updates the background model and returns the foreground mask
 *
 * Parameters are the same as in "BackgroundSubtractor.operator()"
 *
 * @param image a image
 * @param fgmask a fgmask
 * @param learningRate a learningRate
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog-operator">org.opencv.video.BackgroundSubtractorMOG.operator()</a>
 */
    public  void apply(Mat image, Mat fgmask, double learningRate)
    {

        apply_0(nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);

        return;
    }

/**
 * Updates the background model and returns the foreground mask
 *
 * Parameters are the same as in "BackgroundSubtractor.operator()"
 *
 * @param image a image
 * @param fgmask a fgmask
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog-operator">org.opencv.video.BackgroundSubtractorMOG.operator()</a>
 */
    public  void apply(Mat image, Mat fgmask)
    {

        apply_1(nativeObj, image.nativeObj, fgmask.nativeObj);

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

    // C++:   BackgroundSubtractorMOG::BackgroundSubtractorMOG()
    private static native long BackgroundSubtractorMOG_0();

    // C++:   BackgroundSubtractorMOG::BackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio, double noiseSigma = 0)
    private static native long BackgroundSubtractorMOG_1(int history, int nmixtures, double backgroundRatio, double noiseSigma);
    private static native long BackgroundSubtractorMOG_2(int history, int nmixtures, double backgroundRatio);

    // C++:  void BackgroundSubtractor::operator()(Mat image, Mat& fgmask, double learningRate = 0)
    private static native void apply_0(long nativeObj, long image_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_1(long nativeObj, long image_nativeObj, long fgmask_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
