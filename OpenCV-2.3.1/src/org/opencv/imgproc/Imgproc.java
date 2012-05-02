
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgproc;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

public class Imgproc {

    private static final int
            IPL_BORDER_CONSTANT = 0,
            IPL_BORDER_REPLICATE = 1,
            IPL_BORDER_REFLECT = 2,
            IPL_BORDER_WRAP = 3,
            IPL_BORDER_REFLECT_101 = 4,
            IPL_BORDER_TRANSPARENT = 5,
            CV_INPAINT_NS = 0,
            CV_INPAINT_TELEA = 1,
            CV_INTER_NN = 0,
            CV_INTER_LINEAR = 1,
            CV_INTER_CUBIC = 2,
            CV_INTER_AREA = 3,
            CV_INTER_LANCZOS4 = 4,
            CV_MOP_ERODE = 0,
            CV_MOP_DILATE = 1,
            CV_MOP_OPEN = 2,
            CV_MOP_CLOSE = 3,
            CV_MOP_GRADIENT = 4,
            CV_MOP_TOPHAT = 5,
            CV_MOP_BLACKHAT = 6,
            CV_RETR_EXTERNAL = 0,
            CV_RETR_LIST = 1,
            CV_RETR_CCOMP = 2,
            CV_RETR_TREE = 3,
            CV_CHAIN_APPROX_NONE = 1,
            CV_CHAIN_APPROX_SIMPLE = 2,
            CV_CHAIN_APPROX_TC89_L1 = 3,
            CV_CHAIN_APPROX_TC89_KCOS = 4,
            CV_THRESH_BINARY = 0,
            CV_THRESH_BINARY_INV = 1,
            CV_THRESH_TRUNC = 2,
            CV_THRESH_TOZERO = 3,
            CV_THRESH_TOZERO_INV = 4,
            CV_THRESH_MASK = 7,
            CV_THRESH_OTSU = 8;


    public static final int
            CV_BLUR_NO_SCALE = 0,
            CV_BLUR = 1,
            CV_GAUSSIAN = 2,
            CV_MEDIAN = 3,
            CV_BILATERAL = 4,
            CV_GAUSSIAN_5x5 = 7,
            CV_SCHARR = -1,
            CV_MAX_SOBEL_KSIZE = 7,
            CV_WARP_FILL_OUTLIERS = 8,
            CV_WARP_INVERSE_MAP = 16,
            CV_SHAPE_RECT = 0,
            CV_SHAPE_CROSS = 1,
            CV_SHAPE_ELLIPSE = 2,
            CV_SHAPE_CUSTOM = 100,
            CV_CHAIN_CODE = 0,
            CV_LINK_RUNS = 5,
            CV_POLY_APPROX_DP = 0,
            CV_CONTOURS_MATCH_I1 = 1,
            CV_CONTOURS_MATCH_I2 = 2,
            CV_CONTOURS_MATCH_I3 = 3,
            CV_CLOCKWISE = 1,
            CV_COUNTER_CLOCKWISE = 2,
            CV_COMP_CORREL = 0,
            CV_COMP_CHISQR = 1,
            CV_COMP_INTERSECT = 2,
            CV_COMP_BHATTACHARYYA = 3,
            CV_DIST_MASK_3 = 3,
            CV_DIST_MASK_5 = 5,
            CV_DIST_MASK_PRECISE = 0,
            CV_DIST_USER = -1,
            CV_DIST_L1 = 1,
            CV_DIST_L2 = 2,
            CV_DIST_C = 3,
            CV_DIST_L12 = 4,
            CV_DIST_FAIR = 5,
            CV_DIST_WELSCH = 6,
            CV_DIST_HUBER = 7,
            CV_CANNY_L2_GRADIENT = (1 << 31),
            CV_HOUGH_STANDARD = 0,
            CV_HOUGH_PROBABILISTIC = 1,
            CV_HOUGH_MULTI_SCALE = 2,
            CV_HOUGH_GRADIENT = 3,
            BORDER_REPLICATE = IPL_BORDER_REPLICATE,
            BORDER_CONSTANT = IPL_BORDER_CONSTANT,
            BORDER_REFLECT = IPL_BORDER_REFLECT,
            BORDER_WRAP = IPL_BORDER_WRAP,
            BORDER_REFLECT_101 = IPL_BORDER_REFLECT_101,
            BORDER_REFLECT101 = BORDER_REFLECT_101,
            BORDER_TRANSPARENT = IPL_BORDER_TRANSPARENT,
            BORDER_DEFAULT = BORDER_REFLECT_101,
            BORDER_ISOLATED = 16,
            KERNEL_GENERAL = 0,
            KERNEL_SYMMETRICAL = 1,
            KERNEL_ASYMMETRICAL = 2,
            KERNEL_SMOOTH = 4,
            KERNEL_INTEGER = 8,
            MORPH_ERODE = CV_MOP_ERODE,
            MORPH_DILATE = CV_MOP_DILATE,
            MORPH_OPEN = CV_MOP_OPEN,
            MORPH_CLOSE = CV_MOP_CLOSE,
            MORPH_GRADIENT = CV_MOP_GRADIENT,
            MORPH_TOPHAT = CV_MOP_TOPHAT,
            MORPH_BLACKHAT = CV_MOP_BLACKHAT,
            MORPH_RECT = 0,
            MORPH_CROSS = 1,
            MORPH_ELLIPSE = 2,
            INTER_NEAREST = CV_INTER_NN,
            INTER_LINEAR = CV_INTER_LINEAR,
            INTER_CUBIC = CV_INTER_CUBIC,
            INTER_AREA = CV_INTER_AREA,
            INTER_LANCZOS4 = CV_INTER_LANCZOS4,
            INTER_MAX = 7,
            WARP_INVERSE_MAP = CV_WARP_INVERSE_MAP,
            INTER_BITS = 5,
            INTER_BITS2 = INTER_BITS*2,
            INTER_TAB_SIZE = (1<<INTER_BITS),
            INTER_TAB_SIZE2 = INTER_TAB_SIZE*INTER_TAB_SIZE,
            THRESH_BINARY = CV_THRESH_BINARY,
            THRESH_BINARY_INV = CV_THRESH_BINARY_INV,
            THRESH_TRUNC = CV_THRESH_TRUNC,
            THRESH_TOZERO = CV_THRESH_TOZERO,
            THRESH_TOZERO_INV = CV_THRESH_TOZERO_INV,
            THRESH_MASK = CV_THRESH_MASK,
            THRESH_OTSU = CV_THRESH_OTSU,
            ADAPTIVE_THRESH_MEAN_C = 0,
            ADAPTIVE_THRESH_GAUSSIAN_C = 1,
            PROJ_SPHERICAL_ORTHO = 0,
            PROJ_SPHERICAL_EQRECT = 1,
            GC_BGD = 0,
            GC_FGD = 1,
            GC_PR_BGD = 2,
            GC_PR_FGD = 3,
            GC_INIT_WITH_RECT = 0,
            GC_INIT_WITH_MASK = 1,
            GC_EVAL = 2,
            INPAINT_NS = CV_INPAINT_NS,
            INPAINT_TELEA = CV_INPAINT_TELEA,
            FLOODFILL_FIXED_RANGE = 1 << 16,
            FLOODFILL_MASK_ONLY = 1 << 17,
            COLOR_BGR2BGRA = 0,
            COLOR_RGB2RGBA = COLOR_BGR2BGRA,
            COLOR_BGRA2BGR = 1,
            COLOR_RGBA2RGB = COLOR_BGRA2BGR,
            COLOR_BGR2RGBA = 2,
            COLOR_RGB2BGRA = COLOR_BGR2RGBA,
            COLOR_RGBA2BGR = 3,
            COLOR_BGRA2RGB = COLOR_RGBA2BGR,
            COLOR_BGR2RGB = 4,
            COLOR_RGB2BGR = COLOR_BGR2RGB,
            COLOR_BGRA2RGBA = 5,
            COLOR_RGBA2BGRA = COLOR_BGRA2RGBA,
            COLOR_BGR2GRAY = 6,
            COLOR_RGB2GRAY = 7,
            COLOR_GRAY2BGR = 8,
            COLOR_GRAY2RGB = COLOR_GRAY2BGR,
            COLOR_GRAY2BGRA = 9,
            COLOR_GRAY2RGBA = COLOR_GRAY2BGRA,
            COLOR_BGRA2GRAY = 10,
            COLOR_RGBA2GRAY = 11,
            COLOR_BGR2BGR565 = 12,
            COLOR_RGB2BGR565 = 13,
            COLOR_BGR5652BGR = 14,
            COLOR_BGR5652RGB = 15,
            COLOR_BGRA2BGR565 = 16,
            COLOR_RGBA2BGR565 = 17,
            COLOR_BGR5652BGRA = 18,
            COLOR_BGR5652RGBA = 19,
            COLOR_GRAY2BGR565 = 20,
            COLOR_BGR5652GRAY = 21,
            COLOR_BGR2BGR555 = 22,
            COLOR_RGB2BGR555 = 23,
            COLOR_BGR5552BGR = 24,
            COLOR_BGR5552RGB = 25,
            COLOR_BGRA2BGR555 = 26,
            COLOR_RGBA2BGR555 = 27,
            COLOR_BGR5552BGRA = 28,
            COLOR_BGR5552RGBA = 29,
            COLOR_GRAY2BGR555 = 30,
            COLOR_BGR5552GRAY = 31,
            COLOR_BGR2XYZ = 32,
            COLOR_RGB2XYZ = 33,
            COLOR_XYZ2BGR = 34,
            COLOR_XYZ2RGB = 35,
            COLOR_BGR2YCrCb = 36,
            COLOR_RGB2YCrCb = 37,
            COLOR_YCrCb2BGR = 38,
            COLOR_YCrCb2RGB = 39,
            COLOR_BGR2HSV = 40,
            COLOR_RGB2HSV = 41,
            COLOR_BGR2Lab = 44,
            COLOR_RGB2Lab = 45,
            COLOR_BayerBG2BGR = 46,
            COLOR_BayerGB2BGR = 47,
            COLOR_BayerRG2BGR = 48,
            COLOR_BayerGR2BGR = 49,
            COLOR_BayerBG2RGB = COLOR_BayerRG2BGR,
            COLOR_BayerGB2RGB = COLOR_BayerGR2BGR,
            COLOR_BayerRG2RGB = COLOR_BayerBG2BGR,
            COLOR_BayerGR2RGB = COLOR_BayerGB2BGR,
            COLOR_BGR2Luv = 50,
            COLOR_RGB2Luv = 51,
            COLOR_BGR2HLS = 52,
            COLOR_RGB2HLS = 53,
            COLOR_HSV2BGR = 54,
            COLOR_HSV2RGB = 55,
            COLOR_Lab2BGR = 56,
            COLOR_Lab2RGB = 57,
            COLOR_Luv2BGR = 58,
            COLOR_Luv2RGB = 59,
            COLOR_HLS2BGR = 60,
            COLOR_HLS2RGB = 61,
            COLOR_BayerBG2BGR_VNG = 62,
            COLOR_BayerGB2BGR_VNG = 63,
            COLOR_BayerRG2BGR_VNG = 64,
            COLOR_BayerGR2BGR_VNG = 65,
            COLOR_BayerBG2RGB_VNG = COLOR_BayerRG2BGR_VNG,
            COLOR_BayerGB2RGB_VNG = COLOR_BayerGR2BGR_VNG,
            COLOR_BayerRG2RGB_VNG = COLOR_BayerBG2BGR_VNG,
            COLOR_BayerGR2RGB_VNG = COLOR_BayerGB2BGR_VNG,
            COLOR_BGR2HSV_FULL = 66,
            COLOR_RGB2HSV_FULL = 67,
            COLOR_BGR2HLS_FULL = 68,
            COLOR_RGB2HLS_FULL = 69,
            COLOR_HSV2BGR_FULL = 70,
            COLOR_HSV2RGB_FULL = 71,
            COLOR_HLS2BGR_FULL = 72,
            COLOR_HLS2RGB_FULL = 73,
            COLOR_LBGR2Lab = 74,
            COLOR_LRGB2Lab = 75,
            COLOR_LBGR2Luv = 76,
            COLOR_LRGB2Luv = 77,
            COLOR_Lab2LBGR = 78,
            COLOR_Lab2LRGB = 79,
            COLOR_Luv2LBGR = 80,
            COLOR_Luv2LRGB = 81,
            COLOR_BGR2YUV = 82,
            COLOR_RGB2YUV = 83,
            COLOR_YUV2BGR = 84,
            COLOR_YUV2RGB = 85,
            COLOR_BayerBG2GRAY = 86,
            COLOR_BayerGB2GRAY = 87,
            COLOR_BayerRG2GRAY = 88,
            COLOR_BayerGR2GRAY = 89,
            COLOR_YUV420i2RGB = 90,
            COLOR_YUV420i2BGR = 91,
            COLOR_YUV420sp2RGB = 92,
            COLOR_YUV420sp2BGR = 93,
            COLOR_COLORCVT_MAX = 100,
            TM_SQDIFF = 0,
            TM_SQDIFF_NORMED = 1,
            TM_CCORR = 2,
            TM_CCORR_NORMED = 3,
            TM_CCOEFF = 4,
            TM_CCOEFF_NORMED = 5,
            RETR_EXTERNAL = CV_RETR_EXTERNAL,
            RETR_LIST = CV_RETR_LIST,
            RETR_CCOMP = CV_RETR_CCOMP,
            RETR_TREE = CV_RETR_TREE,
            CHAIN_APPROX_NONE = CV_CHAIN_APPROX_NONE,
            CHAIN_APPROX_SIMPLE = CV_CHAIN_APPROX_SIMPLE,
            CHAIN_APPROX_TC89_L1 = CV_CHAIN_APPROX_TC89_L1,
            CHAIN_APPROX_TC89_KCOS = CV_CHAIN_APPROX_TC89_KCOS;


    //
    // C++:  void Canny(Mat image, Mat& edges, double threshold1, double threshold2, int apertureSize = 3, bool L2gradient = false)
    //

/**
 * Finds edges in an image using the [Canny86] algorithm.
 *
 * The function finds edges in the input image "image" and marks them in the
 * output map "edges" using the Canny algorithm. The smallest value between
 * "threshold1" and "threshold2" is used for edge linking. The largest value is
 * used to find initial segments of strong edges. See http://en.wikipedia.org/wiki/Canny_edge_detector
 *
 * @param image Single-channel 8-bit input image.
 * @param edges Output edge map. It has the same size and type as "image".
 * @param threshold1 First threshold for the hysteresis procedure.
 * @param threshold2 Second threshold for the hysteresis procedure.
 * @param apertureSize Aperture size for the "Sobel" operator.
 * @param L2gradient Flag indicating whether a more accurate L_2 norm
 * =sqrt((dI/dx)^2 + (dI/dy)^2) should be used to compute the image gradient
 * magnitude ("L2gradient=true"), or a faster default L_1 norm =|dI/dx|+|dI/dy|
 * is enough ("L2gradient=false").
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#canny">org.opencv.imgproc.Imgproc.Canny</a>
 */
    public static void Canny(Mat image, Mat edges, double threshold1, double threshold2, int apertureSize, boolean L2gradient)
    {

        Canny_0(image.nativeObj, edges.nativeObj, threshold1, threshold2, apertureSize, L2gradient);

        return;
    }

/**
 * Finds edges in an image using the [Canny86] algorithm.
 *
 * The function finds edges in the input image "image" and marks them in the
 * output map "edges" using the Canny algorithm. The smallest value between
 * "threshold1" and "threshold2" is used for edge linking. The largest value is
 * used to find initial segments of strong edges. See http://en.wikipedia.org/wiki/Canny_edge_detector
 *
 * @param image Single-channel 8-bit input image.
 * @param edges Output edge map. It has the same size and type as "image".
 * @param threshold1 First threshold for the hysteresis procedure.
 * @param threshold2 Second threshold for the hysteresis procedure.
 * @param apertureSize Aperture size for the "Sobel" operator.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#canny">org.opencv.imgproc.Imgproc.Canny</a>
 */
    public static void Canny(Mat image, Mat edges, double threshold1, double threshold2, int apertureSize)
    {

        Canny_1(image.nativeObj, edges.nativeObj, threshold1, threshold2, apertureSize);

        return;
    }

/**
 * Finds edges in an image using the [Canny86] algorithm.
 *
 * The function finds edges in the input image "image" and marks them in the
 * output map "edges" using the Canny algorithm. The smallest value between
 * "threshold1" and "threshold2" is used for edge linking. The largest value is
 * used to find initial segments of strong edges. See http://en.wikipedia.org/wiki/Canny_edge_detector
 *
 * @param image Single-channel 8-bit input image.
 * @param edges Output edge map. It has the same size and type as "image".
 * @param threshold1 First threshold for the hysteresis procedure.
 * @param threshold2 Second threshold for the hysteresis procedure.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#canny">org.opencv.imgproc.Imgproc.Canny</a>
 */
    public static void Canny(Mat image, Mat edges, double threshold1, double threshold2)
    {

        Canny_2(image.nativeObj, edges.nativeObj, threshold1, threshold2);

        return;
    }


    //
    // C++:  void GaussianBlur(Mat src, Mat& dst, Size ksize, double sigma1, double sigma2 = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Smoothes an image using a Gaussian filter.
 *
 * The function convolves the source image with the specified Gaussian kernel.
 * In-place filtering is supported.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Gaussian kernel size. "ksize.width" and "ksize.height" can
 * differ but they both must be positive and odd. Or, they can be zero's and
 * then they are computed from "sigma*".
 * @param sigma1 a sigma1
 * @param sigma2 a sigma2
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#gaussianblur">org.opencv.imgproc.Imgproc.GaussianBlur</a>
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.medianBlur
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 */
    public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigma1, double sigma2, int borderType)
    {

        GaussianBlur_0(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigma1, sigma2, borderType);

        return;
    }

/**
 * Smoothes an image using a Gaussian filter.
 *
 * The function convolves the source image with the specified Gaussian kernel.
 * In-place filtering is supported.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Gaussian kernel size. "ksize.width" and "ksize.height" can
 * differ but they both must be positive and odd. Or, they can be zero's and
 * then they are computed from "sigma*".
 * @param sigma1 a sigma1
 * @param sigma2 a sigma2
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#gaussianblur">org.opencv.imgproc.Imgproc.GaussianBlur</a>
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.medianBlur
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 */
    public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigma1, double sigma2)
    {

        GaussianBlur_1(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigma1, sigma2);

        return;
    }

/**
 * Smoothes an image using a Gaussian filter.
 *
 * The function convolves the source image with the specified Gaussian kernel.
 * In-place filtering is supported.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Gaussian kernel size. "ksize.width" and "ksize.height" can
 * differ but they both must be positive and odd. Or, they can be zero's and
 * then they are computed from "sigma*".
 * @param sigma1 a sigma1
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#gaussianblur">org.opencv.imgproc.Imgproc.GaussianBlur</a>
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.medianBlur
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 */
    public static void GaussianBlur(Mat src, Mat dst, Size ksize, double sigma1)
    {

        GaussianBlur_2(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, sigma1);

        return;
    }


    //
    // C++:  void HoughCircles(Mat image, Mat& circles, int method, double dp, double minDist, double param1 = 100, double param2 = 100, int minRadius = 0, int maxRadius = 0)
    //

/**
 * Finds circles in a grayscale image using the Hough transform.
 *
 * The function finds circles in a grayscale image using a modification of the
 * Hough transform.
 *
 * Example:
 *
 * Note: Usually the function detects the centers of circles well. However, it
 * may fail to find correct radii. You can assist to the function by specifying
 * the radius range ("minRadius" and "maxRadius") if you know it. Or, you may
 * ignore the returned radius, use only the center, and find the correct radius
 * using an additional procedure.
 *
 * @param image 8-bit, single-channel, grayscale input image.
 * @param circles Output vector of found circles. Each vector is encoded as a
 * 3-element floating-point vector (x, y, radius).
 * @param method Detection method to use. Currently, the only implemented method
 * is "CV_HOUGH_GRADIENT", which is basically *21HT*, described in [Yuen90].
 * @param dp Inverse ratio of the accumulator resolution to the image
 * resolution. For example, if "dp=1", the accumulator has the same resolution
 * as the input image. If "dp=2", the accumulator has half as big width and
 * height.
 * @param minDist Minimum distance between the centers of the detected circles.
 * If the parameter is too small, multiple neighbor circles may be falsely
 * detected in addition to a true one. If it is too large, some circles may be
 * missed.
 * @param param1 First method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the higher threshold of the two passed to the "Canny" edge detector
 * (the lower one is twice smaller).
 * @param param2 Second method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the accumulator threshold for the circle centers at the detection
 * stage. The smaller it is, the more false circles may be detected. Circles,
 * corresponding to the larger accumulator values, will be returned first.
 * @param minRadius Minimum circle radius.
 * @param maxRadius Maximum circle radius.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghcircles">org.opencv.imgproc.Imgproc.HoughCircles</a>
 * @see org.opencv.imgproc.Imgproc.minEnclosingCircle
 * @see org.opencv.imgproc.Imgproc.fitEllipse
 */
    public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2, int minRadius, int maxRadius)
    {

        HoughCircles_0(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2, minRadius, maxRadius);

        return;
    }

/**
 * Finds circles in a grayscale image using the Hough transform.
 *
 * The function finds circles in a grayscale image using a modification of the
 * Hough transform.
 *
 * Example:
 *
 * Note: Usually the function detects the centers of circles well. However, it
 * may fail to find correct radii. You can assist to the function by specifying
 * the radius range ("minRadius" and "maxRadius") if you know it. Or, you may
 * ignore the returned radius, use only the center, and find the correct radius
 * using an additional procedure.
 *
 * @param image 8-bit, single-channel, grayscale input image.
 * @param circles Output vector of found circles. Each vector is encoded as a
 * 3-element floating-point vector (x, y, radius).
 * @param method Detection method to use. Currently, the only implemented method
 * is "CV_HOUGH_GRADIENT", which is basically *21HT*, described in [Yuen90].
 * @param dp Inverse ratio of the accumulator resolution to the image
 * resolution. For example, if "dp=1", the accumulator has the same resolution
 * as the input image. If "dp=2", the accumulator has half as big width and
 * height.
 * @param minDist Minimum distance between the centers of the detected circles.
 * If the parameter is too small, multiple neighbor circles may be falsely
 * detected in addition to a true one. If it is too large, some circles may be
 * missed.
 * @param param1 First method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the higher threshold of the two passed to the "Canny" edge detector
 * (the lower one is twice smaller).
 * @param param2 Second method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the accumulator threshold for the circle centers at the detection
 * stage. The smaller it is, the more false circles may be detected. Circles,
 * corresponding to the larger accumulator values, will be returned first.
 * @param minRadius Minimum circle radius.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghcircles">org.opencv.imgproc.Imgproc.HoughCircles</a>
 * @see org.opencv.imgproc.Imgproc.minEnclosingCircle
 * @see org.opencv.imgproc.Imgproc.fitEllipse
 */
    public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2, int minRadius)
    {

        HoughCircles_1(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2, minRadius);

        return;
    }

/**
 * Finds circles in a grayscale image using the Hough transform.
 *
 * The function finds circles in a grayscale image using a modification of the
 * Hough transform.
 *
 * Example:
 *
 * Note: Usually the function detects the centers of circles well. However, it
 * may fail to find correct radii. You can assist to the function by specifying
 * the radius range ("minRadius" and "maxRadius") if you know it. Or, you may
 * ignore the returned radius, use only the center, and find the correct radius
 * using an additional procedure.
 *
 * @param image 8-bit, single-channel, grayscale input image.
 * @param circles Output vector of found circles. Each vector is encoded as a
 * 3-element floating-point vector (x, y, radius).
 * @param method Detection method to use. Currently, the only implemented method
 * is "CV_HOUGH_GRADIENT", which is basically *21HT*, described in [Yuen90].
 * @param dp Inverse ratio of the accumulator resolution to the image
 * resolution. For example, if "dp=1", the accumulator has the same resolution
 * as the input image. If "dp=2", the accumulator has half as big width and
 * height.
 * @param minDist Minimum distance between the centers of the detected circles.
 * If the parameter is too small, multiple neighbor circles may be falsely
 * detected in addition to a true one. If it is too large, some circles may be
 * missed.
 * @param param1 First method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the higher threshold of the two passed to the "Canny" edge detector
 * (the lower one is twice smaller).
 * @param param2 Second method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the accumulator threshold for the circle centers at the detection
 * stage. The smaller it is, the more false circles may be detected. Circles,
 * corresponding to the larger accumulator values, will be returned first.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghcircles">org.opencv.imgproc.Imgproc.HoughCircles</a>
 * @see org.opencv.imgproc.Imgproc.minEnclosingCircle
 * @see org.opencv.imgproc.Imgproc.fitEllipse
 */
    public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1, double param2)
    {

        HoughCircles_2(image.nativeObj, circles.nativeObj, method, dp, minDist, param1, param2);

        return;
    }

/**
 * Finds circles in a grayscale image using the Hough transform.
 *
 * The function finds circles in a grayscale image using a modification of the
 * Hough transform.
 *
 * Example:
 *
 * Note: Usually the function detects the centers of circles well. However, it
 * may fail to find correct radii. You can assist to the function by specifying
 * the radius range ("minRadius" and "maxRadius") if you know it. Or, you may
 * ignore the returned radius, use only the center, and find the correct radius
 * using an additional procedure.
 *
 * @param image 8-bit, single-channel, grayscale input image.
 * @param circles Output vector of found circles. Each vector is encoded as a
 * 3-element floating-point vector (x, y, radius).
 * @param method Detection method to use. Currently, the only implemented method
 * is "CV_HOUGH_GRADIENT", which is basically *21HT*, described in [Yuen90].
 * @param dp Inverse ratio of the accumulator resolution to the image
 * resolution. For example, if "dp=1", the accumulator has the same resolution
 * as the input image. If "dp=2", the accumulator has half as big width and
 * height.
 * @param minDist Minimum distance between the centers of the detected circles.
 * If the parameter is too small, multiple neighbor circles may be falsely
 * detected in addition to a true one. If it is too large, some circles may be
 * missed.
 * @param param1 First method-specific parameter. In case of "CV_HOUGH_GRADIENT",
 * it is the higher threshold of the two passed to the "Canny" edge detector
 * (the lower one is twice smaller).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghcircles">org.opencv.imgproc.Imgproc.HoughCircles</a>
 * @see org.opencv.imgproc.Imgproc.minEnclosingCircle
 * @see org.opencv.imgproc.Imgproc.fitEllipse
 */
    public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist, double param1)
    {

        HoughCircles_3(image.nativeObj, circles.nativeObj, method, dp, minDist, param1);

        return;
    }

/**
 * Finds circles in a grayscale image using the Hough transform.
 *
 * The function finds circles in a grayscale image using a modification of the
 * Hough transform.
 *
 * Example:
 *
 * Note: Usually the function detects the centers of circles well. However, it
 * may fail to find correct radii. You can assist to the function by specifying
 * the radius range ("minRadius" and "maxRadius") if you know it. Or, you may
 * ignore the returned radius, use only the center, and find the correct radius
 * using an additional procedure.
 *
 * @param image 8-bit, single-channel, grayscale input image.
 * @param circles Output vector of found circles. Each vector is encoded as a
 * 3-element floating-point vector (x, y, radius).
 * @param method Detection method to use. Currently, the only implemented method
 * is "CV_HOUGH_GRADIENT", which is basically *21HT*, described in [Yuen90].
 * @param dp Inverse ratio of the accumulator resolution to the image
 * resolution. For example, if "dp=1", the accumulator has the same resolution
 * as the input image. If "dp=2", the accumulator has half as big width and
 * height.
 * @param minDist Minimum distance between the centers of the detected circles.
 * If the parameter is too small, multiple neighbor circles may be falsely
 * detected in addition to a true one. If it is too large, some circles may be
 * missed.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghcircles">org.opencv.imgproc.Imgproc.HoughCircles</a>
 * @see org.opencv.imgproc.Imgproc.minEnclosingCircle
 * @see org.opencv.imgproc.Imgproc.fitEllipse
 */
    public static void HoughCircles(Mat image, Mat circles, int method, double dp, double minDist)
    {

        HoughCircles_4(image.nativeObj, circles.nativeObj, method, dp, minDist);

        return;
    }


    //
    // C++:  void HoughLines(Mat image, Mat& lines, double rho, double theta, int threshold, double srn = 0, double stn = 0)
    //

/**
 * Finds lines in a binary image using the standard Hough transform.
 *
 * The function implements the standard or standard multi-scale Hough transform
 * algorithm for line detection. See http://homepages.inf.ed.ac.uk/rbf/HIPR2/hough.htm
 * for a good explanation of Hough transform.
 * See also the example in "HoughLinesP" description.
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a
 * two-element vector (rho, theta). rho is the distance from the coordinate
 * origin (0,0) (top-left corner of the image). theta is the line rotation angle
 * in radians (0 ~ vertical line, pi/2 ~ horizontal line).
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 * @param srn For the multi-scale Hough transform, it is a divisor for the
 * distance resolution "rho". The coarse accumulator distance resolution is
 * "rho" and the accurate accumulator resolution is "rho/srn". If both "srn=0"
 * and "stn=0", the classical Hough transform is used. Otherwise, both these
 * parameters should be positive.
 * @param stn For the multi-scale Hough transform, it is a divisor for the
 * distance resolution "theta".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlines">org.opencv.imgproc.Imgproc.HoughLines</a>
 */
    public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn, double stn)
    {

        HoughLines_0(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn, stn);

        return;
    }

/**
 * Finds lines in a binary image using the standard Hough transform.
 *
 * The function implements the standard or standard multi-scale Hough transform
 * algorithm for line detection. See http://homepages.inf.ed.ac.uk/rbf/HIPR2/hough.htm
 * for a good explanation of Hough transform.
 * See also the example in "HoughLinesP" description.
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a
 * two-element vector (rho, theta). rho is the distance from the coordinate
 * origin (0,0) (top-left corner of the image). theta is the line rotation angle
 * in radians (0 ~ vertical line, pi/2 ~ horizontal line).
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 * @param srn For the multi-scale Hough transform, it is a divisor for the
 * distance resolution "rho". The coarse accumulator distance resolution is
 * "rho" and the accurate accumulator resolution is "rho/srn". If both "srn=0"
 * and "stn=0", the classical Hough transform is used. Otherwise, both these
 * parameters should be positive.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlines">org.opencv.imgproc.Imgproc.HoughLines</a>
 */
    public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold, double srn)
    {

        HoughLines_1(image.nativeObj, lines.nativeObj, rho, theta, threshold, srn);

        return;
    }

/**
 * Finds lines in a binary image using the standard Hough transform.
 *
 * The function implements the standard or standard multi-scale Hough transform
 * algorithm for line detection. See http://homepages.inf.ed.ac.uk/rbf/HIPR2/hough.htm
 * for a good explanation of Hough transform.
 * See also the example in "HoughLinesP" description.
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a
 * two-element vector (rho, theta). rho is the distance from the coordinate
 * origin (0,0) (top-left corner of the image). theta is the line rotation angle
 * in radians (0 ~ vertical line, pi/2 ~ horizontal line).
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlines">org.opencv.imgproc.Imgproc.HoughLines</a>
 */
    public static void HoughLines(Mat image, Mat lines, double rho, double theta, int threshold)
    {

        HoughLines_2(image.nativeObj, lines.nativeObj, rho, theta, threshold);

        return;
    }


    //
    // C++:  void HoughLinesP(Mat image, Mat& lines, double rho, double theta, int threshold, double minLineLength = 0, double maxLineGap = 0)
    //

/**
 * Finds line segments in a binary image using the probabilistic Hough
 * transform.
 *
 * The function implements the probabilistic Hough transform algorithm for line
 * detection, described in [Matas00]. See the line detection example below:
 *
 * This is a sample picture the function parameters have been tuned for:
 *
 * And this is the output of the above program in case of the probabilistic
 * Hough transform:
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a 4-element
 * vector (x_1, y_1, x_2, y_2), where (x_1,y_1) and (x_2, y_2) are the ending
 * points of each detected line segment.
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 * @param minLineLength Minimum line length. Line segments shorter than that are
 * rejected.
 * @param maxLineGap Maximum allowed gap between points on the same line to link
 * them.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlinesp">org.opencv.imgproc.Imgproc.HoughLinesP</a>
 */
    public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold, double minLineLength, double maxLineGap)
    {

        HoughLinesP_0(image.nativeObj, lines.nativeObj, rho, theta, threshold, minLineLength, maxLineGap);

        return;
    }

/**
 * Finds line segments in a binary image using the probabilistic Hough
 * transform.
 *
 * The function implements the probabilistic Hough transform algorithm for line
 * detection, described in [Matas00]. See the line detection example below:
 *
 * This is a sample picture the function parameters have been tuned for:
 *
 * And this is the output of the above program in case of the probabilistic
 * Hough transform:
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a 4-element
 * vector (x_1, y_1, x_2, y_2), where (x_1,y_1) and (x_2, y_2) are the ending
 * points of each detected line segment.
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 * @param minLineLength Minimum line length. Line segments shorter than that are
 * rejected.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlinesp">org.opencv.imgproc.Imgproc.HoughLinesP</a>
 */
    public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold, double minLineLength)
    {

        HoughLinesP_1(image.nativeObj, lines.nativeObj, rho, theta, threshold, minLineLength);

        return;
    }

/**
 * Finds line segments in a binary image using the probabilistic Hough
 * transform.
 *
 * The function implements the probabilistic Hough transform algorithm for line
 * detection, described in [Matas00]. See the line detection example below:
 *
 * This is a sample picture the function parameters have been tuned for:
 *
 * And this is the output of the above program in case of the probabilistic
 * Hough transform:
 *
 * @param image 8-bit, single-channel binary source image. The image may be
 * modified by the function.
 * @param lines Output vector of lines. Each line is represented by a 4-element
 * vector (x_1, y_1, x_2, y_2), where (x_1,y_1) and (x_2, y_2) are the ending
 * points of each detected line segment.
 * @param rho Distance resolution of the accumulator in pixels.
 * @param theta Angle resolution of the accumulator in radians.
 * @param threshold Accumulator threshold parameter. Only those lines are
 * returned that get enough votes (>threshold).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#houghlinesp">org.opencv.imgproc.Imgproc.HoughLinesP</a>
 */
    public static void HoughLinesP(Mat image, Mat lines, double rho, double theta, int threshold)
    {

        HoughLinesP_2(image.nativeObj, lines.nativeObj, rho, theta, threshold);

        return;
    }


    //
    // C++:  void HuMoments(Moments m, Mat& hu)
    //

/**
 * Calculates seven Hu invariants.
 *
 * The function calculates seven Hu invariants (introduced in [Hu62]; see also
 * http://en.wikipedia.org/wiki/Image_moment) defined as:
 *
 * hu[0]= eta _20+ eta _02
 * hu[1]=(eta _20- eta _02)^2+4 eta _11^2
 * hu[2]=(eta _30-3 eta _12)^2+ (3 eta _21- eta _03)^2
 * hu[3]=(eta _30+ eta _12)^2+ (eta _21+ eta _03)^2
 * hu[4]=(eta _30-3 eta _12)(eta _30+ eta _12)[(eta _30+ eta _12)^2-3(eta _21+
 * eta _03)^2]+(3 eta _21- eta _03)(eta _21+ eta _03)[3(eta _30+ eta _12)^2-(eta
 * _21+ eta _03)^2]
 * hu[5]=(eta _20- eta _02)[(eta _30+ eta _12)^2- (eta _21+ eta _03)^2]+4 eta
 * _11(eta _30+ eta _12)(eta _21+ eta _03)
 * hu[6]=(3 eta _21- eta _03)(eta _21+ eta _03)[3(eta _30+ eta _12)^2-(eta _21+
 * eta _03)^2]-(eta _30-3 eta _12)(eta _21+ eta _03)[3(eta _30+ eta _12)^2-(eta
 * _21+ eta _03)^2]
 *
 *
 * where eta_(ji) stands for Moments.nu_(ji).
 *
 * These values are proved to be invariants to the image scale, rotation, and
 * reflection except the seventh one, whose sign is changed by reflection. This
 * invariance is proved with the assumption of infinite image resolution. In
 * case of raster images, the computed Hu invariants for the original and
 * transformed images are a bit different.
 *
 * @param m a m
 * @param hu Output Hu invariants.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#humoments">org.opencv.imgproc.Imgproc.HuMoments</a>
 * @see org.opencv.imgproc.Imgproc.matchShapes
 */
    public static void HuMoments(Moments m, Mat hu)
    {

        HuMoments_0(m.nativeObj, hu.nativeObj);

        return;
    }


    //
    // C++:  void Laplacian(Mat src, Mat& dst, int ddepth, int ksize = 1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates the Laplacian of an image.
 *
 * The function calculates the Laplacian of the source image by adding up the
 * second x and y derivatives calculated using the Sobel operator:
 *
 * dst = Delta src = (d^2 src)/(dx^2) + (d^2 src)/(dy^2)
 *
 * This is done when "ksize > 1". When "ksize == 1", the Laplacian is computed
 * by filtering the image with the following 3 x 3 aperture:
 *
 * vecthreethree 0101(-4)1010
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image.
 * @param ksize Aperture size used to compute the second-derivative filters. See
 * "getDerivKernels" for details. The size must be positive and odd.
 * @param scale Optional scale factor for the computed Laplacian values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#laplacian">org.opencv.imgproc.Imgproc.Laplacian</a>
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Sobel
 */
    public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale, double delta, int borderType)
    {

        Laplacian_0(src.nativeObj, dst.nativeObj, ddepth, ksize, scale, delta, borderType);

        return;
    }

/**
 * Calculates the Laplacian of an image.
 *
 * The function calculates the Laplacian of the source image by adding up the
 * second x and y derivatives calculated using the Sobel operator:
 *
 * dst = Delta src = (d^2 src)/(dx^2) + (d^2 src)/(dy^2)
 *
 * This is done when "ksize > 1". When "ksize == 1", the Laplacian is computed
 * by filtering the image with the following 3 x 3 aperture:
 *
 * vecthreethree 0101(-4)1010
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image.
 * @param ksize Aperture size used to compute the second-derivative filters. See
 * "getDerivKernels" for details. The size must be positive and odd.
 * @param scale Optional scale factor for the computed Laplacian values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#laplacian">org.opencv.imgproc.Imgproc.Laplacian</a>
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Sobel
 */
    public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale, double delta)
    {

        Laplacian_1(src.nativeObj, dst.nativeObj, ddepth, ksize, scale, delta);

        return;
    }

/**
 * Calculates the Laplacian of an image.
 *
 * The function calculates the Laplacian of the source image by adding up the
 * second x and y derivatives calculated using the Sobel operator:
 *
 * dst = Delta src = (d^2 src)/(dx^2) + (d^2 src)/(dy^2)
 *
 * This is done when "ksize > 1". When "ksize == 1", the Laplacian is computed
 * by filtering the image with the following 3 x 3 aperture:
 *
 * vecthreethree 0101(-4)1010
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image.
 * @param ksize Aperture size used to compute the second-derivative filters. See
 * "getDerivKernels" for details. The size must be positive and odd.
 * @param scale Optional scale factor for the computed Laplacian values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#laplacian">org.opencv.imgproc.Imgproc.Laplacian</a>
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Sobel
 */
    public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize, double scale)
    {

        Laplacian_2(src.nativeObj, dst.nativeObj, ddepth, ksize, scale);

        return;
    }

