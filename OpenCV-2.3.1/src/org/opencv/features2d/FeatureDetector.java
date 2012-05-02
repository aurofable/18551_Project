
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class javaFeatureDetector
/**
 * Abstract base class for 2D image feature detectors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector">org.opencv.features2d.FeatureDetector</a>
 */
public class FeatureDetector {

    protected final long nativeObj;
    protected FeatureDetector(long addr) { nativeObj = addr; }


    private static final int
            GRIDRETECTOR = 1000,
            PYRAMIDDETECTOR = 2000,
            DYNAMICDETECTOR = 3000;


    public static final int
            FAST = 1,
            STAR = 2,
            SIFT = 3,
            SURF = 4,
            ORB = 5,
            MSER = 6,
            GFTT = 7,
            HARRIS = 8,
            SIMPLEBLOB = 9,
            DENSE = 10,
            GRID_FAST = GRIDRETECTOR + FAST,
            GRID_STAR = GRIDRETECTOR + STAR,
            GRID_SIFT = GRIDRETECTOR + SIFT,
            GRID_SURF = GRIDRETECTOR + SURF,
            GRID_ORB = GRIDRETECTOR + ORB,
            GRID_MSER = GRIDRETECTOR + MSER,
            GRID_GFTT = GRIDRETECTOR + GFTT,
            GRID_HARRIS = GRIDRETECTOR + HARRIS,
            GRID_SIMPLEBLOB = GRIDRETECTOR + SIMPLEBLOB,
            GRID_DENSE = GRIDRETECTOR + DENSE,
            PYRAMID_FAST = PYRAMIDDETECTOR + FAST,
            PYRAMID_STAR = PYRAMIDDETECTOR + STAR,
            PYRAMID_SIFT = PYRAMIDDETECTOR + SIFT,
            PYRAMID_SURF = PYRAMIDDETECTOR + SURF,
            PYRAMID_ORB = PYRAMIDDETECTOR + ORB,
            PYRAMID_MSER = PYRAMIDDETECTOR + MSER,
            PYRAMID_GFTT = PYRAMIDDETECTOR + GFTT,
            PYRAMID_HARRIS = PYRAMIDDETECTOR + HARRIS,
            PYRAMID_SIMPLEBLOB = PYRAMIDDETECTOR + SIMPLEBLOB,
            PYRAMID_DENSE = PYRAMIDDETECTOR + DENSE,
            DYNAMIC_FAST = DYNAMICDETECTOR + FAST,
            DYNAMIC_STAR = DYNAMICDETECTOR + STAR,
            DYNAMIC_SIFT = DYNAMICDETECTOR + SIFT,
            DYNAMIC_SURF = DYNAMICDETECTOR + SURF,
            DYNAMIC_ORB = DYNAMICDETECTOR + ORB,
            DYNAMIC_MSER = DYNAMICDETECTOR + MSER,
            DYNAMIC_GFTT = DYNAMICDETECTOR + GFTT,
            DYNAMIC_HARRIS = DYNAMICDETECTOR + HARRIS,
            DYNAMIC_SIMPLEBLOB = DYNAMICDETECTOR + SIMPLEBLOB,
            DYNAMIC_DENSE = DYNAMICDETECTOR + DENSE;


    //
    // C++: static javaFeatureDetector* javaFeatureDetector::create(int detectorType)
    //

/**
 * Creates a feature detector by its name.
 *
 * The following detector types are supported:
 *   * "FAST" -- "FastFeatureDetector"
 *   * "STAR" -- "StarFeatureDetector"
 *   * "SIFT" -- "SiftFeatureDetector"
 *   * "SURF" -- "SurfFeatureDetector"
 *   * "ORB" -- "OrbFeatureDetector"
 *   * "MSER" -- "MserFeatureDetector"
 *   * "GFTT" -- "GfttFeatureDetector"
 *   * "HARRIS" -- "HarrisFeatureDetector"
 *
 * Also a combined format is supported: feature detector adapter name ("Grid" --
 * "GridAdaptedFeatureDetector", "Pyramid" -- "PyramidAdaptedFeatureDetector") +
 * feature detector name (see above), for example: "GridFAST", "PyramidSTAR".
 *
 * @param detectorType Feature detector type.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-create">org.opencv.features2d.FeatureDetector.create</a>
 */
    public static FeatureDetector create(int detectorType)
    {

        FeatureDetector retVal = new FeatureDetector(create_0(detectorType));

        return retVal;
    }


    //
    // C++:  void javaFeatureDetector::detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    //

/**
 * Detects keypoints in an image (first variant) or image set (second variant).
 *
 * @param image Image.
 * @param keypoints The detected keypoints. In the second variant of the method
 * "keypoints[i]" is a set of keypoints detected in "images[i]".
 * @param mask Mask specifying where to look for keypoints (optional). It must
 * be a 8-bit integer matrix with non-zero values in the region of interest.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(Mat image, List<KeyPoint> keypoints, Mat mask)
    {
        Mat keypoints_mat = new Mat();
        detect_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, mask.nativeObj);
        Converters.Mat_to_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }

/**
 * Detects keypoints in an image (first variant) or image set (second variant).
 *
 * @param image Image.
 * @param keypoints The detected keypoints. In the second variant of the method
 * "keypoints[i]" is a set of keypoints detected in "images[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(Mat image, List<KeyPoint> keypoints)
    {
        Mat keypoints_mat = new Mat();
        detect_1(nativeObj, image.nativeObj, keypoints_mat.nativeObj);
        Converters.Mat_to_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }


    //
    // C++:  void javaFeatureDetector::detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = vector<Mat>())
    //

/**
 * Detects keypoints in an image (first variant) or image set (second variant).
 *
 * @param images Image set.
 * @param keypoints The detected keypoints. In the second variant of the method
 * "keypoints[i]" is a set of keypoints detected in "images[i]".
 * @param masks Masks for each input image specifying where to look for
 * keypoints (optional). "masks[i]" is a mask for "images[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(List<Mat> images, List<List<KeyPoint>> keypoints, List<Mat> masks)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        detect_2(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }

/**
 * Detects keypoints in an image (first variant) or image set (second variant).
 *
 * @param images Image set.
 * @param keypoints The detected keypoints. In the second variant of the method
 * "keypoints[i]" is a set of keypoints detected in "images[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(List<Mat> images, List<List<KeyPoint>> keypoints)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        detect_3(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }


    //
    // C++:  bool javaFeatureDetector::empty()
    //

    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void javaFeatureDetector::read(string fileName)
    //

/**
 * Reads a feature detector object from a file node.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-read">org.opencv.features2d.FeatureDetector.read</a>
 */
    public  void read(String fileName)
    {

        read_0(nativeObj, fileName);

        return;
    }


    //
    // C++:  void javaFeatureDetector::write(string fileName)
    //

/**
 * Writes a feature detector object to a file storage.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-write">org.opencv.features2d.FeatureDetector.write</a>
 */
    public  void write(String fileName)
    {

        write_0(nativeObj, fileName);

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

    // C++: static javaFeatureDetector* javaFeatureDetector::create(int detectorType)
    private static native long create_0(int detectorType);

    // C++:  void javaFeatureDetector::detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    private static native void detect_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long mask_nativeObj);
    private static native void detect_1(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj);

    // C++:  void javaFeatureDetector::detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = vector<Mat>())
    private static native void detect_2(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long masks_mat_nativeObj);
    private static native void detect_3(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj);

    // C++:  bool javaFeatureDetector::empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  void javaFeatureDetector::read(string fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void javaFeatureDetector::write(string fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
