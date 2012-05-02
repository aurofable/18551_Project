
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

public class Video {

    public static final int
            OPTFLOW_USE_INITIAL_FLOW = 4,
            OPTFLOW_FARNEBACK_GAUSSIAN = 256;


    //
    // C++:  RotatedRect CamShift(Mat probImage, Rect& window, TermCriteria criteria)
    //

/**
 * Finds an object center, size, and orientation.
 *
 * The function implements the CAMSHIFT object tracking algrorithm [Bradski98].
 * First, it finds an object center using "meanShift" and then adjusts the
 * window size and finds the optimal rotation. The function returns the rotated
 * rectangle structure that includes the object position, size, and orientation.
 * The next position of the search window can be obtained with "RotatedRect.boundingRect()".
 *
 * See the OpenCV sample "camshiftdemo.c" that tracks colored objects.
 *
 * @param probImage Back projection of the object histogram. See
 * "calcBackProject".
 * @param window Initial search window.
 * @param criteria Stop criteria for the underlying "meanShift".
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#camshift">org.opencv.video.Video.CamShift</a>
 */
    public static RotatedRect CamShift(Mat probImage, Rect window, TermCriteria criteria)
    {
        double[] window_out = new double[4];
        RotatedRect retVal = new RotatedRect(CamShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon));
        if(window!=null){ window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
        return retVal;
    }


    //
    // C++:  double calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration)
    //

/**
 * Calculates a global motion orientation in a selected region.
 *
 * The function calculates an average motion direction in the selected region
 * and returns the angle between 0 degrees and 360 degrees. The average
 * direction is computed from the weighted orientation histogram, where a recent
 * motion has a larger weight and the motion occurred in the past has a smaller
 * weight, as recorded in "mhi".
 *
 * @param orientation Motion gradient orientation image calculated by the
 * function "calcMotionGradient".
 * @param mask Mask image. It may be a conjunction of a valid gradient mask,
 * also calculated by "calcMotionGradient", and the mask of a region whose
 * direction needs to be calculated.
 * @param mhi Motion history image calculated by "updateMotionHistory".
 * @param timestamp Timestamp passed to "updateMotionHistory".
 * @param duration Maximum duration of a motion track in milliseconds, passed to
 * "updateMotionHistory".
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcglobalorientation">org.opencv.video.Video.calcGlobalOrientation</a>
 */
    public static double calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration)
    {

        double retVal = calcGlobalOrientation_0(orientation.nativeObj, mask.nativeObj, mhi.nativeObj, timestamp, duration);

        return retVal;
    }


    //
    // C++:  void calcMotionGradient(Mat mhi, Mat& mask, Mat& orientation, double delta1, double delta2, int apertureSize = 3)
    //

/**
 * Calculates a gradient orientation of a motion history image.
 *
 * The function calculates a gradient orientation at each pixel (x, y) as:
 *
 * orientation(x,y)= arctan((dmhi/dy)/(dmhi/dx))
 *
 * In fact, "fastArctan" and "phase" are used so that the computed angle is
 * measured in degrees and covers the full range 0..360. Also, the "mask" is
 * filled to indicate pixels where the computed angle is valid.
 *
 * @param mhi Motion history single-channel floating-point image.
 * @param mask Output mask image that has the type "CV_8UC1" and the same size
 * as "mhi". Its non-zero elements mark pixels where the motion gradient data is
 * correct.
 * @param orientation Output motion gradient orientation image that has the same
 * type and the same size as "mhi". Each pixel of the image is a motion
 * orientation, from 0 to 360 degrees.
 * @param delta1 Minimal (or maximal) allowed difference between "mhi" values
 * within a pixel neighorhood.
 * @param delta2 Maximal (or minimal) allowed difference between "mhi" values
 * within a pixel neighorhood. That is, the function finds the minimum (m(x,y))
 * and maximum (M(x,y)) "mhi" values over 3 x 3 neighborhood of each pixel and
 * marks the motion orientation at (x, y) as valid only if
 *
 * min(delta1, delta2) <= M(x,y)-m(x,y) <= max(delta1, delta2).
 * @param apertureSize Aperture size of the "Sobel" operator.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcmotiongradient">org.opencv.video.Video.calcMotionGradient</a>
 */
    public static void calcMotionGradient(Mat mhi, Mat mask, Mat orientation, double delta1, double delta2, int apertureSize)
    {

        calcMotionGradient_0(mhi.nativeObj, mask.nativeObj, orientation.nativeObj, delta1, delta2, apertureSize);

        return;
    }