/**
 * Calculates the Laplacian of an image.
 *
 * The function calculates the Laplacian of the source image by adding up the
 * second x and y derivatives calculated using the Sobel operator:
 *
 * dst = Delta src = (d^2 src)/(dx^2) + (d^2 src)/(dy^2)
 *
 * This is done when "ksize > 1". When "ksize == 1", the Laplacian is computed
 * by filtering the image with the following 3 x 3 aperture:
 *
 * vecthreethree 0101(-4)1010
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image.
 * @param ksize Aperture size used to compute the second-derivative filters. See
 * "getDerivKernels" for details. The size must be positive and odd.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#laplacian">org.opencv.imgproc.Imgproc.Laplacian</a>
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Sobel
 */
    public static void Laplacian(Mat src, Mat dst, int ddepth, int ksize)
    {

        Laplacian_3(src.nativeObj, dst.nativeObj, ddepth, ksize);

        return;
    }

/**
 * Calculates the Laplacian of an image.
 *
 * The function calculates the Laplacian of the source image by adding up the
 * second x and y derivatives calculated using the Sobel operator:
 *
 * dst = Delta src = (d^2 src)/(dx^2) + (d^2 src)/(dy^2)
 *
 * This is done when "ksize > 1". When "ksize == 1", the Laplacian is computed
 * by filtering the image with the following 3 x 3 aperture:
 *
 * vecthreethree 0101(-4)1010
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#laplacian">org.opencv.imgproc.Imgproc.Laplacian</a>
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Sobel
 */
    public static void Laplacian(Mat src, Mat dst, int ddepth)
    {

        Laplacian_4(src.nativeObj, dst.nativeObj, ddepth);

        return;
    }


    //
    // C++:  void Scharr(Mat src, Mat& dst, int ddepth, int dx, int dy, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates the first x- or y- image derivative using Scharr operator.
 *
 * The function computes the first x- or y- spatial image derivative using the
 * Scharr operator. The call
 *
 * Scharr(src, dst, ddepth, xorder, yorder, scale, delta, borderType)
 *
 * is equivalent to
 *
 * Sobel(src, dst, ddepth, xorder, yorder, CV_SCHARR, scale, delta, borderType).
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#scharr">org.opencv.imgproc.Imgproc.Scharr</a>
 */
    public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale, double delta, int borderType)
    {

        Scharr_0(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale, delta, borderType);

        return;
    }

/**
 * Calculates the first x- or y- image derivative using Scharr operator.
 *
 * The function computes the first x- or y- spatial image derivative using the
 * Scharr operator. The call
 *
 * Scharr(src, dst, ddepth, xorder, yorder, scale, delta, borderType)
 *
 * is equivalent to
 *
 * Sobel(src, dst, ddepth, xorder, yorder, CV_SCHARR, scale, delta, borderType).
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#scharr">org.opencv.imgproc.Imgproc.Scharr</a>
 */
    public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale, double delta)
    {

        Scharr_1(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale, delta);

        return;
    }

/**
 * Calculates the first x- or y- image derivative using Scharr operator.
 *
 * The function computes the first x- or y- spatial image derivative using the
 * Scharr operator. The call
 *
 * Scharr(src, dst, ddepth, xorder, yorder, scale, delta, borderType)
 *
 * is equivalent to
 *
 * Sobel(src, dst, ddepth, xorder, yorder, CV_SCHARR, scale, delta, borderType).
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#scharr">org.opencv.imgproc.Imgproc.Scharr</a>
 */
    public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy, double scale)
    {

        Scharr_2(src.nativeObj, dst.nativeObj, ddepth, dx, dy, scale);

        return;
    }

/**
 * Calculates the first x- or y- image derivative using Scharr operator.
 *
 * The function computes the first x- or y- spatial image derivative using the
 * Scharr operator. The call
 *
 * Scharr(src, dst, ddepth, xorder, yorder, scale, delta, borderType)
 *
 * is equivalent to
 *
 * Sobel(src, dst, ddepth, xorder, yorder, CV_SCHARR, scale, delta, borderType).
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#scharr">org.opencv.imgproc.Imgproc.Scharr</a>
 */
    public static void Scharr(Mat src, Mat dst, int ddepth, int dx, int dy)
    {

        Scharr_3(src.nativeObj, dst.nativeObj, ddepth, dx, dy);

        return;
    }


    //
    // C++:  void Sobel(Mat src, Mat& dst, int ddepth, int dx, int dy, int ksize = 3, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates the first, second, third, or mixed image derivatives using an
 * extended Sobel operator.
 *
 * In all cases except one, the ksize x
 * ksize separable kernel is used to calculate the derivative. When ksize = 1,
 * the 3 x 1 or 1 x 3 kernel is used (that is, no Gaussian smoothing is done).
 * "ksize = 1" can only be used for the first or the second x- or y-
 * derivatives.
 *
 * There is also the special value "ksize = CV_SCHARR" (-1) that corresponds to
 * the 3x3 Scharr filter that may give more accurate results than the 3x3 Sobel.
 * The Scharr aperture is
 *
 *
 * |-3 0 3|
 * |-10 0 10|
 * |-3 0 3|
 *
 *
 * for the x-derivative, or transposed for the y-derivative.
 *
 * The function calculates an image derivative by convolving the image with the
 * appropriate kernel:
 *
 * dst = (d^(xorder+yorder) src)/(dx^(xorder) dy^(yorder))
 *
 * The Sobel operators combine Gaussian smoothing and differentiation, so the
 * result is more or less resistant to the noise. Most often, the function is
 * called with ("xorder" = 1, "yorder" = 0, "ksize" = 3) or ("xorder" = 0,
 * "yorder" = 1, "ksize" = 3) to calculate the first x- or y- image derivative.
 * The first case corresponds to a kernel of:
 *
 *
 * |-1 0 1|
 * |-2 0 2|
 * |-1 0 1|
 *
 *
 * The second case corresponds to a kernel of:
 *
 *
 * |-1 -2 -1|
 * |0 0 0|
 * |1 2 1|
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param ksize Size of the extended Sobel kernel. It must be 1, 3, 5, or 7.
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sobel">org.opencv.imgproc.Imgproc.Sobel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Laplacian
 */
    public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale, double delta, int borderType)
    {

        Sobel_0(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale, delta, borderType);

        return;
    }

/**
 * Calculates the first, second, third, or mixed image derivatives using an
 * extended Sobel operator.
 *
 * In all cases except one, the ksize x
 * ksize separable kernel is used to calculate the derivative. When ksize = 1,
 * the 3 x 1 or 1 x 3 kernel is used (that is, no Gaussian smoothing is done).
 * "ksize = 1" can only be used for the first or the second x- or y-
 * derivatives.
 *
 * There is also the special value "ksize = CV_SCHARR" (-1) that corresponds to
 * the 3x3 Scharr filter that may give more accurate results than the 3x3 Sobel.
 * The Scharr aperture is
 *
 *
 * |-3 0 3|
 * |-10 0 10|
 * |-3 0 3|
 *
 *
 * for the x-derivative, or transposed for the y-derivative.
 *
 * The function calculates an image derivative by convolving the image with the
 * appropriate kernel:
 *
 * dst = (d^(xorder+yorder) src)/(dx^(xorder) dy^(yorder))
 *
 * The Sobel operators combine Gaussian smoothing and differentiation, so the
 * result is more or less resistant to the noise. Most often, the function is
 * called with ("xorder" = 1, "yorder" = 0, "ksize" = 3) or ("xorder" = 0,
 * "yorder" = 1, "ksize" = 3) to calculate the first x- or y- image derivative.
 * The first case corresponds to a kernel of:
 *
 *
 * |-1 0 1|
 * |-2 0 2|
 * |-1 0 1|
 *
 *
 * The second case corresponds to a kernel of:
 *
 *
 * |-1 -2 -1|
 * |0 0 0|
 * |1 2 1|
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param ksize Size of the extended Sobel kernel. It must be 1, 3, 5, or 7.
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 * @param delta Optional delta value that is added to the results prior to
 * storing them in "dst".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sobel">org.opencv.imgproc.Imgproc.Sobel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Laplacian
 */
    public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale, double delta)
    {

        Sobel_1(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale, delta);

        return;
    }

/**
 * Calculates the first, second, third, or mixed image derivatives using an
 * extended Sobel operator.
 *
 * In all cases except one, the ksize x
 * ksize separable kernel is used to calculate the derivative. When ksize = 1,
 * the 3 x 1 or 1 x 3 kernel is used (that is, no Gaussian smoothing is done).
 * "ksize = 1" can only be used for the first or the second x- or y-
 * derivatives.
 *
 * There is also the special value "ksize = CV_SCHARR" (-1) that corresponds to
 * the 3x3 Scharr filter that may give more accurate results than the 3x3 Sobel.
 * The Scharr aperture is
 *
 *
 * |-3 0 3|
 * |-10 0 10|
 * |-3 0 3|
 *
 *
 * for the x-derivative, or transposed for the y-derivative.
 *
 * The function calculates an image derivative by convolving the image with the
 * appropriate kernel:
 *
 * dst = (d^(xorder+yorder) src)/(dx^(xorder) dy^(yorder))
 *
 * The Sobel operators combine Gaussian smoothing and differentiation, so the
 * result is more or less resistant to the noise. Most often, the function is
 * called with ("xorder" = 1, "yorder" = 0, "ksize" = 3) or ("xorder" = 0,
 * "yorder" = 1, "ksize" = 3) to calculate the first x- or y- image derivative.
 * The first case corresponds to a kernel of:
 *
 *
 * |-1 0 1|
 * |-2 0 2|
 * |-1 0 1|
 *
 *
 * The second case corresponds to a kernel of:
 *
 *
 * |-1 -2 -1|
 * |0 0 0|
 * |1 2 1|
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param ksize Size of the extended Sobel kernel. It must be 1, 3, 5, or 7.
 * @param scale Optional scale factor for the computed derivative values. By
 * default, no scaling is applied. See "getDerivKernels" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sobel">org.opencv.imgproc.Imgproc.Sobel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Laplacian
 */
    public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize, double scale)
    {

        Sobel_2(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize, scale);

        return;
    }

/**
 * Calculates the first, second, third, or mixed image derivatives using an
 * extended Sobel operator.
 *
 * In all cases except one, the ksize x
 * ksize separable kernel is used to calculate the derivative. When ksize = 1,
 * the 3 x 1 or 1 x 3 kernel is used (that is, no Gaussian smoothing is done).
 * "ksize = 1" can only be used for the first or the second x- or y-
 * derivatives.
 *
 * There is also the special value "ksize = CV_SCHARR" (-1) that corresponds to
 * the 3x3 Scharr filter that may give more accurate results than the 3x3 Sobel.
 * The Scharr aperture is
 *
 *
 * |-3 0 3|
 * |-10 0 10|
 * |-3 0 3|
 *
 *
 * for the x-derivative, or transposed for the y-derivative.
 *
 * The function calculates an image derivative by convolving the image with the
 * appropriate kernel:
 *
 * dst = (d^(xorder+yorder) src)/(dx^(xorder) dy^(yorder))
 *
 * The Sobel operators combine Gaussian smoothing and differentiation, so the
 * result is more or less resistant to the noise. Most often, the function is
 * called with ("xorder" = 1, "yorder" = 0, "ksize" = 3) or ("xorder" = 0,
 * "yorder" = 1, "ksize" = 3) to calculate the first x- or y- image derivative.
 * The first case corresponds to a kernel of:
 *
 *
 * |-1 0 1|
 * |-2 0 2|
 * |-1 0 1|
 *
 *
 * The second case corresponds to a kernel of:
 *
 *
 * |-1 -2 -1|
 * |0 0 0|
 * |1 2 1|
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 * @param ksize Size of the extended Sobel kernel. It must be 1, 3, 5, or 7.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sobel">org.opencv.imgproc.Imgproc.Sobel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Laplacian
 */
    public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy, int ksize)
    {

        Sobel_3(src.nativeObj, dst.nativeObj, ddepth, dx, dy, ksize);

        return;
    }

/**
 * Calculates the first, second, third, or mixed image derivatives using an
 * extended Sobel operator.
 *
 * In all cases except one, the ksize x
 * ksize separable kernel is used to calculate the derivative. When ksize = 1,
 * the 3 x 1 or 1 x 3 kernel is used (that is, no Gaussian smoothing is done).
 * "ksize = 1" can only be used for the first or the second x- or y-
 * derivatives.
 *
 * There is also the special value "ksize = CV_SCHARR" (-1) that corresponds to
 * the 3x3 Scharr filter that may give more accurate results than the 3x3 Sobel.
 * The Scharr aperture is
 *
 *
 * |-3 0 3|
 * |-10 0 10|
 * |-3 0 3|
 *
 *
 * for the x-derivative, or transposed for the y-derivative.
 *
 * The function calculates an image derivative by convolving the image with the
 * appropriate kernel:
 *
 * dst = (d^(xorder+yorder) src)/(dx^(xorder) dy^(yorder))
 *
 * The Sobel operators combine Gaussian smoothing and differentiation, so the
 * result is more or less resistant to the noise. Most often, the function is
 * called with ("xorder" = 1, "yorder" = 0, "ksize" = 3) or ("xorder" = 0,
 * "yorder" = 1, "ksize" = 3) to calculate the first x- or y- image derivative.
 * The first case corresponds to a kernel of:
 *
 *
 * |-1 0 1|
 * |-2 0 2|
 * |-1 0 1|
 *
 *
 * The second case corresponds to a kernel of:
 *
 *
 * |-1 -2 -1|
 * |0 0 0|
 * |1 2 1|
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param dx a dx
 * @param dy a dy
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sobel">org.opencv.imgproc.Imgproc.Sobel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.Scharr
 * @see org.opencv.imgproc.Imgproc.Laplacian
 */
    public static void Sobel(Mat src, Mat dst, int ddepth, int dx, int dy)
    {

        Sobel_4(src.nativeObj, dst.nativeObj, ddepth, dx, dy);

        return;
    }


    //
    // C++:  void accumulate(Mat src, Mat& dst, Mat mask = Mat())
    //

/**
 * Adds an image to the accumulator.
 *
 * The function adds "src" or some of its elements to "dst" :
 *
 * dst(x,y) <- dst(x,y) + src(x,y) if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * The functions "accumulate*" can be used, for example, to collect statistics
 * of a scene background viewed by a still camera and for the further
 * foreground-background segmentation.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulate">org.opencv.imgproc.Imgproc.accumulate</a>
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulate(Mat src, Mat dst, Mat mask)
    {

        accumulate_0(src.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * Adds an image to the accumulator.
 *
 * The function adds "src" or some of its elements to "dst" :
 *
 * dst(x,y) <- dst(x,y) + src(x,y) if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * The functions "accumulate*" can be used, for example, to collect statistics
 * of a scene background viewed by a still camera and for the further
 * foreground-background segmentation.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulate">org.opencv.imgproc.Imgproc.accumulate</a>
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulate(Mat src, Mat dst)
    {

        accumulate_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void accumulateProduct(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

/**
 * Adds the per-element product of two input images to the accumulator.
 *
 * The function adds the product of two images or their selected regions to the
 * accumulator "dst" :
 *
 * dst(x,y) <- dst(x,y) + src1(x,y) * src2(x,y) if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src1 First input image, 1- or 3-channel, 8-bit or 32-bit floating
 * point.
 * @param src2 Second input image of the same type and the same size as "src1".
 * @param dst Accumulator with the same number of channels as input images,
 * 32-bit or 64-bit floating-point.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulateproduct">org.opencv.imgproc.Imgproc.accumulateProduct</a>
 * @see org.opencv.imgproc.Imgproc.accumulate
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateProduct(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        accumulateProduct_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * Adds the per-element product of two input images to the accumulator.
 *
 * The function adds the product of two images or their selected regions to the
 * accumulator "dst" :
 *
 * dst(x,y) <- dst(x,y) + src1(x,y) * src2(x,y) if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src1 First input image, 1- or 3-channel, 8-bit or 32-bit floating
 * point.
 * @param src2 Second input image of the same type and the same size as "src1".
 * @param dst Accumulator with the same number of channels as input images,
 * 32-bit or 64-bit floating-point.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulateproduct">org.opencv.imgproc.Imgproc.accumulateProduct</a>
 * @see org.opencv.imgproc.Imgproc.accumulate
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateProduct(Mat src1, Mat src2, Mat dst)
    {

        accumulateProduct_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void accumulateSquare(Mat src, Mat& dst, Mat mask = Mat())
    //

/**
 * Adds the square of a source image to the accumulator.
 *
 * The function adds the input image "src" or its selected region, raised to a
 * power of 2, to the accumulator "dst" :
 *
 * dst(x,y) <- dst(x,y) + src(x,y)^2 if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulatesquare">org.opencv.imgproc.Imgproc.accumulateSquare</a>
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateSquare(Mat src, Mat dst, Mat mask)
    {

        accumulateSquare_0(src.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * Adds the square of a source image to the accumulator.
 *
 * The function adds the input image "src" or its selected region, raised to a
 * power of 2, to the accumulator "dst" :
 *
 * dst(x,y) <- dst(x,y) + src(x,y)^2 if mask(x,y) != 0
 *
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulatesquare">org.opencv.imgproc.Imgproc.accumulateSquare</a>
 * @see org.opencv.imgproc.Imgproc.accumulateWeighted
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateSquare(Mat src, Mat dst)
    {

        accumulateSquare_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void accumulateWeighted(Mat src, Mat& dst, double alpha, Mat mask = Mat())
    //

/**
 * Updates a running average.
 *
 * The function calculates the weighted sum of the input image "src" and the
 * accumulator "dst" so that "dst" becomes a running average of a frame
 * sequence:
 *
 * dst(x,y) <- (1- alpha) * dst(x,y) + alpha * src(x,y) if mask(x,y) != 0
 *
 * That is, "alpha" regulates the update speed (how fast the accumulator
 * "forgets" about earlier images).
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 * @param alpha Weight of the input image.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulateweighted">org.opencv.imgproc.Imgproc.accumulateWeighted</a>
 * @see org.opencv.imgproc.Imgproc.accumulate
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateWeighted(Mat src, Mat dst, double alpha, Mat mask)
    {

        accumulateWeighted_0(src.nativeObj, dst.nativeObj, alpha, mask.nativeObj);

        return;
    }

/**
 * Updates a running average.
 *
 * The function calculates the weighted sum of the input image "src" and the
 * accumulator "dst" so that "dst" becomes a running average of a frame
 * sequence:
 *
 * dst(x,y) <- (1- alpha) * dst(x,y) + alpha * src(x,y) if mask(x,y) != 0
 *
 * That is, "alpha" regulates the update speed (how fast the accumulator
 * "forgets" about earlier images).
 * The function supports multi-channel images. Each channel is processed
 * independently.
 *
 * @param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
 * @param dst Accumulator image with the same number of channels as input image,
 * 32-bit or 64-bit floating-point.
 * @param alpha Weight of the input image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/motion_analysis_and_object_tracking.html#accumulateweighted">org.opencv.imgproc.Imgproc.accumulateWeighted</a>
 * @see org.opencv.imgproc.Imgproc.accumulate
 * @see org.opencv.imgproc.Imgproc.accumulateProduct
 * @see org.opencv.imgproc.Imgproc.accumulateSquare
 */
    public static void accumulateWeighted(Mat src, Mat dst, double alpha)
    {

        accumulateWeighted_1(src.nativeObj, dst.nativeObj, alpha);

        return;
    }


    //
    // C++:  void adaptiveThreshold(Mat src, Mat& dst, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C)
    //

/**
 * Applies an adaptive threshold to an array.
 *
 * The function transforms a grayscale image to a binary image according to the
 * formulae:
 *   * THRESH_BINARY
 *
 * dst(x,y) = maxValue if src(x,y) > T(x,y); 0 otherwise
 *
 *   * THRESH_BINARY_INV
 *
 * dst(x,y) = 0 if src(x,y) > T(x,y); maxValue otherwise
 *
 * where T(x,y) is a threshold calculated individually for each pixel.
 *   * For the method "ADAPTIVE_THRESH_MEAN_C", the threshold value T(x,y) is a
 * mean of the blockSize x blockSize neighborhood of (x, y) minus "C".
 *   * For the method "ADAPTIVE_THRESH_GAUSSIAN_C", the threshold value T(x, y)
 * is a weighted sum (cross-correlation with a Gaussian window) of the blockSize
 * x blockSize neighborhood of (x, y) minus "C". The default sigma (standard
 * deviation) is used for the specified "blockSize". See "getGaussianKernel".
 *
 * The function can process the image in-place.
 *
 * @param src Source 8-bit single-channel image.
 * @param dst Destination image of the same size and the same type as "src".
 * @param maxValue Non-zero value assigned to the pixels for which the condition
 * is satisfied. See the details below.
 * @param adaptiveMethod Adaptive thresholding algorithm to use,
 * "ADAPTIVE_THRESH_MEAN_C" or "ADAPTIVE_THRESH_GAUSSIAN_C". See the details
 * below.
 * @param thresholdType Thresholding type that must be either "THRESH_BINARY" or
 * "THRESH_BINARY_INV".
 * @param blockSize Size of a pixel neighborhood that is used to calculate a
 * threshold value for the pixel: 3, 5, 7, and so on.
 * @param C Constant subtracted from the mean or weighted mean (see the details
 * below). Normally, it is positive but may be zero or negative as well.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#adaptivethreshold">org.opencv.imgproc.Imgproc.adaptiveThreshold</a>
 * @see org.opencv.imgproc.Imgproc.threshold
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.blur
 */
    public static void adaptiveThreshold(Mat src, Mat dst, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C)
    {

        adaptiveThreshold_0(src.nativeObj, dst.nativeObj, maxValue, adaptiveMethod, thresholdType, blockSize, C);

        return;
    }


    //
    // C++:  void approxPolyDP(Mat curve, Mat& approxCurve, double epsilon, bool closed)
    //

/**
 * Approximates a polygonal curve(s) with the specified precision.
 *
 * The functions "approxPolyDP" approximate a curve or a polygon with another
 * curve/polygon with less vertices so that the distance between them is less or
 * equal to the specified precision. It uses the Douglas-Peucker algorithm
 * http://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm
 *
 * See http://code.ros.org/svn/opencv/trunk/opencv/samples/cpp/contours.cpp for
 * the function usage model.
 *
 * @param curve Input vector of a 2D point stored in:
 *   * "std.vector" or "Mat" (C++ interface)
 *   * "Nx2" numpy array (Python interface)
 *   * "CvSeq" or " "CvMat" (C interface)
 * @param approxCurve Result of the approximation. The type should match the
 * type of the input curve. In case of C interface the approximated curve is
 * stored in the memory storage and pointer to it is returned.
 * @param epsilon Parameter specifying the approximation accuracy. This is the
 * maximum distance between the original curve and its approximation.
 * @param closed If true, the approximated curve is closed (its first and last
 * vertices are connected). Otherwise, it is not closed.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#approxpolydp">org.opencv.imgproc.Imgproc.approxPolyDP</a>
 */
    public static void approxPolyDP(Mat curve, Mat approxCurve, double epsilon, boolean closed)
    {

        approxPolyDP_0(curve.nativeObj, approxCurve.nativeObj, epsilon, closed);

        return;
    }


    //
    // C++:  double arcLength(vector_Point2f curve, bool closed)
    //

/**
 * Calculates a contour perimeter or a curve length.
 *
 * The function computes a curve length or a closed contour perimeter.
 *
 * @param curve Input vector of 2D points, stored in "std.vector" or "Mat".
 * @param closed Flag indicating whether the curve is closed or not.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#arclength">org.opencv.imgproc.Imgproc.arcLength</a>
 */
    public static double arcLength(List<Point> curve, boolean closed)
    {
        Mat curve_mat = Converters.vector_Point2f_to_Mat(curve);
        double retVal = arcLength_0(curve_mat.nativeObj, closed);

        return retVal;
    }


    //
    // C++:  void bilateralFilter(Mat src, Mat& dst, int d, double sigmaColor, double sigmaSpace, int borderType = BORDER_DEFAULT)
    //

/**
 * Applies the bilateral filter to an image.
 *
 * The function applies bilateral filtering to the input image, as described in
 * http://www.dai.ed.ac.uk/CVonline/LOCAL_COPIES/MANDUCHI1/Bilateral_Filtering.html
 * "bilateralFilter" can reduce unwanted noise very well while keeping edges
 * fairly sharp. However, it is very slow compared to most filters.
 *   *Sigma values*: For simplicity, you can set the 2 sigma values to be the
 * same. If they are small (< 10), the filter will not have much effect, whereas
 * if they are large (> 150), they will have a very strong effect, making the
 * image look "cartoonish".
 *   *Filter size*: Large filters (d > 5) are very slow, so it is recommended to
 * use d=5 for real-time applications, and perhaps d=9 for offline applications
 * that need heavy noise filtering.
 *
 * This filter does not work inplace.
 *
 * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
 * @param dst Destination image of the same size and type as "src".
 * @param d Diameter of each pixel neighborhood that is used during filtering.
 * If it is non-positive, it is computed from "sigmaSpace".
 * @param sigmaColor Filter sigma in the color space. A larger value of the
 * parameter means that farther colors within the pixel neighborhood (see
 * "sigmaSpace") will be mixed together, resulting in larger areas of semi-equal
 * color.
 * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the
 * parameter means that farther pixels will influence each other as long as
 * their colors are close enough (see "sigmaColor"). When "d>0", it specifies
 * the neighborhood size regardless of "sigmaSpace". Otherwise, "d" is
 * proportional to "sigmaSpace".
 * @param borderType a borderType
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#bilateralfilter">org.opencv.imgproc.Imgproc.bilateralFilter</a>
 */
    public static void bilateralFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int borderType)
    {

        bilateralFilter_0(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, borderType);

        return;
    }

/**
 * Applies the bilateral filter to an image.
 *
 * The function applies bilateral filtering to the input image, as described in
 * http://www.dai.ed.ac.uk/CVonline/LOCAL_COPIES/MANDUCHI1/Bilateral_Filtering.html
 * "bilateralFilter" can reduce unwanted noise very well while keeping edges
 * fairly sharp. However, it is very slow compared to most filters.
 *   *Sigma values*: For simplicity, you can set the 2 sigma values to be the
 * same. If they are small (< 10), the filter will not have much effect, whereas
 * if they are large (> 150), they will have a very strong effect, making the
 * image look "cartoonish".
 *   *Filter size*: Large filters (d > 5) are very slow, so it is recommended to
 * use d=5 for real-time applications, and perhaps d=9 for offline applications
 * that need heavy noise filtering.
 *
 * This filter does not work inplace.
 *
 * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
 * @param dst Destination image of the same size and type as "src".
 * @param d Diameter of each pixel neighborhood that is used during filtering.
 * If it is non-positive, it is computed from "sigmaSpace".
 * @param sigmaColor Filter sigma in the color space. A larger value of the
 * parameter means that farther colors within the pixel neighborhood (see
 * "sigmaSpace") will be mixed together, resulting in larger areas of semi-equal
 * color.
 * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the
 * parameter means that farther pixels will influence each other as long as
 * their colors are close enough (see "sigmaColor"). When "d>0", it specifies
 * the neighborhood size regardless of "sigmaSpace". Otherwise, "d" is
 * proportional to "sigmaSpace".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#bilateralfilter">org.opencv.imgproc.Imgproc.bilateralFilter</a>
 */
    public static void bilateralFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace)
    {

        bilateralFilter_1(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);

        return;
    }


    //
    // C++:  void blur(Mat src, Mat& dst, Size ksize, Point anchor = Point(-1,-1), int borderType = BORDER_DEFAULT)
    //

/**
 * Smoothes an image using the normalized box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = 1/(ksize.width*ksize.height) 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 *
 * The call "blur(src, dst, ksize, anchor, borderType)" is equivalent to
 * "boxFilter(src, dst, src.type(), anchor, true, borderType)".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Smoothing kernel size.
 * @param anchor Anchor point. The default value "Point(-1,-1)" means that the
 * anchor is at the kernel center.
 * @param borderType Border mode used to extrapolate pixels outside of the
 * image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#blur">org.opencv.imgproc.Imgproc.blur</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void blur(Mat src, Mat dst, Size ksize, Point anchor, int borderType)
    {

        blur_0(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, anchor.x, anchor.y, borderType);

        return;
    }

/**
 * Smoothes an image using the normalized box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = 1/(ksize.width*ksize.height) 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 *
 * The call "blur(src, dst, ksize, anchor, borderType)" is equivalent to
 * "boxFilter(src, dst, src.type(), anchor, true, borderType)".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Smoothing kernel size.
 * @param anchor Anchor point. The default value "Point(-1,-1)" means that the
 * anchor is at the kernel center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#blur">org.opencv.imgproc.Imgproc.blur</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void blur(Mat src, Mat dst, Size ksize, Point anchor)
    {

        blur_1(src.nativeObj, dst.nativeObj, ksize.width, ksize.height, anchor.x, anchor.y);

        return;
    }

/**
 * Smoothes an image using the normalized box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = 1/(ksize.width*ksize.height) 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 *
 * The call "blur(src, dst, ksize, anchor, borderType)" is equivalent to
 * "boxFilter(src, dst, src.type(), anchor, true, borderType)".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ksize Smoothing kernel size.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#blur">org.opencv.imgproc.Imgproc.blur</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void blur(Mat src, Mat dst, Size ksize)
    {

        blur_2(src.nativeObj, dst.nativeObj, ksize.width, ksize.height);

        return;
    }


    //
    // C++:  int borderInterpolate(int p, int len, int borderType)
    //

/**
 * Computes the source location of an extrapolated pixel.
 *
 * The function computes and returns the coordinate of a donor pixel
 * corresponding to the specified extrapolated pixel when using the specified
 * extrapolation border mode. For example, if you use "BORDER_WRAP" mode in the
 * horizontal direction, "BORDER_REFLECT_101" in the vertical direction and want
 * to compute value of the "virtual" pixel "Point(-5, 100)" in a floating-point
 * image "img", it looks like:
 *
 * Normally, the function is not called directly. It is used inside
 * "FilterEngine" and "copyMakeBorder" to compute tables for quick
 * extrapolation.
 *
 * @param p 0-based coordinate of the extrapolated pixel along one of the axes,
 * likely <0 or >= "len".
 * @param len Length of the array along the corresponding axis.
 * @param borderType Border type, one of the "BORDER_*", except for
 * "BORDER_TRANSPARENT" and "BORDER_ISOLATED". When "borderType==BORDER_CONSTANT",
 * the function always returns -1, regardless of "p" and "len".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#borderinterpolate">org.opencv.imgproc.Imgproc.borderInterpolate</a>
 * @see org.opencv.imgproc.FilterEngine
 * @see org.opencv.imgproc.Imgproc.copyMakeBorder
 */
    public static int borderInterpolate(int p, int len, int borderType)
    {

        int retVal = borderInterpolate_0(p, len, borderType);

        return retVal;
    }


    //
    // C++:  Rect boundingRect(vector_Point points)
    //

/**
 * Calculates the up-right bounding rectangle of a point set.
 *
 * The function calculates and returns the minimal up-right bounding rectangle
 * for the specified point set.
 *
 * @param points Input 2D point set, stored in "std.vector" or "Mat".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#boundingrect">org.opencv.imgproc.Imgproc.boundingRect</a>
 */
    public static Rect boundingRect(List<Point> points)
    {
        Mat points_mat = Converters.vector_Point_to_Mat(points);
        Rect retVal = new Rect(boundingRect_0(points_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  void boxFilter(Mat src, Mat& dst, int ddepth, Size ksize, Point anchor = Point(-1,-1), bool normalize = true, int borderType = BORDER_DEFAULT)
    //

/**
 * Smoothes an image using the box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = alpha 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 * where
 *
 * alpha = 1/(ksize.width*ksize.height) when normalize=true; 1 otherwise
 *
 * Unnormalized box filter is useful for computing various integral
 * characteristics over each pixel neighborhood, such as covariance matrices of
 * image derivatives (used in dense optical flow algorithms, and so on). If you
 * need to compute pixel sums over variable-size windows, use "integral".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ddepth a ddepth
 * @param ksize Smoothing kernel size.
 * @param anchor Anchor point. The default value "Point(-1,-1)" means that the
 * anchor is at the kernel center.
 * @param normalize Flag specifying whether the kernel is normalized by its area
 * or not.
 * @param borderType Border mode used to extrapolate pixels outside of the
 * image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#boxfilter">org.opencv.imgproc.Imgproc.boxFilter</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.integral
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize, int borderType)
    {

        boxFilter_0(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize, borderType);

        return;
    }

/**
 * Smoothes an image using the box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = alpha 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 * where
 *
 * alpha = 1/(ksize.width*ksize.height) when normalize=true; 1 otherwise
 *
 * Unnormalized box filter is useful for computing various integral
 * characteristics over each pixel neighborhood, such as covariance matrices of
 * image derivatives (used in dense optical flow algorithms, and so on). If you
 * need to compute pixel sums over variable-size windows, use "integral".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ddepth a ddepth
 * @param ksize Smoothing kernel size.
 * @param anchor Anchor point. The default value "Point(-1,-1)" means that the
 * anchor is at the kernel center.
 * @param normalize Flag specifying whether the kernel is normalized by its area
 * or not.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#boxfilter">org.opencv.imgproc.Imgproc.boxFilter</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.integral
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor, boolean normalize)
    {

        boxFilter_1(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y, normalize);

        return;
    }

/**
 * Smoothes an image using the box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = alpha 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 * where
 *
 * alpha = 1/(ksize.width*ksize.height) when normalize=true; 1 otherwise
 *
 * Unnormalized box filter is useful for computing various integral
 * characteristics over each pixel neighborhood, such as covariance matrices of
 * image derivatives (used in dense optical flow algorithms, and so on). If you
 * need to compute pixel sums over variable-size windows, use "integral".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ddepth a ddepth
 * @param ksize Smoothing kernel size.
 * @param anchor Anchor point. The default value "Point(-1,-1)" means that the
 * anchor is at the kernel center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#boxfilter">org.opencv.imgproc.Imgproc.boxFilter</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.integral
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize, Point anchor)
    {

        boxFilter_2(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height, anchor.x, anchor.y);

        return;
    }

/**
 * Smoothes an image using the box filter.
 *
 * The function smoothes an image using the kernel:
 *
 * K = alpha 1 1 1 *s 1 1
 * 1 1 1 *s 1 1..................
 * 1 1 1 *s 1 1
 *
 * where
 *
 * alpha = 1/(ksize.width*ksize.height) when normalize=true; 1 otherwise
 *
 * Unnormalized box filter is useful for computing various integral
 * characteristics over each pixel neighborhood, such as covariance matrices of
 * image derivatives (used in dense optical flow algorithms, and so on). If you
 * need to compute pixel sums over variable-size windows, use "integral".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param ddepth a ddepth
 * @param ksize Smoothing kernel size.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#boxfilter">org.opencv.imgproc.Imgproc.boxFilter</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.integral
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.medianBlur
 */
    public static void boxFilter(Mat src, Mat dst, int ddepth, Size ksize)
    {

        boxFilter_3(src.nativeObj, dst.nativeObj, ddepth, ksize.width, ksize.height);

        return;
    }


    //
    // C++:  void calcBackProject(vector_Mat images, vector_int channels, Mat hist, Mat& dst, vector_float ranges, double scale)
    //

/**
 * Calculates the back projection of a histogram.
 *
 * The functions "calcBackProject" calculate the back project of the histogram.
 * That is, similarly to "calcHist", at each location "(x, y)" the function
 * collects the values from the selected channels in the input images and finds
 * the corresponding histogram bin. But instead of incrementing it, the function
 * reads the bin value, scales it by "scale", and stores in "backProject(x,y)".
 * In terms of statistics, the function computes probability of each element
 * value in respect with the empirical probability distribution represented by
 * the histogram. See how, for example, you can find and track a bright-colored
 * object in a scene:
 *   #. Before tracking, show the object to the camera so that it covers almost
 * the whole frame. Calculate a hue histogram. The histogram may have strong
 * maximums, corresponding to the dominant colors in the object.
 *   #. When tracking, calculate a back projection of a hue plane of each input
 * video frame using that pre-computed histogram. Threshold the back projection
 * to suppress weak colors. It may also make sense to suppress pixels with
 * non-sufficient color saturation and too dark or too bright pixels.
 *   #. Find connected components in the resulting picture and choose, for
 * example, the largest component.
 *
 * This is an approximate algorithm of the "CAMShift" color object tracker.
 *
 * @param images a images
 * @param channels The list of channels used to compute the back projection. The
 * number of channels must match the histogram dimensionality. The first array
 * channels are numerated from 0 to "arrays[0].channels()-1", the second array
 * channels are counted from "arrays[0].channels()" to "arrays[0].channels() +
 * arrays[1].channels()-1", and so on.
 * @param hist Input histogram that can be dense or sparse.
 * @param dst a dst
 * @param ranges Array of arrays of the histogram bin boundaries in each
 * dimension. See "calcHist".
 * @param scale Optional scale factor for the output back projection.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/histograms.html#calcbackproject">org.opencv.imgproc.Imgproc.calcBackProject</a>
 * @see org.opencv.imgproc.Imgproc.calcHist
 */
    public static void calcBackProject(List<Mat> images, List<Integer> channels, Mat hist, Mat dst, List<Float> ranges, double scale)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat channels_mat = Converters.vector_int_to_Mat(channels);
        Mat ranges_mat = Converters.vector_float_to_Mat(ranges);
        calcBackProject_0(images_mat.nativeObj, channels_mat.nativeObj, hist.nativeObj, dst.nativeObj, ranges_mat.nativeObj, scale);

        return;
    }


    //
    // C++:  void calcHist(vector_Mat images, vector_int channels, Mat mask, Mat& hist, vector_int histSize, vector_float ranges, bool accumulate = false)
    //

/**
 * Calculates a histogram of a set of arrays.
 *
 * The functions "calcHist" calculate the histogram of one or more arrays. The
 * elements of a tuple used to increment a histogram bin are taken from the
 * corresponding input arrays at the same location. The sample below shows how
 * to compute a 2D Hue-Saturation histogram for a color image.
 *
 * @param images a images
 * @param channels List of the "dims" channels used to compute the histogram.
 * The first array channels are numerated from 0 to "arrays[0].channels()-1",
 * the second array channels are counted from "arrays[0].channels()" to
 * "arrays[0].channels() + arrays[1].channels()-1", and so on.
 * @param mask Optional mask. If the matrix is not empty, it must be an 8-bit
 * array of the same size as "arrays[i]". The non-zero mask elements mark the
 * array elements counted in the histogram.
 * @param hist Output histogram, which is a dense or sparse "dims" -dimensional
 * array.
 * @param histSize Array of histogram sizes in each dimension.
 * @param ranges Array of the "dims" arrays of the histogram bin boundaries in
 * each dimension. When the histogram is uniform ("uniform" =true), then for
 * each dimension "i" it is enough to specify the lower (inclusive) boundary L_0
 * of the 0-th histogram bin and the upper (exclusive) boundary
 * U_(histSize[i]-1) for the last histogram bin "histSize[i]-1". That is, in
 * case of a uniform histogram each of "ranges[i]" is an array of 2 elements.
 * When the histogram is not uniform ("uniform=false"), then each of "ranges[i]"
 * contains "histSize[i]+1" elements: L_0, U_0=L_1, U_1=L_2,...,
 * U_(histSize[i]-2)=L_(histSize[i]-1), U_(histSize[i]-1). The array elements,
 * that are not between L_0 and U_(histSize[i]-1), are not counted in the
 * histogram.
 * @param accumulate Accumulation flag. If it is set, the histogram is not
 * cleared in the beginning when it is allocated. This feature enables you to
 * compute a single histogram from several sets of arrays, or to update the
 * histogram in time.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/histograms.html#calchist">org.opencv.imgproc.Imgproc.calcHist</a>
 */
    public static void calcHist(List<Mat> images, List<Integer> channels, Mat mask, Mat hist, List<Integer> histSize, List<Float> ranges, boolean accumulate)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat channels_mat = Converters.vector_int_to_Mat(channels);
        Mat histSize_mat = Converters.vector_int_to_Mat(histSize);
        Mat ranges_mat = Converters.vector_float_to_Mat(ranges);
        calcHist_0(images_mat.nativeObj, channels_mat.nativeObj, mask.nativeObj, hist.nativeObj, histSize_mat.nativeObj, ranges_mat.nativeObj, accumulate);

        return;
    }

/**
 * Calculates a histogram of a set of arrays.
 *
 * The functions "calcHist" calculate the histogram of one or more arrays. The
 * elements of a tuple used to increment a histogram bin are taken from the
 * corresponding input arrays at the same location. The sample below shows how
 * to compute a 2D Hue-Saturation histogram for a color image.
 *
 * @param images a images
 * @param channels List of the "dims" channels used to compute the histogram.
 * The first array channels are numerated from 0 to "arrays[0].channels()-1",
 * the second array channels are counted from "arrays[0].channels()" to
 * "arrays[0].channels() + arrays[1].channels()-1", and so on.
 * @param mask Optional mask. If the matrix is not empty, it must be an 8-bit
 * array of the same size as "arrays[i]". The non-zero mask elements mark the
 * array elements counted in the histogram.
 * @param hist Output histogram, which is a dense or sparse "dims" -dimensional
 * array.
 * @param histSize Array of histogram sizes in each dimension.
 * @param ranges Array of the "dims" arrays of the histogram bin boundaries in
 * each dimension. When the histogram is uniform ("uniform" =true), then for
 * each dimension "i" it is enough to specify the lower (inclusive) boundary L_0
 * of the 0-th histogram bin and the upper (exclusive) boundary
 * U_(histSize[i]-1) for the last histogram bin "histSize[i]-1". That is, in
 * case of a uniform histogram each of "ranges[i]" is an array of 2 elements.
 * When the histogram is not uniform ("uniform=false"), then each of "ranges[i]"
 * contains "histSize[i]+1" elements: L_0, U_0=L_1, U_1=L_2,...,
 * U_(histSize[i]-2)=L_(histSize[i]-1), U_(histSize[i]-1). The array elements,
 * that are not between L_0 and U_(histSize[i]-1), are not counted in the
 * histogram.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/histograms.html#calchist">org.opencv.imgproc.Imgproc.calcHist</a>
 */
    public static void calcHist(List<Mat> images, List<Integer> channels, Mat mask, Mat hist, List<Integer> histSize, List<Float> ranges)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat channels_mat = Converters.vector_int_to_Mat(channels);
        Mat histSize_mat = Converters.vector_int_to_Mat(histSize);
        Mat ranges_mat = Converters.vector_float_to_Mat(ranges);
        calcHist_1(images_mat.nativeObj, channels_mat.nativeObj, mask.nativeObj, hist.nativeObj, histSize_mat.nativeObj, ranges_mat.nativeObj);

        return;
    }


    //
    // C++:  double compareHist(Mat H1, Mat H2, int method)
    //

