
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class javaGenericDescriptorMatcher
/**
 * Abstract interface for extracting and matching a keypoint descriptor. There
 * are also "DescriptorExtractor" and "DescriptorMatcher" for these purposes but
 * their interfaces are intended for descriptors represented as vectors in a
 * multidimensional space. "GenericDescriptorMatcher" is a more generic
 * interface for descriptors. "DescriptorMatcher" and "GenericDescriptorMatcher"
 * have two groups of match methods: for matching keypoints of an image with
 * another image or with an image set.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher">org.opencv.features2d.GenericDescriptorMatcher</a>
 */
public class GenericDescriptorMatcher {

    protected final long nativeObj;
    protected GenericDescriptorMatcher(long addr) { nativeObj = addr; }


    public static final int
            ONEWAY = 1,
            FERN = 2;


    //
    // C++:  void javaGenericDescriptorMatcher::add(vector_Mat images, vector_vector_KeyPoint keypoints)
    //

/**
 * Adds images and their keypoints to the training collection stored in the
 * class instance.
 *
 * @param images Image collection.
 * @param keypoints Point collection. It is assumed that "keypoints[i]" are
 * keypoints detected in the image "images[i]".
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-add">org.opencv.features2d.GenericDescriptorMatcher.add</a>
 */
    public  void add(List<Mat> images, List<List<KeyPoint>> keypoints)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        List<Mat> keypoints_tmplm = new ArrayList<Mat>((keypoints != null) ? keypoints.size() : 0);
        Mat keypoints_mat = Converters.vector_vector_KeyPoint_to_Mat(keypoints, keypoints_tmplm);
        add_0(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj);

        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::classify(Mat queryImage, vector_KeyPoint& queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints)
    //

/**
 * Classifies keypoints from a query set.
 *
 * The method classifies each keypoint from a query set. The first variant of
 * the method takes a train image and its keypoints as an input argument. The
 * second variant uses the internally stored training collection that can be
 * built using the "GenericDescriptorMatcher.add" method.
 *
 * The methods do the following:
 *   #. Call the "GenericDescriptorMatcher.match" method to find correspondence
 * between the query set and the training set.
 *   #. Set the "class_id" field of each keypoint from the query set to
 * "class_id" of the corresponding keypoint from the training set.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints from a query image.
 * @param trainImage Train image.
 * @param trainKeypoints Keypoints from a train image.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-classify">org.opencv.features2d.GenericDescriptorMatcher.classify</a>
 */
    public  void classify(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        classify_0(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj);
        Converters.Mat_to_vector_KeyPoint(queryKeypoints_mat, queryKeypoints);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::classify(Mat queryImage, vector_KeyPoint& queryKeypoints)
    //

/**
 * Classifies keypoints from a query set.
 *
 * The method classifies each keypoint from a query set. The first variant of
 * the method takes a train image and its keypoints as an input argument. The
 * second variant uses the internally stored training collection that can be
 * built using the "GenericDescriptorMatcher.add" method.
 *
 * The methods do the following:
 *   #. Call the "GenericDescriptorMatcher.match" method to find correspondence
 * between the query set and the training set.
 *   #. Set the "class_id" field of each keypoint from the query set to
 * "class_id" of the corresponding keypoint from the training set.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints from a query image.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-classify">org.opencv.features2d.GenericDescriptorMatcher.classify</a>
 */
    public  void classify(Mat queryImage, List<KeyPoint> queryKeypoints)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        classify_1(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj);
        Converters.Mat_to_vector_KeyPoint(queryKeypoints_mat, queryKeypoints);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::clear()
    //

/**
 * Clears a train collection (images and keypoints).
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-clear">org.opencv.features2d.GenericDescriptorMatcher.clear</a>
 */
    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  javaGenericDescriptorMatcher* javaGenericDescriptorMatcher::jclone(bool emptyTrainData = false)
    //

    public  GenericDescriptorMatcher clone(boolean emptyTrainData)
    {

        GenericDescriptorMatcher retVal = new GenericDescriptorMatcher(clone_0(nativeObj, emptyTrainData));

        return retVal;
    }

    public  GenericDescriptorMatcher clone()
    {

        GenericDescriptorMatcher retVal = new GenericDescriptorMatcher(clone_1(nativeObj));

        return retVal;
    }


    //
    // C++: static javaGenericDescriptorMatcher* javaGenericDescriptorMatcher::create(int matcherType)
    //

    public static GenericDescriptorMatcher create(int matcherType)
    {

        GenericDescriptorMatcher retVal = new GenericDescriptorMatcher(create_0(matcherType));

        return retVal;
    }


    //
    // C++:  bool javaGenericDescriptorMatcher::empty()
    //

    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  vector_Mat javaGenericDescriptorMatcher::getTrainImages()
    //

/**
 * Returns a train image collection.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-gettrainimages">org.opencv.features2d.GenericDescriptorMatcher.getTrainImages</a>
 */
    public  List<Mat> getTrainImages()
    {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getTrainImages_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  vector_vector_KeyPoint javaGenericDescriptorMatcher::getTrainKeypoints()
    //

/**
 * Returns a train keypoints collection.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-gettrainkeypoints">org.opencv.features2d.GenericDescriptorMatcher.getTrainKeypoints</a>
 */
    public  List<List<KeyPoint>> getTrainKeypoints()
    {
        List<List<KeyPoint>> retVal = new ArrayList<List<KeyPoint>>();
        Mat retValMat = new Mat(getTrainKeypoints_0(nativeObj));
        Converters.Mat_to_vector_vector_KeyPoint(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  bool javaGenericDescriptorMatcher::isMaskSupported()
    //

/**
 * Returns "true" if a generic descriptor matcher supports masking permissible
 * matches.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-ismasksupported">org.opencv.features2d.GenericDescriptorMatcher.isMaskSupported</a>
 */
    public  boolean isMaskSupported()
    {

        boolean retVal = isMaskSupported_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::knnMatch(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    //

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param k a k
 * @param mask a mask
 * @param compactResult a compactResult
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, int k, Mat mask, boolean compactResult)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        knnMatch_0(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, k, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param k a k
 * @param mask a mask
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, int k, Mat mask)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        knnMatch_1(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, k, mask.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param k a k
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, int k)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        knnMatch_2(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::knnMatch(Mat queryImage, vector_KeyPoint queryKeypoints, vector_vector_DMatch& matches, int k, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    //

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param k a k
 * @param masks a masks
 * @param compactResult a compactResult
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, int k, List<Mat> masks, boolean compactResult)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        knnMatch_3(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param k a k
 * @param masks a masks
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, int k, List<Mat> masks)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        knnMatch_4(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the "k" best matches for each query keypoint.
 *
 * The methods are extended variants of "GenericDescriptorMatch.match". The
 * parameters are similar, and the the semantics is similar to "DescriptorMatcher.knnMatch".
 * But this class does not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param k a k
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-knnmatch">org.opencv.features2d.GenericDescriptorMatcher.knnMatch</a>
 */
    public  void knnMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, int k)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        knnMatch_5(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::match(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_DMatch& matches, Mat mask = Mat())
    //

/**
 * Finds the best match in the training set for each keypoint from the query
 * set.
 *
 * The methods find the best match for each query keypoint. In the first variant
 * of the method, a train image and its keypoints are the input arguments. In
 * the second variant, query keypoints are matched to the internally stored
 * training collection that can be built using the "GenericDescriptorMatcher.add"
 * method. Optional mask (or masks) can be passed to specify which query and
 * training descriptors can be matched. Namely, "queryKeypoints[i]" can be
 * matched with "trainKeypoints[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints detected in "queryImage".
 * @param trainImage Train image. It is not added to a train image collection
 * stored in the class object.
 * @param trainKeypoints Keypoints detected in "trainImage". They are not added
 * to a train points collection stored in the class object.
 * @param matches Matches. If a query descriptor (keypoint) is masked out in
 * "mask", match is added for this descriptor. So, "matches" size may be smaller
 * than the query keypoints count.
 * @param mask Mask specifying permissible matches between an input query and
 * train keypoints.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-match">org.opencv.features2d.GenericDescriptorMatcher.match</a>
 */
    public  void match(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<DMatch> matches, Mat mask)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        match_0(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, mask.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the best match in the training set for each keypoint from the query
 * set.
 *
 * The methods find the best match for each query keypoint. In the first variant
 * of the method, a train image and its keypoints are the input arguments. In
 * the second variant, query keypoints are matched to the internally stored
 * training collection that can be built using the "GenericDescriptorMatcher.add"
 * method. Optional mask (or masks) can be passed to specify which query and
 * training descriptors can be matched. Namely, "queryKeypoints[i]" can be
 * matched with "trainKeypoints[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints detected in "queryImage".
 * @param trainImage Train image. It is not added to a train image collection
 * stored in the class object.
 * @param trainKeypoints Keypoints detected in "trainImage". They are not added
 * to a train points collection stored in the class object.
 * @param matches Matches. If a query descriptor (keypoint) is masked out in
 * "mask", match is added for this descriptor. So, "matches" size may be smaller
 * than the query keypoints count.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-match">org.opencv.features2d.GenericDescriptorMatcher.match</a>
 */
    public  void match(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<DMatch> matches)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        match_1(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::match(Mat queryImage, vector_KeyPoint queryKeypoints, vector_DMatch& matches, vector_Mat masks = vector<Mat>())
    //

/**
 * Finds the best match in the training set for each keypoint from the query
 * set.
 *
 * The methods find the best match for each query keypoint. In the first variant
 * of the method, a train image and its keypoints are the input arguments. In
 * the second variant, query keypoints are matched to the internally stored
 * training collection that can be built using the "GenericDescriptorMatcher.add"
 * method. Optional mask (or masks) can be passed to specify which query and
 * training descriptors can be matched. Namely, "queryKeypoints[i]" can be
 * matched with "trainKeypoints[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints detected in "queryImage".
 * @param matches Matches. If a query descriptor (keypoint) is masked out in
 * "mask", match is added for this descriptor. So, "matches" size may be smaller
 * than the query keypoints count.
 * @param masks Set of masks. Each "masks[i]" specifies permissible matches
 * between input query keypoints and stored train keypoints from the i-th image.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-match">org.opencv.features2d.GenericDescriptorMatcher.match</a>
 */
    public  void match(Mat queryImage, List<KeyPoint> queryKeypoints, List<DMatch> matches, List<Mat> masks)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        match_2(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, masks_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * Finds the best match in the training set for each keypoint from the query
 * set.
 *
 * The methods find the best match for each query keypoint. In the first variant
 * of the method, a train image and its keypoints are the input arguments. In
 * the second variant, query keypoints are matched to the internally stored
 * training collection that can be built using the "GenericDescriptorMatcher.add"
 * method. Optional mask (or masks) can be passed to specify which query and
 * training descriptors can be matched. Namely, "queryKeypoints[i]" can be
 * matched with "trainKeypoints[j]" only if "mask.at<uchar>(i,j)" is non-zero.
 *
 * @param queryImage Query image.
 * @param queryKeypoints Keypoints detected in "queryImage".
 * @param matches Matches. If a query descriptor (keypoint) is masked out in
 * "mask", match is added for this descriptor. So, "matches" size may be smaller
 * than the query keypoints count.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-match">org.opencv.features2d.GenericDescriptorMatcher.match</a>
 */
    public  void match(Mat queryImage, List<KeyPoint> queryKeypoints, List<DMatch> matches)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        match_3(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj);
        Converters.Mat_to_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::radiusMatch(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    //

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 * @param mask a mask
 * @param compactResult a compactResult
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, float maxDistance, Mat mask, boolean compactResult)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        radiusMatch_0(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 * @param mask a mask
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, float maxDistance, Mat mask)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        radiusMatch_1(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param trainImage a trainImage
 * @param trainKeypoints a trainKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, Mat trainImage, List<KeyPoint> trainKeypoints, List<List<DMatch>> matches, float maxDistance)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat trainKeypoints_mat = Converters.vector_KeyPoint_to_Mat(trainKeypoints);
        Mat matches_mat = new Mat();
        radiusMatch_2(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, trainImage.nativeObj, trainKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::radiusMatch(Mat queryImage, vector_KeyPoint queryKeypoints, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    //

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 * @param masks a masks
 * @param compactResult a compactResult
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, float maxDistance, List<Mat> masks, boolean compactResult)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        radiusMatch_3(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 * @param masks a masks
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, float maxDistance, List<Mat> masks)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        radiusMatch_4(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }

/**
 * For each query keypoint, finds the training keypoints not farther than the
 * specified distance.
 *
 * The methods are similar to "DescriptorMatcher.radius". But this class does
 * not require explicitly computed keypoint descriptors.
 *
 * @param queryImage a queryImage
 * @param queryKeypoints a queryKeypoints
 * @param matches a matches
 * @param maxDistance a maxDistance
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-radiusmatch">org.opencv.features2d.GenericDescriptorMatcher.radiusMatch</a>
 */
    public  void radiusMatch(Mat queryImage, List<KeyPoint> queryKeypoints, List<List<DMatch>> matches, float maxDistance)
    {
        Mat queryKeypoints_mat = Converters.vector_KeyPoint_to_Mat(queryKeypoints);
        Mat matches_mat = new Mat();
        radiusMatch_5(nativeObj, queryImage.nativeObj, queryKeypoints_mat.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::read(string fileName)
    //

/**
 * Reads a matcher object from a file node.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-read">org.opencv.features2d.GenericDescriptorMatcher.read</a>
 */
    public  void read(String fileName)
    {

        read_0(nativeObj, fileName);

        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::train()
    //

/**
 * Trains descriptor matcher
 *
 * Prepares descriptor matcher, for example, creates a tree-based structure, to
 * extract descriptors or to optimize descriptors matching.
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-train">org.opencv.features2d.GenericDescriptorMatcher.train</a>
 */
    public  void train()
    {

        train_0(nativeObj);

        return;
    }


    //
    // C++:  void javaGenericDescriptorMatcher::write(string fileName)
    //

/**
 * Writes a match object to a file storage.
 *
 * @param fileName a fileName
 *
 * @see <a href="http://opencv.itseez.com/modules/features2d/doc/common_interfaces_of_generic_descriptor_matchers.html#genericdescriptormatcher-write">org.opencv.features2d.GenericDescriptorMatcher.write</a>
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

    // C++:  void javaGenericDescriptorMatcher::add(vector_Mat images, vector_vector_KeyPoint keypoints)
    private static native void add_0(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj);

    // C++:  void javaGenericDescriptorMatcher::classify(Mat queryImage, vector_KeyPoint& queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints)
    private static native void classify_0(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj);

    // C++:  void javaGenericDescriptorMatcher::classify(Mat queryImage, vector_KeyPoint& queryKeypoints)
    private static native void classify_1(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj);

    // C++:  void javaGenericDescriptorMatcher::clear()
    private static native void clear_0(long nativeObj);

    // C++:  javaGenericDescriptorMatcher* javaGenericDescriptorMatcher::jclone(bool emptyTrainData = false)
    private static native long clone_0(long nativeObj, boolean emptyTrainData);
    private static native long clone_1(long nativeObj);

    // C++: static javaGenericDescriptorMatcher* javaGenericDescriptorMatcher::create(int matcherType)
    private static native long create_0(int matcherType);

    // C++:  bool javaGenericDescriptorMatcher::empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  vector_Mat javaGenericDescriptorMatcher::getTrainImages()
    private static native long getTrainImages_0(long nativeObj);

    // C++:  vector_vector_KeyPoint javaGenericDescriptorMatcher::getTrainKeypoints()
    private static native long getTrainKeypoints_0(long nativeObj);

    // C++:  bool javaGenericDescriptorMatcher::isMaskSupported()
    private static native boolean isMaskSupported_0(long nativeObj);

    // C++:  void javaGenericDescriptorMatcher::knnMatch(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    private static native void knnMatch_0(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k, long mask_nativeObj, boolean compactResult);
    private static native void knnMatch_1(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k, long mask_nativeObj);
    private static native void knnMatch_2(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k);

    // C++:  void javaGenericDescriptorMatcher::knnMatch(Mat queryImage, vector_KeyPoint queryKeypoints, vector_vector_DMatch& matches, int k, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    private static native void knnMatch_3(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k, long masks_mat_nativeObj, boolean compactResult);
    private static native void knnMatch_4(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k, long masks_mat_nativeObj);
    private static native void knnMatch_5(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, int k);

    // C++:  void javaGenericDescriptorMatcher::match(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_DMatch& matches, Mat mask = Mat())
    private static native void match_0(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, long mask_nativeObj);
    private static native void match_1(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj);

    // C++:  void javaGenericDescriptorMatcher::match(Mat queryImage, vector_KeyPoint queryKeypoints, vector_DMatch& matches, vector_Mat masks = vector<Mat>())
    private static native void match_2(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, long masks_mat_nativeObj);
    private static native void match_3(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj);

    // C++:  void javaGenericDescriptorMatcher::radiusMatch(Mat queryImage, vector_KeyPoint queryKeypoints, Mat trainImage, vector_KeyPoint trainKeypoints, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    private static native void radiusMatch_0(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance, long mask_nativeObj, boolean compactResult);
    private static native void radiusMatch_1(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance, long mask_nativeObj);
    private static native void radiusMatch_2(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long trainImage_nativeObj, long trainKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance);

    // C++:  void javaGenericDescriptorMatcher::radiusMatch(Mat queryImage, vector_KeyPoint queryKeypoints, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector<Mat>(), bool compactResult = false)
    private static native void radiusMatch_3(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance, long masks_mat_nativeObj, boolean compactResult);
    private static native void radiusMatch_4(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance, long masks_mat_nativeObj);
    private static native void radiusMatch_5(long nativeObj, long queryImage_nativeObj, long queryKeypoints_mat_nativeObj, long matches_mat_nativeObj, float maxDistance);

    // C++:  void javaGenericDescriptorMatcher::read(string fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void javaGenericDescriptorMatcher::train()
    private static native void train_0(long nativeObj);

    // C++:  void javaGenericDescriptorMatcher::write(string fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
