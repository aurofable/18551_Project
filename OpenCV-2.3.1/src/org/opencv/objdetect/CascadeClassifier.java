
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.lang.String;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Size;
import org.opencv.utils.Converters;

// C++: class CascadeClassifier
/**
 * Cascade classifier class for object detection.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier">org.opencv.objdetect.CascadeClassifier</a>
 */
public class CascadeClassifier {

    protected final long nativeObj;
    protected CascadeClassifier(long addr) { nativeObj = addr; }


    //
    // C++:   CascadeClassifier::CascadeClassifier()
    //

/**
 * Loads a classifier from a file.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-cascadeclassifier">org.opencv.objdetect.CascadeClassifier.CascadeClassifier</a>
 */
    public   CascadeClassifier()
    {

        nativeObj = CascadeClassifier_0();

        return;
    }


    //
    // C++:   CascadeClassifier::CascadeClassifier(string filename)
    //

/**
 * Loads a classifier from a file.
 *
 * @param filename Name of the file from which the classifier is loaded.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-cascadeclassifier">org.opencv.objdetect.CascadeClassifier.CascadeClassifier</a>
 */
    public   CascadeClassifier(String filename)
    {

        nativeObj = CascadeClassifier_1(filename);

        return;
    }


    //
    // C++:  void CascadeClassifier::detectMultiScale(Mat image, vector_Rect& objects, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    //

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_0(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, double scaleFactor, int minNeighbors, int flags, Size minSize)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_1(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, double scaleFactor, int minNeighbors, int flags)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_2(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor, minNeighbors, flags);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, double scaleFactor, int minNeighbors)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_3(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor, minNeighbors);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, double scaleFactor)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_4(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects)
    {
        Mat objects_mat = new Mat();
        detectMultiScale_5(nativeObj, image.nativeObj, objects_mat.nativeObj);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }


    //
    // C++:  void CascadeClassifier::detectMultiScale(Mat image, vector_Rect& objects, vector_int rejectLevels, vector_double levelWeights, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size(), bool outputRejectLevels = false)
    //

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 * @param outputRejectLevels a outputRejectLevels
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize, boolean outputRejectLevels)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_6(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height, outputRejectLevels);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_7(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_8(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function "cvHaarDetectObjects". It is not used for a new cascade.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor, int minNeighbors, int flags)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_9(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors, flags);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candiate
 * rectangle should have to retain it.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor, int minNeighbors)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_10(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights, double scaleFactor)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_11(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }

/**
 * Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.
 *
 * @param image Matrix of the type "CV_8U" containing an image where objects are
 * detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, List<Rect> objects, List<Integer> rejectLevels, List<Double> levelWeights)
    {
        Mat objects_mat = new Mat();
        Mat rejectLevels_mat = Converters.vector_int_to_Mat(rejectLevels);
        Mat levelWeights_mat = Converters.vector_double_to_Mat(levelWeights);
        detectMultiScale_12(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj);
        Converters.Mat_to_vector_Rect(objects_mat, objects);
        return;
    }


    //
    // C++:  bool CascadeClassifier::empty()
    //

/**
 * Checks whether the classifier has been loaded.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-empty">org.opencv.objdetect.CascadeClassifier.empty</a>
 */
    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  bool CascadeClassifier::load(string filename)
    //

/**
 * Loads a classifier from a file.
 *
 * @param filename Name of the file from which the classifier is loaded. The
 * file may contain an old HAAR classifier trained by the haartraining
 * application or a new cascade classifier trained by the traincascade
 * application.
 *
 * @see <a href="http://opencv.itseez.com/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-load">org.opencv.objdetect.CascadeClassifier.load</a>
 */
    public  boolean load(String filename)
    {

        boolean retVal = load_0(nativeObj, filename);

        return retVal;
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

    // C++:   CascadeClassifier::CascadeClassifier()
    private static native long CascadeClassifier_0();

    // C++:   CascadeClassifier::CascadeClassifier(string filename)
    private static native long CascadeClassifier_1(String filename);

    // C++:  void CascadeClassifier::detectMultiScale(Mat image, vector_Rect& objects, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    private static native void detectMultiScale_0(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height);
    private static native void detectMultiScale_1(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height);
    private static native void detectMultiScale_2(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor, int minNeighbors, int flags);
    private static native void detectMultiScale_3(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor, int minNeighbors);
    private static native void detectMultiScale_4(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor);
    private static native void detectMultiScale_5(long nativeObj, long image_nativeObj, long objects_mat_nativeObj);

    // C++:  void CascadeClassifier::detectMultiScale(Mat image, vector_Rect& objects, vector_int rejectLevels, vector_double levelWeights, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size(), bool outputRejectLevels = false)
    private static native void detectMultiScale_6(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height, boolean outputRejectLevels);
    private static native void detectMultiScale_7(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height);
    private static native void detectMultiScale_8(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height);
    private static native void detectMultiScale_9(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors, int flags);
    private static native void detectMultiScale_10(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors);
    private static native void detectMultiScale_11(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor);
    private static native void detectMultiScale_12(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj);

    // C++:  bool CascadeClassifier::empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  bool CascadeClassifier::load(string filename)
    private static native boolean load_0(long nativeObj, String filename);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