/**
 * Compares two histograms.
 *
 * The functions "compareHist" compare two dense or two sparse histograms using
 * the specified method:
 *   * Correlation (method=CV_COMP_CORREL)
 *
 * d(H_1,H_2) = (sum_I(H_1(I) - H_1")(H_2(I) - H_2"))/(sqrt(sum_I(H_1(I) -
 * H_1")^2 sum_I(H_2(I) - H_2")^2))
 *
 * where
 *
 * H_k" = 1/(N) sum _J H_k(J)
 *
 * and N is a total number of histogram bins.
 *   * Chi-Square (method=CV_COMP_CHISQR)
 *
 * d(H_1,H_2) = sum _I((H_1(I)-H_2(I))^2)/(H_1(I)+H_2(I))
 *
 *   * Intersection (method=CV_COMP_INTERSECT)
 *
 * d(H_1,H_2) = sum _I min(H_1(I), H_2(I))
 *
 *   * Bhattacharyya distance (method=CV_COMP_BHATTACHARYYA)
 *
 * d(H_1,H_2) = sqrt(1 - frac(1)(sqrt(H_1" H_2" N^2)) sum_I sqrt(H_1(I) *
 * H_2(I)))
 *
 * The function returns d(H_1, H_2).
 *
 * While the function works well with 1-, 2-, 3-dimensional dense histograms, it
 * may not be suitable for high-dimensional sparse histograms. In such
 * histograms, because of aliasing and sampling problems, the coordinates of
 * non-zero histogram bins can slightly shift. To compare such histograms or
 * more general sparse configurations of weighted points, consider using the
 * "EMD" function.
 *
 * @param H1 First compared histogram.
 * @param H2 Second compared histogram of the same size as "H1".
 * @param method Comparison method that could be one of the following:
 *   * CV_COMP_CORREL Correlation
 *   * CV_COMP_CHISQR Chi-Square
 *   * CV_COMP_INTERSECT Intersection
 *   * CV_COMP_BHATTACHARYYA Bhattacharyya distance
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/histograms.html#comparehist">org.opencv.imgproc.Imgproc.compareHist</a>
 */
    public static double compareHist(Mat H1, Mat H2, int method)
    {

        double retVal = compareHist_0(H1.nativeObj, H2.nativeObj, method);

        return retVal;
    }


    //
    // C++:  double contourArea(Mat contour, bool oriented = false)
    //

/**
 * Calculates a contour area.
 *
 * The function computes a contour area. Similarly to "moments", the area is
 * computed using the Green formula. Thus, the returned area and the number of
 * non-zero pixels, if you draw the contour using "drawContours" or "fillPoly",
 * can be different.
 *
 * Example:
 *
 * @param contour Input vector of 2D points (contour vertices), stored in
 * "std.vector" or "Mat".
 * @param oriented a oriented
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#contourarea">org.opencv.imgproc.Imgproc.contourArea</a>
 */
    public static double contourArea(Mat contour, boolean oriented)
    {

        double retVal = contourArea_0(contour.nativeObj, oriented);

        return retVal;
    }

/**
 * Calculates a contour area.
 *
 * The function computes a contour area. Similarly to "moments", the area is
 * computed using the Green formula. Thus, the returned area and the number of
 * non-zero pixels, if you draw the contour using "drawContours" or "fillPoly",
 * can be different.
 *
 * Example:
 *
 * @param contour Input vector of 2D points (contour vertices), stored in
 * "std.vector" or "Mat".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#contourarea">org.opencv.imgproc.Imgproc.contourArea</a>
 */
    public static double contourArea(Mat contour)
    {

        double retVal = contourArea_1(contour.nativeObj);

        return retVal;
    }


    //
    // C++:  void convertMaps(Mat map1, Mat map2, Mat& dstmap1, Mat& dstmap2, int dstmap1type, bool nninterpolation = false)
    //

/**
 * Converts image transformation maps from one representation to another.
 *
 * The function converts a pair of maps for "remap" from one representation to
 * another. The following options ("(map1.type(), map2.type())" ->
 * "(dstmap1.type(), dstmap2.type())") are supported:
 *   * (CV_32FC1, CV_32FC1) -> (CV_16SC2, CV_16UC1). This is the most frequently
 * used conversion operation, in which the original floating-point maps (see
 * "remap") are converted to a more compact and much faster fixed-point
 * representation. The first output array contains the rounded coordinates and
 * the second array (created only when "nninterpolation=false") contains indices
 * in the interpolation tables.
 *   * (CV_32FC2) -> (CV_16SC2, CV_16UC1). The same as above but the original
 * maps are stored in one 2-channel matrix.
 *   * Reverse conversion. Obviously, the reconstructed floating-point maps will
 * not be exactly the same as the originals.
 *
 * @param map1 The first input map of type "CV_16SC2", "CV_32FC1", or
 * "CV_32FC2".
 * @param map2 The second input map of type "CV_16UC1", "CV_32FC1", or none
 * (empty matrix), respectively.
 * @param dstmap1 The first output map that has the type "dstmap1type" and the
 * same size as "src".
 * @param dstmap2 The second output map.
 * @param dstmap1type Type of the first output map that should be "CV_16SC2",
 * "CV_32FC1", or "CV_32FC2".
 * @param nninterpolation Flag indicating whether the fixed-point maps are used
 * for the nearest-neighbor or for a more complex interpolation.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#convertmaps">org.opencv.imgproc.Imgproc.convertMaps</a>
 * @see undisort
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.initUndistortRectifyMap
 */
    public static void convertMaps(Mat map1, Mat map2, Mat dstmap1, Mat dstmap2, int dstmap1type, boolean nninterpolation)
    {

        convertMaps_0(map1.nativeObj, map2.nativeObj, dstmap1.nativeObj, dstmap2.nativeObj, dstmap1type, nninterpolation);

        return;
    }

/**
 * Converts image transformation maps from one representation to another.
 *
 * The function converts a pair of maps for "remap" from one representation to
 * another. The following options ("(map1.type(), map2.type())" ->
 * "(dstmap1.type(), dstmap2.type())") are supported:
 *   * (CV_32FC1, CV_32FC1) -> (CV_16SC2, CV_16UC1). This is the most frequently
 * used conversion operation, in which the original floating-point maps (see
 * "remap") are converted to a more compact and much faster fixed-point
 * representation. The first output array contains the rounded coordinates and
 * the second array (created only when "nninterpolation=false") contains indices
 * in the interpolation tables.
 *   * (CV_32FC2) -> (CV_16SC2, CV_16UC1). The same as above but the original
 * maps are stored in one 2-channel matrix.
 *   * Reverse conversion. Obviously, the reconstructed floating-point maps will
 * not be exactly the same as the originals.
 *
 * @param map1 The first input map of type "CV_16SC2", "CV_32FC1", or
 * "CV_32FC2".
 * @param map2 The second input map of type "CV_16UC1", "CV_32FC1", or none
 * (empty matrix), respectively.
 * @param dstmap1 The first output map that has the type "dstmap1type" and the
 * same size as "src".
 * @param dstmap2 The second output map.
 * @param dstmap1type Type of the first output map that should be "CV_16SC2",
 * "CV_32FC1", or "CV_32FC2".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#convertmaps">org.opencv.imgproc.Imgproc.convertMaps</a>
 * @see undisort
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.initUndistortRectifyMap
 */
    public static void convertMaps(Mat map1, Mat map2, Mat dstmap1, Mat dstmap2, int dstmap1type)
    {

        convertMaps_1(map1.nativeObj, map2.nativeObj, dstmap1.nativeObj, dstmap2.nativeObj, dstmap1type);

        return;
    }


    //
    // C++:  void convexHull(Mat points, Mat& hull, bool clockwise = false, bool returnPoints = true)
    //

/**
 * Finds the convex hull of a point set.
 *
 * The functions find the convex hull of a 2D point set using the Sklansky's
 * algorithm [Sklansky82] that has *O(N logN)* complexity in the current
 * implementation. See the OpenCV sample "convexhull.cpp" that demonstrates the
 * usage of different function variants.
 *
 * @param points Input 2D point set, stored in "std.vector" or "Mat".
 * @param hull Output convex hull. It is either an integer vector of indices or
 * vector of points. In the first case, the "hull" elements are 0-based indices
 * of the convex hull points in the original array (since the set of convex hull
 * points is a subset of the original point set). In the second case, "hull"
 * elements aree the convex hull points themselves.
 * @param clockwise Orientation flag. If it is true, the output convex hull is
 * oriented clockwise. Otherwise, it is oriented counter-clockwise. The usual
 * screen coordinate system is assumed so that the origin is at the top-left
 * corner, x axis is oriented to the right, and y axis is oriented downwards.
 * @param returnPoints Operation flag. In case of a matrix, when the flag is
 * true, the function returns convex hull points. Otherwise, it returns indices
 * of the convex hull points. When the output array is "std.vector", the flag
 * is ignored, and the output depends on the type of the vector:
 * "std.vector<int>" implies "returnPoints=true", "std.vector<Point>" implies
 * "returnPoints=false".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#convexhull">org.opencv.imgproc.Imgproc.convexHull</a>
 */
    public static void convexHull(Mat points, Mat hull, boolean clockwise, boolean returnPoints)
    {

        convexHull_0(points.nativeObj, hull.nativeObj, clockwise, returnPoints);

        return;
    }

/**
 * Finds the convex hull of a point set.
 *
 * The functions find the convex hull of a 2D point set using the Sklansky's
 * algorithm [Sklansky82] that has *O(N logN)* complexity in the current
 * implementation. See the OpenCV sample "convexhull.cpp" that demonstrates the
 * usage of different function variants.
 *
 * @param points Input 2D point set, stored in "std.vector" or "Mat".
 * @param hull Output convex hull. It is either an integer vector of indices or
 * vector of points. In the first case, the "hull" elements are 0-based indices
 * of the convex hull points in the original array (since the set of convex hull
 * points is a subset of the original point set). In the second case, "hull"
 * elements aree the convex hull points themselves.
 * @param clockwise Orientation flag. If it is true, the output convex hull is
 * oriented clockwise. Otherwise, it is oriented counter-clockwise. The usual
 * screen coordinate system is assumed so that the origin is at the top-left
 * corner, x axis is oriented to the right, and y axis is oriented downwards.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#convexhull">org.opencv.imgproc.Imgproc.convexHull</a>
 */
    public static void convexHull(Mat points, Mat hull, boolean clockwise)
    {

        convexHull_1(points.nativeObj, hull.nativeObj, clockwise);

        return;
    }

/**
 * Finds the convex hull of a point set.
 *
 * The functions find the convex hull of a 2D point set using the Sklansky's
 * algorithm [Sklansky82] that has *O(N logN)* complexity in the current
 * implementation. See the OpenCV sample "convexhull.cpp" that demonstrates the
 * usage of different function variants.
 *
 * @param points Input 2D point set, stored in "std.vector" or "Mat".
 * @param hull Output convex hull. It is either an integer vector of indices or
 * vector of points. In the first case, the "hull" elements are 0-based indices
 * of the convex hull points in the original array (since the set of convex hull
 * points is a subset of the original point set). In the second case, "hull"
 * elements aree the convex hull points themselves.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#convexhull">org.opencv.imgproc.Imgproc.convexHull</a>
 */
    public static void convexHull(Mat points, Mat hull)
    {

        convexHull_2(points.nativeObj, hull.nativeObj);

        return;
    }


    //
    // C++:  void copyMakeBorder(Mat src, Mat& dst, int top, int bottom, int left, int right, int borderType, Scalar value = Scalar())
    //

/**
 * Forms a border around an image.
 *
 * The function copies the source image into the middle of the destination
 * image. The areas to the left, to the right, above and below the copied source
 * image will be filled with extrapolated pixels. This is not what
 * "FilterEngine" or filtering functions based on it do (they extrapolate pixels
 * on-fly), but what other more complex functions, including your own, may do to
 * simplify image boundary handling.
 *
 * The function supports the mode when "src" is already in the middle of "dst".
 * In this case, the function does not copy "src" itself but simply constructs
 * the border, for example:
 *
 * @param src Source image.
 * @param dst Destination image of the same type as "src" and the size
 * "Size(src.cols+left+right, src.rows+top+bottom)".
 * @param top a top
 * @param bottom a bottom
 * @param left a left
 * @param right Parameter specifying how many pixels in each direction from the
 * source image rectangle to extrapolate. For example, "top=1, bottom=1, left=1,
 * right=1" mean that 1 pixel-wide border needs to be built.
 * @param borderType Border type. See "borderInterpolate" for details.
 * @param value Border value if "borderType==BORDER_CONSTANT".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#copymakeborder">org.opencv.imgproc.Imgproc.copyMakeBorder</a>
 * @see org.opencv.imgproc.Imgproc.borderInterpolate
 */
    public static void copyMakeBorder(Mat src, Mat dst, int top, int bottom, int left, int right, int borderType, Scalar value)
    {

        copyMakeBorder_0(src.nativeObj, dst.nativeObj, top, bottom, left, right, borderType, value.val[0], value.val[1], value.val[2], value.val[3]);

        return;
    }

/**
 * Forms a border around an image.
 *
 * The function copies the source image into the middle of the destination
 * image. The areas to the left, to the right, above and below the copied source
 * image will be filled with extrapolated pixels. This is not what
 * "FilterEngine" or filtering functions based on it do (they extrapolate pixels
 * on-fly), but what other more complex functions, including your own, may do to
 * simplify image boundary handling.
 *
 * The function supports the mode when "src" is already in the middle of "dst".
 * In this case, the function does not copy "src" itself but simply constructs
 * the border, for example:
 *
 * @param src Source image.
 * @param dst Destination image of the same type as "src" and the size
 * "Size(src.cols+left+right, src.rows+top+bottom)".
 * @param top a top
 * @param bottom a bottom
 * @param left a left
 * @param right Parameter specifying how many pixels in each direction from the
 * source image rectangle to extrapolate. For example, "top=1, bottom=1, left=1,
 * right=1" mean that 1 pixel-wide border needs to be built.
 * @param borderType Border type. See "borderInterpolate" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#copymakeborder">org.opencv.imgproc.Imgproc.copyMakeBorder</a>
 * @see org.opencv.imgproc.Imgproc.borderInterpolate
 */
    public static void copyMakeBorder(Mat src, Mat dst, int top, int bottom, int left, int right, int borderType)
    {

        copyMakeBorder_1(src.nativeObj, dst.nativeObj, top, bottom, left, right, borderType);

        return;
    }


    //
    // C++:  void cornerEigenValsAndVecs(Mat src, Mat& dst, int blockSize, int ksize, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates eigenvalues and eigenvectors of image blocks for corner detection.
 *
 * For every pixel p, the function "cornerEigenValsAndVecs" considers a
 * "blockSize" x "blockSize" neigborhood S(p). It calculates the covariation
 * matrix of derivatives over the neighborhood as:
 *
 * M = sum(by: S(p))(dI/dx)^2 sum(by: S(p))(dI/dx dI/dy)^2
 * sum(by: S(p))(dI/dx dI/dy)^2 sum(by: S(p))(dI/dy)^2
 *
 * where the derivatives are computed using the "Sobel" operator.
 *
 * After that, it finds eigenvectors and eigenvalues of M and stores them in the
 * destination image as (lambda_1, lambda_2, x_1, y_1, x_2, y_2) where
 *   * lambda_1, lambda_2 are the non-sorted eigenvalues of M
 *   * x_1, y_1 are the eigenvectors corresponding to lambda_1
 *   * x_2, y_2 are the eigenvectors corresponding to lambda_2
 *
 * The output of the function can be used for robust edge or corner detection.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the results. It has the same size as "src" and the
 * type "CV_32FC(6)".
 * @param blockSize Neighborhood size (see details below).
 * @param ksize a ksize
 * @param borderType a borderType
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornereigenvalsandvecs">org.opencv.imgproc.Imgproc.cornerEigenValsAndVecs</a>
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see org.opencv.imgproc.Imgproc.preCornerDetect
 */
    public static void cornerEigenValsAndVecs(Mat src, Mat dst, int blockSize, int ksize, int borderType)
    {

        cornerEigenValsAndVecs_0(src.nativeObj, dst.nativeObj, blockSize, ksize, borderType);

        return;
    }

/**
 * Calculates eigenvalues and eigenvectors of image blocks for corner detection.
 *
 * For every pixel p, the function "cornerEigenValsAndVecs" considers a
 * "blockSize" x "blockSize" neigborhood S(p). It calculates the covariation
 * matrix of derivatives over the neighborhood as:
 *
 * M = sum(by: S(p))(dI/dx)^2 sum(by: S(p))(dI/dx dI/dy)^2
 * sum(by: S(p))(dI/dx dI/dy)^2 sum(by: S(p))(dI/dy)^2
 *
 * where the derivatives are computed using the "Sobel" operator.
 *
 * After that, it finds eigenvectors and eigenvalues of M and stores them in the
 * destination image as (lambda_1, lambda_2, x_1, y_1, x_2, y_2) where
 *   * lambda_1, lambda_2 are the non-sorted eigenvalues of M
 *   * x_1, y_1 are the eigenvectors corresponding to lambda_1
 *   * x_2, y_2 are the eigenvectors corresponding to lambda_2
 *
 * The output of the function can be used for robust edge or corner detection.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the results. It has the same size as "src" and the
 * type "CV_32FC(6)".
 * @param blockSize Neighborhood size (see details below).
 * @param ksize a ksize
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornereigenvalsandvecs">org.opencv.imgproc.Imgproc.cornerEigenValsAndVecs</a>
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see org.opencv.imgproc.Imgproc.preCornerDetect
 */
    public static void cornerEigenValsAndVecs(Mat src, Mat dst, int blockSize, int ksize)
    {

        cornerEigenValsAndVecs_1(src.nativeObj, dst.nativeObj, blockSize, ksize);

        return;
    }


    //
    // C++:  void cornerHarris(Mat src, Mat& dst, int blockSize, int ksize, double k, int borderType = BORDER_DEFAULT)
    //

/**
 * Harris edge detector.
 *
 * The function runs the Harris edge detector on the image. Similarly to
 * "cornerMinEigenVal" and "cornerEigenValsAndVecs", for each pixel (x, y) it
 * calculates a 2x2 gradient covariance matrix M^((x,y)) over a blockSize x
 * blockSize neighborhood. Then, it computes the following characteristic:
 *
 * dst(x,y) = det M^((x,y)) - k * (tr M^((x,y)))^2
 *
 * Corners in the image can be found as the local maxima of this response map.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the Harris detector responses. It has the type
 * "CV_32FC1" and the same size as "src".
 * @param blockSize Neighborhood size (see the details on "cornerEigenValsAndVecs").
 * @param ksize a ksize
 * @param k Harris detector free parameter. See the formula below.
 * @param borderType a borderType
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornerharris">org.opencv.imgproc.Imgproc.cornerHarris</a>
 */
    public static void cornerHarris(Mat src, Mat dst, int blockSize, int ksize, double k, int borderType)
    {

        cornerHarris_0(src.nativeObj, dst.nativeObj, blockSize, ksize, k, borderType);

        return;
    }

/**
 * Harris edge detector.
 *
 * The function runs the Harris edge detector on the image. Similarly to
 * "cornerMinEigenVal" and "cornerEigenValsAndVecs", for each pixel (x, y) it
 * calculates a 2x2 gradient covariance matrix M^((x,y)) over a blockSize x
 * blockSize neighborhood. Then, it computes the following characteristic:
 *
 * dst(x,y) = det M^((x,y)) - k * (tr M^((x,y)))^2
 *
 * Corners in the image can be found as the local maxima of this response map.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the Harris detector responses. It has the type
 * "CV_32FC1" and the same size as "src".
 * @param blockSize Neighborhood size (see the details on "cornerEigenValsAndVecs").
 * @param ksize a ksize
 * @param k Harris detector free parameter. See the formula below.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornerharris">org.opencv.imgproc.Imgproc.cornerHarris</a>
 */
    public static void cornerHarris(Mat src, Mat dst, int blockSize, int ksize, double k)
    {

        cornerHarris_1(src.nativeObj, dst.nativeObj, blockSize, ksize, k);

        return;
    }


    //
    // C++:  void cornerMinEigenVal(Mat src, Mat& dst, int blockSize, int ksize = 3, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates the minimal eigenvalue of gradient matrices for corner detection.
 *
 * The function is similar to "cornerEigenValsAndVecs" but it calculates and
 * stores only the minimal eigenvalue of the covariance matrix of derivatives,
 * that is, min(lambda_1, lambda_2) in terms of the formulae in the
 * "cornerEigenValsAndVecs" description.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the minimal eigenvalues. It has the type "CV_32FC1"
 * and the same size as "src".
 * @param blockSize Neighborhood size (see the details on "cornerEigenValsAndVecs").
 * @param ksize a ksize
 * @param borderType a borderType
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornermineigenval">org.opencv.imgproc.Imgproc.cornerMinEigenVal</a>
 */
    public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize, int ksize, int borderType)
    {

        cornerMinEigenVal_0(src.nativeObj, dst.nativeObj, blockSize, ksize, borderType);

        return;
    }

/**
 * Calculates the minimal eigenvalue of gradient matrices for corner detection.
 *
 * The function is similar to "cornerEigenValsAndVecs" but it calculates and
 * stores only the minimal eigenvalue of the covariance matrix of derivatives,
 * that is, min(lambda_1, lambda_2) in terms of the formulae in the
 * "cornerEigenValsAndVecs" description.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the minimal eigenvalues. It has the type "CV_32FC1"
 * and the same size as "src".
 * @param blockSize Neighborhood size (see the details on "cornerEigenValsAndVecs").
 * @param ksize a ksize
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornermineigenval">org.opencv.imgproc.Imgproc.cornerMinEigenVal</a>
 */
    public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize, int ksize)
    {

        cornerMinEigenVal_1(src.nativeObj, dst.nativeObj, blockSize, ksize);

        return;
    }

/**
 * Calculates the minimal eigenvalue of gradient matrices for corner detection.
 *
 * The function is similar to "cornerEigenValsAndVecs" but it calculates and
 * stores only the minimal eigenvalue of the covariance matrix of derivatives,
 * that is, min(lambda_1, lambda_2) in terms of the formulae in the
 * "cornerEigenValsAndVecs" description.
 *
 * @param src Input single-channel 8-bit or floating-point image.
 * @param dst Image to store the minimal eigenvalues. It has the type "CV_32FC1"
 * and the same size as "src".
 * @param blockSize Neighborhood size (see the details on "cornerEigenValsAndVecs").
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornermineigenval">org.opencv.imgproc.Imgproc.cornerMinEigenVal</a>
 */
    public static void cornerMinEigenVal(Mat src, Mat dst, int blockSize)
    {

        cornerMinEigenVal_2(src.nativeObj, dst.nativeObj, blockSize);

        return;
    }


    //
    // C++:  void cornerSubPix(Mat image, vector_Point2f& corners, Size winSize, Size zeroZone, TermCriteria criteria)
    //

/**
 * Refines the corner locations.
 *
 * The function iterates to find the sub-pixel accurate location of corners or
 * radial saddle points, as shown on the figure below.
 *
 * Sub-pixel accurate corner locator is based on the observation that every
 * vector from the center q to a point p located within a neighborhood of q is
 * orthogonal to the image gradient at p subject to image and measurement noise.
 * Consider the expression:
 *
 * epsilon _i = (DI_(p_i))^T * (q - p_i)
 *
 * where (DI_(p_i)) is an image gradient at one of the points p_i in a
 * neighborhood of q. The value of q is to be found so that epsilon_i is
 * minimized. A system of equations may be set up with epsilon_i set to zero:
 *
 * sum _i(DI_(p_i) * (DI_(p_i))^T) - sum _i(DI_(p_i) * (DI_(p_i))^T * p_i)
 *
 * where the gradients are summed within a neighborhood ("search window") of q.
 * Calling the first gradient term G and the second gradient term b gives:
 *
 * q = G^(-1) * b
 *
 * The algorithm sets the center of the neighborhood window at this new center q
 * and then iterates until the center stays within a set threshold.
 *
 * @param image Input image.
 * @param corners Initial coordinates of the input corners and refined
 * coordinates provided for output.
 * @param winSize Half of the side length of the search window. For example, if
 * "winSize=Size(5,5)", then a 5*2+1 x 5*2+1 = 11 x 11 search window is used.
 * @param zeroZone Half of the size of the dead region in the middle of the
 * search zone over which the summation in the formula below is not done. It is
 * used sometimes to avoid possible singularities of the autocorrelation matrix.
 * The value of (-1,-1) indicates that there is no such a size.
 * @param criteria Criteria for termination of the iterative process of corner
 * refinement. That is, the process of corner position refinement stops either
 * after "criteria.maxCount" iterations or when the corner position moves by
 * less than "criteria.epsilon" on some iteration.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#cornersubpix">org.opencv.imgproc.Imgproc.cornerSubPix</a>
 */
    public static void cornerSubPix(Mat image, List<Point> corners, Size winSize, Size zeroZone, TermCriteria criteria)
    {
        Mat corners_mat = Converters.vector_Point2f_to_Mat(corners);
        cornerSubPix_0(image.nativeObj, corners_mat.nativeObj, winSize.width, winSize.height, zeroZone.width, zeroZone.height, criteria.type, criteria.maxCount, criteria.epsilon);
        Converters.Mat_to_vector_Point2f(corners_mat, corners);
        return;
    }


    //
    // C++:  void cvtColor(Mat src, Mat& dst, int code, int dstCn = 0)
    //

/**
 * Converts an image from one color space to another.
 *
 * The function converts an input image from one color space to another. In case
 * of a transformation to-from RGB color space, the order of the channels should
 * be specified explicitly (RGB or BGR).
 * Note that the default color format in OpenCV is often referred to as RGB but
 * it is actually BGR (the bytes are reversed). So the first byte in a standard
 * (24-bit) color image will be an 8-bit Blue component, the second byte will be
 * Green, and the third byte will be Red. The fourth, fifth, and sixth bytes
 * would then be the second pixel (Blue, then Green, then Red), and so on.
 *
 * The conventional ranges for R, G, and B channel values are:
 *   * 0 to 255 for "CV_8U" images
 *   * 0 to 65535 for "CV_16U" images
 *   * 0 to 1 for "CV_32F" images
 *
 * In case of linear transformations, the range does not matter.
 * But in case of a non-linear transformation, an input RGB image should be
 * normalized to the proper value range to get the correct results, for example,
 * for RGB -> L*u*v* transformation. For example, if you have a 32-bit
 * floating-point image directly converted from an 8-bit image without any
 * scaling, then it will have the 0..255 value range instead of 0..1 assumed by
 * the function. So, before calling "cvtColor", you need first to scale the
 * image down:
 *
 * If you use "cvtColor" with 8-bit images, the conversion will have some
 * information lost. For many applications, this will not be noticeable but it
 * is recommended to use 32-bit images in applications that need the full range
 * of colors or that convert an image before an operation and then convert back.
 *
 * The function can do the following transformations:
 *   * Transformations within RGB space like adding/removing the alpha channel,
 * reversing the channel order, conversion to/from 16-bit RGB color (R5:G6:B5 or
 * R5:G5:B5), as well as conversion to/from grayscale using:
 *
 * RGB[A] to Gray: Y <- 0.299 * R + 0.587 * G + 0.114 * B
 *
 * and
 *
 * Gray to RGB[A]: R <- Y, G <- Y, B <- Y, A <- 0
 *
 * The conversion from a RGB image to gray is done with:
 *
 * More advanced channel reordering can also be done with "mixChannels".
 *   * RGB <-> CIE XYZ.Rec 709 with D65 white point ("CV_BGR2XYZ, CV_RGB2XYZ,
 * CV_XYZ2BGR, CV_XYZ2RGB"):.. math
 *
 * begin{bmatrix} X \ Y \ Z end{bmatrix} leftarrow begin{bmatrix} 0.412453 &
 * 0.357580 & 0.180423 \ 0.212671 & 0.715160 & 0.072169 \ 0.019334 & 0.119193 &
 * 0.950227 end{bmatrix} cdot begin{bmatrix} R \ G \ B end{bmatrix}.. math
 *
 * begin{bmatrix} R \ G \ B end{bmatrix} leftarrow begin{bmatrix} 3.240479 &
 * -1.53715 & -0.498535 \ -0.969256 & 1.875991 & 0.041556 \ 0.055648 & -0.204043
 * & 1.057311 end{bmatrix} cdot begin{bmatrix} X \ Y \ Z end{bmatrix}
 *
 * X, Y and Z cover the whole value range (in case of floating-point images, Z
 * may exceed 1).
 *   * RGB <-> YCrCb JPEG (or YCC) ("CV_BGR2YCrCb, CV_RGB2YCrCb, CV_YCrCb2BGR,
 * CV_YCrCb2RGB")
 *
 * Y <- 0.299 * R + 0.587 * G + 0.114 * B
 *
 *
 *
 * Cr <- (R-Y) * 0.713 + delta
 *
 *
 *
 * Cb <- (B-Y) * 0.564 + delta
 *
 *
 *
 * R <- Y + 1.403 * (Cr - delta)
 *
 *
 *
 * G <- Y - 0.344 * (Cr - delta) - 0.714 * (Cb - delta)
 *
 *
 *
 * B <- Y + 1.773 * (Cb - delta)
 *
 * where
 *
 * delta = <= ft (128 for 8-bit images
 * 32768 for 16-bit images
 * 0.5 for floating-point images right.
 *
 * Y, Cr, and Cb cover the whole value range.
 *   * RGB <-> HSV ("CV_BGR2HSV, CV_RGB2HSV, CV_HSV2BGR, CV_HSV2RGB") In case of
 * 8-bit and 16-bit images, R, G, and B are converted to the floating-point
 * format and scaled to fit the 0 to 1 range.
 *
 * V <- max(R,G,B)
 *
 *
 *
 * S <- (V-min(R,G,B))/(V) if V != 0; 0 otherwise
 *
 *
 *
 * H <- (60(G - B))/((V-min(R,G,B))) if V=R; (120+60(B - R))/((V-min(R,G,B))) if
 * V=G; (240+60(R - G))/((V-min(R,G,B))) if V=B
 *
 * If H<0 then H <- H+360. On output 0 <= V <= 1, 0 <= S <= 1, 0 <= H <= 360.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * V <- 255 V, S <- 255 S, H <- H/2(to fit to 0 to 255)
 *
 *   * 16-bit images (currently not supported)
 *
 * V <- 65535 V, S <- 65535 S, H <- H
 *
 *   * 32-bit images H, S, and V are left as is
 *   * RGB <-> HLS ("CV_BGR2HLS, CV_RGB2HLS, CV_HLS2BGR, CV_HLS2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit the 0 to 1 range.
 *
 * V_(max) <- (max)(R,G,B)
 *
 *
 *
 * V_(min) <- (min)(R,G,B)
 *
 *
 *
 * L <- (V_(max) + V_(min))/2.. math
 *
 * S leftarrow fork { frac{V_{max} - V_{min}}{V_{max} + V_{min}} }{if $L < 0.5$
 * } { frac{V_{max} - V_{min}}{2 - (V_{max} + V_{min})} }{if $L ge 0.5$ }.. math
 *
 * H leftarrow forkthree {{60(G - B)}/{S}}{if $V_{max}=R$ } {{120+60(B -
 * R)}/{S}}{if $V_{max}=G$ } {{240+60(R - G)}/{S}}{if $V_{max}=B$ }
 *
 * If H<0 then H <- H+360. On output 0 <= L <= 1, 0 <= S <= 1, 0 <= H <= 360.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * V <- 255 * V, S <- 255 * S, H <- H/2(to fit to 0 to 255)
 *
 *   * 16-bit images (currently not supported)
 *
 * V <- 65535 * V, S <- 65535 * S, H <- H
 *
 *   * 32-bit images H, S, V are left as is
 *   * RGB <-> CIE L*a*b* ("CV_BGR2Lab, CV_RGB2Lab, CV_Lab2BGR, CV_Lab2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit the 0 to 1 range.
 *
 * [X Y Z] <-
 * |0.412453 0.357580 0.180423|
 * |0.212671 0.715160 0.072169|
 * |0.019334 0.119193 0.950227|
 *   * [R G B]
 *
 *
 *
 * X <- X/X_n, where X_n = 0.950456
 *
 *
 *
 * Z <- Z/Z_n, where Z_n = 1.088754
 *
 *
 *
 * L <- 116*Y^(1/3)-16 for Y>0.008856; 903.3*Y for Y <= 0.008856
 *
 *
 *
 * a <- 500(f(X)-f(Y)) + delta
 *
 *
 *
 * b <- 200(f(Y)-f(Z)) + delta
 *
 * where
 *
 * f(t)= t^(1/3) for t>0.008856; 7.787 t+16/116 for t <= 0.008856
 *
 * and
 *
 * delta = 128 for 8-bit images; 0 for floating-point images
 *
 * This outputs 0 <= L <= 100, -127 <= a <= 127, -127 <= b <= 127. The values
 * are then converted to the destination data type:
 *   * 8-bit images
 *
 * L <- L*255/100, a <- a + 128, b <- b + 128
 *
 *   * 16-bit images (currently not supported)
 *   * 32-bit images L, a, and b are left as is
 *   * RGB <-> CIE L*u*v* ("CV_BGR2Luv, CV_RGB2Luv, CV_Luv2BGR, CV_Luv2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit 0 to 1 range.
 *
 * [X Y Z] <-
 * |0.412453 0.357580 0.180423|
 * |0.212671 0.715160 0.072169|
 * |0.019334 0.119193 0.950227|
 *   * [R G B]
 *
 *
 *
 * L <- 116 Y^(1/3) for Y>0.008856; 903.3 Y for Y <= 0.008856
 *
 *
 *
 * u' <- 4*X/(X + 15*Y + 3 Z)
 *
 *
 *
 * v' <- 9*Y/(X + 15*Y + 3 Z)
 *
 *
 *
 * u <- 13*L*(u' - u_n) where u_n=0.19793943
 *
 *
 *
 * v <- 13*L*(v' - v_n) where v_n=0.46831096
 *
 * This outputs 0 <= L <= 100, -134 <= u <= 220, -140 <= v <= 122.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * L <- 255/100 L, u <- 255/354(u + 134), v <- 255/256(v + 140)
 *
 *   * 16-bit images (currently not supported)
 *   * 32-bit images L, u, and v are left as is
 *
 * The above formulae for converting RGB to/from various color spaces have been
 * taken from multiple sources on the web, primarily from the Charles Poynton
 * site http://www.poynton.com/ColorFAQ.html
 *   * Bayer -> RGB ("CV_BayerBG2BGR, CV_BayerGB2BGR, CV_BayerRG2BGR,
 * CV_BayerGR2BGR, CV_BayerBG2RGB, CV_BayerGB2RGB, CV_BayerRG2RGB,
 * CV_BayerGR2RGB"). The Bayer pattern is widely used in CCD and CMOS cameras.
 * It enables you to get color pictures from a single plane where R,G, and B
 * pixels (sensors of a particular component) are interleaved as follows:
 *
 * @param src Source image: 8-bit unsigned, 16-bit unsigned ("CV_16UC..."), or
 * single-precision floating-point.
 * @param dst Destination image of the same size and depth as "src".
 * @param code Color space conversion code. See the description below.
 * @param dstCn Number of channels in the destination image. If the parameter is
 * 0, the number of the channels is derived automatically from "src" and "code".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#cvtcolor">org.opencv.imgproc.Imgproc.cvtColor</a>
 */
    public static void cvtColor(Mat src, Mat dst, int code, int dstCn)
    {

        cvtColor_0(src.nativeObj, dst.nativeObj, code, dstCn);

        return;
    }