/**
 * Calculates a gradient orientation of a motion history image.
 *
 * The function calculates a gradient orientation at each pixel (x, y) as:
 *
 * orientation(x,y)= arctan((dmhi/dy)/(dmhi/dx))
 *
 * In fact, "fastArctan" and "phase" are used so that the computed angle is
 * measured in degrees and covers the full range 0..360. Also, the "mask" is
 * filled to indicate pixels where the computed angle is valid.
 *
 * @param mhi Motion history single-channel floating-point image.
 * @param mask Output mask image that has the type "CV_8UC1" and the same size
 * as "mhi". Its non-zero elements mark pixels where the motion gradient data is
 * correct.
 * @param orientation Output motion gradient orientation image that has the same
 * type and the same size as "mhi". Each pixel of the image is a motion
 * orientation, from 0 to 360 degrees.
 * @param delta1 Minimal (or maximal) allowed difference between "mhi" values
 * within a pixel neighorhood.
 * @param delta2 Maximal (or minimal) allowed difference between "mhi" values
 * within a pixel neighorhood. That is, the function finds the minimum (m(x,y))
 * and maximum (M(x,y)) "mhi" values over 3 x 3 neighborhood of each pixel and
 * marks the motion orientation at (x, y) as valid only if
 *
 * min(delta1, delta2) <= M(x,y)-m(x,y) <= max(delta1, delta2).
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcmotiongradient">org.opencv.video.Video.calcMotionGradient</a>
 */
    public static void calcMotionGradient(Mat mhi, Mat mask, Mat orientation, double delta1, double delta2)
    {

        calcMotionGradient_1(mhi.nativeObj, mask.nativeObj, orientation.nativeObj, delta1, delta2);

        return;
    }


    //
    // C++:  void calcOpticalFlowFarneback(Mat prev, Mat next, Mat& flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    //

