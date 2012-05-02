
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.utils.Converters;

public class Objdetect {

    public static final int
            CASCADE_DO_CANNY_PRUNING = 1,
            CASCADE_SCALE_IMAGE = 2,
            CASCADE_FIND_BIGGEST_OBJECT = 4,
            CASCADE_DO_ROUGH_SEARCH = 8;


    //
    // C++:  void groupRectangles(vector_Rect& rectList, int groupThreshold, double eps = 0.2)
    //

/**
 * Groups the object candidate rectangles.
 *
 * The function is a wrapper for the generic function "partition". It clusters
 * all the input rectangles using the rectangle equivalence criteria that
 * combines rectangles with similar sizes and similar locations. The similarity
 * is defined by "eps". When "eps=0", no clustering is done at all. If eps->
 * +inf, all the rectangles are put in one cluster. Then, the small clusters
 * containing less than or equal to "groupThreshold" rectangles are rejected. In
 * each other cluster, the average rectangle is computed and put into the output
 * rectangle list.
 *
 * @param rectList Input/output vector of rectangles. Output vector includes
 * retained and grouped rectangles.
 * @param groupThreshold Minimum possible number of rectangles minus 1. The
 * threshold is used in a group of rectangles to retain it.
 * @param eps Relative difference between sides of the rectangles to merge them
 * into a group.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#grouprectangles">org.opencv.objdetect.Objdetect.groupRectangles</a>
 */
    public static void groupRectangles(List<Rect> rectList, int groupThreshold, double eps)
    {
        Mat rectList_mat = Converters.vector_Rect_to_Mat(rectList);
        groupRectangles_0(rectList_mat.nativeObj, groupThreshold, eps);
        Converters.Mat_to_vector_Rect(rectList_mat, rectList);
        return;
    }

/**
 * Groups the object candidate rectangles.
 *
 * The function is a wrapper for the generic function "partition". It clusters
 * all the input rectangles using the rectangle equivalence criteria that
 * combines rectangles with similar sizes and similar locations. The similarity
 * is defined by "eps". When "eps=0", no clustering is done at all. If eps->
 * +inf, all the rectangles are put in one cluster. Then, the small clusters
 * containing less than or equal to "groupThreshold" rectangles are rejected. In
 * each other cluster, the average rectangle is computed and put into the output
 * rectangle list.
 *
 * @param rectList Input/output vector of rectangles. Output vector includes
 * retained and grouped rectangles.
 * @param groupThreshold Minimum possible number of rectangles minus 1. The
 * threshold is used in a group of rectangles to retain it.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#grouprectangles">org.opencv.objdetect.Objdetect.groupRectangles</a>
 */
    public static void groupRectangles(List<Rect> rectList, int groupThreshold)
    {
        Mat rectList_mat = Converters.vector_Rect_to_Mat(rectList);
        groupRectangles_1(rectList_mat.nativeObj, groupThreshold);
        Converters.Mat_to_vector_Rect(rectList_mat, rectList);
        return;
    }