/**
 * Converts an image from one color space to another.
 *
 * The function converts an input image from one color space to another. In case
 * of a transformation to-from RGB color space, the order of the channels should
 * be specified explicitly (RGB or BGR).
 * Note that the default color format in OpenCV is often referred to as RGB but
 * it is actually BGR (the bytes are reversed). So the first byte in a standard
 * (24-bit) color image will be an 8-bit Blue component, the second byte will be
 * Green, and the third byte will be Red. The fourth, fifth, and sixth bytes
 * would then be the second pixel (Blue, then Green, then Red), and so on.
 *
 * The conventional ranges for R, G, and B channel values are:
 *   * 0 to 255 for "CV_8U" images
 *   * 0 to 65535 for "CV_16U" images
 *   * 0 to 1 for "CV_32F" images
 *
 * In case of linear transformations, the range does not matter.
 * But in case of a non-linear transformation, an input RGB image should be
 * normalized to the proper value range to get the correct results, for example,
 * for RGB -> L*u*v* transformation. For example, if you have a 32-bit
 * floating-point image directly converted from an 8-bit image without any
 * scaling, then it will have the 0..255 value range instead of 0..1 assumed by
 * the function. So, before calling "cvtColor", you need first to scale the
 * image down:
 *
 * If you use "cvtColor" with 8-bit images, the conversion will have some
 * information lost. For many applications, this will not be noticeable but it
 * is recommended to use 32-bit images in applications that need the full range
 * of colors or that convert an image before an operation and then convert back.
 *
 * The function can do the following transformations:
 *   * Transformations within RGB space like adding/removing the alpha channel,
 * reversing the channel order, conversion to/from 16-bit RGB color (R5:G6:B5 or
 * R5:G5:B5), as well as conversion to/from grayscale using:
 *
 * RGB[A] to Gray: Y <- 0.299 * R + 0.587 * G + 0.114 * B
 *
 * and
 *
 * Gray to RGB[A]: R <- Y, G <- Y, B <- Y, A <- 0
 *
 * The conversion from a RGB image to gray is done with:
 *
 * More advanced channel reordering can also be done with "mixChannels".
 *   * RGB <-> CIE XYZ.Rec 709 with D65 white point ("CV_BGR2XYZ, CV_RGB2XYZ,
 * CV_XYZ2BGR, CV_XYZ2RGB"):.. math
 *
 * begin{bmatrix} X \ Y \ Z end{bmatrix} leftarrow begin{bmatrix} 0.412453 &
 * 0.357580 & 0.180423 \ 0.212671 & 0.715160 & 0.072169 \ 0.019334 & 0.119193 &
 * 0.950227 end{bmatrix} cdot begin{bmatrix} R \ G \ B end{bmatrix}.. math
 *
 * begin{bmatrix} R \ G \ B end{bmatrix} leftarrow begin{bmatrix} 3.240479 &
 * -1.53715 & -0.498535 \ -0.969256 & 1.875991 & 0.041556 \ 0.055648 & -0.204043
 * & 1.057311 end{bmatrix} cdot begin{bmatrix} X \ Y \ Z end{bmatrix}
 *
 * X, Y and Z cover the whole value range (in case of floating-point images, Z
 * may exceed 1).
 *   * RGB <-> YCrCb JPEG (or YCC) ("CV_BGR2YCrCb, CV_RGB2YCrCb, CV_YCrCb2BGR,
 * CV_YCrCb2RGB")
 *
 * Y <- 0.299 * R + 0.587 * G + 0.114 * B
 *
 *
 *
 * Cr <- (R-Y) * 0.713 + delta
 *
 *
 *
 * Cb <- (B-Y) * 0.564 + delta
 *
 *
 *
 * R <- Y + 1.403 * (Cr - delta)
 *
 *
 *
 * G <- Y - 0.344 * (Cr - delta) - 0.714 * (Cb - delta)
 *
 *
 *
 * B <- Y + 1.773 * (Cb - delta)
 *
 * where
 *
 * delta = <= ft (128 for 8-bit images
 * 32768 for 16-bit images
 * 0.5 for floating-point images right.
 *
 * Y, Cr, and Cb cover the whole value range.
 *   * RGB <-> HSV ("CV_BGR2HSV, CV_RGB2HSV, CV_HSV2BGR, CV_HSV2RGB") In case of
 * 8-bit and 16-bit images, R, G, and B are converted to the floating-point
 * format and scaled to fit the 0 to 1 range.
 *
 * V <- max(R,G,B)
 *
 *
 *
 * S <- (V-min(R,G,B))/(V) if V != 0; 0 otherwise
 *
 *
 *
 * H <- (60(G - B))/((V-min(R,G,B))) if V=R; (120+60(B - R))/((V-min(R,G,B))) if
 * V=G; (240+60(R - G))/((V-min(R,G,B))) if V=B
 *
 * If H<0 then H <- H+360. On output 0 <= V <= 1, 0 <= S <= 1, 0 <= H <= 360.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * V <- 255 V, S <- 255 S, H <- H/2(to fit to 0 to 255)
 *
 *   * 16-bit images (currently not supported)
 *
 * V <- 65535 V, S <- 65535 S, H <- H
 *
 *   * 32-bit images H, S, and V are left as is
 *   * RGB <-> HLS ("CV_BGR2HLS, CV_RGB2HLS, CV_HLS2BGR, CV_HLS2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit the 0 to 1 range.
 *
 * V_(max) <- (max)(R,G,B)
 *
 *
 *
 * V_(min) <- (min)(R,G,B)
 *
 *
 *
 * L <- (V_(max) + V_(min))/2.. math
 *
 * S leftarrow fork { frac{V_{max} - V_{min}}{V_{max} + V_{min}} }{if $L < 0.5$
 * } { frac{V_{max} - V_{min}}{2 - (V_{max} + V_{min})} }{if $L ge 0.5$ }.. math
 *
 * H leftarrow forkthree {{60(G - B)}/{S}}{if $V_{max}=R$ } {{120+60(B -
 * R)}/{S}}{if $V_{max}=G$ } {{240+60(R - G)}/{S}}{if $V_{max}=B$ }
 *
 * If H<0 then H <- H+360. On output 0 <= L <= 1, 0 <= S <= 1, 0 <= H <= 360.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * V <- 255 * V, S <- 255 * S, H <- H/2(to fit to 0 to 255)
 *
 *   * 16-bit images (currently not supported)
 *
 * V <- 65535 * V, S <- 65535 * S, H <- H
 *
 *   * 32-bit images H, S, V are left as is
 *   * RGB <-> CIE L*a*b* ("CV_BGR2Lab, CV_RGB2Lab, CV_Lab2BGR, CV_Lab2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit the 0 to 1 range.
 *
 * [X Y Z] <-
 * |0.412453 0.357580 0.180423|
 * |0.212671 0.715160 0.072169|
 * |0.019334 0.119193 0.950227|
 *   * [R G B]
 *
 *
 *
 * X <- X/X_n, where X_n = 0.950456
 *
 *
 *
 * Z <- Z/Z_n, where Z_n = 1.088754
 *
 *
 *
 * L <- 116*Y^(1/3)-16 for Y>0.008856; 903.3*Y for Y <= 0.008856
 *
 *
 *
 * a <- 500(f(X)-f(Y)) + delta
 *
 *
 *
 * b <- 200(f(Y)-f(Z)) + delta
 *
 * where
 *
 * f(t)= t^(1/3) for t>0.008856; 7.787 t+16/116 for t <= 0.008856
 *
 * and
 *
 * delta = 128 for 8-bit images; 0 for floating-point images
 *
 * This outputs 0 <= L <= 100, -127 <= a <= 127, -127 <= b <= 127. The values
 * are then converted to the destination data type:
 *   * 8-bit images
 *
 * L <- L*255/100, a <- a + 128, b <- b + 128
 *
 *   * 16-bit images (currently not supported)
 *   * 32-bit images L, a, and b are left as is
 *   * RGB <-> CIE L*u*v* ("CV_BGR2Luv, CV_RGB2Luv, CV_Luv2BGR, CV_Luv2RGB").
 * In case of 8-bit and 16-bit images, R, G, and B are converted to the
 * floating-point format and scaled to fit 0 to 1 range.
 *
 * [X Y Z] <-
 * |0.412453 0.357580 0.180423|
 * |0.212671 0.715160 0.072169|
 * |0.019334 0.119193 0.950227|
 *   * [R G B]
 *
 *
 *
 * L <- 116 Y^(1/3) for Y>0.008856; 903.3 Y for Y <= 0.008856
 *
 *
 *
 * u' <- 4*X/(X + 15*Y + 3 Z)
 *
 *
 *
 * v' <- 9*Y/(X + 15*Y + 3 Z)
 *
 *
 *
 * u <- 13*L*(u' - u_n) where u_n=0.19793943
 *
 *
 *
 * v <- 13*L*(v' - v_n) where v_n=0.46831096
 *
 * This outputs 0 <= L <= 100, -134 <= u <= 220, -140 <= v <= 122.
 *
 * The values are then converted to the destination data type:
 *   * 8-bit images
 *
 * L <- 255/100 L, u <- 255/354(u + 134), v <- 255/256(v + 140)
 *
 *   * 16-bit images (currently not supported)
 *   * 32-bit images L, u, and v are left as is
 *
 * The above formulae for converting RGB to/from various color spaces have been
 * taken from multiple sources on the web, primarily from the Charles Poynton
 * site http://www.poynton.com/ColorFAQ.html
 *   * Bayer -> RGB ("CV_BayerBG2BGR, CV_BayerGB2BGR, CV_BayerRG2BGR,
 * CV_BayerGR2BGR, CV_BayerBG2RGB, CV_BayerGB2RGB, CV_BayerRG2RGB,
 * CV_BayerGR2RGB"). The Bayer pattern is widely used in CCD and CMOS cameras.
 * It enables you to get color pictures from a single plane where R,G, and B
 * pixels (sensors of a particular component) are interleaved as follows:
 *
 * @param src Source image: 8-bit unsigned, 16-bit unsigned ("CV_16UC..."), or
 * single-precision floating-point.
 * @param dst Destination image of the same size and depth as "src".
 * @param code Color space conversion code. See the description below.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#cvtcolor">org.opencv.imgproc.Imgproc.cvtColor</a>
 */
    public static void cvtColor(Mat src, Mat dst, int code)
    {

        cvtColor_1(src.nativeObj, dst.nativeObj, code);

        return;
    }


    //
    // C++:  void dilate(Mat src, Mat& dst, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    //

/**
 * Dilates an image by using a specific structuring element.
 *
 * The function dilates the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the maximum is
 * taken:
 *
 * dst(x,y) = max _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Dilation can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times dilation is applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 * @param borderValue Border value in case of a constant border. The default
 * value has a special meaning. See "createMorphologyFilter" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#dilate">org.opencv.imgproc.Imgproc.dilate</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 */
    public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue)
    {

        dilate_0(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Dilates an image by using a specific structuring element.
 *
 * The function dilates the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the maximum is
 * taken:
 *
 * dst(x,y) = max _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Dilation can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times dilation is applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#dilate">org.opencv.imgproc.Imgproc.dilate</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 */
    public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType)
    {

        dilate_1(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);

        return;
    }

/**
 * Dilates an image by using a specific structuring element.
 *
 * The function dilates the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the maximum is
 * taken:
 *
 * dst(x,y) = max _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Dilation can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times dilation is applied.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#dilate">org.opencv.imgproc.Imgproc.dilate</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 */
    public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor, int iterations)
    {

        dilate_2(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations);

        return;
    }

/**
 * Dilates an image by using a specific structuring element.
 *
 * The function dilates the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the maximum is
 * taken:
 *
 * dst(x,y) = max _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Dilation can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#dilate">org.opencv.imgproc.Imgproc.dilate</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 */
    public static void dilate(Mat src, Mat dst, Mat kernel, Point anchor)
    {

        dilate_3(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y);

        return;
    }

/**
 * Dilates an image by using a specific structuring element.
 *
 * The function dilates the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the maximum is
 * taken:
 *
 * dst(x,y) = max _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Dilation can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#dilate">org.opencv.imgproc.Imgproc.dilate</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 */
    public static void dilate(Mat src, Mat dst, Mat kernel)
    {

        dilate_4(src.nativeObj, dst.nativeObj, kernel.nativeObj);

        return;
    }


    //
    // C++:  void distanceTransform(Mat src, Mat& dst, Mat& labels, int distanceType, int maskSize)
    //