/**
 * Computes a dense optical flow using the Gunnar Farneback's algorithm.
 *
 * The function finds an optical flow for each "prevImg" pixel using the
 * [Farneback2003] alorithm so that
 *
 * prevImg(y,x) ~ nextImg(y + flow(y,x)[1], x + flow(y,x)[0])
 *
 * @param prev a prev
 * @param next a next
 * @param flow Computed flow image that has the same size as "prevImg" and type
 * "CV_32FC2".
 * @param pyr_scale a pyr_scale
 * @param levels Number of pyramid layers including the initial image.
 * "levels=1" means that no extra layers are created and only the original
 * images are used.
 * @param winsize Averaging window size. Larger values increase the algorithm
 * robustness to image noise and give more chances for fast motion detection,
 * but yield more blurred motion field.
 * @param iterations Number of iterations the algorithm does at each pyramid
 * level.
 * @param poly_n a poly_n
 * @param poly_sigma a poly_sigma
 * @param flags Operation flags that can be a combination of the following:
 *   * OPTFLOW_USE_INITIAL_FLOW Use the input "flow" as an initial flow
 * approximation.
 *   * OPTFLOW_FARNEBACK_GAUSSIAN Use the Gaussian winsizexwinsize filter
 * instead of a box filter of the same size for optical flow estimation.
 * Usually, this option gives z more accurate flow than with a box filter, at
 * the cost of lower speed. Normally, "winsize" for a Gaussian window should be
 * set to a larger value to achieve the same level of robustness.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowfarneback">org.opencv.video.Video.calcOpticalFlowFarneback</a>
 */
    public static void calcOpticalFlowFarneback(Mat prev, Mat next, Mat flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    {

        calcOpticalFlowFarneback_0(prev.nativeObj, next.nativeObj, flow.nativeObj, pyr_scale, levels, winsize, iterations, poly_n, poly_sigma, flags);

        return;
    }


    //
    // C++:  void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, vector_Point2f prevPts, vector_Point2f& nextPts, vector_uchar& status, vector_float& err, Size winSize = Size(21,21), int maxLevel = 3, TermCriteria criteria = TermCriteria( TermCriteria::COUNT+TermCriteria::EPS, 30, 0.01), double derivLambda = 0.5, int flags = 0, double minEigThreshold = 1e-4)
    //

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number. If set to 0, pyramids
 * are not used (single level). If set to 1, two levels are used, and so on.
 * @param criteria Parameter specifying the termination criteria of the
 * iterative search algorithm (after the specified maximum number of iterations
 * "criteria.maxCount" or when the search window moves by less than
 * "criteria.epsilon".
 * @param derivLambda Not used.
 * @param flags Operation flags:
 *   * OPTFLOW_USE_INITIAL_FLOW Use initial estimations stored in "nextPts". If
 * the flag is not set, then "prevPts" is copied to "nextPts" and is considered
 * as the initial estimate.
 * @param minEigThreshold a minEigThreshold
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize, int maxLevel, TermCriteria criteria, double derivLambda, int flags, double minEigThreshold)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_0(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, derivLambda, flags, minEigThreshold);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number. If set to 0, pyramids
 * are not used (single level). If set to 1, two levels are used, and so on.
 * @param criteria Parameter specifying the termination criteria of the
 * iterative search algorithm (after the specified maximum number of iterations
 * "criteria.maxCount" or when the search window moves by less than
 * "criteria.epsilon".
 * @param derivLambda Not used.
 * @param flags Operation flags:
 *   * OPTFLOW_USE_INITIAL_FLOW Use initial estimations stored in "nextPts". If
 * the flag is not set, then "prevPts" is copied to "nextPts" and is considered
 * as the initial estimate.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize, int maxLevel, TermCriteria criteria, double derivLambda, int flags)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_1(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, derivLambda, flags);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number. If set to 0, pyramids
 * are not used (single level). If set to 1, two levels are used, and so on.
 * @param criteria Parameter specifying the termination criteria of the
 * iterative search algorithm (after the specified maximum number of iterations
 * "criteria.maxCount" or when the search window moves by less than
 * "criteria.epsilon".
 * @param derivLambda Not used.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize, int maxLevel, TermCriteria criteria, double derivLambda)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_2(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, derivLambda);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number. If set to 0, pyramids
 * are not used (single level). If set to 1, two levels are used, and so on.
 * @param criteria Parameter specifying the termination criteria of the
 * iterative search algorithm (after the specified maximum number of iterations
 * "criteria.maxCount" or when the search window moves by less than
 * "criteria.epsilon".
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize, int maxLevel, TermCriteria criteria)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_3(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number. If set to 0, pyramids
 * are not used (single level). If set to 1, two levels are used, and so on.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize, int maxLevel)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_4(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 * @param winSize Size of the search window at each pyramid level.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err, Size winSize)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_5(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }

/**
 * Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.
 *
 * The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00].
 *
 * @param prevImg First 8-bit single-channel or 3-channel input image.
 * @param nextImg Second input image of the same size and the same type as
 * "prevImg".
 * @param prevPts Vector of 2D points for which the flow needs to be found. The
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts Output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image. When "OPTFLOW_USE_INITIAL_FLOW" flag is passed,
 * the vector must have the same size as in the input.
 * @param status Output status vector. Each element of the vector is set to 1 if
 * the flow for the corresponding features has been found. Otherwise, it is set
 * to 0.
 * @param err Output vector that contains the difference between patches around
 * the original and moved points.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, List<Point> prevPts, List<Point> nextPts, List<Byte> status, List<Float> err)
    {
        Mat prevPts_mat = Converters.vector_Point2f_to_Mat(prevPts);
        Mat nextPts_mat = Converters.vector_Point2f_to_Mat(nextPts);
        Mat status_mat = new Mat();
        Mat err_mat = new Mat();
        calcOpticalFlowPyrLK_6(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj);
        Converters.Mat_to_vector_Point2f(nextPts_mat, nextPts);
        Converters.Mat_to_vector_uchar(status_mat, status);
        Converters.Mat_to_vector_float(err_mat, err);
        return;
    }


    //
    // C++:  Mat estimateRigidTransform(Mat src, Mat dst, bool fullAffine)
    //

/**
 * Computes an optimal affine transformation between two 2D point sets.
 *
 * The function finds an optimal affine transform *[A|b]* (a "2 x 3"
 * floating-point matrix) that approximates best the affine transformation
 * between:
 *   * Two point sets
 *   * Two raster images. In this case, the function first finds some features
 * in the "src" image and finds the corresponding features in "dst" image. After
 * that, the problem is reduced to the first case.
 *
 * In case of point sets, the problem is formulated as follows: you need to find
 * a 2x2 matrix *A* and 2x1 vector *b* so that:
 *
 * [A^*|b^*] = arg min _([A|b]) sum _i|dst[i] - A (src[i])^T - b| ^2
 *
 * where "src[i]" and "dst[i]" are the i-th points in "src" and "dst",
 * respectively
 *
 * [A|b] can be either arbitrary (when "fullAffine=true") or have a form of
 *
 * a_11 a_12 b_1
 * -a_12 a_11 b_2
 *
 * when "fullAffine=false".
 *
 * @param src First input 2D point set stored in "std.vector" or "Mat", or an
 * image stored in "Mat".
 * @param dst Second input 2D point set of the same size and the same type as
 * "A", or another image.
 * @param fullAffine If true, the function finds an optimal affine
 * transformation with no additional resrictions (6 degrees of freedom).
 * Otherwise, the class of transformations to choose from is limited to
 * combinations of translation, rotation, and uniform scaling (5 degrees of
 * freedom).
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#estimaterigidtransform">org.opencv.video.Video.estimateRigidTransform</a>
 * @see org.opencv.calib3d.Calib3d.findHomography
 * @see org.opencv.imgproc.Imgproc.getAffineTransform
 * @see org.opencv.imgproc.Imgproc.getPerspectiveTransform
 */
    public static Mat estimateRigidTransform(Mat src, Mat dst, boolean fullAffine)
    {

        Mat retVal = new Mat(estimateRigidTransform_0(src.nativeObj, dst.nativeObj, fullAffine));

        return retVal;
    }


    //
    // C++:  int meanShift(Mat probImage, Rect& window, TermCriteria criteria)
    //

/**
 * Finds an object on a back projection image.
 *
 * The function implements the iterative object search algorithm. It takes the
 * input back projection of an object and the initial position. The mass center
 * in "window" of the back projection image is computed and the search window
 * center shifts to the mass center. The procedure is repeated until the
 * specified number of iterations "criteria.maxCount" is done or until the
 * window center shifts by less than "criteria.epsilon". The algorithm is used
 * inside "CamShift" and, unlike "CamShift", the search window size or
 * orientation do not change during the search. You can simply pass the output
 * of "calcBackProject" to this function. But better results can be obtained if
 * you pre-filter the back projection and remove the noise. For example, you can
 * do this by retrieving connected components with "findContours", throwing away
 * contours with small area ("contourArea"), and rendering the remaining
 * contours with "drawContours".
 *
 * @param probImage Back projection of the object histogram. See
 * "calcBackProject" for details.
 * @param window Initial search window.
 * @param criteria Stop criteria for the iterative search algorithm.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#meanshift">org.opencv.video.Video.meanShift</a>
 */
    public static int meanShift(Mat probImage, Rect window, TermCriteria criteria)
    {
        double[] window_out = new double[4];
        int retVal = meanShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon);
        if(window!=null){ window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
        return retVal;
    }


    //
    // C++:  void segmentMotion(Mat mhi, Mat& segmask, vector_Rect& boundingRects, double timestamp, double segThresh)
    //

/**
 * Splits a motion history image into a few parts corresponding to separate
 * independent motions (for example, left hand, right hand).
 *
 * The function finds all of the motion segments and marks them in "segmask"
 * with individual values (1,2,...). It also computes a vector with ROIs of
 * motion connected components. After that the motion direction for every
 * component can be calculated with "calcGlobalOrientation" using the extracted
 * mask of the particular component.
 *
 * @param mhi Motion history image.
 * @param segmask Image where the found mask should be stored, single-channel,
 * 32-bit floating-point.
 * @param boundingRects Vector containing ROIs of motion connected components.
 * @param timestamp Current time in milliseconds or other units.
 * @param segThresh Segmentation threshold that is recommended to be equal to
 * the interval between motion history "steps" or greater.
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#segmentmotion">org.opencv.video.Video.segmentMotion</a>
 */
    public static void segmentMotion(Mat mhi, Mat segmask, List<Rect> boundingRects, double timestamp, double segThresh)
    {
        Mat boundingRects_mat = new Mat();
        segmentMotion_0(mhi.nativeObj, segmask.nativeObj, boundingRects_mat.nativeObj, timestamp, segThresh);
        Converters.Mat_to_vector_Rect(boundingRects_mat, boundingRects);
        return;
    }


    //
    // C++:  void updateMotionHistory(Mat silhouette, Mat& mhi, double timestamp, double duration)
    //

/**
 * Updates the motion history image by a moving silhouette.
 *
 * The function updates the motion history image as follows:
 *
 * mhi(x,y)= timestamp if silhouette(x,y) != 0; 0 if silhouette(x,y) = 0 and mhi
 * < (timestamp - duration); mhi(x,y) otherwise
 *
 * That is, MHI pixels where the motion occurs are set to the current
 * "timestamp", while the pixels where the motion happened last time a long time
 * ago are cleared.
 *
 * The function, together with "calcMotionGradient" and "calcGlobalOrientation",
 * implements a motion templates technique described in [Davis97] and
 * [Bradski00].
 * See also the OpenCV sample "motempl.c" that demonstrates the use of all the
 * motion template functions.
 *
 * @param silhouette Silhouette mask that has non-zero pixels where the motion
 * occurs.
 * @param mhi Motion history image that is updated by the function
 * (single-channel, 32-bit floating-point).
 * @param timestamp Current time in milliseconds or other units.
 * @param duration Maximal duration of the motion track in the same units as
 * "timestamp".
 *
 * @see <a href="http://opencv.itseez.com/modules/video/doc/motion_analysis_and_object_tracking.html#updatemotionhistory">org.opencv.video.Video.updateMotionHistory</a>
 */
    public static void updateMotionHistory(Mat silhouette, Mat mhi, double timestamp, double duration)
    {

        updateMotionHistory_0(silhouette.nativeObj, mhi.nativeObj, timestamp, duration);

        return;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  RotatedRect CamShift(Mat probImage, Rect& window, TermCriteria criteria)
    private static native double[] CamShift_0(long probImage_nativeObj, int window_x, int window_y, int window_width, int window_height, double[] window_out, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++:  double calcGlobalOrientation(Mat orientation, Mat mask, Mat mhi, double timestamp, double duration)
    private static native double calcGlobalOrientation_0(long orientation_nativeObj, long mask_nativeObj, long mhi_nativeObj, double timestamp, double duration);

    // C++:  void calcMotionGradient(Mat mhi, Mat& mask, Mat& orientation, double delta1, double delta2, int apertureSize = 3)
    private static native void calcMotionGradient_0(long mhi_nativeObj, long mask_nativeObj, long orientation_nativeObj, double delta1, double delta2, int apertureSize);
    private static native void calcMotionGradient_1(long mhi_nativeObj, long mask_nativeObj, long orientation_nativeObj, double delta1, double delta2);

    // C++:  void calcOpticalFlowFarneback(Mat prev, Mat next, Mat& flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    private static native void calcOpticalFlowFarneback_0(long prev_nativeObj, long next_nativeObj, long flow_nativeObj, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags);

    // C++:  void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, vector_Point2f prevPts, vector_Point2f& nextPts, vector_uchar& status, vector_float& err, Size winSize = Size(21,21), int maxLevel = 3, TermCriteria criteria = TermCriteria( TermCriteria::COUNT+TermCriteria::EPS, 30, 0.01), double derivLambda = 0.5, int flags = 0, double minEigThreshold = 1e-4)
    private static native void calcOpticalFlowPyrLK_0(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, int criteria_type, int criteria_maxCount, double criteria_epsilon, double derivLambda, int flags, double minEigThreshold);
    private static native void calcOpticalFlowPyrLK_1(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, int criteria_type, int criteria_maxCount, double criteria_epsilon, double derivLambda, int flags);
    private static native void calcOpticalFlowPyrLK_2(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, int criteria_type, int criteria_maxCount, double criteria_epsilon, double derivLambda);
    private static native void calcOpticalFlowPyrLK_3(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native void calcOpticalFlowPyrLK_4(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel);
    private static native void calcOpticalFlowPyrLK_5(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height);
    private static native void calcOpticalFlowPyrLK_6(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj);

    // C++:  Mat estimateRigidTransform(Mat src, Mat dst, bool fullAffine)
    private static native long estimateRigidTransform_0(long src_nativeObj, long dst_nativeObj, boolean fullAffine);

    // C++:  int meanShift(Mat probImage, Rect& window, TermCriteria criteria)
    private static native int meanShift_0(long probImage_nativeObj, int window_x, int window_y, int window_width, int window_height, double[] window_out, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++:  void segmentMotion(Mat mhi, Mat& segmask, vector_Rect& boundingRects, double timestamp, double segThresh)
    private static native void segmentMotion_0(long mhi_nativeObj, long segmask_nativeObj, long boundingRects_mat_nativeObj, double timestamp, double segThresh);

    // C++:  void updateMotionHistory(Mat silhouette, Mat& mhi, double timestamp, double duration)
    private static native void updateMotionHistory_0(long silhouette_nativeObj, long mhi_nativeObj, double timestamp, double duration);

}
