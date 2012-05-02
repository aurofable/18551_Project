
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class javaDescriptorMatcher
/**
 * Abstract base class for matching keypoint descriptors. It has two groups of
 * match methods: for matching descriptors of an image with another image or
 * with an image set.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher">org.opencv.features2d.DescriptorMatcher</a>
 */
public class DescriptorMatcher {

    protected final long nativeObj;
    protected DescriptorMatcher(long addr) { nativeObj = addr; }


    public static final int
            FLANNBASED = 1,
            BRUTEFORCE = 2,
            BRUTEFORCE_L1 = 3,
            BRUTEFORCE_HAMMING = 4,
            BRUTEFORCE_HAMMINGLUT = 5,
            BRUTEFORCE_SL2 = 6;


    //
    // C++:  void javaDescriptorMatcher::add(vector_Mat descriptors)
    //

/**
 * Adds descriptors to train a descriptor collection. If the collection
 * "trainDescCollectionis" is not empty, the new descriptors are added to
 * existing train descriptors.
 *
 * @param descriptors Descriptors to add. Each "descriptors[i]" is a set of
 * descriptors from the same train image.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-add">org.opencv.features2d.DescriptorMatcher.add</a>
 */
    public  void add(List<Mat> descriptors)
    {
        Mat descriptors_mat = Converters.vector_Mat_to_Mat(descriptors);
        add_0(nativeObj, descriptors_mat.nativeObj);

        return;
    }


    //
    // C++:  void javaDescriptorMatcher::clear()
    //

/**
 * Clears the train descriptor collection.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-clear">org.opencv.features2d.DescriptorMatcher.clear</a>
 */
    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  javaDescriptorMatcher* javaDescriptorMatcher::jclone(bool emptyTrainData = false)
    //

    public  DescriptorMatcher clone(boolean emptyTrainData)
    {

        DescriptorMatcher retVal = new DescriptorMatcher(clone_0(nativeObj, emptyTrainData));

        return retVal;
    }

    public  DescriptorMatcher clone()
    {

        DescriptorMatcher retVal = new DescriptorMatcher(clone_1(nativeObj));

        return retVal;
    }


    //
    // C++: static javaDescriptorMatcher* javaDescriptorMatcher::create(int matcherType)
    //

/**
 * Creates a descriptor matcher of a given type with the default parameters
 * (using default constructor).
 *
 * @param matcherType a matcherType
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-create">org.opencv.features2d.DescriptorMatcher.create</a>
 */
    public static DescriptorMatcher create(int matcherType)
    {

        DescriptorMatcher retVal = new DescriptorMatcher(create_0(matcherType));

        return retVal;
    }