/**
 * Calculates the distance to the closest zero pixel for each pixel of the
 * source image.
 *
 * The functions "distanceTransform" calculate the approximate or precise
 * distance from every binary image pixel to the nearest zero pixel.
 * For zero image pixels, the distance will obviously be zero.
 *
 * When "maskSize == CV_DIST_MASK_PRECISE" and "distanceType == CV_DIST_L2", the
 * function runs the algorithm described in [Felzenszwalb04].
 *
 * In other cases, the algorithm [Borgefors86] is used. This means that for a
 * pixel the function finds the shortest path to the nearest zero pixel
 * consisting of basic shifts: horizontal, vertical, diagonal, or knight's move
 * (the latest is available for a 5x 5 mask). The overall distance is calculated
 * as a sum of these basic distances. Since the distance function should be
 * symmetric, all of the horizontal and vertical shifts must have the same cost
 * (denoted as "a"), all the diagonal shifts must have the same cost (denoted as
 * "b"), and all knight's moves must have the same cost (denoted as "c"). For
 * the "CV_DIST_C" and "CV_DIST_L1" types, the distance is calculated precisely,
 * whereas for "CV_DIST_L2" (Euclidian distance) the distance can be calculated
 * only with a relative error (a 5x 5 mask gives more accurate results). For
 * "a","b", and "c", OpenCV uses the values suggested in the original paper:
 *
 * ============== =================== ======================
 * "CV_DIST_C" (3x 3) a = 1, b = 1 \
 * ============== =================== ======================
 * "CV_DIST_L1" (3x 3) a = 1, b = 2 \
 * "CV_DIST_L2" (3x 3) a=0.955, b=1.3693 \
 * "CV_DIST_L2" (5x 5) a=1, b=1.4, c=2.1969 \
 * ============== =================== ======================
 *
 * Typically, for a fast, coarse distance estimation "CV_DIST_L2", a 3x 3 mask
 * is used. For a more accurate distance estimation "CV_DIST_L2", a 5x 5 mask or
 * the precise algorithm is used.
 * Note that both the precise and the approximate algorithms are linear on the
 * number of pixels.
 *
 * The second variant of the function does not only compute the minimum distance
 * for each pixel (x, y) but also identifies the nearest connected component
 * consisting of zero pixels. Index of the component is stored in labels(x, y).
 * The connected components of zero pixels are also found and marked by the
 * function.
 *
 * In this mode, the complexity is still linear.
 * That is, the function provides a very fast way to compute the Voronoi diagram
 * for a binary image.
 * Currently, the second variant can use only the approximate distance transform
 * algorithm.
 *
 * @param src 8-bit, single-channel (binary) source image.
 * @param dst Output image with calculated distances. It is a 32-bit
 * floating-point, single-channel image of the same size as "src".
 * @param labels Optional output 2D array of labels (the discrete Voronoi
 * diagram). It has the type "CV_32SC1" and the same size as "src". See the
 * details below.
 * @param distanceType Type of distance. It can be "CV_DIST_L1, CV_DIST_L2", or
 * "CV_DIST_C".
 * @param maskSize Size of the distance transform mask. It can be 3, 5, or
 * "CV_DIST_MASK_PRECISE" (the latter option is only supported by the first
 * function). In case of the "CV_DIST_L1" or "CV_DIST_C" distance type, the
 * parameter is forced to 3 because a 3x 3 mask gives the same result as 5x 5 or
 * any larger aperture.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#distancetransform">org.opencv.imgproc.Imgproc.distanceTransform</a>
 */
    public static void distanceTransform(Mat src, Mat dst, Mat labels, int distanceType, int maskSize)
    {

        distanceTransform_0(src.nativeObj, dst.nativeObj, labels.nativeObj, distanceType, maskSize);

        return;
    }


    //
    // C++:  void drawContours(Mat& image, vector_Mat contours, int contourIdx, Scalar color, int thickness = 1, int lineType = 8, Mat hierarchy = Mat(), int maxLevel = INT_MAX, Point offset = Point())
    //

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 * @param thickness Thickness of lines the contours are drawn with. If it is
 * negative (for example, "thickness=CV_FILLED"), the contour interiors are
 * drawn.
 * @param lineType Line connectivity. See "line" for details.
 * @param hierarchy Optional information about hierarchy. It is only needed if
 * you want to draw only some of the contours (see "maxLevel").
 * @param maxLevel Maximal level for drawn contours. If it is 0, only the
 * specified contour is drawn. If it is 1, the function draws the contour(s) and
 * all the nested contours. If it is 2, the function draws the contours, all the
 * nested contours, all the nested-to-nested contours, and so on. This parameter
 * is only taken into account when there is "hierarchy" available.
 * @param offset Optional contour shift parameter. Shift all the drawn contours
 * by the specified offset=(dx,dy).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy, int maxLevel, Point offset)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_0(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj, maxLevel, offset.x, offset.y);

        return;
    }

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 * @param thickness Thickness of lines the contours are drawn with. If it is
 * negative (for example, "thickness=CV_FILLED"), the contour interiors are
 * drawn.
 * @param lineType Line connectivity. See "line" for details.
 * @param hierarchy Optional information about hierarchy. It is only needed if
 * you want to draw only some of the contours (see "maxLevel").
 * @param maxLevel Maximal level for drawn contours. If it is 0, only the
 * specified contour is drawn. If it is 1, the function draws the contour(s) and
 * all the nested contours. If it is 2, the function draws the contours, all the
 * nested contours, all the nested-to-nested contours, and so on. This parameter
 * is only taken into account when there is "hierarchy" available.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy, int maxLevel)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_1(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj, maxLevel);

        return;
    }

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 * @param thickness Thickness of lines the contours are drawn with. If it is
 * negative (for example, "thickness=CV_FILLED"), the contour interiors are
 * drawn.
 * @param lineType Line connectivity. See "line" for details.
 * @param hierarchy Optional information about hierarchy. It is only needed if
 * you want to draw only some of the contours (see "maxLevel").
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color, int thickness, int lineType, Mat hierarchy)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_2(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, hierarchy.nativeObj);

        return;
    }

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 * @param thickness Thickness of lines the contours are drawn with. If it is
 * negative (for example, "thickness=CV_FILLED"), the contour interiors are
 * drawn.
 * @param lineType Line connectivity. See "line" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color, int thickness, int lineType)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_3(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);

        return;
    }

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 * @param thickness Thickness of lines the contours are drawn with. If it is
 * negative (for example, "thickness=CV_FILLED"), the contour interiors are
 * drawn.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color, int thickness)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_4(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * Draws contours outlines or filled contours.
 *
 * The function draws contour outlines in the image if thickness >= 0 or fills
 * the area bounded by the contours if thickness<0. The example below shows how
 * to retrieve connected components from the binary image and label them:
 *
 * @param image Destination image.
 * @param contours All the input contours. Each contour is stored as a point
 * vector.
 * @param contourIdx Parameter indicating a contour to draw. If it is negative,
 * all the contours are drawn.
 * @param color Color of the contours.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#drawcontours">org.opencv.imgproc.Imgproc.drawContours</a>
 */
    public static void drawContours(Mat image, List<Mat> contours, int contourIdx, Scalar color)
    {
        Mat contours_mat = Converters.vector_Mat_to_Mat(contours);
        drawContours_5(image.nativeObj, contours_mat.nativeObj, contourIdx, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void equalizeHist(Mat src, Mat& dst)
    //

/**
 * Equalizes the histogram of a grayscale image.
 *
 * The function equalizes the histogram of the input image using the following
 * algorithm:
 *   #. Calculate the histogram H for "src".
 *   #. Normalize the histogram so that the sum of histogram bins is 255.
 *   #. Compute the integral of the histogram:
 *
 * H'_i = sum(by: 0 <= j < i) H(j)
 *
 *   #.
 * Transform the image using H' as a look-up table: dst(x,y) = H'(src(x,y))
 *
 * The algorithm normalizes the brightness and increases the contrast of the
 * image.
 *
 * @param src Source 8-bit single channel image.
 * @param dst Destination image of the same size and type as "src".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/histograms.html#equalizehist">org.opencv.imgproc.Imgproc.equalizeHist</a>
 */
    public static void equalizeHist(Mat src, Mat dst)
    {

        equalizeHist_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void erode(Mat src, Mat& dst, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    //

/**
 * Erodes an image by using a specific structuring element.
 *
 * The function erodes the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the minimum is
 * taken:
 *
 * dst(x,y) = min _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Erosion can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times erosion is applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 * @param borderValue Border value in case of a constant border. The default
 * value has a special meaning. See "createMorphoogyFilter" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#erode">org.opencv.imgproc.Imgproc.erode</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue)
    {

        erode_0(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Erodes an image by using a specific structuring element.
 *
 * The function erodes the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the minimum is
 * taken:
 *
 * dst(x,y) = min _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Erosion can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times erosion is applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#erode">org.opencv.imgproc.Imgproc.erode</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations, int borderType)
    {

        erode_1(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);

        return;
    }

/**
 * Erodes an image by using a specific structuring element.
 *
 * The function erodes the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the minimum is
 * taken:
 *
 * dst(x,y) = min _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Erosion can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 * @param iterations Number of times erosion is applied.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#erode">org.opencv.imgproc.Imgproc.erode</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void erode(Mat src, Mat dst, Mat kernel, Point anchor, int iterations)
    {

        erode_2(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y, iterations);

        return;
    }

/**
 * Erodes an image by using a specific structuring element.
 *
 * The function erodes the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the minimum is
 * taken:
 *
 * dst(x,y) = min _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Erosion can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 * @param anchor Position of the anchor within the element. The default value
 * "(-1, -1)" means that the anchor is at the element center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#erode">org.opencv.imgproc.Imgproc.erode</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void erode(Mat src, Mat dst, Mat kernel, Point anchor)
    {

        erode_3(src.nativeObj, dst.nativeObj, kernel.nativeObj, anchor.x, anchor.y);

        return;
    }

/**
 * Erodes an image by using a specific structuring element.
 *
 * The function erodes the source image using the specified structuring element
 * that determines the shape of a pixel neighborhood over which the minimum is
 * taken:
 *
 * dst(x,y) = min _((x',y'): element(x',y') != 0) src(x+x',y+y')
 *
 * The function supports the in-place mode. Erosion can be applied several
 * ("iterations") times. In case of multi-channel images, each channel is
 * processed independently.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param kernel a kernel
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#erode">org.opencv.imgproc.Imgproc.erode</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.morphologyEx
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void erode(Mat src, Mat dst, Mat kernel)
    {

        erode_4(src.nativeObj, dst.nativeObj, kernel.nativeObj);

        return;
    }


    //
    // C++:  void filter2D(Mat src, Mat& dst, int ddepth, Mat kernel, Point anchor = Point(-1,-1), double delta = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Convolves an image with the kernel.
 *
 * The function applies an arbitrary linear filter to an image. In-place
 * operation is supported. When the aperture is partially outside the image, the
 * function interpolates outlier pixel values according to the specified border
 * mode.
 *
 * The function does actually compute correlation, not the convolution:
 *
 * dst(x,y) = sum(by: 0 <= x' < kernel.cols, 0 <= y' < kernel.rows)
 * kernel(x',y')* src(x+x'- anchor.x,y+y'- anchor.y)
 *
 * That is, the kernel is not mirrored around the anchor point. If you need a
 * real convolution, flip the kernel using "flip" and set the new anchor to
 * "(kernel.cols - anchor.x - 1, kernel.rows - anchor.y - 1)".
 *
 * The function uses the DFT-based algorithm in case of sufficiently large
 * kernels (~"11 x 11" or larger) and the direct algorithm (that uses the engine
 * retrieved by "createLinearFilter") for small kernels.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image. If it is negative, it
 * will be the same as "src.depth()".
 * @param kernel Convolution kernel (or rather a correlation kernel), a
 * single-channel floating point matrix. If you want to apply different kernels
 * to different channels, split the image into separate color planes using
 * "split" and process them individually.
 * @param anchor Anchor of the kernel that indicates the relative position of a
 * filtered point within the kernel. The anchor should lie within the kernel.
 * The special default value (-1,-1) means that the anchor is at the kernel
 * center.
 * @param delta Optional value added to the filtered pixels before storing them
 * in "dst".
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#filter2d">org.opencv.imgproc.Imgproc.filter2D</a>
 * @see org.opencv.imgproc.Imgproc.matchTemplate
 * @see org.opencv.core.Core.dft
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.createLinearFilter
 */
    public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor, double delta, int borderType)
    {

        filter2D_0(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y, delta, borderType);

        return;
    }

/**
 * Convolves an image with the kernel.
 *
 * The function applies an arbitrary linear filter to an image. In-place
 * operation is supported. When the aperture is partially outside the image, the
 * function interpolates outlier pixel values according to the specified border
 * mode.
 *
 * The function does actually compute correlation, not the convolution:
 *
 * dst(x,y) = sum(by: 0 <= x' < kernel.cols, 0 <= y' < kernel.rows)
 * kernel(x',y')* src(x+x'- anchor.x,y+y'- anchor.y)
 *
 * That is, the kernel is not mirrored around the anchor point. If you need a
 * real convolution, flip the kernel using "flip" and set the new anchor to
 * "(kernel.cols - anchor.x - 1, kernel.rows - anchor.y - 1)".
 *
 * The function uses the DFT-based algorithm in case of sufficiently large
 * kernels (~"11 x 11" or larger) and the direct algorithm (that uses the engine
 * retrieved by "createLinearFilter") for small kernels.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image. If it is negative, it
 * will be the same as "src.depth()".
 * @param kernel Convolution kernel (or rather a correlation kernel), a
 * single-channel floating point matrix. If you want to apply different kernels
 * to different channels, split the image into separate color planes using
 * "split" and process them individually.
 * @param anchor Anchor of the kernel that indicates the relative position of a
 * filtered point within the kernel. The anchor should lie within the kernel.
 * The special default value (-1,-1) means that the anchor is at the kernel
 * center.
 * @param delta Optional value added to the filtered pixels before storing them
 * in "dst".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#filter2d">org.opencv.imgproc.Imgproc.filter2D</a>
 * @see org.opencv.imgproc.Imgproc.matchTemplate
 * @see org.opencv.core.Core.dft
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.createLinearFilter
 */
    public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor, double delta)
    {

        filter2D_1(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y, delta);

        return;
    }

/**
 * Convolves an image with the kernel.
 *
 * The function applies an arbitrary linear filter to an image. In-place
 * operation is supported. When the aperture is partially outside the image, the
 * function interpolates outlier pixel values according to the specified border
 * mode.
 *
 * The function does actually compute correlation, not the convolution:
 *
 * dst(x,y) = sum(by: 0 <= x' < kernel.cols, 0 <= y' < kernel.rows)
 * kernel(x',y')* src(x+x'- anchor.x,y+y'- anchor.y)
 *
 * That is, the kernel is not mirrored around the anchor point. If you need a
 * real convolution, flip the kernel using "flip" and set the new anchor to
 * "(kernel.cols - anchor.x - 1, kernel.rows - anchor.y - 1)".
 *
 * The function uses the DFT-based algorithm in case of sufficiently large
 * kernels (~"11 x 11" or larger) and the direct algorithm (that uses the engine
 * retrieved by "createLinearFilter") for small kernels.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image. If it is negative, it
 * will be the same as "src.depth()".
 * @param kernel Convolution kernel (or rather a correlation kernel), a
 * single-channel floating point matrix. If you want to apply different kernels
 * to different channels, split the image into separate color planes using
 * "split" and process them individually.
 * @param anchor Anchor of the kernel that indicates the relative position of a
 * filtered point within the kernel. The anchor should lie within the kernel.
 * The special default value (-1,-1) means that the anchor is at the kernel
 * center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#filter2d">org.opencv.imgproc.Imgproc.filter2D</a>
 * @see org.opencv.imgproc.Imgproc.matchTemplate
 * @see org.opencv.core.Core.dft
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.createLinearFilter
 */
    public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel, Point anchor)
    {

        filter2D_2(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj, anchor.x, anchor.y);

        return;
    }

/**
 * Convolves an image with the kernel.
 *
 * The function applies an arbitrary linear filter to an image. In-place
 * operation is supported. When the aperture is partially outside the image, the
 * function interpolates outlier pixel values according to the specified border
 * mode.
 *
 * The function does actually compute correlation, not the convolution:
 *
 * dst(x,y) = sum(by: 0 <= x' < kernel.cols, 0 <= y' < kernel.rows)
 * kernel(x',y')* src(x+x'- anchor.x,y+y'- anchor.y)
 *
 * That is, the kernel is not mirrored around the anchor point. If you need a
 * real convolution, flip the kernel using "flip" and set the new anchor to
 * "(kernel.cols - anchor.x - 1, kernel.rows - anchor.y - 1)".
 *
 * The function uses the DFT-based algorithm in case of sufficiently large
 * kernels (~"11 x 11" or larger) and the direct algorithm (that uses the engine
 * retrieved by "createLinearFilter") for small kernels.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Desired depth of the destination image. If it is negative, it
 * will be the same as "src.depth()".
 * @param kernel Convolution kernel (or rather a correlation kernel), a
 * single-channel floating point matrix. If you want to apply different kernels
 * to different channels, split the image into separate color planes using
 * "split" and process them individually.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#filter2d">org.opencv.imgproc.Imgproc.filter2D</a>
 * @see org.opencv.imgproc.Imgproc.matchTemplate
 * @see org.opencv.core.Core.dft
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.createLinearFilter
 */
    public static void filter2D(Mat src, Mat dst, int ddepth, Mat kernel)
    {

        filter2D_3(src.nativeObj, dst.nativeObj, ddepth, kernel.nativeObj);

        return;
    }


    //
    // C++:  void findContours(Mat& image, vector_Mat& contours, Mat& hierarchy, int mode, int method, Point offset = Point())
    //

/**
 * Finds contours in a binary image.
 *
 * The function retrieves contours from the binary image using the algorithm
 * [Suzuki85]. The contours are a useful tool for shape analysis and object
 * detection and recognition. See "squares.c" in the OpenCV sample directory.
 *
 * Note: Source "image" is modified by this function.
 *
 * @param image Source, an 8-bit single-channel image. Non-zero pixels are
 * treated as 1's. Zero pixels remain 0's, so the image is treated as "binary".
 * You can use "compare", "inRange", "threshold", "adaptiveThreshold", "Canny",
 * and others to create a binary image out of a grayscale or color one. The
 * function modifies the "image" while extracting the contours.
 * @param contours Detected contours. Each contour is stored as a vector of
 * points.
 * @param hierarchy a hierarchy
 * @param mode Contour retrieval mode.
 *   * CV_RETR_EXTERNAL retrieves only the extreme outer contours. It sets
 * "hierarchy[i][2]=hierarchy[i][3]=-1" for all the contours.
 *   * CV_RETR_LIST retrieves all of the contours without establishing any
 * hierarchical relationships.
 *   * CV_RETR_CCOMP retrieves all of the contours and organizes them into a
 * two-level hierarchy. At the top level, there are external boundaries of the
 * components. At the second level, there are boundaries of the holes. If there
 * is another contour inside a hole of a connected component, it is still put at
 * the top level.
 *   * CV_RETR_TREE retrieves all of the contours and reconstructs a full
 * hierarchy of nested contours. This full hierarchy is built and shown in the
 * OpenCV "contours.c" demo.
 * @param method Contour approximation method.
 *   * CV_CHAIN_APPROX_NONE stores absolutely all the contour points. That is,
 * any 2 subsequent points "(x1,y1)" and "(x2,y2)" of the contour will be either
 * horizontal, vertical or diagonal neighbors, that is, "max(abs(x1-x2),abs(y2-y1))==1".
 *   * CV_CHAIN_APPROX_SIMPLE compresses horizontal, vertical, and diagonal
 * segments and leaves only their end points. For example, an up-right
 * rectangular contour is encoded with 4 points.
 *   * CV_CHAIN_APPROX_TC89_L1,CV_CHAIN_APPROX_TC89_KCOS applies one of the
 * flavors of the Teh-Chin chain approximation algorithm. See [TehChin89] for
 * details.
 * @param offset Optional offset by which every contour point is shifted. This
 * is useful if the contours are extracted from the image ROI and then they
 * should be analyzed in the whole image context.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#findcontours">org.opencv.imgproc.Imgproc.findContours</a>
 */
    public static void findContours(Mat image, List<Mat> contours, Mat hierarchy, int mode, int method, Point offset)
    {
        Mat contours_mat = new Mat();
        findContours_0(image.nativeObj, contours_mat.nativeObj, hierarchy.nativeObj, mode, method, offset.x, offset.y);
        Converters.Mat_to_vector_Mat(contours_mat, contours);
        return;
    }

/**
 * Finds contours in a binary image.
 *
 * The function retrieves contours from the binary image using the algorithm
 * [Suzuki85]. The contours are a useful tool for shape analysis and object
 * detection and recognition. See "squares.c" in the OpenCV sample directory.
 *
 * Note: Source "image" is modified by this function.
 *
 * @param image Source, an 8-bit single-channel image. Non-zero pixels are
 * treated as 1's. Zero pixels remain 0's, so the image is treated as "binary".
 * You can use "compare", "inRange", "threshold", "adaptiveThreshold", "Canny",
 * and others to create a binary image out of a grayscale or color one. The
 * function modifies the "image" while extracting the contours.
 * @param contours Detected contours. Each contour is stored as a vector of
 * points.
 * @param hierarchy a hierarchy
 * @param mode Contour retrieval mode.
 *   * CV_RETR_EXTERNAL retrieves only the extreme outer contours. It sets
 * "hierarchy[i][2]=hierarchy[i][3]=-1" for all the contours.
 *   * CV_RETR_LIST retrieves all of the contours without establishing any
 * hierarchical relationships.
 *   * CV_RETR_CCOMP retrieves all of the contours and organizes them into a
 * two-level hierarchy. At the top level, there are external boundaries of the
 * components. At the second level, there are boundaries of the holes. If there
 * is another contour inside a hole of a connected component, it is still put at
 * the top level.
 *   * CV_RETR_TREE retrieves all of the contours and reconstructs a full
 * hierarchy of nested contours. This full hierarchy is built and shown in the
 * OpenCV "contours.c" demo.
 * @param method Contour approximation method.
 *   * CV_CHAIN_APPROX_NONE stores absolutely all the contour points. That is,
 * any 2 subsequent points "(x1,y1)" and "(x2,y2)" of the contour will be either
 * horizontal, vertical or diagonal neighbors, that is, "max(abs(x1-x2),abs(y2-y1))==1".
 *   * CV_CHAIN_APPROX_SIMPLE compresses horizontal, vertical, and diagonal
 * segments and leaves only their end points. For example, an up-right
 * rectangular contour is encoded with 4 points.
 *   * CV_CHAIN_APPROX_TC89_L1,CV_CHAIN_APPROX_TC89_KCOS applies one of the
 * flavors of the Teh-Chin chain approximation algorithm. See [TehChin89] for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#findcontours">org.opencv.imgproc.Imgproc.findContours</a>
 */
    public static void findContours(Mat image, List<Mat> contours, Mat hierarchy, int mode, int method)
    {
        Mat contours_mat = new Mat();
        findContours_1(image.nativeObj, contours_mat.nativeObj, hierarchy.nativeObj, mode, method);
        Converters.Mat_to_vector_Mat(contours_mat, contours);
        return;
    }


    //
    // C++:  RotatedRect fitEllipse(vector_Point2f points)
    //

/**
 * Fits an ellipse around a set of 2D points.
 *
 * The function calculates the ellipse that fits (in a least-squares sense) a
 * set of 2D points best of all. It returns the rotated rectangle in which the
 * ellipse is inscribed. The algorithm [Fitzgibbon95] is used.
 *
 * @param points Input 2D point set, stored in:
 *   * "std.vector<>" or "Mat" (C++ interface)
 *   * "CvSeq*" or "CvMat*" (C interface)
 *   * Nx2 numpy array (Python interface)
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#fitellipse">org.opencv.imgproc.Imgproc.fitEllipse</a>
 */
    public static RotatedRect fitEllipse(List<Point> points)
    {
        Mat points_mat = Converters.vector_Point2f_to_Mat(points);
        RotatedRect retVal = new RotatedRect(fitEllipse_0(points_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  void fitLine(Mat points, Mat& line, int distType, double param, double reps, double aeps)
    //

/**
 * Fits a line to a 2D or 3D point set.
 *
 * The function "fitLine" fits a line to a 2D or 3D point set by minimizing
 * sum_i rho(r_i) where r_i is a distance between the i^(th) point, the line and
 * rho(r) is a distance function, one of the following:
 *   * distType=CV_DIST_L2
 *
 * rho(r) = r^2/2(the simplest and the fastest least-squares method)
 *
 *   * distType=CV_DIST_L1
 *
 * rho(r) = r
 *
 *   * distType=CV_DIST_L12
 *
 * rho(r) = 2 * (sqrt(1 + frac(r^2)2) - 1)
 *
 *   * distType=CV_DIST_FAIR
 *
 * rho(r) = C^2 * ((r)/(C) - log((1 + (r)/(C)))) where C=1.3998
 *
 *   * distType=CV_DIST_WELSCH
 *
 * rho(r) = (C^2)/2 * (1 - exp((-((r)/(C))^2))) where C=2.9846
 *
 *   * distType=CV_DIST_HUBER
 *
 * rho(r) = r^2/2 if r < C; C * (r-C/2) otherwise where C=1.345
 *
 * The algorithm is based on the M-estimator (http://en.wikipedia.org/wiki/M-estimator)
 * technique that iteratively fits the line using the weighted least-squares
 * algorithm. After each iteration the weights w_i are adjusted to be inversely
 * proportional to rho(r_i).
 *
 * @param points Input vector of 2D or 3D points, stored in "std.vector<>" or
 * "Mat".
 * @param line Output line parameters. In case of 2D fitting, it should be a
 * vector of 4 elements (like "Vec4f") - "(vx, vy, x0, y0)", where "(vx, vy)" is
 * a normalized vector collinear to the line and "(x0, y0)" is a point on the
 * line. In case of 3D fitting, it should be a vector of 6 elements (like
 * "Vec6f") - "(vx, vy, vz, x0, y0, z0)", where "(vx, vy, vz)" is a normalized
 * vector collinear to the line and "(x0, y0, z0)" is a point on the line.
 * @param distType Distance used by the M-estimator (see the discussion below).
 * @param param Numerical parameter ("C") for some types of distances. If it is
 * 0, an optimal value is chosen.
 * @param reps Sufficient accuracy for the radius (distance between the
 * coordinate origin and the line).
 * @param aeps Sufficient accuracy for the angle. 0.01 would be a good default
 * value for "reps" and "aeps".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#fitline">org.opencv.imgproc.Imgproc.fitLine</a>
 */
    public static void fitLine(Mat points, Mat line, int distType, double param, double reps, double aeps)
    {

        fitLine_0(points.nativeObj, line.nativeObj, distType, param, reps, aeps);

        return;
    }


    //
    // C++:  int floodFill(Mat& image, Mat& mask, Point seedPoint, Scalar newVal, Rect* rect = 0, Scalar loDiff = Scalar(), Scalar upDiff = Scalar(), int flags = 4)
    //

/**
 * Fills a connected component with the given color.
 *
 * The functions "floodFill" fill a connected component starting from the seed
 * point with the specified color. The connectivity is determined by the
 * color/brightness closeness of the neighbor pixels. The pixel at (x,y) is
 * considered to belong to the repainted domain if:
 *   * src(x',y')- loDiff <= src(x,y) <= src(x',y')+ upDiff
 *
 * in case of a grayscale image and floating range
 *   * src(seed.x, seed.y)- loDiff <= src(x,y) <= src(seed.x, seed.y)+ upDiff
 *
 * in case of a grayscale image and fixed range
 *   * src(x',y')_r- loDiff _r <= src(x,y)_r <= src(x',y')_r+ upDiff _r,
 *
 *
 *
 * src(x',y')_g- loDiff _g <= src(x,y)_g <= src(x',y')_g+ upDiff _g
 *
 * and
 *
 * src(x',y')_b- loDiff _b <= src(x,y)_b <= src(x',y')_b+ upDiff _b
 *
 * in case of a color image and floating range
 *   * src(seed.x, seed.y)_r- loDiff _r <= src(x,y)_r <= src(seed.x, seed.y)_r+
 * upDiff _r,
 *
 *
 *
 * src(seed.x, seed.y)_g- loDiff _g <= src(x,y)_g <= src(seed.x, seed.y)_g+
 * upDiff _g
 *
 * and
 *
 * src(seed.x, seed.y)_b- loDiff _b <= src(x,y)_b <= src(seed.x, seed.y)_b+
 * upDiff _b
 *
 * in case of a color image and fixed range
 *
 * where src(x',y') is the value of one of pixel neighbors that is already known
 * to belong to the component. That is, to be added to the connected component,
 * a color/brightness of the pixel should be close enough to:
 *   * Color/brightness of one of its neighbors that already belong to the
 * connected component in case of a floating range.
 *   * Color/brightness of the seed point in case of a fixed range.
 *
 * Use these functions to either mark a connected component with the specified
 * color in-place, or build a mask and then extract the contour, or copy the
 * region to another image, and so on. Various modes of the function are
 * demonstrated in the "floodfill.cpp" sample.
 *
 * @param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It
 * is modified by the function unless the "FLOODFILL_MASK_ONLY" flag is set in
 * the second variant of the function. See the details below.
 * @param mask (For the second function only) Operation mask that should be a
 * single-channel 8-bit image, 2 pixels wider and 2 pixels taller. The function
 * uses and updates the mask, so you take responsibility of initializing the
 * "mask" content. Flood-filling cannot go across non-zero pixels in the mask.
 * For example, an edge detector output can be used as a mask to stop filling at
 * edges. It is possible to use the same mask in multiple calls to the function
 * to make sure the filled area does not overlap.
 *
 * Note: Since the mask is larger than the filled image, a pixel (x, y) in
 * "image" corresponds to the pixel (x+1, y+1) in the "mask".
 * @param seedPoint a seedPoint
 * @param newVal New value of the repainted domain pixels.
 * @param rect Optional output parameter set by the function to the minimum
 * bounding rectangle of the repainted domain.
 * @param loDiff Maximal lower brightness/color difference between the currently
 * observed pixel and one of its neighbors belonging to the component, or a seed
 * pixel being added to the component.
 * @param upDiff Maximal upper brightness/color difference between the currently
 * observed pixel and one of its neighbors belonging to the component, or a seed
 * pixel being added to the component.
 * @param flags Operation flags. Lower bits contain a connectivity value, 4
 * (default) or 8, used within the function. Connectivity determines which
 * neighbors of a pixel are considered. Upper bits can be 0 or a combination of
 * the following flags:
 *   * FLOODFILL_FIXED_RANGE If set, the difference between the current pixel
 * and seed pixel is considered. Otherwise, the difference between neighbor
 * pixels is considered (that is, the range is floating).
 *   * FLOODFILL_MASK_ONLY If set, the function does not change the image
 * ("newVal" is ignored), but fills the mask. The flag can be used for the
 * second variant only.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#floodfill">org.opencv.imgproc.Imgproc.floodFill</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff, Scalar upDiff, int flags)
    {
        double[] rect_out = new double[4];
        int retVal = floodFill_0(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3], upDiff.val[0], upDiff.val[1], upDiff.val[2], upDiff.val[3], flags);
        if(rect!=null){ rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
        return retVal;
    }

/**
 * Fills a connected component with the given color.
 *
 * The functions "floodFill" fill a connected component starting from the seed
 * point with the specified color. The connectivity is determined by the
 * color/brightness closeness of the neighbor pixels. The pixel at (x,y) is
 * considered to belong to the repainted domain if:
 *   * src(x',y')- loDiff <= src(x,y) <= src(x',y')+ upDiff
 *
 * in case of a grayscale image and floating range
 *   * src(seed.x, seed.y)- loDiff <= src(x,y) <= src(seed.x, seed.y)+ upDiff
 *
 * in case of a grayscale image and fixed range
 *   * src(x',y')_r- loDiff _r <= src(x,y)_r <= src(x',y')_r+ upDiff _r,
 *
 *
 *
 * src(x',y')_g- loDiff _g <= src(x,y)_g <= src(x',y')_g+ upDiff _g
 *
 * and
 *
 * src(x',y')_b- loDiff _b <= src(x,y)_b <= src(x',y')_b+ upDiff _b
 *
 * in case of a color image and floating range
 *   * src(seed.x, seed.y)_r- loDiff _r <= src(x,y)_r <= src(seed.x, seed.y)_r+
 * upDiff _r,
 *
 *
 *
 * src(seed.x, seed.y)_g- loDiff _g <= src(x,y)_g <= src(seed.x, seed.y)_g+
 * upDiff _g
 *
 * and
 *
 * src(seed.x, seed.y)_b- loDiff _b <= src(x,y)_b <= src(seed.x, seed.y)_b+
 * upDiff _b
 *
 * in case of a color image and fixed range
 *
 * where src(x',y') is the value of one of pixel neighbors that is already known
 * to belong to the component. That is, to be added to the connected component,
 * a color/brightness of the pixel should be close enough to:
 *   * Color/brightness of one of its neighbors that already belong to the
 * connected component in case of a floating range.
 *   * Color/brightness of the seed point in case of a fixed range.
 *
 * Use these functions to either mark a connected component with the specified
 * color in-place, or build a mask and then extract the contour, or copy the
 * region to another image, and so on. Various modes of the function are
 * demonstrated in the "floodfill.cpp" sample.
 *
 * @param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It
 * is modified by the function unless the "FLOODFILL_MASK_ONLY" flag is set in
 * the second variant of the function. See the details below.
 * @param mask (For the second function only) Operation mask that should be a
 * single-channel 8-bit image, 2 pixels wider and 2 pixels taller. The function
 * uses and updates the mask, so you take responsibility of initializing the
 * "mask" content. Flood-filling cannot go across non-zero pixels in the mask.
 * For example, an edge detector output can be used as a mask to stop filling at
 * edges. It is possible to use the same mask in multiple calls to the function
 * to make sure the filled area does not overlap.
 *
 * Note: Since the mask is larger than the filled image, a pixel (x, y) in
 * "image" corresponds to the pixel (x+1, y+1) in the "mask".
 * @param seedPoint a seedPoint
 * @param newVal New value of the repainted domain pixels.
 * @param rect Optional output parameter set by the function to the minimum
 * bounding rectangle of the repainted domain.
 * @param loDiff Maximal lower brightness/color difference between the currently
 * observed pixel and one of its neighbors belonging to the component, or a seed
 * pixel being added to the component.
 * @param upDiff Maximal upper brightness/color difference between the currently
 * observed pixel and one of its neighbors belonging to the component, or a seed
 * pixel being added to the component.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#floodfill">org.opencv.imgproc.Imgproc.floodFill</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff, Scalar upDiff)
    {
        double[] rect_out = new double[4];
        int retVal = floodFill_1(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3], upDiff.val[0], upDiff.val[1], upDiff.val[2], upDiff.val[3]);
        if(rect!=null){ rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
        return retVal;
    }

/**
 * Fills a connected component with the given color.
 *
 * The functions "floodFill" fill a connected component starting from the seed
 * point with the specified color. The connectivity is determined by the
 * color/brightness closeness of the neighbor pixels. The pixel at (x,y) is
 * considered to belong to the repainted domain if:
 *   * src(x',y')- loDiff <= src(x,y) <= src(x',y')+ upDiff
 *
 * in case of a grayscale image and floating range
 *   * src(seed.x, seed.y)- loDiff <= src(x,y) <= src(seed.x, seed.y)+ upDiff
 *
 * in case of a grayscale image and fixed range
 *   * src(x',y')_r- loDiff _r <= src(x,y)_r <= src(x',y')_r+ upDiff _r,
 *
 *
 *
 * src(x',y')_g- loDiff _g <= src(x,y)_g <= src(x',y')_g+ upDiff _g
 *
 * and
 *
 * src(x',y')_b- loDiff _b <= src(x,y)_b <= src(x',y')_b+ upDiff _b
 *
 * in case of a color image and floating range
 *   * src(seed.x, seed.y)_r- loDiff _r <= src(x,y)_r <= src(seed.x, seed.y)_r+
 * upDiff _r,
 *
 *
 *
 * src(seed.x, seed.y)_g- loDiff _g <= src(x,y)_g <= src(seed.x, seed.y)_g+
 * upDiff _g
 *
 * and
 *
 * src(seed.x, seed.y)_b- loDiff _b <= src(x,y)_b <= src(seed.x, seed.y)_b+
 * upDiff _b
 *
 * in case of a color image and fixed range
 *
 * where src(x',y') is the value of one of pixel neighbors that is already known
 * to belong to the component. That is, to be added to the connected component,
 * a color/brightness of the pixel should be close enough to:
 *   * Color/brightness of one of its neighbors that already belong to the
 * connected component in case of a floating range.
 *   * Color/brightness of the seed point in case of a fixed range.
 *
 * Use these functions to either mark a connected component with the specified
 * color in-place, or build a mask and then extract the contour, or copy the
 * region to another image, and so on. Various modes of the function are
 * demonstrated in the "floodfill.cpp" sample.
 *
 * @param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It
 * is modified by the function unless the "FLOODFILL_MASK_ONLY" flag is set in
 * the second variant of the function. See the details below.
 * @param mask (For the second function only) Operation mask that should be a
 * single-channel 8-bit image, 2 pixels wider and 2 pixels taller. The function
 * uses and updates the mask, so you take responsibility of initializing the
 * "mask" content. Flood-filling cannot go across non-zero pixels in the mask.
 * For example, an edge detector output can be used as a mask to stop filling at
 * edges. It is possible to use the same mask in multiple calls to the function
 * to make sure the filled area does not overlap.
 *
 * Note: Since the mask is larger than the filled image, a pixel (x, y) in
 * "image" corresponds to the pixel (x+1, y+1) in the "mask".
 * @param seedPoint a seedPoint
 * @param newVal New value of the repainted domain pixels.
 * @param rect Optional output parameter set by the function to the minimum
 * bounding rectangle of the repainted domain.
 * @param loDiff Maximal lower brightness/color difference between the currently
 * observed pixel and one of its neighbors belonging to the component, or a seed
 * pixel being added to the component.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#floodfill">org.opencv.imgproc.Imgproc.floodFill</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect, Scalar loDiff)
    {
        double[] rect_out = new double[4];
        int retVal = floodFill_2(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out, loDiff.val[0], loDiff.val[1], loDiff.val[2], loDiff.val[3]);
        if(rect!=null){ rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
        return retVal;
    }

/**
 * Fills a connected component with the given color.
 *
 * The functions "floodFill" fill a connected component starting from the seed
 * point with the specified color. The connectivity is determined by the
 * color/brightness closeness of the neighbor pixels. The pixel at (x,y) is
 * considered to belong to the repainted domain if:
 *   * src(x',y')- loDiff <= src(x,y) <= src(x',y')+ upDiff
 *
 * in case of a grayscale image and floating range
 *   * src(seed.x, seed.y)- loDiff <= src(x,y) <= src(seed.x, seed.y)+ upDiff
 *
 * in case of a grayscale image and fixed range
 *   * src(x',y')_r- loDiff _r <= src(x,y)_r <= src(x',y')_r+ upDiff _r,
 *
 *
 *
 * src(x',y')_g- loDiff _g <= src(x,y)_g <= src(x',y')_g+ upDiff _g
 *
 * and
 *
 * src(x',y')_b- loDiff _b <= src(x,y)_b <= src(x',y')_b+ upDiff _b
 *
 * in case of a color image and floating range
 *   * src(seed.x, seed.y)_r- loDiff _r <= src(x,y)_r <= src(seed.x, seed.y)_r+
 * upDiff _r,
 *
 *
 *
 * src(seed.x, seed.y)_g- loDiff _g <= src(x,y)_g <= src(seed.x, seed.y)_g+
 * upDiff _g
 *
 * and
 *
 * src(seed.x, seed.y)_b- loDiff _b <= src(x,y)_b <= src(seed.x, seed.y)_b+
 * upDiff _b
 *
 * in case of a color image and fixed range
 *
 * where src(x',y') is the value of one of pixel neighbors that is already known
 * to belong to the component. That is, to be added to the connected component,
 * a color/brightness of the pixel should be close enough to:
 *   * Color/brightness of one of its neighbors that already belong to the
 * connected component in case of a floating range.
 *   * Color/brightness of the seed point in case of a fixed range.
 *
 * Use these functions to either mark a connected component with the specified
 * color in-place, or build a mask and then extract the contour, or copy the
 * region to another image, and so on. Various modes of the function are
 * demonstrated in the "floodfill.cpp" sample.
 *
 * @param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It
 * is modified by the function unless the "FLOODFILL_MASK_ONLY" flag is set in
 * the second variant of the function. See the details below.
 * @param mask (For the second function only) Operation mask that should be a
 * single-channel 8-bit image, 2 pixels wider and 2 pixels taller. The function
 * uses and updates the mask, so you take responsibility of initializing the
 * "mask" content. Flood-filling cannot go across non-zero pixels in the mask.
 * For example, an edge detector output can be used as a mask to stop filling at
 * edges. It is possible to use the same mask in multiple calls to the function
 * to make sure the filled area does not overlap.
 *
 * Note: Since the mask is larger than the filled image, a pixel (x, y) in
 * "image" corresponds to the pixel (x+1, y+1) in the "mask".
 * @param seedPoint a seedPoint
 * @param newVal New value of the repainted domain pixels.
 * @param rect Optional output parameter set by the function to the minimum
 * bounding rectangle of the repainted domain.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#floodfill">org.opencv.imgproc.Imgproc.floodFill</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal, Rect rect)
    {
        double[] rect_out = new double[4];
        int retVal = floodFill_3(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3], rect_out);
        if(rect!=null){ rect.x = (int)rect_out[0]; rect.y = (int)rect_out[1]; rect.width = (int)rect_out[2]; rect.height = (int)rect_out[3]; }
        return retVal;
    }

/**
 * Fills a connected component with the given color.
 *
 * The functions "floodFill" fill a connected component starting from the seed
 * point with the specified color. The connectivity is determined by the
 * color/brightness closeness of the neighbor pixels. The pixel at (x,y) is
 * considered to belong to the repainted domain if:
 *   * src(x',y')- loDiff <= src(x,y) <= src(x',y')+ upDiff
 *
 * in case of a grayscale image and floating range
 *   * src(seed.x, seed.y)- loDiff <= src(x,y) <= src(seed.x, seed.y)+ upDiff
 *
 * in case of a grayscale image and fixed range
 *   * src(x',y')_r- loDiff _r <= src(x,y)_r <= src(x',y')_r+ upDiff _r,
 *
 *
 *
 * src(x',y')_g- loDiff _g <= src(x,y)_g <= src(x',y')_g+ upDiff _g
 *
 * and
 *
 * src(x',y')_b- loDiff _b <= src(x,y)_b <= src(x',y')_b+ upDiff _b
 *
 * in case of a color image and floating range
 *   * src(seed.x, seed.y)_r- loDiff _r <= src(x,y)_r <= src(seed.x, seed.y)_r+
 * upDiff _r,
 *
 *
 *
 * src(seed.x, seed.y)_g- loDiff _g <= src(x,y)_g <= src(seed.x, seed.y)_g+
 * upDiff _g
 *
 * and
 *
 * src(seed.x, seed.y)_b- loDiff _b <= src(x,y)_b <= src(seed.x, seed.y)_b+
 * upDiff _b
 *
 * in case of a color image and fixed range
 *
 * where src(x',y') is the value of one of pixel neighbors that is already known
 * to belong to the component. That is, to be added to the connected component,
 * a color/brightness of the pixel should be close enough to:
 *   * Color/brightness of one of its neighbors that already belong to the
 * connected component in case of a floating range.
 *   * Color/brightness of the seed point in case of a fixed range.
 *
 * Use these functions to either mark a connected component with the specified
 * color in-place, or build a mask and then extract the contour, or copy the
 * region to another image, and so on. Various modes of the function are
 * demonstrated in the "floodfill.cpp" sample.
 *
 * @param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It
 * is modified by the function unless the "FLOODFILL_MASK_ONLY" flag is set in
 * the second variant of the function. See the details below.
 * @param mask (For the second function only) Operation mask that should be a
 * single-channel 8-bit image, 2 pixels wider and 2 pixels taller. The function
 * uses and updates the mask, so you take responsibility of initializing the
 * "mask" content. Flood-filling cannot go across non-zero pixels in the mask.
 * For example, an edge detector output can be used as a mask to stop filling at
 * edges. It is possible to use the same mask in multiple calls to the function
 * to make sure the filled area does not overlap.
 *
 * Note: Since the mask is larger than the filled image, a pixel (x, y) in
 * "image" corresponds to the pixel (x+1, y+1) in the "mask".
 * @param seedPoint a seedPoint
 * @param newVal New value of the repainted domain pixels.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#floodfill">org.opencv.imgproc.Imgproc.floodFill</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static int floodFill(Mat image, Mat mask, Point seedPoint, Scalar newVal)
    {

        int retVal = floodFill_4(image.nativeObj, mask.nativeObj, seedPoint.x, seedPoint.y, newVal.val[0], newVal.val[1], newVal.val[2], newVal.val[3]);

        return retVal;
    }


    //
    // C++:  Mat getAffineTransform(vector_Point2f src, vector_Point2f dst)
    //

/**
 * Calculates an affine transform from three pairs of the corresponding points.
 *
 * The function calculates the 2 x 3 matrix of an affine transform so that:
 *
 * x'_i
 * y'_i = map_matrix * x_i
 * y_i
 *
 * where.. math
 *
 * dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2
 *
 * @param src Coordinates of triangle vertices in the source image.
 * @param dst Coordinates of the corresponding triangle vertices in the
 * destination image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getaffinetransform">org.opencv.imgproc.Imgproc.getAffineTransform</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.core.Core.transform
 */
    public static Mat getAffineTransform(List<Point> src, List<Point> dst)
    {
        Mat src_mat = Converters.vector_Point2f_to_Mat(src);
        Mat dst_mat = Converters.vector_Point2f_to_Mat(dst);
        Mat retVal = new Mat(getAffineTransform_0(src_mat.nativeObj, dst_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize = Size(), bool centerPrincipalPoint = false)
    //

/**
 * Returns the default new camera matrix.
 *
 * The function returns the camera matrix that is either an exact copy of the
 * input "cameraMatrix" (when "centerPrinicipalPoint=false"), or the modified
 * one (when "centerPrincipalPoint=true").
 *
 * In the latter case, the new camera matrix will be:
 *
 * f_x 0(imgSize.width -1)*0.5
 * 0 f_y(imgSize.height -1)*0.5
 * 0 0 1,
 *
 * where f_x and f_y are (0,0) and (1,1) elements of "cameraMatrix",
 * respectively.
 *
 * By default, the undistortion functions in OpenCV (see "initUndistortRectifyMap",
 * "undistort") do not move the principal point. However, when you work with
 * stereo, it is important to move the principal points in both views to the
 * same y-coordinate (which is required by most of stereo correspondence
 * algorithms), and may be to the same x-coordinate too. So, you can form the
 * new camera matrix for each view where the principal points are located at the
 * center.
 *
 * @param cameraMatrix Input camera matrix.
 * @param imgsize a imgsize
 * @param centerPrincipalPoint Location of the principal point in the new camera
 * matrix. The parameter indicates whether this location should be at the image
 * center or not.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getdefaultnewcameramatrix">org.opencv.imgproc.Imgproc.getDefaultNewCameraMatrix</a>
 */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize, boolean centerPrincipalPoint)
    {

        Mat retVal = new Mat(getDefaultNewCameraMatrix_0(cameraMatrix.nativeObj, imgsize.width, imgsize.height, centerPrincipalPoint));

        return retVal;
    }

/**
 * Returns the default new camera matrix.
 *
 * The function returns the camera matrix that is either an exact copy of the
 * input "cameraMatrix" (when "centerPrinicipalPoint=false"), or the modified
 * one (when "centerPrincipalPoint=true").
 *
 * In the latter case, the new camera matrix will be:
 *
 * f_x 0(imgSize.width -1)*0.5
 * 0 f_y(imgSize.height -1)*0.5
 * 0 0 1,
 *
 * where f_x and f_y are (0,0) and (1,1) elements of "cameraMatrix",
 * respectively.
 *
 * By default, the undistortion functions in OpenCV (see "initUndistortRectifyMap",
 * "undistort") do not move the principal point. However, when you work with
 * stereo, it is important to move the principal points in both views to the
 * same y-coordinate (which is required by most of stereo correspondence
 * algorithms), and may be to the same x-coordinate too. So, you can form the
 * new camera matrix for each view where the principal points are located at the
 * center.
 *
 * @param cameraMatrix Input camera matrix.
 * @param imgsize a imgsize
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getdefaultnewcameramatrix">org.opencv.imgproc.Imgproc.getDefaultNewCameraMatrix</a>
 */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize)
    {

        Mat retVal = new Mat(getDefaultNewCameraMatrix_1(cameraMatrix.nativeObj, imgsize.width, imgsize.height));

        return retVal;
    }

/**
 * Returns the default new camera matrix.
 *
 * The function returns the camera matrix that is either an exact copy of the
 * input "cameraMatrix" (when "centerPrinicipalPoint=false"), or the modified
 * one (when "centerPrincipalPoint=true").
 *
 * In the latter case, the new camera matrix will be:
 *
 * f_x 0(imgSize.width -1)*0.5
 * 0 f_y(imgSize.height -1)*0.5
 * 0 0 1,
 *
 * where f_x and f_y are (0,0) and (1,1) elements of "cameraMatrix",
 * respectively.
 *
 * By default, the undistortion functions in OpenCV (see "initUndistortRectifyMap",
 * "undistort") do not move the principal point. However, when you work with
 * stereo, it is important to move the principal points in both views to the
 * same y-coordinate (which is required by most of stereo correspondence
 * algorithms), and may be to the same x-coordinate too. So, you can form the
 * new camera matrix for each view where the principal points are located at the
 * center.
 *
 * @param cameraMatrix Input camera matrix.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getdefaultnewcameramatrix">org.opencv.imgproc.Imgproc.getDefaultNewCameraMatrix</a>
 */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix)
    {

        Mat retVal = new Mat(getDefaultNewCameraMatrix_2(cameraMatrix.nativeObj));

        return retVal;
    }


    //
    // C++:  void getDerivKernels(Mat& kx, Mat& ky, int dx, int dy, int ksize, bool normalize = false, int ktype = CV_32F)
    //

/**
 * Returns filter coefficients for computing spatial image derivatives.
 *
 * The function computes and returns the filter coefficients for spatial image
 * derivatives. When "ksize=CV_SCHARR", the Scharr 3 x 3 kernels are generated
 * (see "Scharr"). Otherwise, Sobel kernels are generated (see "Sobel"). The
 * filters are normally passed to "sepFilter2D" or to "createSeparableLinearFilter".
 *
 * @param kx Output matrix of row filter coefficients. It has the type "ktype".
 * @param ky Output matrix of column filter coefficients. It has the type
 * "ktype".
 * @param dx Derivative order in respect of x.
 * @param dy Derivative order in respect of y.
 * @param ksize Aperture size. It can be "CV_SCHARR", 1, 3, 5, or 7.
 * @param normalize Flag indicating whether to normalize (scale down) the filter
 * coefficients or not. Theoretically, the coefficients should have the
 * denominator =2^(ksize*2-dx-dy-2). If you are going to filter floating-point
 * images, you are likely to use the normalized kernels. But if you compute
 * derivatives of an 8-bit image, store the results in a 16-bit image, and wish
 * to preserve all the fractional bits, you may want to set "normalize=false".
 * @param ktype Type of filter coefficients. It can be "CV_32f" or "CV_64F".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getderivkernels">org.opencv.imgproc.Imgproc.getDerivKernels</a>
 */
    public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize, boolean normalize, int ktype)
    {

        getDerivKernels_0(kx.nativeObj, ky.nativeObj, dx, dy, ksize, normalize, ktype);

        return;
    }

/**
 * Returns filter coefficients for computing spatial image derivatives.
 *
 * The function computes and returns the filter coefficients for spatial image
 * derivatives. When "ksize=CV_SCHARR", the Scharr 3 x 3 kernels are generated
 * (see "Scharr"). Otherwise, Sobel kernels are generated (see "Sobel"). The
 * filters are normally passed to "sepFilter2D" or to "createSeparableLinearFilter".
 *
 * @param kx Output matrix of row filter coefficients. It has the type "ktype".
 * @param ky Output matrix of column filter coefficients. It has the type
 * "ktype".
 * @param dx Derivative order in respect of x.
 * @param dy Derivative order in respect of y.
 * @param ksize Aperture size. It can be "CV_SCHARR", 1, 3, 5, or 7.
 * @param normalize Flag indicating whether to normalize (scale down) the filter
 * coefficients or not. Theoretically, the coefficients should have the
 * denominator =2^(ksize*2-dx-dy-2). If you are going to filter floating-point
 * images, you are likely to use the normalized kernels. But if you compute
 * derivatives of an 8-bit image, store the results in a 16-bit image, and wish
 * to preserve all the fractional bits, you may want to set "normalize=false".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getderivkernels">org.opencv.imgproc.Imgproc.getDerivKernels</a>
 */
    public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize, boolean normalize)
    {

        getDerivKernels_1(kx.nativeObj, ky.nativeObj, dx, dy, ksize, normalize);

        return;
    }

/**
 * Returns filter coefficients for computing spatial image derivatives.
 *
 * The function computes and returns the filter coefficients for spatial image
 * derivatives. When "ksize=CV_SCHARR", the Scharr 3 x 3 kernels are generated
 * (see "Scharr"). Otherwise, Sobel kernels are generated (see "Sobel"). The
 * filters are normally passed to "sepFilter2D" or to "createSeparableLinearFilter".
 *
 * @param kx Output matrix of row filter coefficients. It has the type "ktype".
 * @param ky Output matrix of column filter coefficients. It has the type
 * "ktype".
 * @param dx Derivative order in respect of x.
 * @param dy Derivative order in respect of y.
 * @param ksize Aperture size. It can be "CV_SCHARR", 1, 3, 5, or 7.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getderivkernels">org.opencv.imgproc.Imgproc.getDerivKernels</a>
 */
    public static void getDerivKernels(Mat kx, Mat ky, int dx, int dy, int ksize)
    {

        getDerivKernels_2(kx.nativeObj, ky.nativeObj, dx, dy, ksize);

        return;
    }


    //
    // C++:  Mat getGaussianKernel(int ksize, double sigma, int ktype = CV_64F)
    //

/**
 * Returns Gaussian filter coefficients.
 *
 * The function computes and returns the ksize x 1 matrix of Gaussian filter
 * coefficients:
 *
 * G_i= alpha *e^(-(i-(ksize -1)/2)^2/(2* sigma)^2),
 *
 * where i=0..ksize-1 and alpha is the scale factor chosen so that sum_i G_i=1.
 *
 * Two of such generated kernels can be passed to "sepFilter2D" or to
 * "createSeparableLinearFilter". Those functions automatically recognize
 * smoothing kernels (a symmetrical kernel with sum of weights equal to 1) and
 * handle them accordingly. You may also use the higher-level "GaussianBlur".
 *
 * @param ksize Aperture size. It should be odd (ksize mod 2 = 1) and positive.
 * @param sigma Gaussian standard deviation. If it is non-positive, it is
 * computed from "ksize" as "sigma = 0.3*((ksize-1)*0.5 - 1) + 0.8".
 * @param ktype Type of filter coefficients. It can be "CV_32f" or "CV_64F".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getgaussiankernel">org.opencv.imgproc.Imgproc.getGaussianKernel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.getStructuringElement
 * @see org.opencv.imgproc.Imgproc.getDerivKernels
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static Mat getGaussianKernel(int ksize, double sigma, int ktype)
    {

        Mat retVal = new Mat(getGaussianKernel_0(ksize, sigma, ktype));

        return retVal;
    }

/**
 * Returns Gaussian filter coefficients.
 *
 * The function computes and returns the ksize x 1 matrix of Gaussian filter
 * coefficients:
 *
 * G_i= alpha *e^(-(i-(ksize -1)/2)^2/(2* sigma)^2),
 *
 * where i=0..ksize-1 and alpha is the scale factor chosen so that sum_i G_i=1.
 *
 * Two of such generated kernels can be passed to "sepFilter2D" or to
 * "createSeparableLinearFilter". Those functions automatically recognize
 * smoothing kernels (a symmetrical kernel with sum of weights equal to 1) and
 * handle them accordingly. You may also use the higher-level "GaussianBlur".
 *
 * @param ksize Aperture size. It should be odd (ksize mod 2 = 1) and positive.
 * @param sigma Gaussian standard deviation. If it is non-positive, it is
 * computed from "ksize" as "sigma = 0.3*((ksize-1)*0.5 - 1) + 0.8".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getgaussiankernel">org.opencv.imgproc.Imgproc.getGaussianKernel</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.sepFilter2D
 * @see org.opencv.imgproc.Imgproc.getStructuringElement
 * @see org.opencv.imgproc.Imgproc.getDerivKernels
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static Mat getGaussianKernel(int ksize, double sigma)
    {

        Mat retVal = new Mat(getGaussianKernel_1(ksize, sigma));

        return retVal;
    }


    //
    // C++:  Mat getPerspectiveTransform(Mat src, Mat dst)
    //

/**
 * Calculates a perspective transform from four pairs of the corresponding
 * points.
 *
 * The function calculates the 3 x 3 matrix of a perspective transform so that:
 *
 * t_i x'_i
 * t_i y'_i
 * t_i = map_matrix * x_i
 * y_i
 *
 * where.. math
 *
 * dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2,3
 *
 * @param src Coordinates of quadrangle vertices in the source image.
 * @param dst Coordinates of the corresponding quadrangle vertices in the
 * destination image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getperspectivetransform">org.opencv.imgproc.Imgproc.getPerspectiveTransform</a>
 * @see org.opencv.calib3d.Calib3d.findHomography
 * @see org.opencv.core.Core.perspectiveTransform
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static Mat getPerspectiveTransform(Mat src, Mat dst)
    {

        Mat retVal = new Mat(getPerspectiveTransform_0(src.nativeObj, dst.nativeObj));

        return retVal;
    }


    //
    // C++:  void getRectSubPix(Mat image, Size patchSize, Point2f center, Mat& patch, int patchType = -1)
    //

/**
 * Retrieves a pixel rectangle from an image with sub-pixel accuracy.
 *
 * The function "getRectSubPix" extracts pixels from "src" :
 *
 * dst(x, y) = src(x + center.x - (dst.cols -1)*0.5, y + center.y - (dst.rows
 * -1)*0.5)
 *
 * where the values of the pixels at non-integer coordinates are retrieved using
 * bilinear interpolation. Every channel of multi-channel images is processed
 * independently. While the center of the rectangle must be inside the image,
 * parts of the rectangle may be outside. In this case, the replication border
 * mode (see "borderInterpolate") is used to extrapolate the pixel values
 * outside of the image.
 *
 * @param image a image
 * @param patchSize Size of the extracted patch.
 * @param center Floating point coordinates of the center of the extracted
 * rectangle within the source image. The center must be inside the image.
 * @param patch a patch
 * @param patchType Depth of the extracted pixels. By default, they have the
 * same depth as "src".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getrectsubpix">org.opencv.imgproc.Imgproc.getRectSubPix</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void getRectSubPix(Mat image, Size patchSize, Point center, Mat patch, int patchType)
    {

        getRectSubPix_0(image.nativeObj, patchSize.width, patchSize.height, center.x, center.y, patch.nativeObj, patchType);

        return;
    }

/**
 * Retrieves a pixel rectangle from an image with sub-pixel accuracy.
 *
 * The function "getRectSubPix" extracts pixels from "src" :
 *
 * dst(x, y) = src(x + center.x - (dst.cols -1)*0.5, y + center.y - (dst.rows
 * -1)*0.5)
 *
 * where the values of the pixels at non-integer coordinates are retrieved using
 * bilinear interpolation. Every channel of multi-channel images is processed
 * independently. While the center of the rectangle must be inside the image,
 * parts of the rectangle may be outside. In this case, the replication border
 * mode (see "borderInterpolate") is used to extrapolate the pixel values
 * outside of the image.
 *
 * @param image a image
 * @param patchSize Size of the extracted patch.
 * @param center Floating point coordinates of the center of the extracted
 * rectangle within the source image. The center must be inside the image.
 * @param patch a patch
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getrectsubpix">org.opencv.imgproc.Imgproc.getRectSubPix</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void getRectSubPix(Mat image, Size patchSize, Point center, Mat patch)
    {

        getRectSubPix_1(image.nativeObj, patchSize.width, patchSize.height, center.x, center.y, patch.nativeObj);

        return;
    }


    //
    // C++:  Mat getRotationMatrix2D(Point2f center, double angle, double scale)
    //

/**
 * Calculates an affine matrix of 2D rotation.
 *
 * The function calculates the following matrix:
 *
 * alpha beta(1- alpha) * center.x - beta * center.y
 * - beta alpha beta * center.x + (1- alpha) * center.y
 *
 * where
 *
 * alpha = scale * cos angle,
 * beta = scale * sin angle
 *
 * The transformation maps the rotation center to itself. If this is not the
 * target, adjust the shift.
 *
 * @param center Center of the rotation in the source image.
 * @param angle Rotation angle in degrees. Positive values mean
 * counter-clockwise rotation (the coordinate origin is assumed to be the
 * top-left corner).
 * @param scale Isotropic scale factor.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#getrotationmatrix2d">org.opencv.imgproc.Imgproc.getRotationMatrix2D</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.getAffineTransform
 * @see org.opencv.core.Core.transform
 */
    public static Mat getRotationMatrix2D(Point center, double angle, double scale)
    {

        Mat retVal = new Mat(getRotationMatrix2D_0(center.x, center.y, angle, scale));

        return retVal;
    }


    //
    // C++:  Mat getStructuringElement(int shape, Size ksize, Point anchor = Point(-1,-1))
    //

/**
 * Returns a structuring element of the specified size and shape for
 * morphological operations.
 *
 * The function constructs and returns the structuring element that can be
 * further passed to "createMorphologyFilter", "erode", "dilate" or
 * "morphologyEx". But you can also construct an arbitrary binary mask yourself
 * and use it as the structuring element.
 *
 * Note: When using OpenCV 1.x C API, the created structuring element
 * "IplConvKernel* element" must be released in the end using "cvReleaseStructuringElement(&element)".
 *
 * @param shape Element shape that could be one of the following:
 *   * MORPH_RECT - a rectangular structuring element:
 *
 * E_(ij)=1
 *
 *   * MORPH_ELLIPSE - an elliptic structuring element, that is, a filled
 * ellipse inscribed into the rectangle "Rect(0, 0, esize.width,
 * 0.esize.height)"
 *   * MORPH_CROSS - a cross-shaped structuring element:
 *
 * E_(ij) = 1 if i=anchor.y or j=anchor.x; 0 otherwise
 *
 *   * CV_SHAPE_CUSTOM - custom structuring element (OpenCV 1.x API)
 * @param ksize Size of the structuring element.
 * @param anchor Anchor position within the element. The default value (-1, -1)
 * means that the anchor is at the center. Note that only the shape of a
 * cross-shaped element depends on the anchor position. In other cases the
 * anchor just regulates how much the result of the morphological operation is
 * shifted.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getstructuringelement">org.opencv.imgproc.Imgproc.getStructuringElement</a>
 */
    public static Mat getStructuringElement(int shape, Size ksize, Point anchor)
    {

        Mat retVal = new Mat(getStructuringElement_0(shape, ksize.width, ksize.height, anchor.x, anchor.y));

        return retVal;
    }

/**
 * Returns a structuring element of the specified size and shape for
 * morphological operations.
 *
 * The function constructs and returns the structuring element that can be
 * further passed to "createMorphologyFilter", "erode", "dilate" or
 * "morphologyEx". But you can also construct an arbitrary binary mask yourself
 * and use it as the structuring element.
 *
 * Note: When using OpenCV 1.x C API, the created structuring element
 * "IplConvKernel* element" must be released in the end using "cvReleaseStructuringElement(&element)".
 *
 * @param shape Element shape that could be one of the following:
 *   * MORPH_RECT - a rectangular structuring element:
 *
 * E_(ij)=1
 *
 *   * MORPH_ELLIPSE - an elliptic structuring element, that is, a filled
 * ellipse inscribed into the rectangle "Rect(0, 0, esize.width,
 * 0.esize.height)"
 *   * MORPH_CROSS - a cross-shaped structuring element:
 *
 * E_(ij) = 1 if i=anchor.y or j=anchor.x; 0 otherwise
 *
 *   * CV_SHAPE_CUSTOM - custom structuring element (OpenCV 1.x API)
 * @param ksize Size of the structuring element.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#getstructuringelement">org.opencv.imgproc.Imgproc.getStructuringElement</a>
 */
    public static Mat getStructuringElement(int shape, Size ksize)
    {

        Mat retVal = new Mat(getStructuringElement_1(shape, ksize.width, ksize.height));

        return retVal;
    }


    //
    // C++:  void goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask = Mat(), int blockSize = 3, bool useHarrisDetector = false, double k = 0.04)
    //

/**
 * Determines strong corners on an image.
 *
 * The function finds the most prominent corners in the image or in the
 * specified image region, as described in [Shi94]:
 *   #. Function calculates the corner quality measure at every source image
 * pixel using the "cornerMinEigenVal" or "cornerHarris".
 *   #. Function performs a non-maximum suppression (the local maximums in *3 x
 * 3* neighborhood are retained).
 *   #. The corners with the minimal eigenvalue less than qualityLevel *
 * max_(x,y) qualityMeasureMap(x,y) are rejected.
 *   #. The remaining corners are sorted by the quality measure in the
 * descending order.
 *   #. Function throws away each corner for which there is a stronger corner at
 * a distance less than "maxDistance".
 *
 * The function can be used to initialize a point-based tracker of an object.
 *
 * Note: If the function is called with different values "A" and "B" of the
 * parameter "qualityLevel", and "A" > {B}, the vector of returned corners with
 * "qualityLevel=A" will be the prefix of the output vector with
 * "qualityLevel=B".
 *
 * @param image Input 8-bit or floating-point 32-bit, single-channel image.
 * @param corners Output vector of detected corners.
 * @param maxCorners Maximum number of corners to return. If there are more
 * corners than are found, the strongest of them is returned.
 * @param qualityLevel Parameter characterizing the minimal accepted quality of
 * image corners. The parameter value is multiplied by the best corner quality
 * measure, which is the minimal eigenvalue (see "cornerMinEigenVal") or the
 * Harris function response (see "cornerHarris"). The corners with the quality
 * measure less than the product are rejected. For example, if the best corner
 * has the quality measure = 1500, and the "qualityLevel=0.01", then all the
 * corners with the quality measure less than 15 are rejected.
 * @param minDistance Minimum possible Euclidean distance between the returned
 * corners.
 * @param mask Optional region of interest. If the image is not empty (it needs
 * to have the type "CV_8UC1" and the same size as "image"), it specifies the
 * region in which the corners are detected.
 * @param blockSize Size of an average block for computing a derivative
 * covariation matrix over each pixel neighborhood. See "cornerEigenValsAndVecs".
 * @param useHarrisDetector Parameter indicating whether to use a Harris
 * detector (see "cornerHarris") or "cornerMinEigenVal".
 * @param k Free parameter of the Harris detector.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#goodfeaturestotrack">org.opencv.imgproc.Imgproc.goodFeaturesToTrack</a>
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see OneWayDescriptor
 * @see org.opencv.video.Video.calcOpticalFlowPyrLK
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see estimateRigidMotion
 * @see PlanarObjectDetector
 */
    public static void goodFeaturesToTrack(Mat image, List<Point> corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector, double k)
    {
        Mat corners_mat = new Mat();
        goodFeaturesToTrack_0(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector, k);
        Converters.Mat_to_vector_Point(corners_mat, corners);
        return;
    }

/**
 * Determines strong corners on an image.
 *
 * The function finds the most prominent corners in the image or in the
 * specified image region, as described in [Shi94]:
 *   #. Function calculates the corner quality measure at every source image
 * pixel using the "cornerMinEigenVal" or "cornerHarris".
 *   #. Function performs a non-maximum suppression (the local maximums in *3 x
 * 3* neighborhood are retained).
 *   #. The corners with the minimal eigenvalue less than qualityLevel *
 * max_(x,y) qualityMeasureMap(x,y) are rejected.
 *   #. The remaining corners are sorted by the quality measure in the
 * descending order.
 *   #. Function throws away each corner for which there is a stronger corner at
 * a distance less than "maxDistance".
 *
 * The function can be used to initialize a point-based tracker of an object.
 *
 * Note: If the function is called with different values "A" and "B" of the
 * parameter "qualityLevel", and "A" > {B}, the vector of returned corners with
 * "qualityLevel=A" will be the prefix of the output vector with
 * "qualityLevel=B".
 *
 * @param image Input 8-bit or floating-point 32-bit, single-channel image.
 * @param corners Output vector of detected corners.
 * @param maxCorners Maximum number of corners to return. If there are more
 * corners than are found, the strongest of them is returned.
 * @param qualityLevel Parameter characterizing the minimal accepted quality of
 * image corners. The parameter value is multiplied by the best corner quality
 * measure, which is the minimal eigenvalue (see "cornerMinEigenVal") or the
 * Harris function response (see "cornerHarris"). The corners with the quality
 * measure less than the product are rejected. For example, if the best corner
 * has the quality measure = 1500, and the "qualityLevel=0.01", then all the
 * corners with the quality measure less than 15 are rejected.
 * @param minDistance Minimum possible Euclidean distance between the returned
 * corners.
 * @param mask Optional region of interest. If the image is not empty (it needs
 * to have the type "CV_8UC1" and the same size as "image"), it specifies the
 * region in which the corners are detected.
 * @param blockSize Size of an average block for computing a derivative
 * covariation matrix over each pixel neighborhood. See "cornerEigenValsAndVecs".
 * @param useHarrisDetector Parameter indicating whether to use a Harris
 * detector (see "cornerHarris") or "cornerMinEigenVal".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#goodfeaturestotrack">org.opencv.imgproc.Imgproc.goodFeaturesToTrack</a>
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see OneWayDescriptor
 * @see org.opencv.video.Video.calcOpticalFlowPyrLK
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see estimateRigidMotion
 * @see PlanarObjectDetector
 */
    public static void goodFeaturesToTrack(Mat image, List<Point> corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector)
    {
        Mat corners_mat = new Mat();
        goodFeaturesToTrack_1(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector);
        Converters.Mat_to_vector_Point(corners_mat, corners);
        return;
    }

/**
 * Determines strong corners on an image.
 *
 * The function finds the most prominent corners in the image or in the
 * specified image region, as described in [Shi94]:
 *   #. Function calculates the corner quality measure at every source image
 * pixel using the "cornerMinEigenVal" or "cornerHarris".
 *   #. Function performs a non-maximum suppression (the local maximums in *3 x
 * 3* neighborhood are retained).
 *   #. The corners with the minimal eigenvalue less than qualityLevel *
 * max_(x,y) qualityMeasureMap(x,y) are rejected.
 *   #. The remaining corners are sorted by the quality measure in the
 * descending order.
 *   #. Function throws away each corner for which there is a stronger corner at
 * a distance less than "maxDistance".
 *
 * The function can be used to initialize a point-based tracker of an object.
 *
 * Note: If the function is called with different values "A" and "B" of the
 * parameter "qualityLevel", and "A" > {B}, the vector of returned corners with
 * "qualityLevel=A" will be the prefix of the output vector with
 * "qualityLevel=B".
 *
 * @param image Input 8-bit or floating-point 32-bit, single-channel image.
 * @param corners Output vector of detected corners.
 * @param maxCorners Maximum number of corners to return. If there are more
 * corners than are found, the strongest of them is returned.
 * @param qualityLevel Parameter characterizing the minimal accepted quality of
 * image corners. The parameter value is multiplied by the best corner quality
 * measure, which is the minimal eigenvalue (see "cornerMinEigenVal") or the
 * Harris function response (see "cornerHarris"). The corners with the quality
 * measure less than the product are rejected. For example, if the best corner
 * has the quality measure = 1500, and the "qualityLevel=0.01", then all the
 * corners with the quality measure less than 15 are rejected.
 * @param minDistance Minimum possible Euclidean distance between the returned
 * corners.
 * @param mask Optional region of interest. If the image is not empty (it needs
 * to have the type "CV_8UC1" and the same size as "image"), it specifies the
 * region in which the corners are detected.
 * @param blockSize Size of an average block for computing a derivative
 * covariation matrix over each pixel neighborhood. See "cornerEigenValsAndVecs".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#goodfeaturestotrack">org.opencv.imgproc.Imgproc.goodFeaturesToTrack</a>
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see OneWayDescriptor
 * @see org.opencv.video.Video.calcOpticalFlowPyrLK
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see estimateRigidMotion
 * @see PlanarObjectDetector
 */
    public static void goodFeaturesToTrack(Mat image, List<Point> corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize)
    {
        Mat corners_mat = new Mat();
        goodFeaturesToTrack_2(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize);
        Converters.Mat_to_vector_Point(corners_mat, corners);
        return;
    }

/**
 * Determines strong corners on an image.
 *
 * The function finds the most prominent corners in the image or in the
 * specified image region, as described in [Shi94]:
 *   #. Function calculates the corner quality measure at every source image
 * pixel using the "cornerMinEigenVal" or "cornerHarris".
 *   #. Function performs a non-maximum suppression (the local maximums in *3 x
 * 3* neighborhood are retained).
 *   #. The corners with the minimal eigenvalue less than qualityLevel *
 * max_(x,y) qualityMeasureMap(x,y) are rejected.
 *   #. The remaining corners are sorted by the quality measure in the
 * descending order.
 *   #. Function throws away each corner for which there is a stronger corner at
 * a distance less than "maxDistance".
 *
 * The function can be used to initialize a point-based tracker of an object.
 *
 * Note: If the function is called with different values "A" and "B" of the
 * parameter "qualityLevel", and "A" > {B}, the vector of returned corners with
 * "qualityLevel=A" will be the prefix of the output vector with
 * "qualityLevel=B".
 *
 * @param image Input 8-bit or floating-point 32-bit, single-channel image.
 * @param corners Output vector of detected corners.
 * @param maxCorners Maximum number of corners to return. If there are more
 * corners than are found, the strongest of them is returned.
 * @param qualityLevel Parameter characterizing the minimal accepted quality of
 * image corners. The parameter value is multiplied by the best corner quality
 * measure, which is the minimal eigenvalue (see "cornerMinEigenVal") or the
 * Harris function response (see "cornerHarris"). The corners with the quality
 * measure less than the product are rejected. For example, if the best corner
 * has the quality measure = 1500, and the "qualityLevel=0.01", then all the
 * corners with the quality measure less than 15 are rejected.
 * @param minDistance Minimum possible Euclidean distance between the returned
 * corners.
 * @param mask Optional region of interest. If the image is not empty (it needs
 * to have the type "CV_8UC1" and the same size as "image"), it specifies the
 * region in which the corners are detected.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#goodfeaturestotrack">org.opencv.imgproc.Imgproc.goodFeaturesToTrack</a>
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see OneWayDescriptor
 * @see org.opencv.video.Video.calcOpticalFlowPyrLK
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see estimateRigidMotion
 * @see PlanarObjectDetector
 */
    public static void goodFeaturesToTrack(Mat image, List<Point> corners, int maxCorners, double qualityLevel, double minDistance, Mat mask)
    {
        Mat corners_mat = new Mat();
        goodFeaturesToTrack_3(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj);
        Converters.Mat_to_vector_Point(corners_mat, corners);
        return;
    }

/**
 * Determines strong corners on an image.
 *
 * The function finds the most prominent corners in the image or in the
 * specified image region, as described in [Shi94]:
 *   #. Function calculates the corner quality measure at every source image
 * pixel using the "cornerMinEigenVal" or "cornerHarris".
 *   #. Function performs a non-maximum suppression (the local maximums in *3 x
 * 3* neighborhood are retained).
 *   #. The corners with the minimal eigenvalue less than qualityLevel *
 * max_(x,y) qualityMeasureMap(x,y) are rejected.
 *   #. The remaining corners are sorted by the quality measure in the
 * descending order.
 *   #. Function throws away each corner for which there is a stronger corner at
 * a distance less than "maxDistance".
 *
 * The function can be used to initialize a point-based tracker of an object.
 *
 * Note: If the function is called with different values "A" and "B" of the
 * parameter "qualityLevel", and "A" > {B}, the vector of returned corners with
 * "qualityLevel=A" will be the prefix of the output vector with
 * "qualityLevel=B".
 *
 * @param image Input 8-bit or floating-point 32-bit, single-channel image.
 * @param corners Output vector of detected corners.
 * @param maxCorners Maximum number of corners to return. If there are more
 * corners than are found, the strongest of them is returned.
 * @param qualityLevel Parameter characterizing the minimal accepted quality of
 * image corners. The parameter value is multiplied by the best corner quality
 * measure, which is the minimal eigenvalue (see "cornerMinEigenVal") or the
 * Harris function response (see "cornerHarris"). The corners with the quality
 * measure less than the product are rejected. For example, if the best corner
 * has the quality measure = 1500, and the "qualityLevel=0.01", then all the
 * corners with the quality measure less than 15 are rejected.
 * @param minDistance Minimum possible Euclidean distance between the returned
 * corners.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#goodfeaturestotrack">org.opencv.imgproc.Imgproc.goodFeaturesToTrack</a>
 * @see org.opencv.imgproc.Imgproc.cornerMinEigenVal
 * @see OneWayDescriptor
 * @see org.opencv.video.Video.calcOpticalFlowPyrLK
 * @see org.opencv.imgproc.Imgproc.cornerHarris
 * @see estimateRigidMotion
 * @see PlanarObjectDetector
 */
    public static void goodFeaturesToTrack(Mat image, List<Point> corners, int maxCorners, double qualityLevel, double minDistance)
    {
        Mat corners_mat = new Mat();
        goodFeaturesToTrack_4(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance);
        Converters.Mat_to_vector_Point(corners_mat, corners);
        return;
    }


    //
    // C++:  void grabCut(Mat img, Mat& mask, Rect rect, Mat& bgdModel, Mat& fgdModel, int iterCount, int mode = GC_EVAL)
    //

/**
 * Runs the GrabCut algorithm.
 *
 * The function implements the GrabCut image segmentation algorithm
 * (http://en.wikipedia.org/wiki/GrabCut).
 * See the sample "grabcut.cpp" to learn how to use the function.
 *
 * @param img a img
 * @param mask Input/output 8-bit single-channel mask. The mask is initialized
 * by the function when "mode" is set to "GC_INIT_WITH_RECT". Its elements may
 * have one of following values:
 *   * GC_BGD defines an obvious background pixels.
 *   * GC_FGD defines an obvious foreground (object) pixel.
 *   * GC_PR_BGD defines a possible background pixel.
 *   * GC_PR_BGD defines a possible foreground pixel.
 * @param rect ROI containing a segmented object. The pixels outside of the ROI
 * are marked as "obvious background". The parameter is only used when
 * "mode==GC_INIT_WITH_RECT".
 * @param bgdModel Temporary array for the background model. Do not modify it
 * while you are processing the same image.
 * @param fgdModel Temporary arrays for the foreground model. Do not modify it
 * while you are processing the same image.
 * @param iterCount Number of iterations the algorithm should make before
 * returning the result. Note that the result can be refined with further calls
 * with "mode==GC_INIT_WITH_MASK" or "mode==GC_EVAL".
 * @param mode Operation mode that could be one of the following:
 *   * GC_INIT_WITH_RECT The function initializes the state and the mask using
 * the provided rectangle. After that it runs "iterCount" iterations of the
 * algorithm.
 *   * GC_INIT_WITH_MASK The function initializes the state using the provided
 * mask. Note that "GC_INIT_WITH_RECT" and "GC_INIT_WITH_MASK" can be combined.
 * Then, all the pixels outside of the ROI are automatically initialized with
 * "GC_BGD".
 *   * GC_EVAL The value means that the algorithm should just resume.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#grabcut">org.opencv.imgproc.Imgproc.grabCut</a>
 */
    public static void grabCut(Mat img, Mat mask, Rect rect, Mat bgdModel, Mat fgdModel, int iterCount, int mode)
    {

        grabCut_0(img.nativeObj, mask.nativeObj, rect.x, rect.y, rect.width, rect.height, bgdModel.nativeObj, fgdModel.nativeObj, iterCount, mode);

        return;
    }

/**
 * Runs the GrabCut algorithm.
 *
 * The function implements the GrabCut image segmentation algorithm
 * (http://en.wikipedia.org/wiki/GrabCut).
 * See the sample "grabcut.cpp" to learn how to use the function.
 *
 * @param img a img
 * @param mask Input/output 8-bit single-channel mask. The mask is initialized
 * by the function when "mode" is set to "GC_INIT_WITH_RECT". Its elements may
 * have one of following values:
 *   * GC_BGD defines an obvious background pixels.
 *   * GC_FGD defines an obvious foreground (object) pixel.
 *   * GC_PR_BGD defines a possible background pixel.
 *   * GC_PR_BGD defines a possible foreground pixel.
 * @param rect ROI containing a segmented object. The pixels outside of the ROI
 * are marked as "obvious background". The parameter is only used when
 * "mode==GC_INIT_WITH_RECT".
 * @param bgdModel Temporary array for the background model. Do not modify it
 * while you are processing the same image.
 * @param fgdModel Temporary arrays for the foreground model. Do not modify it
 * while you are processing the same image.
 * @param iterCount Number of iterations the algorithm should make before
 * returning the result. Note that the result can be refined with further calls
 * with "mode==GC_INIT_WITH_MASK" or "mode==GC_EVAL".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#grabcut">org.opencv.imgproc.Imgproc.grabCut</a>
 */
    public static void grabCut(Mat img, Mat mask, Rect rect, Mat bgdModel, Mat fgdModel, int iterCount)
    {

        grabCut_1(img.nativeObj, mask.nativeObj, rect.x, rect.y, rect.width, rect.height, bgdModel.nativeObj, fgdModel.nativeObj, iterCount);

        return;
    }


    //
    // C++:  void initUndistortRectifyMap(Mat cameraMatrix, Mat distCoeffs, Mat R, Mat newCameraMatrix, Size size, int m1type, Mat& map1, Mat& map2)
    //

/**
 * Computes the undistortion and rectification transformation map.
 *
 * The function computes the joint undistortion and rectification transformation
 * and represents the result in the form of maps for "remap". The undistorted
 * image looks like original, as if it is captured with a camera using the
 * camera matrix "=newCameraMatrix" and zero distortion. In case of a monocular
 * camera, "newCameraMatrix" is usually equal to "cameraMatrix", or it can be
 * computed by "getOptimalNewCameraMatrix" for a better control over scaling. In
 * case of a stereo camera, "newCameraMatrix" is normally set to "P1" or "P2"
 * computed by "stereoRectify".
 *
 * Also, this new camera is oriented differently in the coordinate space,
 * according to "R". That, for example, helps to align two heads of a stereo
 * camera so that the epipolar lines on both images become horizontal and have
 * the same y- coordinate (in case of a horizontally aligned stereo camera).
 *
 * The function actually builds the maps for the inverse mapping algorithm that
 * is used by "remap". That is, for each pixel (u, v) in the destination
 * (corrected and rectified) image, the function computes the corresponding
 * coordinates in the source image (that is, in the original image from camera).
 * The following process is applied:
 *
 * x <- (u - (c')_x)/(f')_x
 * y <- (v - (c')_y)/(f')_y
 * ([X Y W]) ^T <- R^(-1)*[x y 1]^T
 * x' <- X/W
 * y' <- Y/W
 * x" <- x' (1 + k_1 r^2 + k_2 r^4 + k_3 r^6) + 2p_1 x' y' + p_2(r^2 + 2 x'^2)
 * y" <- y' (1 + k_1 r^2 + k_2 r^4 + k_3 r^6) + p_1(r^2 + 2 y'^2) + 2 p_2 x' y'
 * map_x(u,v) <- x" f_x + c_x
 * map_y(u,v) <- y" f_y + c_y
 *
 * where (k_1, k_2, p_1, p_2[, k_3]) are the distortion coefficients.
 *
 * In case of a stereo camera, this function is called twice: once for each
 * camera head, after "stereoRectify", which in its turn is called after
 * "stereoCalibrate". But if the stereo camera was not calibrated, it is still
 * possible to compute the rectification transformations directly from the
 * fundamental matrix using "stereoRectifyUncalibrated". For each camera, the
 * function computes homography "H" as the rectification transformation in a
 * pixel domain, not a rotation matrix "R" in 3D space. "R" can be computed from
 * "H" as
 *
 * R = cameraMatrix ^(-1) * H * cameraMatrix
 *
 * where "cameraMatrix" can be chosen arbitrarily.
 *
 * @param cameraMatrix Input camera matrix A=
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param R Optional rectification transformation in the object space (3x3
 * matrix). "R1" or "R2", computed by "stereoRectify" can be passed here. If the
 * matrix is empty, the identity transformation is assumed. In "cvInitUndistortMap"
 * R assumed to be an identity matrix.
 * @param newCameraMatrix New camera matrix A'=
 * |f_x' 0 c_x'|
 * |0 f_y' c_y'|
 * |0 0 1|.
 * @param size Undistorted image size.
 * @param m1type Type of the first output map that can be "CV_32FC1" or
 * "CV_16SC2". See "convertMaps" for details.
 * @param map1 The first output map.
 * @param map2 The second output map.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#initundistortrectifymap">org.opencv.imgproc.Imgproc.initUndistortRectifyMap</a>
 */
    public static void initUndistortRectifyMap(Mat cameraMatrix, Mat distCoeffs, Mat R, Mat newCameraMatrix, Size size, int m1type, Mat map1, Mat map2)
    {

        initUndistortRectifyMap_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, newCameraMatrix.nativeObj, size.width, size.height, m1type, map1.nativeObj, map2.nativeObj);

        return;
    }


    //
    // C++:  float initWideAngleProjMap(Mat cameraMatrix, Mat distCoeffs, Size imageSize, int destImageWidth, int m1type, Mat& map1, Mat& map2, int projType = PROJ_SPHERICAL_EQRECT, double alpha = 0)
    //

    public static float initWideAngleProjMap(Mat cameraMatrix, Mat distCoeffs, Size imageSize, int destImageWidth, int m1type, Mat map1, Mat map2, int projType, double alpha)
    {

        float retVal = initWideAngleProjMap_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, destImageWidth, m1type, map1.nativeObj, map2.nativeObj, projType, alpha);

        return retVal;
    }

    public static float initWideAngleProjMap(Mat cameraMatrix, Mat distCoeffs, Size imageSize, int destImageWidth, int m1type, Mat map1, Mat map2, int projType)
    {

        float retVal = initWideAngleProjMap_1(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, destImageWidth, m1type, map1.nativeObj, map2.nativeObj, projType);

        return retVal;
    }

    public static float initWideAngleProjMap(Mat cameraMatrix, Mat distCoeffs, Size imageSize, int destImageWidth, int m1type, Mat map1, Mat map2)
    {

        float retVal = initWideAngleProjMap_2(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, destImageWidth, m1type, map1.nativeObj, map2.nativeObj);

        return retVal;
    }


    //
    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRange, int flags)
    //