    //
    // C++:  void groupRectangles(vector_Rect& rectList, vector_int& weights, int groupThreshold, double eps = 0.2)
    //

/**
 * Groups the object candidate rectangles.
 *
 * The function is a wrapper for the generic function "partition". It clusters
 * all the input rectangles using the rectangle equivalence criteria that
 * combines rectangles with similar sizes and similar locations. The similarity
 * is defined by "eps". When "eps=0", no clustering is done at all. If eps->
 * +inf, all the rectangles are put in one cluster. Then, the small clusters
 * containing less than or equal to "groupThreshold" rectangles are rejected. In
 * each other cluster, the average rectangle is computed and put into the output
 * rectangle list.
 *
 * @param rectList Input/output vector of rectangles. Output vector includes
 * retained and grouped rectangles.
 * @param weights a weights
 * @param groupThreshold Minimum possible number of rectangles minus 1. The
 * threshold is used in a group of rectangles to retain it.
 * @param eps Relative difference between sides of the rectangles to merge them
 * into a group.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#grouprectangles">org.opencv.objdetect.Objdetect.groupRectangles</a>
 */
    public static void groupRectangles(List<Rect> rectList, List<Integer> weights, int groupThreshold, double eps)
    {
        Mat rectList_mat = Converters.vector_Rect_to_Mat(rectList);
        Mat weights_mat = new Mat();
        groupRectangles_2(rectList_mat.nativeObj, weights_mat.nativeObj, groupThreshold, eps);
        Converters.Mat_to_vector_Rect(rectList_mat, rectList);
        Converters.Mat_to_vector_int(weights_mat, weights);
        return;
    }

/**
 * Groups the object candidate rectangles.
 *
 * The function is a wrapper for the generic function "partition". It clusters
 * all the input rectangles using the rectangle equivalence criteria that
 * combines rectangles with similar sizes and similar locations. The similarity
 * is defined by "eps". When "eps=0", no clustering is done at all. If eps->
 * +inf, all the rectangles are put in one cluster. Then, the small clusters
 * containing less than or equal to "groupThreshold" rectangles are rejected. In
 * each other cluster, the average rectangle is computed and put into the output
 * rectangle list.
 *
 * @param rectList Input/output vector of rectangles. Output vector includes
 * retained and grouped rectangles.
 * @param weights a weights
 * @param groupThreshold Minimum possible number of rectangles minus 1. The
 * threshold is used in a group of rectangles to retain it.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#grouprectangles">org.opencv.objdetect.Objdetect.groupRectangles</a>
 */
    public static void groupRectangles(List<Rect> rectList, List<Integer> weights, int groupThreshold)
    {
        Mat rectList_mat = Converters.vector_Rect_to_Mat(rectList);
        Mat weights_mat = new Mat();
        groupRectangles_3(rectList_mat.nativeObj, weights_mat.nativeObj, groupThreshold);
        Converters.Mat_to_vector_Rect(rectList_mat, rectList);
        Converters.Mat_to_vector_int(weights_mat, weights);
        return;
    }


    //
    // C++:  void groupRectangles(vector_Rect rectList, int groupThreshold, double eps, vector_int* weights, vector_double* levelWeights)
    //

/**
 * Groups the object candidate rectangles.
 *
 * The function is a wrapper for the generic function "partition". It clusters
 * all the input rectangles using the rectangle equivalence criteria that
 * combines rectangles with similar sizes and similar locations. The similarity
 * is defined by "eps". When "eps=0", no clustering is done at all. If eps->
 * +inf, all the rectangles are put in one cluster. Then, the small clusters
 * containing less than or equal to "groupThreshold" rectangles are rejected. In
 * each other cluster, the average rectangle is computed and put into the output
 * rectangle list.
 *
 * @param rectList Input/output vector of rectangles. Output vector includes
 * retained and grouped rectangles.
 * @param groupThreshold Minimum possible number of rectangles minus 1. The
 * threshold is used in a group of rectangles to retain it.
 * @param eps Relative difference between sides of the rectangles to merge them
 * into a group.
 * @param weights a weights
 * @param levelWeights a levelWeights
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#grouprectangles">org.opencv.objdetect.Objdetect.groupRectangles</a>
 */
    public static void groupRectangles(List<Rect> rectList, int groupThreshold, double eps, List<Integer> weights, List<Double> levelWeights)
    {
        Mat rectList_mat = Converters.vector_Rect_to_Mat(rectList);
        Mat weights_mat = Converters.vector_int_to_Mat(weights);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        groupRectangles_4(rectList_mat.nativeObj, groupThreshold, eps, weights_mat.nativeObj, levelWeights_mat.nativeObj);

        return;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  void groupRectangles(vector_Rect& rectList, int groupThreshold, double eps = 0.2)
    private static native void groupRectangles_0(long rectList_mat_nativeObj, int groupThreshold, double eps);
    private static native void groupRectangles_1(long rectList_mat_nativeObj, int groupThreshold);

    // C++:  void groupRectangles(vector_Rect& rectList, vector_int& weights, int groupThreshold, double eps = 0.2)
    private static native void groupRectangles_2(long rectList_mat_nativeObj, long weights_mat_nativeObj, int groupThreshold, double eps);
    private static native void groupRectangles_3(long rectList_mat_nativeObj, long weights_mat_nativeObj, int groupThreshold);

    // C++:  void groupRectangles(vector_Rect rectList, int groupThreshold, double eps, vector_int* weights, vector_double* levelWeights)
    private static native void groupRectangles_4(long rectList_mat_nativeObj, int groupThreshold, double eps, long weights_mat_nativeObj, long levelWeights_mat_nativeObj);

}
