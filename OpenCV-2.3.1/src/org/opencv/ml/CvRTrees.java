
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;

// C++: class CvRTrees
/**
 * The class implements the random forest predictor as described in the
 * beginning of this section.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees">org.opencv.ml.CvRTrees</a>
 */
public class CvRTrees {

    protected final long nativeObj;
    protected CvRTrees(long addr) { nativeObj = addr; }


    //
    // C++:   CvRTrees::CvRTrees()
    //

    public   CvRTrees()
    {

        nativeObj = CvRTrees_0();

        return;
    }


    //
    // C++:  void CvRTrees::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  Mat CvRTrees::getVarImportance()
    //

/**
 * Returns the variable importance array.
 *
 * The method returns the variable importance vector, computed at the training
 * stage when "CvRTParams.calc_var_importance" is set to true. If this flag was
 * set to false, the "NULL" pointer is returned. This differs from the decision
 * trees where variable importance can be computed anytime after the training.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-getvarimportance">org.opencv.ml.CvRTrees.getVarImportance</a>
 */
    public  Mat getVarImportance()
    {

        Mat retVal = new Mat(getVarImportance_0(nativeObj));

        return retVal;
    }


    //
    // C++:  float CvRTrees::predict(Mat sample, Mat missing = cv::Mat())
    //

/**
 * Predicts the output for an input sample.
 *
 * The input parameters of the prediction method are the same as in
 * "CvDTree.predict" but the return value type is different. This method
 * returns the cumulative result from all the trees in the forest (the class
 * that receives the majority of voices, or the mean of the regression function
 * estimates).
 *
 * @param sample Sample for classification.
 * @param missing Optional missing measurement mask of the sample.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-predict">org.opencv.ml.CvRTrees.predict</a>
 */
    public  float predict(Mat sample, Mat missing)
    {

        float retVal = predict_0(nativeObj, sample.nativeObj, missing.nativeObj);

        return retVal;
    }

/**
 * Predicts the output for an input sample.
 *
 * The input parameters of the prediction method are the same as in
 * "CvDTree.predict" but the return value type is different. This method
 * returns the cumulative result from all the trees in the forest (the class
 * that receives the majority of voices, or the mean of the regression function
 * estimates).
 *
 * @param sample Sample for classification.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-predict">org.opencv.ml.CvRTrees.predict</a>
 */
    public  float predict(Mat sample)
    {

        float retVal = predict_1(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  float CvRTrees::predict_prob(Mat sample, Mat missing = cv::Mat())
    //

/**
 * Returns a fuzzy-predicted class label.
 *
 * The function works for binary classification problems only. It returns the
 * number between 0 and 1. This number represents probability or confidence of
 * the sample belonging to the second class. It is calculated as the proportion
 * of decision trees that classified the sample to the second class.
 *
 * @param sample Sample for classification.
 * @param missing Optional missing measurement mask of the sample.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-predict-prob">org.opencv.ml.CvRTrees.predict_prob</a>
 */
    public  float predict_prob(Mat sample, Mat missing)
    {

        float retVal = predict_prob_0(nativeObj, sample.nativeObj, missing.nativeObj);

        return retVal;
    }

/**
 * Returns a fuzzy-predicted class label.
 *
 * The function works for binary classification problems only. It returns the
 * number between 0 and 1. This number represents probability or confidence of
 * the sample belonging to the second class. It is calculated as the proportion
 * of decision trees that classified the sample to the second class.
 *
 * @param sample Sample for classification.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-predict-prob">org.opencv.ml.CvRTrees.predict_prob</a>
 */
    public  float predict_prob(Mat sample)
    {

        float retVal = predict_prob_1(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvRTrees::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvRTParams params = CvRTParams())
    //

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvRTParams params)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

        return retVal;
    }

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

        return retVal;
    }

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        boolean retVal = train_4(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains the Random Trees model.
 *
 * The method "CvRTrees.train" is very similar to the method "CvDTree.train"
 * and follows the generic method "CvStatModel.train" conventions. All the
 * parameters specific to the algorithm training are passed as a "CvRTParams"
 * instance. The estimate of the training error ("oob-error") is stored in the
 * protected class member "oob_error".
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/random_trees.html#cvrtrees-train">org.opencv.ml.CvRTrees.train</a>
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

    // C++:   CvRTrees::CvRTrees()
    private static native long CvRTrees_0();

    // C++:  void CvRTrees::clear()
    private static native void clear_0(long nativeObj);

    // C++:  Mat CvRTrees::getVarImportance()
    private static native long getVarImportance_0(long nativeObj);

    // C++:  float CvRTrees::predict(Mat sample, Mat missing = cv::Mat())
    private static native float predict_0(long nativeObj, long sample_nativeObj, long missing_nativeObj);
    private static native float predict_1(long nativeObj, long sample_nativeObj);

    // C++:  float CvRTrees::predict_prob(Mat sample, Mat missing = cv::Mat())
    private static native float predict_prob_0(long nativeObj, long sample_nativeObj, long missing_nativeObj);
    private static native float predict_prob_1(long nativeObj, long sample_nativeObj);

    // C++:  bool CvRTrees::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvRTParams params = CvRTParams())
    private static native boolean train_0(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj);
    private static native boolean train_1(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj);
    private static native boolean train_2(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj);
    private static native boolean train_3(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_4(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj);
    private static native boolean train_5(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