/**
 * Restores the selected region in an image using the region neighborhood.
 *
 * The function reconstructs the selected image area from the pixel near the
 * area boundary. The function may be used to remove dust and scratches from a
 * scanned photo, or to remove undesirable objects from still images or video.
 * See http://en.wikipedia.org/wiki/Inpainting for more details.
 *
 * @param src Input 8-bit 1-channel or 3-channel image.
 * @param inpaintMask Inpainting mask, 8-bit 1-channel image. Non-zero pixels
 * indicate the area that needs to be inpainted.
 * @param dst Output image with the same size and type as "src".
 * @param inpaintRange a inpaintRange
 * @param flags Inpainting method that could be one of the following:
 *   * INPAINT_NS Navier-Stokes based method.
 *   * INPAINT_TELEA Method by Alexandru Telea [Telea04].
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#inpaint">org.opencv.imgproc.Imgproc.inpaint</a>
 */
    public static void inpaint(Mat src, Mat inpaintMask, Mat dst, double inpaintRange, int flags)
    {

        inpaint_0(src.nativeObj, inpaintMask.nativeObj, dst.nativeObj, inpaintRange, flags);

        return;
    }


    //
    // C++:  void integral(Mat src, Mat& sum, int sdepth = -1)
    //

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 * @param sdepth Desired depth of the integral and the tilted integral images,
 * "CV_32S", "CV_32F", or "CV_64F".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral(Mat src, Mat sum, int sdepth)
    {

        integral_0(src.nativeObj, sum.nativeObj, sdepth);

        return;
    }

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral(Mat src, Mat sum)
    {

        integral_1(src.nativeObj, sum.nativeObj);

        return;
    }


    //
    // C++:  void integral(Mat src, Mat& sum, Mat& sqsum, int sdepth = -1)
    //

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 * @param sqsum Integral image for squared pixel values. It is (W+1)x(H+1),
 * double-precision floating-point (64f) array.
 * @param sdepth Desired depth of the integral and the tilted integral images,
 * "CV_32S", "CV_32F", or "CV_64F".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral2(Mat src, Mat sum, Mat sqsum, int sdepth)
    {

        integral2_0(src.nativeObj, sum.nativeObj, sqsum.nativeObj, sdepth);

        return;
    }

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 * @param sqsum Integral image for squared pixel values. It is (W+1)x(H+1),
 * double-precision floating-point (64f) array.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral2(Mat src, Mat sum, Mat sqsum)
    {

        integral2_1(src.nativeObj, sum.nativeObj, sqsum.nativeObj);

        return;
    }


    //
    // C++:  void integral(Mat src, Mat& sum, Mat& sqsum, Mat& tilted, int sdepth = -1)
    //

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 * @param sqsum Integral image for squared pixel values. It is (W+1)x(H+1),
 * double-precision floating-point (64f) array.
 * @param tilted Integral for the image rotated by 45 degrees. It is (W+1)x(H+1)
 * array with the same data type as "sum".
 * @param sdepth Desired depth of the integral and the tilted integral images,
 * "CV_32S", "CV_32F", or "CV_64F".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral3(Mat src, Mat sum, Mat sqsum, Mat tilted, int sdepth)
    {

        integral3_0(src.nativeObj, sum.nativeObj, sqsum.nativeObj, tilted.nativeObj, sdepth);

        return;
    }

/**
 * Calculates the integral of an image.
 *
 * The functions calculate one or more integral images for the source image as
 * follows:
 *
 * sum(X,Y) = sum(by: x<X,y<Y) image(x,y)
 *
 *
 *
 * sqsum(X,Y) = sum(by: x<X,y<Y) image(x,y)^2
 *
 *
 *
 * tilted(X,Y) = sum(by: y<Y,abs(x-X+1) <= Y-y-1) image(x,y)
 *
 * Using these integral images, you can calculate sa um, mean, and standard
 * deviation over a specific up-right or rotated rectangular region of the image
 * in a constant time, for example:
 *
 * sum(by: x_1 <= x < x_2, y_1 <= y < y_2) image(x,y) = sum(x_2,y_2)-
 * sum(x_1,y_2)- sum(x_2,y_1)+ sum(x_1,y_1)
 *
 * It makes possible to do a fast blurring or fast block correlation with a
 * variable window size, for example. In case of multi-channel images, sums for
 * each channel are accumulated independently.
 *
 * As a practical example, the next figure shows the calculation of the integral
 * of a straight rectangle "Rect(3,3,3,2)" and of a tilted rectangle
 * "Rect(5,1,2,3)". The selected pixels in the original "image" are shown, as
 * well as the relative pixels in the integral images "sum" and "tilted".
 *
 * @param src a src
 * @param sum Integral image as (W+1)x(H+1), 32-bit integer or floating-point
 * (32f or 64f).
 * @param sqsum Integral image for squared pixel values. It is (W+1)x(H+1),
 * double-precision floating-point (64f) array.
 * @param tilted Integral for the image rotated by 45 degrees. It is (W+1)x(H+1)
 * array with the same data type as "sum".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#integral">org.opencv.imgproc.Imgproc.integral</a>
 */
    public static void integral3(Mat src, Mat sum, Mat sqsum, Mat tilted)
    {

        integral3_1(src.nativeObj, sum.nativeObj, sqsum.nativeObj, tilted.nativeObj);

        return;
    }


    //
    // C++:  void invertAffineTransform(Mat M, Mat& iM)
    //

/**
 * Inverts an affine transformation.
 *
 * The function computes an inverse affine transformation represented by 2 x 3
 * matrix "M" :
 *
 * a_11 a_12 b_1
 * a_21 a_22 b_2
 *
 * The result is also a 2 x 3 matrix of the same type as "M".
 *
 * @param M Original affine transformation.
 * @param iM Output reverse affine transformation.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#invertaffinetransform">org.opencv.imgproc.Imgproc.invertAffineTransform</a>
 */
    public static void invertAffineTransform(Mat M, Mat iM)
    {

        invertAffineTransform_0(M.nativeObj, iM.nativeObj);

        return;
    }


    //
    // C++:  bool isContourConvex(vector_Point2f contour)
    //

/**
 * Tests a contour convexity.
 *
 * The function tests whether the input contour is convex or not. The contour
 * must be simple, that is, without self-intersections. Otherwise, the function
 * output is undefined.
 *
 * @param contour Input vector of 2D points, stored in:
 *   * "std.vector<>" or "Mat" (C++ interface)
 *   * "CvSeq*" or "CvMat*" (C interface)
 *   * Nx2 numpy array (Python interface)
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#iscontourconvex">org.opencv.imgproc.Imgproc.isContourConvex</a>
 */
    public static boolean isContourConvex(List<Point> contour)
    {
        Mat contour_mat = Converters.vector_Point2f_to_Mat(contour);
        boolean retVal = isContourConvex_0(contour_mat.nativeObj);

        return retVal;
    }


    //
    // C++:  double matchShapes(Mat contour1, Mat contour2, int method, double parameter)
    //

/**
 * Compares two shapes.
 *
 * The function compares two shapes. All three implemented methods use the Hu
 * invariants (see "HuMoments") as follows (A denotes "object1",B denotes
 * "object2"):
 *   * method=CV_CONTOUR_MATCH_I1
 *
 * I_1(A,B) = sum(by: i=1...7) <= ft|1/(m^A_i) - 1/(m^B_i) right|
 *
 *   * method=CV_CONTOUR_MATCH_I2
 *
 * I_2(A,B) = sum(by: i=1...7) <= ft|m^A_i - m^B_i right|
 *
 *   * method=CV_CONTOUR_MATCH_I3
 *
 * I_3(A,B) = sum(by: i=1...7)(<= ft| m^A_i - m^B_i right|)/(<= ft| m^A_i
 * right|)
 *
 * where
 *
 * m^A_i = sign(h^A_i) * log(h^A_i)
 * m^B_i = sign(h^B_i) * log(h^B_i)
 *
 * and h^A_i, h^B_i are the Hu moments of A and B, respectively.
 *
 * @param contour1 a contour1
 * @param contour2 a contour2
 * @param method Comparison method: "CV_CONTOUR_MATCH_I1", "CV_CONTOURS_MATCH_I2"
 * or "CV_CONTOURS_MATCH_I3" (see the details below).
 * @param parameter Method-specific parameter (not supported now).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#matchshapes">org.opencv.imgproc.Imgproc.matchShapes</a>
 */
    public static double matchShapes(Mat contour1, Mat contour2, int method, double parameter)
    {

        double retVal = matchShapes_0(contour1.nativeObj, contour2.nativeObj, method, parameter);

        return retVal;
    }


    //
    // C++:  void matchTemplate(Mat image, Mat templ, Mat& result, int method)
    //

/**
 * Compares a template against overlapped image regions.
 *
 * The function slides through "image", compares the overlapped patches of size
 * w x h against "templ" using the specified method and stores the comparison
 * results in "result". Here are the formulae for the available comparison
 * methods (I denotes "image", T "template", R "result"). The summation is done
 * over template and/or the image patch: x' = 0...w-1, y' = 0...h-1
 *   * method=CV_TM_SQDIFF
 *
 * R(x,y)= sum(by: x',y')(T(x',y')-I(x+x',y+y'))^2
 *
 *   * method=CV_TM_SQDIFF_NORMED
 *
 * R(x,y)= (sum_(x',y')(T(x',y')-I(x+x',y+y'))^2)/(sqrt(sum_(x',y')T(x',y')^2 *
 * sum_(x',y') I(x+x',y+y')^2))
 *
 *   * method=CV_TM_CCORR
 *
 * R(x,y)= sum(by: x',y')(T(x',y') * I(x+x',y+y'))
 *
 *   * method=CV_TM_CCORR_NORMED
 *
 * R(x,y)= (sum_(x',y')(T(x',y') * I(x+x',y+y')))/(sqrt(sum_(x',y')T(x',y')^2 *
 * sum_(x',y') I(x+x',y+y')^2))
 *
 *   * method=CV_TM_CCOEFF
 *
 * R(x,y)= sum(by: x',y')(T'(x',y') * I'(x+x',y+y'))
 *
 * where
 *
 * T'(x',y')=T(x',y') - 1/(w * h) * sum(by: x'',y'') T(x'',y'')
 * I'(x+x',y+y')=I(x+x',y+y') - 1/(w * h) * sum(by: x'',y'') I(x+x'',y+y'')
 *
 *   * method=CV_TM_CCOEFF_NORMED
 *
 * R(x,y)= (sum_(x',y')(T'(x',y') * I'(x+x',y+y')))/(sqrt(sum_(x',y')T'(x',y')^2
 * * sum_(x',y') I'(x+x',y+y')^2))
 *
 * After the function finishes the comparison, the best matches can be found as
 * global minimums (when "CV_TM_SQDIFF" was used) or maximums (when
 * "CV_TM_CCORR" or "CV_TM_CCOEFF" was used) using the "minMaxLoc" function. In
 * case of a color image, template summation in the numerator and each sum in
 * the denominator is done over all of the channels and separate mean values are
 * used for each channel. That is, the function can take a color template and a
 * color image. The result will still be a single-channel image, which is easier
 * to analyze.
 *
 * @param image Image where the search is running. It must be 8-bit or 32-bit
 * floating-point.
 * @param templ Searched template. It must be not greater than the source image
 * and have the same data type.
 * @param result Map of comparison results. It must be single-channel 32-bit
 * floating-point. If "image" is W x H and "templ" is w x h, then "result" is
 * (W-w+1) x(H-h+1).
 * @param method Parameter specifying the comparison method (see below).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/object_detection.html#matchtemplate">org.opencv.imgproc.Imgproc.matchTemplate</a>
 */
    public static void matchTemplate(Mat image, Mat templ, Mat result, int method)
    {

        matchTemplate_0(image.nativeObj, templ.nativeObj, result.nativeObj, method);

        return;
    }


    //
    // C++:  void medianBlur(Mat src, Mat& dst, int ksize)
    //

/**
 * Smoothes an image using the median filter.
 *
 * The function smoothes an image using the median filter with the ksize x ksize
 * aperture. Each channel of a multi-channel image is processed independently.
 * In-place operation is supported.
 *
 * @param src Source 1-, 3-, or 4-channel image. When "ksize" is 3 or 5, the
 * image depth should be "CV_8U", "CV_16U", or "CV_32F". For larger aperture
 * sizes, it can only be "CV_8U".
 * @param dst Destination array of the same size and type as "src".
 * @param ksize Aperture linear size. It must be odd and greater than 1, for
 * example: 3, 5, 7...
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#medianblur">org.opencv.imgproc.Imgproc.medianBlur</a>
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.bilateralFilter
 * @see org.opencv.imgproc.Imgproc.blur
 */
    public static void medianBlur(Mat src, Mat dst, int ksize)
    {

        medianBlur_0(src.nativeObj, dst.nativeObj, ksize);

        return;
    }


    //
    // C++:  RotatedRect minAreaRect(vector_Point2f points)
    //

