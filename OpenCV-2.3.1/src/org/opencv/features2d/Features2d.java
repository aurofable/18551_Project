
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.utils.Converters;

public class Features2d {

    public static final int
            DRAW_OVER_OUTIMG = 1,
            NOT_DRAW_SINGLE_POINTS = 2,
            DRAW_RICH_KEYPOINTS = 4;


    //
    // C++:  void drawKeypoints(Mat image, vector_KeyPoint keypoints, Mat outImage, Scalar color = Scalar::all(-1), int flags = 0)
    //

/**
 * Draws keypoints.
 *
 * @param image Source image.
 * @param keypoints Keypoints from the source image.
 * @param outImage a outImage
 * @param color Color of keypoints.
 * @param flags Flags setting drawing features. Possible "flags" bit values are
 * defined by "DrawMatchesFlags". See details above in "drawMatches".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawkeypoints">org.opencv.features2d.Features2d.drawKeypoints</a>
 */
    public static void drawKeypoints(Mat image, List<KeyPoint> keypoints, Mat outImage, Scalar color, int flags)
    {
        Mat keypoints_mat = Converters.vector_KeyPoint_to_Mat(keypoints);
        drawKeypoints_0(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], flags);

        return;
    }

/**
 * Draws keypoints.
 *
 * @param image Source image.
 * @param keypoints Keypoints from the source image.
 * @param outImage a outImage
 * @param color Color of keypoints.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawkeypoints">org.opencv.features2d.Features2d.drawKeypoints</a>
 */
    public static void drawKeypoints(Mat image, List<KeyPoint> keypoints, Mat outImage, Scalar color)
    {
        Mat keypoints_mat = Converters.vector_KeyPoint_to_Mat(keypoints);
        drawKeypoints_1(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }

/**
 * Draws keypoints.
 *
 * @param image Source image.
 * @param keypoints Keypoints from the source image.
 * @param outImage a outImage
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawkeypoints">org.opencv.features2d.Features2d.drawKeypoints</a>
 */
    public static void drawKeypoints(Mat image, List<KeyPoint> keypoints, Mat outImage)
    {
        Mat keypoints_mat = Converters.vector_KeyPoint_to_Mat(keypoints);
        drawKeypoints_2(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj);

        return;
    }


    //
    // C++:  void drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = vector<char>(), int flags = 0)
    //

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 * @param matchesMask Mask determining which matches are drawn. If the mask is
 * empty, all matches are drawn.
 * @param flags Flags setting drawing features. Possible "flags" bit values are
 * defined by "DrawMatchesFlags".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<DMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<Byte> matchesMask, int flags)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        Mat matches1to2_mat = Converters.vector_DMatch_to_Mat(matches1to2);
        Mat matchesMask_mat = Converters.vector_char_to_Mat(matchesMask);
        drawMatches_0(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 * @param matchesMask Mask determining which matches are drawn. If the mask is
 * empty, all matches are drawn.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<DMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<Byte> matchesMask)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        Mat matches1to2_mat = Converters.vector_DMatch_to_Mat(matches1to2);
        Mat matchesMask_mat = Converters.vector_char_to_Mat(matchesMask);
        drawMatches_1(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<DMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        Mat matches1to2_mat = Converters.vector_DMatch_to_Mat(matches1to2);
        drawMatches_2(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<DMatch> matches1to2, Mat outImg, Scalar matchColor)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        Mat matches1to2_mat = Converters.vector_DMatch_to_Mat(matches1to2);
        drawMatches_3(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<DMatch> matches1to2, Mat outImg)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        Mat matches1to2_mat = Converters.vector_DMatch_to_Mat(matches1to2);
        drawMatches_4(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj);

        return;
    }


    //
    // C++:  void drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_vector_DMatch matches1to2, Mat outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_vector_char matchesMask = vector<vector<char> >(), int flags = 0)
    //

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 * @param matchesMask Mask determining which matches are drawn. If the mask is
 * empty, all matches are drawn.
 * @param flags Flags setting drawing features. Possible "flags" bit values are
 * defined by "DrawMatchesFlags".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches2(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<List<DMatch>> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<List<Byte>> matchesMask, int flags)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        List<Mat> matchesMask_tmplm = new ArrayList<Mat>((matchesMask != null) ? matchesMask.size() : 0);
        Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
        drawMatches2_0(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 * @param matchesMask Mask determining which matches are drawn. If the mask is
 * empty, all matches are drawn.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches2(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<List<DMatch>> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<List<Byte>> matchesMask)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        List<Mat> matchesMask_tmplm = new ArrayList<Mat>((matchesMask != null) ? matchesMask.size() : 0);
        Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
        drawMatches2_1(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 * @param singlePointColor Color of single keypoints (circles), which means that
 * keypoints do not have the matches. If "singlePointColor==Scalar.all(-1)",
 * the color is generated randomly.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches2(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<List<DMatch>> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatches2_2(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 * @param matchColor Color of matches (lines and connected keypoints). If
 * "matchColor==Scalar.all(-1)", the color is generated randomly.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches2(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<List<DMatch>> matches1to2, Mat outImg, Scalar matchColor)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatches2_3(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);

        return;
    }

/**
 * Draws the found matches of keypoints from two images.
 *
 * This function draws matches of keypoints from two images in the output image.
 * Match is a line connecting two keypoints (circles). The structure
 * "DrawMatchesFlags" is defined as follows:
 *
 * @param img1 First source image.
 * @param keypoints1 Keypoints from the first source image.
 * @param img2 Second source image.
 * @param keypoints2 Keypoints from the second source image.
 * @param matches1to2 a matches1to2
 * @param outImg Output image. Its content depends on the "flags" value defining
 * what is drawn in the output image. See possible "flags" bit values below.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/drawing_function_of_keypoints_and_matches.html#drawmatches">org.opencv.features2d.Features2d.drawMatches</a>
 */
    public static void drawMatches2(Mat img1, List<KeyPoint> keypoints1, Mat img2, List<KeyPoint> keypoints2, List<List<DMatch>> matches1to2, Mat outImg)
    {
        Mat keypoints1_mat = Converters.vector_KeyPoint_to_Mat(keypoints1);
        Mat keypoints2_mat = Converters.vector_KeyPoint_to_Mat(keypoints2);
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatches2_4(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj);

        return;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  void drawKeypoints(Mat image, vector_KeyPoint keypoints, Mat outImage, Scalar color = Scalar::all(-1), int flags = 0)
    private static native void drawKeypoints_0(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int flags);
    private static native void drawKeypoints_1(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);
    private static native void drawKeypoints_2(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj);

    // C++:  void drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = vector<char>(), int flags = 0)
    private static native void drawMatches_0(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj, int flags);
    private static native void drawMatches_1(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj);
    private static native void drawMatches_2(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3);
    private static native void drawMatches_3(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3);
    private static native void drawMatches_4(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj);

    // C++:  void drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_vector_DMatch matches1to2, Mat outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_vector_char matchesMask = vector<vector<char> >(), int flags = 0)
    private static native void drawMatches2_0(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj, int flags);
    private static native void drawMatches2_1(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj);
    private static native void drawMatches2_2(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3);
    private static native void drawMatches2_3(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3);
    private static native void drawMatches2_4(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj);

}
