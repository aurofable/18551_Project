
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class javaDescriptorExtractor
/**
 * Abstract base class for computing descriptors for image keypoints.
 *
 * In this interface, a keypoint descriptor can be represented as a dense,
 * fixed-dimension vector of a basic type. Most descriptors follow this pattern
 * as it simplifies computing distances between descriptors. Therefore, a
 * collection of descriptors is represented as "Mat", where each row is a
 * keypoint descriptor.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor">org.opencv.features2d.DescriptorExtractor</a>
 */
public class DescriptorExtractor {

    protected final long nativeObj;
    protected DescriptorExtractor(long addr) { nativeObj = addr; }


    private static final int
            OPPONENTEXTRACTOR = 1000;


    public static final int
            SIFT = 1,
            SURF = 2,
            ORB = 3,
            BRIEF = 4,
            OPPONENT_SIFT = OPPONENTEXTRACTOR + SIFT,
            OPPONENT_SURF = OPPONENTEXTRACTOR + SURF,
            OPPONENT_ORB = OPPONENTEXTRACTOR + ORB,
            OPPONENT_BRIEF = OPPONENTEXTRACTOR + BRIEF;


    //
    // C++:  void javaDescriptorExtractor::compute(Mat image, vector_KeyPoint keypoints, Mat descriptors)
    //

/**
 * Computes the descriptors for a set of keypoints detected in an image (first
 * variant) or image set (second variant).
 *
 * @param image Image.
 * @param keypoints Input collection of keypoints. Keypoints for which a
 * descriptor cannot be computed are removed. Sometimes new keypoints can be
 * added, for example: "SIFT" duplicates keypoint with several dominant
 * orientations (for each orientation).
 * @param descriptors Computed descriptors. In the second variant of the method
 * "descriptors[i]" are descriptors computed for a "keypoints[i]". Row "j" is
 * the "keypoints" (or "keypoints[i]") is the descriptor for keypoint "j"-th
 * keypoint.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-compute">org.opencv.features2d.DescriptorExtractor.compute</a>
 */
    public  void compute(Mat image, List<KeyPoint> keypoints, Mat descriptors)
    {
        Mat keypoints_mat = Converters.vector_KeyPoint_to_Mat(keypoints);
        compute_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, descriptors.nativeObj);

        return;
    }


    //
    // C++:  void javaDescriptorExtractor::compute(vector_Mat images, vector_vector_KeyPoint keypoints, vector_Mat& descriptors)
    //

/**
 * Computes the descriptors for a set of keypoints detected in an image (first
 * variant) or image set (second variant).
 *
 * @param images Image set.
 * @param keypoints Input collection of keypoints. Keypoints for which a
 * descriptor cannot be computed are removed. Sometimes new keypoints can be
 * added, for example: "SIFT" duplicates keypoint with several dominant
 * orientations (for each orientation).
 * @param descriptors Computed descriptors. In the second variant of the method
 * "descriptors[i]" are descriptors computed for a "keypoints[i]". Row "j" is
 * the "keypoints" (or "keypoints[i]") is the descriptor for keypoint "j"-th
 * keypoint.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-compute">org.opencv.features2d.DescriptorExtractor.compute</a>
 */
    public  void compute(List<Mat> images, List<List<KeyPoint>> keypoints, List<Mat> descriptors)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        List<Mat> keypoints_tmplm = new ArrayList<Mat>((keypoints != null) ? keypoints.size() : 0);
        Mat keypoints_mat = Converters.vector_vector_KeyPoint_to_Mat(keypoints, keypoints_tmplm);
        Mat descriptors_mat = new Mat();
        compute_1(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, descriptors_mat.nativeObj);
        Converters.Mat_to_vector_Mat(descriptors_mat, descriptors);
        return;
    }


    //
    // C++: static javaDescriptorExtractor* javaDescriptorExtractor::create(int extractorType)
    //

/**
 * Creates a descriptor extractor by name.
 *
 * The current implementation supports the following types of a descriptor
 * extractor:
 *   * "SIFT" -- "SiftDescriptorExtractor"
 *   * "SURF" -- "SurfDescriptorExtractor"
 *   * "ORB" -- "OrbDescriptorExtractor"
 *   * "BRIEF" -- "BriefDescriptorExtractor"
 *
 * A combined format is also supported: descriptor extractor adapter name
 * ("Opponent" -- "OpponentColorDescriptorExtractor") + descriptor extractor
 * name (see above), for example: "OpponentSIFT".
 *
 * @param extractorType a extractorType
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-create">org.opencv.features2d.DescriptorExtractor.create</a>
 */
    public static DescriptorExtractor create(int extractorType)
    {

        DescriptorExtractor retVal = new DescriptorExtractor(create_0(extractorType));

        return retVal;
    }


    //
    // C++:  int javaDescriptorExtractor::descriptorSize()
    //

    public  int descriptorSize()
    {

        int retVal = descriptorSize_0(nativeObj);

        return retVal;
    }


    //
    // C++:  int javaDescriptorExtractor::descriptorType()
    //

    public  int descriptorType()
    {

        int retVal = descriptorType_0(nativeObj);

        return retVal;
    }


    //
    // C++:  bool javaDescriptorExtractor::empty()
    //

    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void javaDescriptorExtractor::read(string fileName)
    //

/**
 * Reads the object of a descriptor extractor from a file node.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-read">org.opencv.features2d.DescriptorExtractor.read</a>
 */
    public  void read(String fileName)
    {

        read_0(nativeObj, fileName);

        return;
    }


    //
    // C++:  void javaDescriptorExtractor::write(string fileName)
    //

/**
 * Writes the object of a descriptor extractor to a file storage.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-write">org.opencv.features2d.DescriptorExtractor.write</a>
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

    // C++:  void javaDescriptorExtractor::compute(Mat image, vector_KeyPoint keypoints, Mat descriptors)
    private static native void compute_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long descriptors_nativeObj);

    // C++:  void javaDescriptorExtractor::compute(vector_Mat images, vector_vector_KeyPoint keypoints, vector_Mat& descriptors)
    private static native void compute_1(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long descriptors_mat_nativeObj);

    // C++: static javaDescriptorExtractor* javaDescriptorExtractor::create(int extractorType)
    private static native long create_0(int extractorType);

    // C++:  int javaDescriptorExtractor::descriptorSize()
    private static native int descriptorSize_0(long nativeObj);

    // C++:  int javaDescriptorExtractor::descriptorType()
    private static native int descriptorType_0(long nativeObj);

    // C++:  bool javaDescriptorExtractor::empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  void javaDescriptorExtractor::read(string fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void javaDescriptorExtractor::write(string fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