/**
 * Finds a rotated rectangle of the minimum area enclosing the input 2D point
 * set.
 *
 * The function calculates and returns the minimum-area bounding rectangle
 * (possibly rotated) for a specified point set. See the OpenCV sample
 * "minarea.cpp".
 *
 * @param points Input vector of 2D points, stored in:
 *   * "std.vector<>" or "Mat" (C++ interface)
 *   * "CvSeq*" or "CvMat*" (C interface)
 *   * Nx2 numpy array (Python interface)
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#minarearect">org.opencv.imgproc.Imgproc.minAreaRect</a>
 */
    public static RotatedRect minAreaRect(List<Point> points)
    {
        Mat points_mat = Converters.vector_Point2f_to_Mat(points);
        RotatedRect retVal = new RotatedRect(minAreaRect_0(points_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  void minEnclosingCircle(vector_Point2f points, Point2f& center, float& radius)
    //

/**
 * Finds a circle of the minimum area enclosing a 2D point set.
 *
 * The function finds the minimal enclosing circle of a 2D point set using an
 * iterative algorithm. See the OpenCV sample "minarea.cpp".
 *
 * @param points Input vector of 2D points, stored in:
 *   * "std.vector<>" or "Mat" (C++ interface)
 *   * "CvSeq*" or "CvMat*" (C interface)
 *   * Nx2 numpy array (Python interface)
 * @param center Output center of the circle.
 * @param radius Output radius of the circle.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#minenclosingcircle">org.opencv.imgproc.Imgproc.minEnclosingCircle</a>
 */
    public static void minEnclosingCircle(List<Point> points, Point center, float[] radius)
    {
        Mat points_mat = Converters.vector_Point2f_to_Mat(points);
        double[] center_out = new double[2];
        double[] radius_out = new double[1];
        minEnclosingCircle_0(points_mat.nativeObj, center_out, radius_out);
        if(center!=null){ center.x = center_out[0]; center.y = center_out[1]; }
        if(radius!=null) radius[0] = (float)radius_out[0];
        return;
    }


    //
    // C++:  Moments moments(Mat array, bool binaryImage = false)
    //

/**
 * Calculates all of the moments up to the third order of a polygon or
 * rasterized shape.
 *
 * The function computes moments, up to the 3rd order, of a vector shape or a
 * rasterized shape. The results are returned in the structure "Moments" defined
 * as:
 *
 * In case of a raster image, the spatial moments Moments.m_(ji) are computed
 * as:
 *
 * m _(ji)= sum(by: x,y)(array(x,y) * x^j * y^i)
 *
 * The central moments Moments.mu_(ji) are computed as:
 *
 * mu _(ji)= sum(by: x,y)(array(x,y) * (x - x")^j * (y - y")^i)
 *
 * where (x", y") is the mass center:
 *
 * x" = (m_10)/(m_(00)), y" = (m_01)/(m_(00))
 *
 * The normalized central moments Moments.nu_(ij) are computed as:
 *
 * nu _(ji)= (mu_(ji))/(m_(00)^((i+j)/2+1)).
 *
 * Note:
 *
 * mu_00=m_00, nu_00=1 nu_10=mu_10=mu_01=mu_10=0, hence the values are not
 * stored.
 *
 * The moments of a contour are defined in the same way but computed using the
 * Green's formula (see http://en.wikipedia.org/wiki/Green_theorem). So, due to
 * a limited raster resolution, the moments computed for a contour are slightly
 * different from the moments computed for the same rasterized contour.
 *
 * @param array Raster image (single-channel, 8-bit or floating-point 2D array)
 * or an array (1 x N or N x 1) of 2D points ("Point" or "Point2f").
 * @param binaryImage If it is true, all non-zero image pixels are treated as
 * 1's. The parameter is used for images only.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#moments">org.opencv.imgproc.Imgproc.moments</a>
 * @see org.opencv.imgproc.Imgproc.contourArea
 * @see org.opencv.imgproc.Imgproc.arcLength
 */
    public static Moments moments(Mat array, boolean binaryImage)
    {

        Moments retVal = new Moments(moments_0(array.nativeObj, binaryImage));

        return retVal;
    }

/**
 * Calculates all of the moments up to the third order of a polygon or
 * rasterized shape.
 *
 * The function computes moments, up to the 3rd order, of a vector shape or a
 * rasterized shape. The results are returned in the structure "Moments" defined
 * as:
 *
 * In case of a raster image, the spatial moments Moments.m_(ji) are computed
 * as:
 *
 * m _(ji)= sum(by: x,y)(array(x,y) * x^j * y^i)
 *
 * The central moments Moments.mu_(ji) are computed as:
 *
 * mu _(ji)= sum(by: x,y)(array(x,y) * (x - x")^j * (y - y")^i)
 *
 * where (x", y") is the mass center:
 *
 * x" = (m_10)/(m_(00)), y" = (m_01)/(m_(00))
 *
 * The normalized central moments Moments.nu_(ij) are computed as:
 *
 * nu _(ji)= (mu_(ji))/(m_(00)^((i+j)/2+1)).
 *
 * Note:
 *
 * mu_00=m_00, nu_00=1 nu_10=mu_10=mu_01=mu_10=0, hence the values are not
 * stored.
 *
 * The moments of a contour are defined in the same way but computed using the
 * Green's formula (see http://en.wikipedia.org/wiki/Green_theorem). So, due to
 * a limited raster resolution, the moments computed for a contour are slightly
 * different from the moments computed for the same rasterized contour.
 *
 * @param array Raster image (single-channel, 8-bit or floating-point 2D array)
 * or an array (1 x N or N x 1) of 2D points ("Point" or "Point2f").
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#moments">org.opencv.imgproc.Imgproc.moments</a>
 * @see org.opencv.imgproc.Imgproc.contourArea
 * @see org.opencv.imgproc.Imgproc.arcLength
 */
    public static Moments moments(Mat array)
    {

        Moments retVal = new Moments(moments_1(array.nativeObj));

        return retVal;
    }


    //
    // C++:  void morphologyEx(Mat src, Mat& dst, int op, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    //

/**
 * Performs advanced morphological transformations.
 *
 * The function can perform advanced morphological transformations using an
 * erosion and dilation as basic operations.
 *
 * Opening operation:
 *
 * dst = open(src, element)= dilate(erode(src, element))
 *
 * Closing operation:
 *
 * dst = close(src, element)= erode(dilate(src, element))
 *
 * Morphological gradient:
 *
 * dst = morph_grad(src, element)= dilate(src, element)- erode(src, element)
 *
 * "Top hat":
 *
 * dst = tophat(src, element)= src - open(src, element)
 *
 * "Black hat":
 *
 * dst = blackhat(src, element)= close(src, element)- src
 *
 * Any of the operations can be done in-place.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param op Type of a morphological operation that can be one of the following:
 *   * MORPH_OPEN - an opening operation
 *   * MORPH_CLOSE - a closing operation
 *   * MORPH_GRADIENT - a morphological gradient
 *   * MORPH_TOPHAT - "top hat"
 *   * MORPH_BLACKHAT - "black hat"
 * @param kernel a kernel
 * @param anchor a anchor
 * @param iterations Number of times erosion and dilation are applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 * @param borderValue Border value in case of a constant border. The default
 * value has a special meaning. See "createMorphoogyFilter" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#morphologyex">org.opencv.imgproc.Imgproc.morphologyEx</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations, int borderType, Scalar borderValue)
    {

        morphologyEx_0(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Performs advanced morphological transformations.
 *
 * The function can perform advanced morphological transformations using an
 * erosion and dilation as basic operations.
 *
 * Opening operation:
 *
 * dst = open(src, element)= dilate(erode(src, element))
 *
 * Closing operation:
 *
 * dst = close(src, element)= erode(dilate(src, element))
 *
 * Morphological gradient:
 *
 * dst = morph_grad(src, element)= dilate(src, element)- erode(src, element)
 *
 * "Top hat":
 *
 * dst = tophat(src, element)= src - open(src, element)
 *
 * "Black hat":
 *
 * dst = blackhat(src, element)= close(src, element)- src
 *
 * Any of the operations can be done in-place.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param op Type of a morphological operation that can be one of the following:
 *   * MORPH_OPEN - an opening operation
 *   * MORPH_CLOSE - a closing operation
 *   * MORPH_GRADIENT - a morphological gradient
 *   * MORPH_TOPHAT - "top hat"
 *   * MORPH_BLACKHAT - "black hat"
 * @param kernel a kernel
 * @param anchor a anchor
 * @param iterations Number of times erosion and dilation are applied.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#morphologyex">org.opencv.imgproc.Imgproc.morphologyEx</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations, int borderType)
    {

        morphologyEx_1(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations, borderType);

        return;
    }

/**
 * Performs advanced morphological transformations.
 *
 * The function can perform advanced morphological transformations using an
 * erosion and dilation as basic operations.
 *
 * Opening operation:
 *
 * dst = open(src, element)= dilate(erode(src, element))
 *
 * Closing operation:
 *
 * dst = close(src, element)= erode(dilate(src, element))
 *
 * Morphological gradient:
 *
 * dst = morph_grad(src, element)= dilate(src, element)- erode(src, element)
 *
 * "Top hat":
 *
 * dst = tophat(src, element)= src - open(src, element)
 *
 * "Black hat":
 *
 * dst = blackhat(src, element)= close(src, element)- src
 *
 * Any of the operations can be done in-place.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param op Type of a morphological operation that can be one of the following:
 *   * MORPH_OPEN - an opening operation
 *   * MORPH_CLOSE - a closing operation
 *   * MORPH_GRADIENT - a morphological gradient
 *   * MORPH_TOPHAT - "top hat"
 *   * MORPH_BLACKHAT - "black hat"
 * @param kernel a kernel
 * @param anchor a anchor
 * @param iterations Number of times erosion and dilation are applied.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#morphologyex">org.opencv.imgproc.Imgproc.morphologyEx</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor, int iterations)
    {

        morphologyEx_2(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y, iterations);

        return;
    }

/**
 * Performs advanced morphological transformations.
 *
 * The function can perform advanced morphological transformations using an
 * erosion and dilation as basic operations.
 *
 * Opening operation:
 *
 * dst = open(src, element)= dilate(erode(src, element))
 *
 * Closing operation:
 *
 * dst = close(src, element)= erode(dilate(src, element))
 *
 * Morphological gradient:
 *
 * dst = morph_grad(src, element)= dilate(src, element)- erode(src, element)
 *
 * "Top hat":
 *
 * dst = tophat(src, element)= src - open(src, element)
 *
 * "Black hat":
 *
 * dst = blackhat(src, element)= close(src, element)- src
 *
 * Any of the operations can be done in-place.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param op Type of a morphological operation that can be one of the following:
 *   * MORPH_OPEN - an opening operation
 *   * MORPH_CLOSE - a closing operation
 *   * MORPH_GRADIENT - a morphological gradient
 *   * MORPH_TOPHAT - "top hat"
 *   * MORPH_BLACKHAT - "black hat"
 * @param kernel a kernel
 * @param anchor a anchor
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#morphologyex">org.opencv.imgproc.Imgproc.morphologyEx</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel, Point anchor)
    {

        morphologyEx_3(src.nativeObj, dst.nativeObj, op, kernel.nativeObj, anchor.x, anchor.y);

        return;
    }

/**
 * Performs advanced morphological transformations.
 *
 * The function can perform advanced morphological transformations using an
 * erosion and dilation as basic operations.
 *
 * Opening operation:
 *
 * dst = open(src, element)= dilate(erode(src, element))
 *
 * Closing operation:
 *
 * dst = close(src, element)= erode(dilate(src, element))
 *
 * Morphological gradient:
 *
 * dst = morph_grad(src, element)= dilate(src, element)- erode(src, element)
 *
 * "Top hat":
 *
 * dst = tophat(src, element)= src - open(src, element)
 *
 * "Black hat":
 *
 * dst = blackhat(src, element)= close(src, element)- src
 *
 * Any of the operations can be done in-place.
 *
 * @param src Source image.
 * @param dst Destination image of the same size and type as "src".
 * @param op Type of a morphological operation that can be one of the following:
 *   * MORPH_OPEN - an opening operation
 *   * MORPH_CLOSE - a closing operation
 *   * MORPH_GRADIENT - a morphological gradient
 *   * MORPH_TOPHAT - "top hat"
 *   * MORPH_BLACKHAT - "black hat"
 * @param kernel a kernel
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#morphologyex">org.opencv.imgproc.Imgproc.morphologyEx</a>
 * @see org.opencv.imgproc.Imgproc.createMorphologyFilter
 * @see org.opencv.imgproc.Imgproc.erode
 * @see org.opencv.imgproc.Imgproc.dilate
 */
    public static void morphologyEx(Mat src, Mat dst, int op, Mat kernel)
    {

        morphologyEx_4(src.nativeObj, dst.nativeObj, op, kernel.nativeObj);

        return;
    }


    //
    // C++:  double pointPolygonTest(vector_Point2f contour, Point2f pt, bool measureDist)
    //

/**
 * Performs a point-in-contour test.
 *
 * The function determines whether the point is inside a contour, outside, or
 * lies on an edge (or coincides with a vertex). It returns positive (inside),
 * negative (outside), or zero (on an edge) value, correspondingly. When
 * "measureDist=false", the return value is +1, -1, and 0, respectively.
 * Otherwise, the return value is a signed distance between the point and the
 * nearest contour edge.
 *
 * See below a sample output of the function where each image pixel is tested
 * against the contour.
 *
 * @param contour Input contour.
 * @param pt Point tested against the contour.
 * @param measureDist If true, the function estimates the signed distance from
 * the point to the nearest contour edge. Otherwise, the function only checks if
 * the point is inside a contour or not.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/structural_analysis_and_shape_descriptors.html#pointpolygontest">org.opencv.imgproc.Imgproc.pointPolygonTest</a>
 */
    public static double pointPolygonTest(List<Point> contour, Point pt, boolean measureDist)
    {
        Mat contour_mat = Converters.vector_Point2f_to_Mat(contour);
        double retVal = pointPolygonTest_0(contour_mat.nativeObj, pt.x, pt.y, measureDist);

        return retVal;
    }


    //
    // C++:  void preCornerDetect(Mat src, Mat& dst, int ksize, int borderType = BORDER_DEFAULT)
    //

/**
 * Calculates a feature map for corner detection.
 *
 * The function calculates the complex spatial derivative-based function of the
 * source image
 *
 * dst = (D_x src)^2 * D_(yy) src + (D_y src)^2 * D_(xx) src - 2 D_x src * D_y
 * src * D_(xy) src
 *
 * where D_x,D_y are the first image derivatives, D_(xx),D_(yy) are the second
 * image derivatives, and D_(xy) is the mixed derivative.
 *
 * The corners can be found as local maximums of the functions, as shown below:
 *
 * @param src Source single-channel 8-bit of floating-point image.
 * @param dst Output image that has the type "CV_32F" and the same size as
 * "src".
 * @param ksize a ksize
 * @param borderType Pixel extrapolation method. See "borderInterpolate".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#precornerdetect">org.opencv.imgproc.Imgproc.preCornerDetect</a>
 */
    public static void preCornerDetect(Mat src, Mat dst, int ksize, int borderType)
    {

        preCornerDetect_0(src.nativeObj, dst.nativeObj, ksize, borderType);

        return;
    }

/**
 * Calculates a feature map for corner detection.
 *
 * The function calculates the complex spatial derivative-based function of the
 * source image
 *
 * dst = (D_x src)^2 * D_(yy) src + (D_y src)^2 * D_(xx) src - 2 D_x src * D_y
 * src * D_(xy) src
 *
 * where D_x,D_y are the first image derivatives, D_(xx),D_(yy) are the second
 * image derivatives, and D_(xy) is the mixed derivative.
 *
 * The corners can be found as local maximums of the functions, as shown below:
 *
 * @param src Source single-channel 8-bit of floating-point image.
 * @param dst Output image that has the type "CV_32F" and the same size as
 * "src".
 * @param ksize a ksize
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/feature_detection.html#precornerdetect">org.opencv.imgproc.Imgproc.preCornerDetect</a>
 */
    public static void preCornerDetect(Mat src, Mat dst, int ksize)
    {

        preCornerDetect_1(src.nativeObj, dst.nativeObj, ksize);

        return;
    }


    //
    // C++:  void pyrDown(Mat src, Mat& dst, Size dstsize = Size())
    //

/**
 * Smoothes an image and downsamples it.
 *
 * The function performs the downsampling step of the Gaussian pyramid
 * construction. First, it convolves the source image with the kernel:
 *
 * 1/256 1 4 6 4 1
 * 4 16 24 16 4
 * 6 24 36 24 6
 * 4 16 24 16 4
 * 1 4 6 4 1
 *
 * Then, it downsamples the image by rejecting even rows and columns.
 *
 * @param src Source image.
 * @param dst Destination image. It has the specified size and the same type as
 * "src".
 * @param dstsize Size of the destination image. By default, it is computed as
 * "Size((src.cols+1)/2, (src.rows+1)/2)". But in any case, the following
 * conditions should be satisfied:.. math
 *
 * begin{array}{l} | texttt{dstsize.width} *2-src.cols| leq 2 \ |
 * texttt{dstsize.height} *2-src.rows| leq 2 end{array}
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrdown">org.opencv.imgproc.Imgproc.pyrDown</a>
 */
    public static void pyrDown(Mat src, Mat dst, Size dstsize)
    {

        pyrDown_0(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height);

        return;
    }

/**
 * Smoothes an image and downsamples it.
 *
 * The function performs the downsampling step of the Gaussian pyramid
 * construction. First, it convolves the source image with the kernel:
 *
 * 1/256 1 4 6 4 1
 * 4 16 24 16 4
 * 6 24 36 24 6
 * 4 16 24 16 4
 * 1 4 6 4 1
 *
 * Then, it downsamples the image by rejecting even rows and columns.
 *
 * @param src Source image.
 * @param dst Destination image. It has the specified size and the same type as
 * "src".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrdown">org.opencv.imgproc.Imgproc.pyrDown</a>
 */
    public static void pyrDown(Mat src, Mat dst)
    {

        pyrDown_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void pyrMeanShiftFiltering(Mat src, Mat& dst, double sp, double sr, int maxLevel = 1, TermCriteria termcrit = TermCriteria( TermCriteria::MAX_ITER+TermCriteria::EPS,5,1))
    //

/**
 * Performs initial step of meanshift segmentation of an image.
 *
 * The function implements the filtering stage of meanshift segmentation, that
 * is, the output of the function is the filtered "posterized" image with color
 * gradients and fine-grain texture flattened. At every pixel "(X,Y)" of the
 * input image (or down-sized input image, see below) the function executes
 * meanshift iterations, that is, the pixel "(X,Y)" neighborhood in the joint
 * space-color hyperspace is considered:
 *
 * (x,y): X- sp <= x <= X+ sp, Y- sp <= y <= Y+ sp, ||(R,G,B)-(r,g,b)|| <= sr
 *
 * where "(R,G,B)" and "(r,g,b)" are the vectors of color components at "(X,Y)"
 * and "(x,y)", respectively (though, the algorithm does not depend on the color
 * space used, so any 3-component color space can be used instead). Over the
 * neighborhood the average spatial value "(X',Y')" and average color vector
 * "(R',G',B')" are found and they act as the neighborhood center on the next
 * iteration:
 *
 * (X,Y)~(X',Y'), (R,G,B)~(R',G',B').
 *
 * After the iterations over, the color components of the initial pixel (that
 * is, the pixel from where the iterations started) are set to the final value
 * (average color at the last iteration):
 *
 * I(X,Y) <- (R*,G*,B*)
 *
 * When "maxLevel > 0", the gaussian pyramid of "maxLevel+1" levels is built,
 * and the above procedure is run on the smallest layer first. After that, the
 * results are propagated to the larger layer and the iterations are run again
 * only on those pixels where the layer colors differ by more than "sr" from the
 * lower-resolution layer of the pyramid. That makes boundaries of color regions
 * sharper. Note that the results will be actually different from the ones
 * obtained by running the meanshift procedure on the whole original image (i.e.
 * when "maxLevel==0").
 *
 * @param src The source 8-bit, 3-channel image.
 * @param dst The destination image of the same format and the same size as the
 * source.
 * @param sp The spatial window radius.
 * @param sr The color window radius.
 * @param maxLevel Maximum level of the pyramid for the segmentation.
 * @param termcrit Termination criteria: when to stop meanshift iterations.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrmeanshiftfiltering">org.opencv.imgproc.Imgproc.pyrMeanShiftFiltering</a>
 */
    public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr, int maxLevel, TermCriteria termcrit)
    {

        pyrMeanShiftFiltering_0(src.nativeObj, dst.nativeObj, sp, sr, maxLevel, termcrit.type, termcrit.maxCount, termcrit.epsilon);

        return;
    }

/**
 * Performs initial step of meanshift segmentation of an image.
 *
 * The function implements the filtering stage of meanshift segmentation, that
 * is, the output of the function is the filtered "posterized" image with color
 * gradients and fine-grain texture flattened. At every pixel "(X,Y)" of the
 * input image (or down-sized input image, see below) the function executes
 * meanshift iterations, that is, the pixel "(X,Y)" neighborhood in the joint
 * space-color hyperspace is considered:
 *
 * (x,y): X- sp <= x <= X+ sp, Y- sp <= y <= Y+ sp, ||(R,G,B)-(r,g,b)|| <= sr
 *
 * where "(R,G,B)" and "(r,g,b)" are the vectors of color components at "(X,Y)"
 * and "(x,y)", respectively (though, the algorithm does not depend on the color
 * space used, so any 3-component color space can be used instead). Over the
 * neighborhood the average spatial value "(X',Y')" and average color vector
 * "(R',G',B')" are found and they act as the neighborhood center on the next
 * iteration:
 *
 * (X,Y)~(X',Y'), (R,G,B)~(R',G',B').
 *
 * After the iterations over, the color components of the initial pixel (that
 * is, the pixel from where the iterations started) are set to the final value
 * (average color at the last iteration):
 *
 * I(X,Y) <- (R*,G*,B*)
 *
 * When "maxLevel > 0", the gaussian pyramid of "maxLevel+1" levels is built,
 * and the above procedure is run on the smallest layer first. After that, the
 * results are propagated to the larger layer and the iterations are run again
 * only on those pixels where the layer colors differ by more than "sr" from the
 * lower-resolution layer of the pyramid. That makes boundaries of color regions
 * sharper. Note that the results will be actually different from the ones
 * obtained by running the meanshift procedure on the whole original image (i.e.
 * when "maxLevel==0").
 *
 * @param src The source 8-bit, 3-channel image.
 * @param dst The destination image of the same format and the same size as the
 * source.
 * @param sp The spatial window radius.
 * @param sr The color window radius.
 * @param maxLevel Maximum level of the pyramid for the segmentation.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrmeanshiftfiltering">org.opencv.imgproc.Imgproc.pyrMeanShiftFiltering</a>
 */
    public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr, int maxLevel)
    {

        pyrMeanShiftFiltering_1(src.nativeObj, dst.nativeObj, sp, sr, maxLevel);

        return;
    }

/**
 * Performs initial step of meanshift segmentation of an image.
 *
 * The function implements the filtering stage of meanshift segmentation, that
 * is, the output of the function is the filtered "posterized" image with color
 * gradients and fine-grain texture flattened. At every pixel "(X,Y)" of the
 * input image (or down-sized input image, see below) the function executes
 * meanshift iterations, that is, the pixel "(X,Y)" neighborhood in the joint
 * space-color hyperspace is considered:
 *
 * (x,y): X- sp <= x <= X+ sp, Y- sp <= y <= Y+ sp, ||(R,G,B)-(r,g,b)|| <= sr
 *
 * where "(R,G,B)" and "(r,g,b)" are the vectors of color components at "(X,Y)"
 * and "(x,y)", respectively (though, the algorithm does not depend on the color
 * space used, so any 3-component color space can be used instead). Over the
 * neighborhood the average spatial value "(X',Y')" and average color vector
 * "(R',G',B')" are found and they act as the neighborhood center on the next
 * iteration:
 *
 * (X,Y)~(X',Y'), (R,G,B)~(R',G',B').
 *
 * After the iterations over, the color components of the initial pixel (that
 * is, the pixel from where the iterations started) are set to the final value
 * (average color at the last iteration):
 *
 * I(X,Y) <- (R*,G*,B*)
 *
 * When "maxLevel > 0", the gaussian pyramid of "maxLevel+1" levels is built,
 * and the above procedure is run on the smallest layer first. After that, the
 * results are propagated to the larger layer and the iterations are run again
 * only on those pixels where the layer colors differ by more than "sr" from the
 * lower-resolution layer of the pyramid. That makes boundaries of color regions
 * sharper. Note that the results will be actually different from the ones
 * obtained by running the meanshift procedure on the whole original image (i.e.
 * when "maxLevel==0").
 *
 * @param src The source 8-bit, 3-channel image.
 * @param dst The destination image of the same format and the same size as the
 * source.
 * @param sp The spatial window radius.
 * @param sr The color window radius.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrmeanshiftfiltering">org.opencv.imgproc.Imgproc.pyrMeanShiftFiltering</a>
 */
    public static void pyrMeanShiftFiltering(Mat src, Mat dst, double sp, double sr)
    {

        pyrMeanShiftFiltering_2(src.nativeObj, dst.nativeObj, sp, sr);

        return;
    }


    //
    // C++:  void pyrUp(Mat src, Mat& dst, Size dstsize = Size())
    //

/**
 * Upsamples an image and then smoothes it.
 *
 * The function performs the upsampling step of the Gaussian pyramid
 * construction though it can actually be used to construct the Laplacian
 * pyramid. First, it upsamples the source image by injecting even zero rows and
 * columns and then convolves the result with the same kernel as in "pyrDown"
 * multiplied by 4.
 *
 * @param src Source image.
 * @param dst Destination image. It has the specified size and the same type as
 * "src".
 * @param dstsize Size of the destination image. By default, it is computed as
 * "Size(src.cols*2, (src.rows*2)". But in any case, the following conditions
 * should be satisfied:.. math
 *
 * begin{array}{l} | texttt{dstsize.width} -src.cols*2| leq (texttt{dstsize.width}
 * mod 2) \ | texttt{dstsize.height} -src.rows*2| leq (texttt{dstsize.height}
 * mod 2) end{array}
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrup">org.opencv.imgproc.Imgproc.pyrUp</a>
 */
    public static void pyrUp(Mat src, Mat dst, Size dstsize)
    {

        pyrUp_0(src.nativeObj, dst.nativeObj, dstsize.width, dstsize.height);

        return;
    }

/**
 * Upsamples an image and then smoothes it.
 *
 * The function performs the upsampling step of the Gaussian pyramid
 * construction though it can actually be used to construct the Laplacian
 * pyramid. First, it upsamples the source image by injecting even zero rows and
 * columns and then convolves the result with the same kernel as in "pyrDown"
 * multiplied by 4.
 *
 * @param src Source image.
 * @param dst Destination image. It has the specified size and the same type as
 * "src".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#pyrup">org.opencv.imgproc.Imgproc.pyrUp</a>
 */
    public static void pyrUp(Mat src, Mat dst)
    {

        pyrUp_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void remap(Mat src, Mat& dst, Mat map1, Mat map2, int interpolation, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    //

/**
 * Applies a generic geometrical transformation to an image.
 *
 * The function "remap" transforms the source image using the specified map:
 *
 * dst(x,y) = src(map_x(x,y),map_y(x,y))
 *
 * where values of pixels with non-integer coordinates are computed using one of
 * available interpolation methods.
 * map_x and map_y can be encoded as separate floating-point maps in map_1 and
 * map_2 respectively, or interleaved floating-point maps of (x,y) in map_1, or
 * fixed-point maps created by using "convertMaps". The reason you might want to
 * convert from floating to fixed-point representations of a map is that they
 * can yield much faster (~2x) remapping operations. In the converted case,
 * map_1 contains pairs "(cvFloor(x), cvFloor(y))" and map_2 contains indices in
 * a table of interpolation coefficients.
 *
 * This function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image. It has the same size as "map1" and the same
 * type as "src".
 * @param map1 The first map of either "(x,y)" points or just "x" values having
 * the type "CV_16SC2", "CV_32FC1", or "CV_32FC2". See "convertMaps" for details
 * on converting a floating point representation to fixed-point for speed.
 * @param map2 The second map of "y" values having the type "CV_16UC1",
 * "CV_32FC1", or none (empty map if "map1" is "(x,y)" points), respectively.
 * @param interpolation Interpolation method (see "resize"). The method
 * "INTER_AREA" is not supported by this function.
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image that corresponds to the "outliers" in the source image are not modified
 * by the function.
 * @param borderValue Value used in case of a constant border. By default, it is
 * 0.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#remap">org.opencv.imgproc.Imgproc.remap</a>
 */
    public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation, int borderMode, Scalar borderValue)
    {

        remap_0(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Applies a generic geometrical transformation to an image.
 *
 * The function "remap" transforms the source image using the specified map:
 *
 * dst(x,y) = src(map_x(x,y),map_y(x,y))
 *
 * where values of pixels with non-integer coordinates are computed using one of
 * available interpolation methods.
 * map_x and map_y can be encoded as separate floating-point maps in map_1 and
 * map_2 respectively, or interleaved floating-point maps of (x,y) in map_1, or
 * fixed-point maps created by using "convertMaps". The reason you might want to
 * convert from floating to fixed-point representations of a map is that they
 * can yield much faster (~2x) remapping operations. In the converted case,
 * map_1 contains pairs "(cvFloor(x), cvFloor(y))" and map_2 contains indices in
 * a table of interpolation coefficients.
 *
 * This function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image. It has the same size as "map1" and the same
 * type as "src".
 * @param map1 The first map of either "(x,y)" points or just "x" values having
 * the type "CV_16SC2", "CV_32FC1", or "CV_32FC2". See "convertMaps" for details
 * on converting a floating point representation to fixed-point for speed.
 * @param map2 The second map of "y" values having the type "CV_16UC1",
 * "CV_32FC1", or none (empty map if "map1" is "(x,y)" points), respectively.
 * @param interpolation Interpolation method (see "resize"). The method
 * "INTER_AREA" is not supported by this function.
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image that corresponds to the "outliers" in the source image are not modified
 * by the function.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#remap">org.opencv.imgproc.Imgproc.remap</a>
 */
    public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation, int borderMode)
    {

        remap_1(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation, borderMode);

        return;
    }

/**
 * Applies a generic geometrical transformation to an image.
 *
 * The function "remap" transforms the source image using the specified map:
 *
 * dst(x,y) = src(map_x(x,y),map_y(x,y))
 *
 * where values of pixels with non-integer coordinates are computed using one of
 * available interpolation methods.
 * map_x and map_y can be encoded as separate floating-point maps in map_1 and
 * map_2 respectively, or interleaved floating-point maps of (x,y) in map_1, or
 * fixed-point maps created by using "convertMaps". The reason you might want to
 * convert from floating to fixed-point representations of a map is that they
 * can yield much faster (~2x) remapping operations. In the converted case,
 * map_1 contains pairs "(cvFloor(x), cvFloor(y))" and map_2 contains indices in
 * a table of interpolation coefficients.
 *
 * This function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image. It has the same size as "map1" and the same
 * type as "src".
 * @param map1 The first map of either "(x,y)" points or just "x" values having
 * the type "CV_16SC2", "CV_32FC1", or "CV_32FC2". See "convertMaps" for details
 * on converting a floating point representation to fixed-point for speed.
 * @param map2 The second map of "y" values having the type "CV_16UC1",
 * "CV_32FC1", or none (empty map if "map1" is "(x,y)" points), respectively.
 * @param interpolation Interpolation method (see "resize"). The method
 * "INTER_AREA" is not supported by this function.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#remap">org.opencv.imgproc.Imgproc.remap</a>
 */
    public static void remap(Mat src, Mat dst, Mat map1, Mat map2, int interpolation)
    {

        remap_2(src.nativeObj, dst.nativeObj, map1.nativeObj, map2.nativeObj, interpolation);

        return;
    }


    //
    // C++:  void resize(Mat src, Mat& dst, Size dsize, double fx = 0, double fy = 0, int interpolation = INTER_LINEAR)
    //

/**
 * Resizes an image.
 *
 * The function "resize" resizes the image "src" down to or up to the specified
 * size.
 * Note that the initial "dst" type or size are not taken into account. Instead,
 * the size and type are derived from the "src","dsize","fx", and "fy". If you
 * want to resize "src" so that it fits the pre-created "dst", you may call the
 * function as follows:
 *
 * If you want to decimate the image by factor of 2 in each direction, you can
 * call the function this way:
 *
 * To shrink an image, it will generally look best with CV_INTER_AREA
 * interpolation, whereas to enlarge an image, it will generally look best with
 * CV_INTER_CUBIC (slow) or CV_INTER_LINEAR (faster but still looks OK).
 *
 * @param src Source image.
 * @param dst Destination image. It has the size "dsize" (when it is non-zero)
 * or the size computed from "src.size()", "fx", and "fy". The type of "dst" is
 * the same as of "src".
 * @param dsize Destination image size. If it is zero, it is computed as:
 *
 * dsize = Size(round(fx*src.cols), round(fy*src.rows))
 *
 * Either "dsize" or both "fx" and "fy" must be non-zero.
 * @param fx Scale factor along the horizontal axis. When it is 0, it is
 * computed as
 *
 * (double)dsize.width/src.cols
 * @param fy Scale factor along the vertical axis. When it is 0, it is computed
 * as
 *
 * (double)dsize.height/src.rows
 * @param interpolation Interpolation method:
 *   * INTER_NEAREST - a nearest-neighbor interpolation
 *   * INTER_LINEAR - a bilinear interpolation (used by default)
 *   * INTER_AREA - resampling using pixel area relation. It may be a preferred
 * method for image decimation, as it gives moire'-free results. But when the
 * image is zoomed, it is similar to the "INTER_NEAREST" method.
 *   * INTER_CUBIC - a bicubic interpolation over 4x4 pixel neighborhood
 *   * INTER_LANCZOS4 - a Lanczos interpolation over 8x8 pixel neighborhood
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#resize">org.opencv.imgproc.Imgproc.resize</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void resize(Mat src, Mat dst, Size dsize, double fx, double fy, int interpolation)
    {

        resize_0(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx, fy, interpolation);

        return;
    }

/**
 * Resizes an image.
 *
 * The function "resize" resizes the image "src" down to or up to the specified
 * size.
 * Note that the initial "dst" type or size are not taken into account. Instead,
 * the size and type are derived from the "src","dsize","fx", and "fy". If you
 * want to resize "src" so that it fits the pre-created "dst", you may call the
 * function as follows:
 *
 * If you want to decimate the image by factor of 2 in each direction, you can
 * call the function this way:
 *
 * To shrink an image, it will generally look best with CV_INTER_AREA
 * interpolation, whereas to enlarge an image, it will generally look best with
 * CV_INTER_CUBIC (slow) or CV_INTER_LINEAR (faster but still looks OK).
 *
 * @param src Source image.
 * @param dst Destination image. It has the size "dsize" (when it is non-zero)
 * or the size computed from "src.size()", "fx", and "fy". The type of "dst" is
 * the same as of "src".
 * @param dsize Destination image size. If it is zero, it is computed as:
 *
 * dsize = Size(round(fx*src.cols), round(fy*src.rows))
 *
 * Either "dsize" or both "fx" and "fy" must be non-zero.
 * @param fx Scale factor along the horizontal axis. When it is 0, it is
 * computed as
 *
 * (double)dsize.width/src.cols
 * @param fy Scale factor along the vertical axis. When it is 0, it is computed
 * as
 *
 * (double)dsize.height/src.rows
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#resize">org.opencv.imgproc.Imgproc.resize</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void resize(Mat src, Mat dst, Size dsize, double fx, double fy)
    {

        resize_1(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx, fy);

        return;
    }

/**
 * Resizes an image.
 *
 * The function "resize" resizes the image "src" down to or up to the specified
 * size.
 * Note that the initial "dst" type or size are not taken into account. Instead,
 * the size and type are derived from the "src","dsize","fx", and "fy". If you
 * want to resize "src" so that it fits the pre-created "dst", you may call the
 * function as follows:
 *
 * If you want to decimate the image by factor of 2 in each direction, you can
 * call the function this way:
 *
 * To shrink an image, it will generally look best with CV_INTER_AREA
 * interpolation, whereas to enlarge an image, it will generally look best with
 * CV_INTER_CUBIC (slow) or CV_INTER_LINEAR (faster but still looks OK).
 *
 * @param src Source image.
 * @param dst Destination image. It has the size "dsize" (when it is non-zero)
 * or the size computed from "src.size()", "fx", and "fy". The type of "dst" is
 * the same as of "src".
 * @param dsize Destination image size. If it is zero, it is computed as:
 *
 * dsize = Size(round(fx*src.cols), round(fy*src.rows))
 *
 * Either "dsize" or both "fx" and "fy" must be non-zero.
 * @param fx Scale factor along the horizontal axis. When it is 0, it is
 * computed as
 *
 * (double)dsize.width/src.cols
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#resize">org.opencv.imgproc.Imgproc.resize</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void resize(Mat src, Mat dst, Size dsize, double fx)
    {

        resize_2(src.nativeObj, dst.nativeObj, dsize.width, dsize.height, fx);

        return;
    }

/**
 * Resizes an image.
 *
 * The function "resize" resizes the image "src" down to or up to the specified
 * size.
 * Note that the initial "dst" type or size are not taken into account. Instead,
 * the size and type are derived from the "src","dsize","fx", and "fy". If you
 * want to resize "src" so that it fits the pre-created "dst", you may call the
 * function as follows:
 *
 * If you want to decimate the image by factor of 2 in each direction, you can
 * call the function this way:
 *
 * To shrink an image, it will generally look best with CV_INTER_AREA
 * interpolation, whereas to enlarge an image, it will generally look best with
 * CV_INTER_CUBIC (slow) or CV_INTER_LINEAR (faster but still looks OK).
 *
 * @param src Source image.
 * @param dst Destination image. It has the size "dsize" (when it is non-zero)
 * or the size computed from "src.size()", "fx", and "fy". The type of "dst" is
 * the same as of "src".
 * @param dsize Destination image size. If it is zero, it is computed as:
 *
 * dsize = Size(round(fx*src.cols), round(fy*src.rows))
 *
 * Either "dsize" or both "fx" and "fy" must be non-zero.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#resize">org.opencv.imgproc.Imgproc.resize</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 */
    public static void resize(Mat src, Mat dst, Size dsize)
    {

        resize_3(src.nativeObj, dst.nativeObj, dsize.width, dsize.height);

        return;
    }


    //
    // C++:  void sepFilter2D(Mat src, Mat& dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor = Point(-1,-1), double delta = 0, int borderType = BORDER_DEFAULT)
    //

/**
 * Applies a separable linear filter to an image.
 *
 * The function applies a separable linear filter to the image. That is, first,
 * every row of "src" is filtered with the 1D kernel "rowKernel". Then, every
 * column of the result is filtered with the 1D kernel "columnKernel". The final
 * result shifted by "delta" is stored in "dst".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param kernelX a kernelX
 * @param kernelY a kernelY
 * @param anchor Anchor position within the kernel. The default value (-1, 1)
 * means that the anchor is at the kernel center.
 * @param delta Value added to the filtered results before storing them.
 * @param borderType Pixel extrapolation method. See "borderInterpolate" for
 * details.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sepfilter2d">org.opencv.imgproc.Imgproc.sepFilter2D</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.Sobel
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor, double delta, int borderType)
    {

        sepFilter2D_0(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y, delta, borderType);

        return;
    }

/**
 * Applies a separable linear filter to an image.
 *
 * The function applies a separable linear filter to the image. That is, first,
 * every row of "src" is filtered with the 1D kernel "rowKernel". Then, every
 * column of the result is filtered with the 1D kernel "columnKernel". The final
 * result shifted by "delta" is stored in "dst".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param kernelX a kernelX
 * @param kernelY a kernelY
 * @param anchor Anchor position within the kernel. The default value (-1, 1)
 * means that the anchor is at the kernel center.
 * @param delta Value added to the filtered results before storing them.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sepfilter2d">org.opencv.imgproc.Imgproc.sepFilter2D</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.Sobel
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor, double delta)
    {

        sepFilter2D_1(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y, delta);

        return;
    }

/**
 * Applies a separable linear filter to an image.
 *
 * The function applies a separable linear filter to the image. That is, first,
 * every row of "src" is filtered with the 1D kernel "rowKernel". Then, every
 * column of the result is filtered with the 1D kernel "columnKernel". The final
 * result shifted by "delta" is stored in "dst".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param kernelX a kernelX
 * @param kernelY a kernelY
 * @param anchor Anchor position within the kernel. The default value (-1, 1)
 * means that the anchor is at the kernel center.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sepfilter2d">org.opencv.imgproc.Imgproc.sepFilter2D</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.Sobel
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor)
    {

        sepFilter2D_2(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj, anchor.x, anchor.y);

        return;
    }

/**
 * Applies a separable linear filter to an image.
 *
 * The function applies a separable linear filter to the image. That is, first,
 * every row of "src" is filtered with the 1D kernel "rowKernel". Then, every
 * column of the result is filtered with the 1D kernel "columnKernel". The final
 * result shifted by "delta" is stored in "dst".
 *
 * @param src Source image.
 * @param dst Destination image of the same size and the same number of channels
 * as "src".
 * @param ddepth Destination image depth.
 * @param kernelX a kernelX
 * @param kernelY a kernelY
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/filtering.html#sepfilter2d">org.opencv.imgproc.Imgproc.sepFilter2D</a>
 * @see org.opencv.imgproc.Imgproc.GaussianBlur
 * @see org.opencv.imgproc.Imgproc.Sobel
 * @see org.opencv.imgproc.Imgproc.boxFilter
 * @see org.opencv.imgproc.Imgproc.blur
 * @see org.opencv.imgproc.Imgproc.filter2D
 * @see org.opencv.imgproc.Imgproc.createSeparableLinearFilter
 */
    public static void sepFilter2D(Mat src, Mat dst, int ddepth, Mat kernelX, Mat kernelY)
    {

        sepFilter2D_3(src.nativeObj, dst.nativeObj, ddepth, kernelX.nativeObj, kernelY.nativeObj);

        return;
    }


    //
    // C++:  double threshold(Mat src, Mat& dst, double thresh, double maxval, int type)
    //

/**
 * Applies a fixed-level threshold to each array element.
 *
 * The function applies fixed-level thresholding to a single-channel array. The
 * function is typically used to get a bi-level (binary) image out of a
 * grayscale image ("compare" could be also used for this purpose) or for
 * removing a noise, that is, filtering out pixels with too small or too large
 * values. There are several types of thresholding supported by the function.
 * They are determined by "thresholdType" :
 *   * THRESH_BINARY
 *
 * dst(x,y) = maxVal if src(x,y) > thresh; 0 otherwise
 *
 *   * THRESH_BINARY_INV
 *
 * dst(x,y) = 0 if src(x,y) > thresh; maxVal otherwise
 *
 *   * THRESH_TRUNC
 *
 * dst(x,y) = threshold if src(x,y) > thresh; src(x,y) otherwise
 *
 *   * THRESH_TOZERO
 *
 * dst(x,y) = src(x,y) if src(x,y) > thresh; 0 otherwise
 *
 *   * THRESH_TOZERO_INV
 *
 * dst(x,y) = 0 if src(x,y) > thresh; src(x,y) otherwise
 *
 * Also, the special value "THRESH_OTSU" may be combined with one of the above
 * values. In this case, the function determines the optimal threshold value
 * using the Otsu's algorithm and uses it instead of the specified "thresh".
 * The function returns the computed threshold value.
 * Currently, the Otsu's method is implemented only for 8-bit images.
 *
 * @param src Source array (single-channel, 8-bit of 32-bit floating point).
 * @param dst Destination array of the same size and type as "src".
 * @param thresh Threshold value.
 * @param maxval a maxval
 * @param type a type
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#threshold">org.opencv.imgproc.Imgproc.threshold</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 * @see org.opencv.core.Core.max
 * @see org.opencv.imgproc.Imgproc.adaptiveThreshold
 * @see org.opencv.core.Core.compare
 * @see org.opencv.core.Core.min
 */
    public static double threshold(Mat src, Mat dst, double thresh, double maxval, int type)
    {

        double retVal = threshold_0(src.nativeObj, dst.nativeObj, thresh, maxval, type);

        return retVal;
    }


    //
    // C++:  void undistort(Mat src, Mat& dst, Mat cameraMatrix, Mat distCoeffs, Mat newCameraMatrix = Mat())
    //

/**
 * Transforms an image to compensate for lens distortion.
 *
 * The function transforms an image to compensate radial and tangential lens
 * distortion.
 *
 * The function is simply a combination of "initUndistortRectifyMap" (with unity
 * "R") and "remap" (with bilinear interpolation). See the former function for
 * details of the transformation being performed.
 *
 * Those pixels in the destination image, for which there is no correspondent
 * pixels in the source image, are filled with zeros (black color).
 *
 * A particular subset of the source image that will be visible in the corrected
 * image can be regulated by "newCameraMatrix". You can use "getOptimalNewCameraMatrix"
 * to compute the appropriate "newCameraMatrix" depending on your requirements.
 *
 * The camera matrix and the distortion parameters can be determined using
 * "calibrateCamera". If the resolution of images is different from the
 * resolution used at the calibration stage, f_x, f_y, c_x and c_y need to be
 * scaled accordingly, while the distortion coefficients remain the same.
 *
 * @param src Input (distorted) image.
 * @param dst Output (corrected) image that has the same size and type as "src".
 * @param cameraMatrix Input camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param newCameraMatrix Camera matrix of the distorted image. By default, it
 * is the same as "cameraMatrix" but you may additionally scale and shift the
 * result by using a different matrix.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#undistort">org.opencv.imgproc.Imgproc.undistort</a>
 */
    public static void undistort(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs, Mat newCameraMatrix)
    {

        undistort_0(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, newCameraMatrix.nativeObj);

        return;
    }

/**
 * Transforms an image to compensate for lens distortion.
 *
 * The function transforms an image to compensate radial and tangential lens
 * distortion.
 *
 * The function is simply a combination of "initUndistortRectifyMap" (with unity
 * "R") and "remap" (with bilinear interpolation). See the former function for
 * details of the transformation being performed.
 *
 * Those pixels in the destination image, for which there is no correspondent
 * pixels in the source image, are filled with zeros (black color).
 *
 * A particular subset of the source image that will be visible in the corrected
 * image can be regulated by "newCameraMatrix". You can use "getOptimalNewCameraMatrix"
 * to compute the appropriate "newCameraMatrix" depending on your requirements.
 *
 * The camera matrix and the distortion parameters can be determined using
 * "calibrateCamera". If the resolution of images is different from the
 * resolution used at the calibration stage, f_x, f_y, c_x and c_y need to be
 * scaled accordingly, while the distortion coefficients remain the same.
 *
 * @param src Input (distorted) image.
 * @param dst Output (corrected) image that has the same size and type as "src".
 * @param cameraMatrix Input camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#undistort">org.opencv.imgproc.Imgproc.undistort</a>
 */
    public static void undistort(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs)
    {

        undistort_1(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);

        return;
    }


    //
    // C++:  void warpAffine(Mat src, Mat& dst, Mat M, Size dsize, int flags = INTER_LINEAR, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    //

/**
 * Applies an affine transformation to an image.
 *
 * The function "warpAffine" transforms the source image using the specified
 * matrix:
 *
 * dst(x,y) = src(M _11 x + M _12 y + M _13, M _21 x + M _22 y + M _23)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invertAffineTransform" and then put in the formula above
 * instead of "M".
 * The function cannot operate in-place.
 *
 * Note: "cvGetQuadrangleSubPix" is similar to "cvWarpAffine", but the outliers
 * are extrapolated using replication border mode.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 2x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image corresponding to the "outliers" in the source image are not modified by
 * the function.
 * @param borderValue Value used in case of a constant border. By default, it is
 * 0.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpaffine">org.opencv.imgproc.Imgproc.warpAffine</a>
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 * @see org.opencv.core.Core.transform
 */
    public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode, Scalar borderValue)
    {

        warpAffine_0(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Applies an affine transformation to an image.
 *
 * The function "warpAffine" transforms the source image using the specified
 * matrix:
 *
 * dst(x,y) = src(M _11 x + M _12 y + M _13, M _21 x + M _22 y + M _23)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invertAffineTransform" and then put in the formula above
 * instead of "M".
 * The function cannot operate in-place.
 *
 * Note: "cvGetQuadrangleSubPix" is similar to "cvWarpAffine", but the outliers
 * are extrapolated using replication border mode.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 2x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image corresponding to the "outliers" in the source image are not modified by
 * the function.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpaffine">org.opencv.imgproc.Imgproc.warpAffine</a>
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 * @see org.opencv.core.Core.transform
 */
    public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode)
    {

        warpAffine_1(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode);

        return;
    }

/**
 * Applies an affine transformation to an image.
 *
 * The function "warpAffine" transforms the source image using the specified
 * matrix:
 *
 * dst(x,y) = src(M _11 x + M _12 y + M _13, M _21 x + M _22 y + M _23)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invertAffineTransform" and then put in the formula above
 * instead of "M".
 * The function cannot operate in-place.
 *
 * Note: "cvGetQuadrangleSubPix" is similar to "cvWarpAffine", but the outliers
 * are extrapolated using replication border mode.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 2x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpaffine">org.opencv.imgproc.Imgproc.warpAffine</a>
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 * @see org.opencv.core.Core.transform
 */
    public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize, int flags)
    {

        warpAffine_2(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags);

        return;
    }

/**
 * Applies an affine transformation to an image.
 *
 * The function "warpAffine" transforms the source image using the specified
 * matrix:
 *
 * dst(x,y) = src(M _11 x + M _12 y + M _13, M _21 x + M _22 y + M _23)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invertAffineTransform" and then put in the formula above
 * instead of "M".
 * The function cannot operate in-place.
 *
 * Note: "cvGetQuadrangleSubPix" is similar to "cvWarpAffine", but the outliers
 * are extrapolated using replication border mode.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 2x 3 transformation matrix.
 * @param dsize Size of the destination image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpaffine">org.opencv.imgproc.Imgproc.warpAffine</a>
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.imgproc.Imgproc.warpPerspective
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 * @see org.opencv.core.Core.transform
 */
    public static void warpAffine(Mat src, Mat dst, Mat M, Size dsize)
    {

        warpAffine_3(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height);

        return;
    }


    //
    // C++:  void warpPerspective(Mat src, Mat& dst, Mat M, Size dsize, int flags = INTER_LINEAR, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    //

/**
 * Applies a perspective transformation to an image.
 *
 * The function "warpPerspective" transforms the source image using the
 * specified matrix:.. math
 *
 * texttt{dst} (x,y) = texttt{src} left (frac{M_{11} x + M_{12} y +
 * M_{13}}{M_{31} x + M_{32} y + M_{33}}, frac{M_{21} x + M_{22} y +
 * M_{23}}{M_{31} x + M_{32} y + M_{33}} right)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invert" and then put in the formula above instead of
 * "M".
 * The function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 3x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image that corresponds to the "outliers" in the source image are not modified
 * by the function.
 * @param borderValue Value used in case of a constant border. By default, it is
 * 0.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpperspective">org.opencv.imgproc.Imgproc.warpPerspective</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.core.Core.perspectiveTransform
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 */
    public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode, Scalar borderValue)
    {

        warpPerspective_0(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode, borderValue.val[0], borderValue.val[1], borderValue.val[2], borderValue.val[3]);

        return;
    }

/**
 * Applies a perspective transformation to an image.
 *
 * The function "warpPerspective" transforms the source image using the
 * specified matrix:.. math
 *
 * texttt{dst} (x,y) = texttt{src} left (frac{M_{11} x + M_{12} y +
 * M_{13}}{M_{31} x + M_{32} y + M_{33}}, frac{M_{21} x + M_{22} y +
 * M_{23}}{M_{31} x + M_{32} y + M_{33}} right)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invert" and then put in the formula above instead of
 * "M".
 * The function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 3x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 * @param borderMode Pixel extrapolation method (see "borderInterpolate"). When
 * "borderMode=BORDER_TRANSPARENT", it means that the pixels in the destination
 * image that corresponds to the "outliers" in the source image are not modified
 * by the function.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpperspective">org.opencv.imgproc.Imgproc.warpPerspective</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.core.Core.perspectiveTransform
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 */
    public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags, int borderMode)
    {

        warpPerspective_1(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags, borderMode);

        return;
    }

/**
 * Applies a perspective transformation to an image.
 *
 * The function "warpPerspective" transforms the source image using the
 * specified matrix:.. math
 *
 * texttt{dst} (x,y) = texttt{src} left (frac{M_{11} x + M_{12} y +
 * M_{13}}{M_{31} x + M_{32} y + M_{33}}, frac{M_{21} x + M_{22} y +
 * M_{23}}{M_{31} x + M_{32} y + M_{33}} right)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invert" and then put in the formula above instead of
 * "M".
 * The function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 3x 3 transformation matrix.
 * @param dsize Size of the destination image.
 * @param flags Combination of interpolation methods (see "resize") and the
 * optional flag "WARP_INVERSE_MAP" that means that "M" is the inverse
 * transformation (dst->src).
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpperspective">org.opencv.imgproc.Imgproc.warpPerspective</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.core.Core.perspectiveTransform
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 */
    public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize, int flags)
    {

        warpPerspective_2(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height, flags);

        return;
    }

