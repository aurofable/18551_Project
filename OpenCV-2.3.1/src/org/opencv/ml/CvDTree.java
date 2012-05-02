
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;

// C++: class CvDTree
/**
 * The class implements a decision tree as described in the beginning of this
 * section.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree">org.opencv.ml.CvDTree</a>
 */
public class CvDTree {

    protected final long nativeObj;
    protected CvDTree(long addr) { nativeObj = addr; }


    //
    // C++:   CvDTree::CvDTree()
    //

    public   CvDTree()
    {

        nativeObj = CvDTree_0();

        return;
    }


    //
    // C++:  void CvDTree::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  Mat CvDTree::getVarImportance()
    //

/**
 * Returns the variable importance array.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-getvarimportance">org.opencv.ml.CvDTree.getVarImportance</a>
 */
    public  Mat getVarImportance()
    {

        Mat retVal = new Mat(getVarImportance_0(nativeObj));

        return retVal;
    }


    //
    // C++:  CvDTreeNode* CvDTree::predict(Mat sample, Mat missingDataMask = cv::Mat(), bool preprocessedInput = false)
    //

    // Return type 'CvDTreeNode*' is not supported, skipping the function


    //
    // C++:  bool CvDTree::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvDTreeParams params = CvDTreeParams())
    //

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 * @param params a params
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvDTreeParams params)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

        return retVal;
    }

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

        return retVal;
    }

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        boolean retVal = train_4(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a decision tree.
 *
 * There are four "train" methods in "CvDTree":
 *   * The first two methods follow the generic "CvStatModel.train"
 * conventions. It is the most complete form. Both data layouts
 * ("tflag=CV_ROW_SAMPLE" and "tflag=CV_COL_SAMPLE") are supported, as well as
 * sample and variable subsets, missing measurements, arbitrary combinations of
 * input and output variable types, and so on. The last parameter contains all
 * of the necessary training parameters (see the "CvDTreeParams" description).
 *   * The third method uses "CvMLData" to pass training data to a decision
 * tree.
 *   * The last method "train" is mostly used for building tree ensembles. It
 * takes the pre-constructed "CvDTreeTrainData" instance and an optional subset
 * of the training set. The indices in "subsampleIdx" are counted relatively to
 * the "_sample_idx", passed to the "CvDTreeTrainData" constructor. For example,
 * if "_sample_idx=[1, 5, 7, 100]", then "subsampleIdx=[0,3]" means that the
 * samples "[1, 100]" of the original training set are used.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/decision_trees.html#cvdtree-train">org.opencv.ml.CvDTree.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses)
    {

        boolean retVal = train_5(nativeObj, trainData.nativeObj, tflag, responses.nativeObj);

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

    // C++:   CvDTree::CvDTree()
    private static native long CvDTree_0();

    // C++:  void CvDTree::clear()
    private static native void clear_0(long nativeObj);

    // C++:  Mat CvDTree::getVarImportance()
    private static native long getVarImportance_0(long nativeObj);

    // C++:  bool CvDTree::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvDTreeParams params = CvDTreeParams())
    private static native boolean train_0(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj);
    private static native boolean train_1(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj);
    private static native boolean train_2(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj);
    private static native boolean train_3(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_4(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj);
    private static native boolean train_5(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