    //
    // C++:  bool javaDescriptorMatcher::empty()
    //

/**
 * Returns true if there are no train descriptors in the collection.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-empty">org.opencv.features2d.DescriptorMatcher.empty</a>
 */
    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  vector_Mat javaDescriptorMatcher::getTrainDescriptors()
    //

/**
 * Returns a constant link to the train descriptor collection "trainDescCollection".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-gettraindescriptors">org.opencv.features2d.DescriptorMatcher.getTrainDescriptors</a>
 */
    public  List<Mat> getTrainDescriptors()
    {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getTrainDescriptors_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  bool javaDescriptorMatcher::isMaskSupported()
    //

/**
 * Returns true if the descriptor matcher supports masking permissible matches.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-ismasksupported">org.opencv.features2d.DescriptorMatcher.isMaskSupported</a>
 */
    public  boolean isMaskSupported()
    {

        boolean retVal = isMaskSupported_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void javaDescriptorMatcher::knnMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    //

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 * @param mask Mask specifying permissible matches between an input query and
 * train matrices of descriptors.
 * @param compactResult Parameter used when the mask (or masks) is not empty. If
 * "compactResult" is false, the "matches" vector has the same size as
 * "queryDescriptors" rows. If "compactResult" is true, the "matches" vector
 * does not contain matches for fully masked-out query descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, int k, Mat mask, boolean compactResult)
    {
        Mat matches_mat = new Mat();
        knnMatch_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 * @param mask Mask specifying permissible matches between an input query and
 * train matrices of descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, int k, Mat mask)
    {
        Mat matches_mat = new Mat();
        knnMatch_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k, mask.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, int k)
    {
        Mat matches_mat = new Mat();
        knnMatch_2(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::knnMatch(Mat queryDescriptors, vector_vector_DMatch& matches, int k, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    //

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between the input query descriptors and stored train descriptors from the
 * i-th image "trainDescCollection[i]".
 * @param compactResult Parameter used when the mask (or masks) is not empty. If
 * "compactResult" is false, the "matches" vector has the same size as
 * "queryDescriptors" rows. If "compactResult" is true, the "matches" vector
 * does not contain matches for fully masked-out query descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, List<List<DMatch>> matches, int k, List<Mat> masks, boolean compactResult)
    {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        knnMatch_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between the input query descriptors and stored train descriptors from the
 * i-th image "trainDescCollection[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, List<List<DMatch>> matches, int k, List<Mat> masks)
    {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        knnMatch_4(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the k best matches for each descriptor from a query set.
 *
 * These extended variants of "DescriptorMatcher.match" methods find several
 * best matches for each query descriptor. The matches are returned in the
 * distance increasing order. See "DescriptorMatcher.match" for the details
 * about query and train descriptors.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Matches. Each "matches[i]" is k or less matches for the same
 * query descriptor.
 * @param k Count of best matches found per each query descriptor or less if a
 * query descriptor has less than k possible matches in total.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-knnmatch">org.opencv.features2d.DescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryDescriptors, List<List<DMatch>> matches, int k)
    {
        Mat matches_mat = new Mat();
        knnMatch_5(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::match(Mat queryDescriptors, Mat trainDescriptors, vector_DMatch& matches, Mat mask = Mat())
    //

/**
 * Finds the best match for each descriptor from a query set.
 *
 * In the first variant of this method, the train descriptors are passed as an
 * input argument. In the second variant of the method, train descriptors
 * collection that was set by "DescriptorMatcher.add" is used. Optional mask
 * (or masks) can be passed to specify which query and training descriptors can
 * be matched. Namely, "queryDescriptors[i]" can be matched with
 * "trainDescriptors[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Matches. If a query descriptor is masked out in "mask", no
 * match is added for this descriptor. So, "matches" size may be smaller than
 * the query descriptors count.
 * @param mask Mask specifying permissible matches between an input query and
 * train matrices of descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-match">org.opencv.features2d.DescriptorMatcher.match</a>
 */
    public  void match(Mat queryDescriptors, Mat trainDescriptors, List<DMatch> matches, Mat mask)
    {
        Mat matches_mat = new Mat();
        match_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, mask.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the best match for each descriptor from a query set.
 *
 * In the first variant of this method, the train descriptors are passed as an
 * input argument. In the second variant of the method, train descriptors
 * collection that was set by "DescriptorMatcher.add" is used. Optional mask
 * (or masks) can be passed to specify which query and training descriptors can
 * be matched. Namely, "queryDescriptors[i]" can be matched with
 * "trainDescriptors[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Matches. If a query descriptor is masked out in "mask", no
 * match is added for this descriptor. So, "matches" size may be smaller than
 * the query descriptors count.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-match">org.opencv.features2d.DescriptorMatcher.match</a>
 */
    public  void match(Mat queryDescriptors, Mat trainDescriptors, List<DMatch> matches)
    {
        Mat matches_mat = new Mat();
        match_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::match(Mat queryDescriptors, vector_DMatch& matches, vector_Mat masks = vector<Mat>())
    //

/**
 * Finds the best match for each descriptor from a query set.
 *
 * In the first variant of this method, the train descriptors are passed as an
 * input argument. In the second variant of the method, train descriptors
 * collection that was set by "DescriptorMatcher.add" is used. Optional mask
 * (or masks) can be passed to specify which query and training descriptors can
 * be matched. Namely, "queryDescriptors[i]" can be matched with
 * "trainDescriptors[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Matches. If a query descriptor is masked out in "mask", no
 * match is added for this descriptor. So, "matches" size may be smaller than
 * the query descriptors count.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between the input query descriptors and stored train descriptors from the
 * i-th image "trainDescCollection[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-match">org.opencv.features2d.DescriptorMatcher.match</a>
 */
    public  void match(Mat queryDescriptors, List<DMatch> matches, List<Mat> masks)
    {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        match_2(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, masks_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the best match for each descriptor from a query set.
 *
 * In the first variant of this method, the train descriptors are passed as an
 * input argument. In the second variant of the method, train descriptors
 * collection that was set by "DescriptorMatcher.add" is used. Optional mask
 * (or masks) can be passed to specify which query and training descriptors can
 * be matched. Namely, "queryDescriptors[i]" can be matched with
 * "trainDescriptors[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Matches. If a query descriptor is masked out in "mask", no
 * match is added for this descriptor. So, "matches" size may be smaller than
 * the query descriptors count.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-match">org.opencv.features2d.DescriptorMatcher.match</a>
 */
    public  void match(Mat queryDescriptors, List<DMatch> matches)
    {
        Mat matches_mat = new Mat();
        match_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::radiusMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    //

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 * @param mask Mask specifying permissible matches between an input query and
 * train matrices of descriptors.
 * @param compactResult Parameter used when the mask (or masks) is not empty. If
 * "compactResult" is false, the "matches" vector has the same size as
 * "queryDescriptors" rows. If "compactResult" is true, the "matches" vector
 * does not contain matches for fully masked-out query descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, float maxDistance, Mat mask, boolean compactResult)
    {
        Mat matches_mat = new Mat();
        radiusMatch_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 * @param mask Mask specifying permissible matches between an input query and
 * train matrices of descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, float maxDistance, Mat mask)
    {
        Mat matches_mat = new Mat();
        radiusMatch_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param trainDescriptors Train set of descriptors. This set is not added to
 * the train descriptors collection stored in the class object.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<List<DMatch>> matches, float maxDistance)
    {
        Mat matches_mat = new Mat();
        radiusMatch_2(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::radiusMatch(Mat queryDescriptors, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    //

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between the input query descriptors and stored train descriptors from the
 * i-th image "trainDescCollection[i]".
 * @param compactResult Parameter used when the mask (or masks) is not empty. If
 * "compactResult" is false, the "matches" vector has the same size as
 * "queryDescriptors" rows. If "compactResult" is true, the "matches" vector
 * does not contain matches for fully masked-out query descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, List<List<DMatch>> matches, float maxDistance, List<Mat> masks, boolean compactResult)
    {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        radiusMatch_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between the input query descriptors and stored train descriptors from the
 * i-th image "trainDescCollection[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, List<List<DMatch>> matches, float maxDistance, List<Mat> masks)
    {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        radiusMatch_4(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query descriptor, finds the training descriptors not farther than
 * the specified distance.
 *
 * For each query descriptor, the methods find such training descriptors that
 * the distance between the query descriptor and the training descriptor is
 * equal or smaller than "maxDistance". Found matches are returned in the
 * distance increasing order.
 *
 * @param queryDescriptors Query set of descriptors.
 * @param matches Found matches.
 * @param maxDistance Threshold for the distance between matched descriptors.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-radiusmatch">org.opencv.features2d.DescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryDescriptors, List<List<DMatch>> matches, float maxDistance)
    {
        Mat matches_mat = new Mat();
        radiusMatch_5(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaDescriptorMatcher::read(string fileName)
    //

    public  void read(String fileName)
    {

        read_0(nativeObj, fileName);

        return;
    }


    //
    // C++:  void javaDescriptorMatcher::train()
    //

/**
 * Trains a descriptor matcher
 *
 * Trains a descriptor matcher (for example, the flann index). In all methods to
 * match, the method "train()" is run every time before matching. Some
 * descriptor matchers (for example, "BruteForceMatcher") have an empty
 * implementation of this method. Other matchers really train their inner
 * structures (for example, "FlannBasedMatcher" trains "flann.Index").
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_descriptor_matchers.html#descriptormatcher-train">org.opencv.features2d.DescriptorMatcher.train</a>
 */
    public  void train()
    {

        train_0(nativeObj);

        return;
    }


    //
    // C++:  void javaDescriptorMatcher::write(string fileName)
    //

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

    // C++:  void javaDescriptorMatcher::add(vector_Mat descriptors)
    private static native void add_0(long nativeObj, long descriptors_mat_nativeObj);

    // C++:  void javaDescriptorMatcher::clear()
    private static native void clear_0(long nativeObj);

    // C++:  javaDescriptorMatcher* javaDescriptorMatcher::jclone(bool emptyTrainData = false)
    private static native long clone_0(long nativeObj, boolean emptyTrainData);
    private static native long clone_1(long nativeObj);

    // C++: static javaDescriptorMatcher* javaDescriptorMatcher::create(int matcherType)
    private static native long create_0(int matcherType);

    // C++:  bool javaDescriptorMatcher::empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  vector_Mat javaDescriptorMatcher::getTrainDescriptors()
    private static native long getTrainDescriptors_0(long nativeObj);

    // C++:  bool javaDescriptorMatcher::isMaskSupported()
    private static native boolean isMaskSupported_0(long nativeObj);

    // C++:  void javaDescriptorMatcher::knnMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    private static native void knnMatch_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, int k, long mask_nativeObj, boolean compactResult);
    private static native void knnMatch_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, int k, long mask_nativeObj);
    private static native void knnMatch_2(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, int k);

    // C++:  void javaDescriptorMatcher::knnMatch(Mat queryDescriptors, vector_vector_DMatch& matches, int k, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    private static native void knnMatch_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, int k, long masks_mat_nativeObj, boolean compactResult);
    private static native void knnMatch_4(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, int k, long masks_mat_nativeObj);
    private static native void knnMatch_5(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, int k);

    // C++:  void javaDescriptorMatcher::match(Mat queryDescriptors, Mat trainDescriptors, vector_DMatch& matches, Mat mask = Mat())
    private static native void match_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, long mask_nativeObj);
    private static native void match_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj);

    // C++:  void javaDescriptorMatcher::match(Mat queryDescriptors, vector_DMatch& matches, vector_Mat masks = vector<Mat>())
    private static native void match_2(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, long masks_mat_nativeObj);
    private static native void match_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj);

    // C++:  void javaDescriptorMatcher::radiusMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    private static native void radiusMatch_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long mask_nativeObj, boolean compactResult);
    private static native void radiusMatch_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long mask_nativeObj);
    private static native void radiusMatch_2(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance);

    // C++:  void javaDescriptorMatcher::radiusMatch(Mat queryDescriptors, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    private static native void radiusMatch_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long masks_mat_nativeObj, boolean compactResult);
    private static native void radiusMatch_4(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long masks_mat_nativeObj);
    private static native void radiusMatch_5(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance);

    // C++:  void javaDescriptorMatcher::read(string fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void javaDescriptorMatcher::train()
    private static native void train_0(long nativeObj);

    // C++:  void javaDescriptorMatcher::write(string fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