/**
 * Applies a perspective transformation to an image.
 *
 * The function "warpPerspective" transforms the source image using the
 * specified matrix:.. math
 *
 * texttt{dst} (x,y) = texttt{src} left (frac{M_{11} x + M_{12} y +
 * M_{13}}{M_{31} x + M_{32} y + M_{33}}, frac{M_{21} x + M_{22} y +
 * M_{23}}{M_{31} x + M_{32} y + M_{33}} right)
 *
 * when the flag "WARP_INVERSE_MAP" is set. Otherwise, the transformation is
 * first inverted with "invert" and then put in the formula above instead of
 * "M".
 * The function cannot operate in-place.
 *
 * @param src Source image.
 * @param dst Destination image that has the size "dsize" and the same type as
 * "src".
 * @param M 3x 3 transformation matrix.
 * @param dsize Size of the destination image.
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/geometric_transformations.html#warpperspective">org.opencv.imgproc.Imgproc.warpPerspective</a>
 * @see org.opencv.imgproc.Imgproc.warpAffine
 * @see org.opencv.imgproc.Imgproc.remap
 * @see org.opencv.core.Core.perspectiveTransform
 * @see org.opencv.imgproc.Imgproc.getRectSubPix
 * @see org.opencv.imgproc.Imgproc.resize
 */
    public static void warpPerspective(Mat src, Mat dst, Mat M, Size dsize)
    {

        warpPerspective_3(src.nativeObj, dst.nativeObj, M.nativeObj, dsize.width, dsize.height);

        return;
    }


    //
    // C++:  void watershed(Mat image, Mat& markers)
    //

/**
 * Performs a marker-based image segmentation using the watershed algrorithm.
 *
 * The function implements one of the variants of watershed, non-parametric
 * marker-based segmentation algorithm, described in [Meyer92].
 *
 * Before passing the image to the function, you have to roughly outline the
 * desired regions in the image "markers" with positive (">0") indices. So,
 * every region is represented as one or more connected components with the
 * pixel values 1, 2, 3, and so on. Such markers can be retrieved from a binary
 * mask using "findContours" and "drawContours" (see the "watershed.cpp" demo).
 * The markers are "seeds" of the future image regions. All the other pixels in
 * "markers", whose relation to the outlined regions is not known and should be
 * defined by the algorithm, should be set to 0's. In the function output, each
 * pixel in markers is set to a value of the "seed" components or to -1 at
 * boundaries between the regions.
 *
 * Visual demonstration and usage example of the function can be found in the
 * OpenCV samples directory (see the "watershed.cpp" demo).
 *
 * Note: Any two neighbor connected components are not necessarily separated by
 * a watershed boundary (-1's pixels); for example, they can touch each other in
 * the initial marker image passed to the function.
 *
 * @param image Input 8-bit 3-channel image.
 * @param markers Input/output 32-bit single-channel image (map) of markers. It
 * should have the same size as "image".
 *
 * @see <a href="http://opencv.itseez.com/modules/imgproc/doc/miscellaneous_transformations.html#watershed">org.opencv.imgproc.Imgproc.watershed</a>
 * @see org.opencv.imgproc.Imgproc.findContours
 */
    public static void watershed(Mat image, Mat markers)
    {

        watershed_0(image.nativeObj, markers.nativeObj);

        return;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  void Canny(Mat image, Mat& edges, double threshold1, double threshold2, int apertureSize = 3, bool L2gradient = false)
    private static native void Canny_0(long image_nativeObj, long edges_nativeObj, double threshold1, double threshold2, int apertureSize, boolean L2gradient);
    private static native void Canny_1(long image_nativeObj, long edges_nativeObj, double threshold1, double threshold2, int apertureSize);
    private static native void Canny_2(long image_nativeObj, long edges_nativeObj, double threshold1, double threshold2);

    // C++:  void GaussianBlur(Mat src, Mat& dst, Size ksize, double sigma1, double sigma2 = 0, int borderType = BORDER_DEFAULT)
    private static native void GaussianBlur_0(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height, double sigma1, double sigma2, int borderType);
    private static native void GaussianBlur_1(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height, double sigma1, double sigma2);
    private static native void GaussianBlur_2(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height, double sigma1);

    // C++:  void HoughCircles(Mat image, Mat& circles, int method, double dp, double minDist, double param1 = 100, double param2 = 100, int minRadius = 0, int maxRadius = 0)
    private static native void HoughCircles_0(long image_nativeObj, long circles_nativeObj, int method, double dp, double minDist, double param1, double param2, int minRadius, int maxRadius);
    private static native void HoughCircles_1(long image_nativeObj, long circles_nativeObj, int method, double dp, double minDist, double param1, double param2, int minRadius);
    private static native void HoughCircles_2(long image_nativeObj, long circles_nativeObj, int method, double dp, double minDist, double param1, double param2);
    private static native void HoughCircles_3(long image_nativeObj, long circles_nativeObj, int method, double dp, double minDist, double param1);
    private static native void HoughCircles_4(long image_nativeObj, long circles_nativeObj, int method, double dp, double minDist);

    // C++:  void HoughLines(Mat image, Mat& lines, double rho, double theta, int threshold, double srn = 0, double stn = 0)
    private static native void HoughLines_0(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold, double srn, double stn);
    private static native void HoughLines_1(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold, double srn);
    private static native void HoughLines_2(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold);

    // C++:  void HoughLinesP(Mat image, Mat& lines, double rho, double theta, int threshold, double minLineLength = 0, double maxLineGap = 0)
    private static native void HoughLinesP_0(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold, double minLineLength, double maxLineGap);
    private static native void HoughLinesP_1(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold, double minLineLength);
    private static native void HoughLinesP_2(long image_nativeObj, long lines_nativeObj, double rho, double theta, int threshold);

    // C++:  void HuMoments(Moments m, Mat& hu)
    private static native void HuMoments_0(long m_nativeObj, long hu_nativeObj);

    // C++:  void Laplacian(Mat src, Mat& dst, int ddepth, int ksize = 1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    private static native void Laplacian_0(long src_nativeObj, long dst_nativeObj, int ddepth, int ksize, double scale, double delta, int borderType);
    private static native void Laplacian_1(long src_nativeObj, long dst_nativeObj, int ddepth, int ksize, double scale, double delta);
    private static native void Laplacian_2(long src_nativeObj, long dst_nativeObj, int ddepth, int ksize, double scale);
    private static native void Laplacian_3(long src_nativeObj, long dst_nativeObj, int ddepth, int ksize);
    private static native void Laplacian_4(long src_nativeObj, long dst_nativeObj, int ddepth);

    // C++:  void Scharr(Mat src, Mat& dst, int ddepth, int dx, int dy, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    private static native void Scharr_0(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, double scale, double delta, int borderType);
    private static native void Scharr_1(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, double scale, double delta);
    private static native void Scharr_2(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, double scale);
    private static native void Scharr_3(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy);

    // C++:  void Sobel(Mat src, Mat& dst, int ddepth, int dx, int dy, int ksize = 3, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    private static native void Sobel_0(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, int ksize, double scale, double delta, int borderType);
    private static native void Sobel_1(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, int ksize, double scale, double delta);
    private static native void Sobel_2(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, int ksize, double scale);
    private static native void Sobel_3(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy, int ksize);
    private static native void Sobel_4(long src_nativeObj, long dst_nativeObj, int ddepth, int dx, int dy);

    // C++:  void accumulate(Mat src, Mat& dst, Mat mask = Mat())
    private static native void accumulate_0(long src_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void accumulate_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void accumulateProduct(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void accumulateProduct_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void accumulateProduct_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void accumulateSquare(Mat src, Mat& dst, Mat mask = Mat())
    private static native void accumulateSquare_0(long src_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void accumulateSquare_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void accumulateWeighted(Mat src, Mat& dst, double alpha, Mat mask = Mat())
    private static native void accumulateWeighted_0(long src_nativeObj, long dst_nativeObj, double alpha, long mask_nativeObj);
    private static native void accumulateWeighted_1(long src_nativeObj, long dst_nativeObj, double alpha);

    // C++:  void adaptiveThreshold(Mat src, Mat& dst, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C)
    private static native void adaptiveThreshold_0(long src_nativeObj, long dst_nativeObj, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C);

    // C++:  void approxPolyDP(Mat curve, Mat& approxCurve, double epsilon, bool closed)
    private static native void approxPolyDP_0(long curve_nativeObj, long approxCurve_nativeObj, double epsilon, boolean closed);

    // C++:  double arcLength(vector_Point2f curve, bool closed)
    private static native double arcLength_0(long curve_mat_nativeObj, boolean closed);

    // C++:  void bilateralFilter(Mat src, Mat& dst, int d, double sigmaColor, double sigmaSpace, int borderType = BORDER_DEFAULT)
    private static native void bilateralFilter_0(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace, int borderType);
    private static native void bilateralFilter_1(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace);

    // C++:  void blur(Mat src, Mat& dst, Size ksize, Point anchor = Point(-1,-1), int borderType = BORDER_DEFAULT)
    private static native void blur_0(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height, double anchor_x, double anchor_y, int borderType);
    private static native void blur_1(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height, double anchor_x, double anchor_y);
    private static native void blur_2(long src_nativeObj, long dst_nativeObj, double ksize_width, double ksize_height);

    // C++:  int borderInterpolate(int p, int len, int borderType)
    private static native int borderInterpolate_0(int p, int len, int borderType);

    // C++:  Rect boundingRect(vector_Point points)
    private static native double[] boundingRect_0(long points_mat_nativeObj);

    // C++:  void boxFilter(Mat src, Mat& dst, int ddepth, Size ksize, Point anchor = Point(-1,-1), bool normalize = true, int borderType = BORDER_DEFAULT)
    private static native void boxFilter_0(long src_nativeObj, long dst_nativeObj, int ddepth, double ksize_width, double ksize_height, double anchor_x, double anchor_y, boolean normalize, int borderType);
    private static native void boxFilter_1(long src_nativeObj, long dst_nativeObj, int ddepth, double ksize_width, double ksize_height, double anchor_x, double anchor_y, boolean normalize);
    private static native void boxFilter_2(long src_nativeObj, long dst_nativeObj, int ddepth, double ksize_width, double ksize_height, double anchor_x, double anchor_y);
    private static native void boxFilter_3(long src_nativeObj, long dst_nativeObj, int ddepth, double ksize_width, double ksize_height);

    // C++:  void calcBackProject(vector_Mat images, vector_int channels, Mat hist, Mat& dst, vector_float ranges, double scale)
    private static native void calcBackProject_0(long images_mat_nativeObj, long channels_mat_nativeObj, long hist_nativeObj, long dst_nativeObj, long ranges_mat_nativeObj, double scale);

    // C++:  void calcHist(vector_Mat images, vector_int channels, Mat mask, Mat& hist, vector_int histSize, vector_float ranges, bool accumulate = false)
    private static native void calcHist_0(long images_mat_nativeObj, long channels_mat_nativeObj, long mask_nativeObj, long hist_nativeObj, long histSize_mat_nativeObj, long ranges_mat_nativeObj, boolean accumulate);
    private static native void calcHist_1(long images_mat_nativeObj, long channels_mat_nativeObj, long mask_nativeObj, long hist_nativeObj, long histSize_mat_nativeObj, long ranges_mat_nativeObj);

    // C++:  double compareHist(Mat H1, Mat H2, int method)
    private static native double compareHist_0(long H1_nativeObj, long H2_nativeObj, int method);

    // C++:  double contourArea(Mat contour, bool oriented = false)
    private static native double contourArea_0(long contour_nativeObj, boolean oriented);
    private static native double contourArea_1(long contour_nativeObj);

    // C++:  void convertMaps(Mat map1, Mat map2, Mat& dstmap1, Mat& dstmap2, int dstmap1type, bool nninterpolation = false)
    private static native void convertMaps_0(long map1_nativeObj, long map2_nativeObj, long dstmap1_nativeObj, long dstmap2_nativeObj, int dstmap1type, boolean nninterpolation);
    private static native void convertMaps_1(long map1_nativeObj, long map2_nativeObj, long dstmap1_nativeObj, long dstmap2_nativeObj, int dstmap1type);

    // C++:  void convexHull(Mat points, Mat& hull, bool clockwise = false, bool returnPoints = true)
    private static native void convexHull_0(long points_nativeObj, long hull_nativeObj, boolean clockwise, boolean returnPoints);
    private static native void convexHull_1(long points_nativeObj, long hull_nativeObj, boolean clockwise);
    private static native void convexHull_2(long points_nativeObj, long hull_nativeObj);

    // C++:  void copyMakeBorder(Mat src, Mat& dst, int top, int bottom, int left, int right, int borderType, Scalar value = Scalar())
    private static native void copyMakeBorder_0(long src_nativeObj, long dst_nativeObj, int top, int bottom, int left, int right, int borderType, double value_val0, double value_val1, double value_val2, double value_val3);
    private static native void copyMakeBorder_1(long src_nativeObj, long dst_nativeObj, int top, int bottom, int left, int right, int borderType);

    // C++:  void cornerEigenValsAndVecs(Mat src, Mat& dst, int blockSize, int ksize, int borderType = BORDER_DEFAULT)
    private static native void cornerEigenValsAndVecs_0(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize, int borderType);
    private static native void cornerEigenValsAndVecs_1(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize);

    // C++:  void cornerHarris(Mat src, Mat& dst, int blockSize, int ksize, double k, int borderType = BORDER_DEFAULT)
    private static native void cornerHarris_0(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize, double k, int borderType);
    private static native void cornerHarris_1(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize, double k);

    // C++:  void cornerMinEigenVal(Mat src, Mat& dst, int blockSize, int ksize = 3, int borderType = BORDER_DEFAULT)
    private static native void cornerMinEigenVal_0(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize, int borderType);
    private static native void cornerMinEigenVal_1(long src_nativeObj, long dst_nativeObj, int blockSize, int ksize);
    private static native void cornerMinEigenVal_2(long src_nativeObj, long dst_nativeObj, int blockSize);

    // C++:  void cornerSubPix(Mat image, vector_Point2f& corners, Size winSize, Size zeroZone, TermCriteria criteria)
    private static native void cornerSubPix_0(long image_nativeObj, long corners_mat_nativeObj, double winSize_width, double winSize_height, double zeroZone_width, double zeroZone_height, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++:  void cvtColor(Mat src, Mat& dst, int code, int dstCn = 0)
    private static native void cvtColor_0(long src_nativeObj, long dst_nativeObj, int code, int dstCn);
    private static native void cvtColor_1(long src_nativeObj, long dst_nativeObj, int code);

    // C++:  void dilate(Mat src, Mat& dst, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    private static native void dilate_0(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void dilate_1(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType);
    private static native void dilate_2(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations);
    private static native void dilate_3(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y);
    private static native void dilate_4(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj);

    // C++:  void distanceTransform(Mat src, Mat& dst, Mat& labels, int distanceType, int maskSize)
    private static native void distanceTransform_0(long src_nativeObj, long dst_nativeObj, long labels_nativeObj, int distanceType, int maskSize);

    // C++:  void drawContours(Mat& image, vector_Mat contours, int contourIdx, Scalar color, int thickness = 1, int lineType = 8, Mat hierarchy = Mat(), int maxLevel = INT_MAX, Point offset = Point())
    private static native void drawContours_0(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, long hierarchy_nativeObj, int maxLevel, double offset_x, double offset_y);
    private static native void drawContours_1(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, long hierarchy_nativeObj, int maxLevel);
    private static native void drawContours_2(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, long hierarchy_nativeObj);
    private static native void drawContours_3(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType);
    private static native void drawContours_4(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void drawContours_5(long image_nativeObj, long contours_mat_nativeObj, int contourIdx, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void equalizeHist(Mat src, Mat& dst)
    private static native void equalizeHist_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void erode(Mat src, Mat& dst, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    private static native void erode_0(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void erode_1(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType);
    private static native void erode_2(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations);
    private static native void erode_3(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj, double anchor_x, double anchor_y);
    private static native void erode_4(long src_nativeObj, long dst_nativeObj, long kernel_nativeObj);

    // C++:  void filter2D(Mat src, Mat& dst, int ddepth, Mat kernel, Point anchor = Point(-1,-1), double delta = 0, int borderType = BORDER_DEFAULT)
    private static native void filter2D_0(long src_nativeObj, long dst_nativeObj, int ddepth, long kernel_nativeObj, double anchor_x, double anchor_y, double delta, int borderType);
    private static native void filter2D_1(long src_nativeObj, long dst_nativeObj, int ddepth, long kernel_nativeObj, double anchor_x, double anchor_y, double delta);
    private static native void filter2D_2(long src_nativeObj, long dst_nativeObj, int ddepth, long kernel_nativeObj, double anchor_x, double anchor_y);
    private static native void filter2D_3(long src_nativeObj, long dst_nativeObj, int ddepth, long kernel_nativeObj);

    // C++:  void findContours(Mat& image, vector_Mat& contours, Mat& hierarchy, int mode, int method, Point offset = Point())
    private static native void findContours_0(long image_nativeObj, long contours_mat_nativeObj, long hierarchy_nativeObj, int mode, int method, double offset_x, double offset_y);
    private static native void findContours_1(long image_nativeObj, long contours_mat_nativeObj, long hierarchy_nativeObj, int mode, int method);

    // C++:  RotatedRect fitEllipse(vector_Point2f points)
    private static native double[] fitEllipse_0(long points_mat_nativeObj);

    // C++:  void fitLine(Mat points, Mat& line, int distType, double param, double reps, double aeps)
    private static native void fitLine_0(long points_nativeObj, long line_nativeObj, int distType, double param, double reps, double aeps);

    // C++:  int floodFill(Mat& image, Mat& mask, Point seedPoint, Scalar newVal, Rect* rect = 0, Scalar loDiff = Scalar(), Scalar upDiff = Scalar(), int flags = 4)
    private static native int floodFill_0(long image_nativeObj, long mask_nativeObj, double seedPoint_x, double seedPoint_y, double newVal_val0, double newVal_val1, double newVal_val2, double newVal_val3, double[] rect_out, double loDiff_val0, double loDiff_val1, double loDiff_val2, double loDiff_val3, double upDiff_val0, double upDiff_val1, double upDiff_val2, double upDiff_val3, int flags);
    private static native int floodFill_1(long image_nativeObj, long mask_nativeObj, double seedPoint_x, double seedPoint_y, double newVal_val0, double newVal_val1, double newVal_val2, double newVal_val3, double[] rect_out, double loDiff_val0, double loDiff_val1, double loDiff_val2, double loDiff_val3, double upDiff_val0, double upDiff_val1, double upDiff_val2, double upDiff_val3);
    private static native int floodFill_2(long image_nativeObj, long mask_nativeObj, double seedPoint_x, double seedPoint_y, double newVal_val0, double newVal_val1, double newVal_val2, double newVal_val3, double[] rect_out, double loDiff_val0, double loDiff_val1, double loDiff_val2, double loDiff_val3);
    private static native int floodFill_3(long image_nativeObj, long mask_nativeObj, double seedPoint_x, double seedPoint_y, double newVal_val0, double newVal_val1, double newVal_val2, double newVal_val3, double[] rect_out);
    private static native int floodFill_4(long image_nativeObj, long mask_nativeObj, double seedPoint_x, double seedPoint_y, double newVal_val0, double newVal_val1, double newVal_val2, double newVal_val3);

    // C++:  Mat getAffineTransform(vector_Point2f src, vector_Point2f dst)
    private static native long getAffineTransform_0(long src_mat_nativeObj, long dst_mat_nativeObj);

    // C++:  Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize = Size(), bool centerPrincipalPoint = false)
    private static native long getDefaultNewCameraMatrix_0(long cameraMatrix_nativeObj, double imgsize_width, double imgsize_height, boolean centerPrincipalPoint);
    private static native long getDefaultNewCameraMatrix_1(long cameraMatrix_nativeObj, double imgsize_width, double imgsize_height);
    private static native long getDefaultNewCameraMatrix_2(long cameraMatrix_nativeObj);

    // C++:  void getDerivKernels(Mat& kx, Mat& ky, int dx, int dy, int ksize, bool normalize = false, int ktype = CV_32F)
    private static native void getDerivKernels_0(long kx_nativeObj, long ky_nativeObj, int dx, int dy, int ksize, boolean normalize, int ktype);
    private static native void getDerivKernels_1(long kx_nativeObj, long ky_nativeObj, int dx, int dy, int ksize, boolean normalize);
    private static native void getDerivKernels_2(long kx_nativeObj, long ky_nativeObj, int dx, int dy, int ksize);

    // C++:  Mat getGaussianKernel(int ksize, double sigma, int ktype = CV_64F)
    private static native long getGaussianKernel_0(int ksize, double sigma, int ktype);
    private static native long getGaussianKernel_1(int ksize, double sigma);

    // C++:  Mat getPerspectiveTransform(Mat src, Mat dst)
    private static native long getPerspectiveTransform_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void getRectSubPix(Mat image, Size patchSize, Point2f center, Mat& patch, int patchType = -1)
    private static native void getRectSubPix_0(long image_nativeObj, double patchSize_width, double patchSize_height, double center_x, double center_y, long patch_nativeObj, int patchType);
    private static native void getRectSubPix_1(long image_nativeObj, double patchSize_width, double patchSize_height, double center_x, double center_y, long patch_nativeObj);

    // C++:  Mat getRotationMatrix2D(Point2f center, double angle, double scale)
    private static native long getRotationMatrix2D_0(double center_x, double center_y, double angle, double scale);

    // C++:  Mat getStructuringElement(int shape, Size ksize, Point anchor = Point(-1,-1))
    private static native long getStructuringElement_0(int shape, double ksize_width, double ksize_height, double anchor_x, double anchor_y);
    private static native long getStructuringElement_1(int shape, double ksize_width, double ksize_height);

    // C++:  void goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask = Mat(), int blockSize = 3, bool useHarrisDetector = false, double k = 0.04)
    private static native void goodFeaturesToTrack_0(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, boolean useHarrisDetector, double k);
    private static native void goodFeaturesToTrack_1(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, boolean useHarrisDetector);
    private static native void goodFeaturesToTrack_2(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize);
    private static native void goodFeaturesToTrack_3(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj);
    private static native void goodFeaturesToTrack_4(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance);

    // C++:  void grabCut(Mat img, Mat& mask, Rect rect, Mat& bgdModel, Mat& fgdModel, int iterCount, int mode = GC_EVAL)
    private static native void grabCut_0(long img_nativeObj, long mask_nativeObj, int rect_x, int rect_y, int rect_width, int rect_height, long bgdModel_nativeObj, long fgdModel_nativeObj, int iterCount, int mode);
    private static native void grabCut_1(long img_nativeObj, long mask_nativeObj, int rect_x, int rect_y, int rect_width, int rect_height, long bgdModel_nativeObj, long fgdModel_nativeObj, int iterCount);

    // C++:  void initUndistortRectifyMap(Mat cameraMatrix, Mat distCoeffs, Mat R, Mat newCameraMatrix, Size size, int m1type, Mat& map1, Mat& map2)
    private static native void initUndistortRectifyMap_0(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long R_nativeObj, long newCameraMatrix_nativeObj, double size_width, double size_height, int m1type, long map1_nativeObj, long map2_nativeObj);

    // C++:  float initWideAngleProjMap(Mat cameraMatrix, Mat distCoeffs, Size imageSize, int destImageWidth, int m1type, Mat& map1, Mat& map2, int projType = PROJ_SPHERICAL_EQRECT, double alpha = 0)
    private static native float initWideAngleProjMap_0(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, int destImageWidth, int m1type, long map1_nativeObj, long map2_nativeObj, int projType, double alpha);
    private static native float initWideAngleProjMap_1(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, int destImageWidth, int m1type, long map1_nativeObj, long map2_nativeObj, int projType);
    private static native float initWideAngleProjMap_2(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, int destImageWidth, int m1type, long map1_nativeObj, long map2_nativeObj);

    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRange, int flags)
    private static native void inpaint_0(long src_nativeObj, long inpaintMask_nativeObj, long dst_nativeObj, double inpaintRange, int flags);

    // C++:  void integral(Mat src, Mat& sum, int sdepth = -1)
    private static native void integral_0(long src_nativeObj, long sum_nativeObj, int sdepth);
    private static native void integral_1(long src_nativeObj, long sum_nativeObj);

    // C++:  void integral(Mat src, Mat& sum, Mat& sqsum, int sdepth = -1)
    private static native void integral2_0(long src_nativeObj, long sum_nativeObj, long sqsum_nativeObj, int sdepth);
    private static native void integral2_1(long src_nativeObj, long sum_nativeObj, long sqsum_nativeObj);

    // C++:  void integral(Mat src, Mat& sum, Mat& sqsum, Mat& tilted, int sdepth = -1)
    private static native void integral3_0(long src_nativeObj, long sum_nativeObj, long sqsum_nativeObj, long tilted_nativeObj, int sdepth);
    private static native void integral3_1(long src_nativeObj, long sum_nativeObj, long sqsum_nativeObj, long tilted_nativeObj);

    // C++:  void invertAffineTransform(Mat M, Mat& iM)
    private static native void invertAffineTransform_0(long M_nativeObj, long iM_nativeObj);

    // C++:  bool isContourConvex(vector_Point2f contour)
    private static native boolean isContourConvex_0(long contour_mat_nativeObj);

    // C++:  double matchShapes(Mat contour1, Mat contour2, int method, double parameter)
    private static native double matchShapes_0(long contour1_nativeObj, long contour2_nativeObj, int method, double parameter);

    // C++:  void matchTemplate(Mat image, Mat templ, Mat& result, int method)
    private static native void matchTemplate_0(long image_nativeObj, long templ_nativeObj, long result_nativeObj, int method);

    // C++:  void medianBlur(Mat src, Mat& dst, int ksize)
    private static native void medianBlur_0(long src_nativeObj, long dst_nativeObj, int ksize);

    // C++:  RotatedRect minAreaRect(vector_Point2f points)
    private static native double[] minAreaRect_0(long points_mat_nativeObj);

    // C++:  void minEnclosingCircle(vector_Point2f points, Point2f& center, float& radius)
    private static native void minEnclosingCircle_0(long points_mat_nativeObj, double[] center_out, double[] radius_out);

    // C++:  Moments moments(Mat array, bool binaryImage = false)
    private static native long moments_0(long array_nativeObj, boolean binaryImage);
    private static native long moments_1(long array_nativeObj);

    // C++:  void morphologyEx(Mat src, Mat& dst, int op, Mat kernel, Point anchor = Point(-1,-1), int iterations = 1, int borderType = BORDER_CONSTANT, Scalar borderValue = morphologyDefaultBorderValue())
    private static native void morphologyEx_0(long src_nativeObj, long dst_nativeObj, int op, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void morphologyEx_1(long src_nativeObj, long dst_nativeObj, int op, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations, int borderType);
    private static native void morphologyEx_2(long src_nativeObj, long dst_nativeObj, int op, long kernel_nativeObj, double anchor_x, double anchor_y, int iterations);
    private static native void morphologyEx_3(long src_nativeObj, long dst_nativeObj, int op, long kernel_nativeObj, double anchor_x, double anchor_y);
    private static native void morphologyEx_4(long src_nativeObj, long dst_nativeObj, int op, long kernel_nativeObj);

    // C++:  double pointPolygonTest(vector_Point2f contour, Point2f pt, bool measureDist)
    private static native double pointPolygonTest_0(long contour_mat_nativeObj, double pt_x, double pt_y, boolean measureDist);

    // C++:  void preCornerDetect(Mat src, Mat& dst, int ksize, int borderType = BORDER_DEFAULT)
    private static native void preCornerDetect_0(long src_nativeObj, long dst_nativeObj, int ksize, int borderType);
    private static native void preCornerDetect_1(long src_nativeObj, long dst_nativeObj, int ksize);

    // C++:  void pyrDown(Mat src, Mat& dst, Size dstsize = Size())
    private static native void pyrDown_0(long src_nativeObj, long dst_nativeObj, double dstsize_width, double dstsize_height);
    private static native void pyrDown_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void pyrMeanShiftFiltering(Mat src, Mat& dst, double sp, double sr, int maxLevel = 1, TermCriteria termcrit = TermCriteria( TermCriteria::MAX_ITER+TermCriteria::EPS,5,1))
    private static native void pyrMeanShiftFiltering_0(long src_nativeObj, long dst_nativeObj, double sp, double sr, int maxLevel, int termcrit_type, int termcrit_maxCount, double termcrit_epsilon);
    private static native void pyrMeanShiftFiltering_1(long src_nativeObj, long dst_nativeObj, double sp, double sr, int maxLevel);
    private static native void pyrMeanShiftFiltering_2(long src_nativeObj, long dst_nativeObj, double sp, double sr);

    // C++:  void pyrUp(Mat src, Mat& dst, Size dstsize = Size())
    private static native void pyrUp_0(long src_nativeObj, long dst_nativeObj, double dstsize_width, double dstsize_height);
    private static native void pyrUp_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void remap(Mat src, Mat& dst, Mat map1, Mat map2, int interpolation, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    private static native void remap_0(long src_nativeObj, long dst_nativeObj, long map1_nativeObj, long map2_nativeObj, int interpolation, int borderMode, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void remap_1(long src_nativeObj, long dst_nativeObj, long map1_nativeObj, long map2_nativeObj, int interpolation, int borderMode);
    private static native void remap_2(long src_nativeObj, long dst_nativeObj, long map1_nativeObj, long map2_nativeObj, int interpolation);

    // C++:  void resize(Mat src, Mat& dst, Size dsize, double fx = 0, double fy = 0, int interpolation = INTER_LINEAR)
    private static native void resize_0(long src_nativeObj, long dst_nativeObj, double dsize_width, double dsize_height, double fx, double fy, int interpolation);
    private static native void resize_1(long src_nativeObj, long dst_nativeObj, double dsize_width, double dsize_height, double fx, double fy);
    private static native void resize_2(long src_nativeObj, long dst_nativeObj, double dsize_width, double dsize_height, double fx);
    private static native void resize_3(long src_nativeObj, long dst_nativeObj, double dsize_width, double dsize_height);

    // C++:  void sepFilter2D(Mat src, Mat& dst, int ddepth, Mat kernelX, Mat kernelY, Point anchor = Point(-1,-1), double delta = 0, int borderType = BORDER_DEFAULT)
    private static native void sepFilter2D_0(long src_nativeObj, long dst_nativeObj, int ddepth, long kernelX_nativeObj, long kernelY_nativeObj, double anchor_x, double anchor_y, double delta, int borderType);
    private static native void sepFilter2D_1(long src_nativeObj, long dst_nativeObj, int ddepth, long kernelX_nativeObj, long kernelY_nativeObj, double anchor_x, double anchor_y, double delta);
    private static native void sepFilter2D_2(long src_nativeObj, long dst_nativeObj, int ddepth, long kernelX_nativeObj, long kernelY_nativeObj, double anchor_x, double anchor_y);
    private static native void sepFilter2D_3(long src_nativeObj, long dst_nativeObj, int ddepth, long kernelX_nativeObj, long kernelY_nativeObj);

    // C++:  double threshold(Mat src, Mat& dst, double thresh, double maxval, int type)
    private static native double threshold_0(long src_nativeObj, long dst_nativeObj, double thresh, double maxval, int type);

    // C++:  void undistort(Mat src, Mat& dst, Mat cameraMatrix, Mat distCoeffs, Mat newCameraMatrix = Mat())
    private static native void undistort_0(long src_nativeObj, long dst_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long newCameraMatrix_nativeObj);
    private static native void undistort_1(long src_nativeObj, long dst_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  void warpAffine(Mat src, Mat& dst, Mat M, Size dsize, int flags = INTER_LINEAR, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    private static native void warpAffine_0(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags, int borderMode, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void warpAffine_1(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags, int borderMode);
    private static native void warpAffine_2(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags);
    private static native void warpAffine_3(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height);

    // C++:  void warpPerspective(Mat src, Mat& dst, Mat M, Size dsize, int flags = INTER_LINEAR, int borderMode = BORDER_CONSTANT, Scalar borderValue = Scalar())
    private static native void warpPerspective_0(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags, int borderMode, double borderValue_val0, double borderValue_val1, double borderValue_val2, double borderValue_val3);
    private static native void warpPerspective_1(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags, int borderMode);
    private static native void warpPerspective_2(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height, int flags);
    private static native void warpPerspective_3(long src_nativeObj, long dst_nativeObj, long M_nativeObj, double dsize_width, double dsize_height);

    // C++:  void watershed(Mat image, Mat& markers)
    private static native void watershed_0(long image_nativeObj, long markers_nativeObj);

}
