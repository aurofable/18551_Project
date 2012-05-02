
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;
import org.opencv.core.Range;

// C++: class CvBoost
/**
 * Boosted tree classifier derived from "CvStatModel".
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost">org.opencv.ml.CvBoost</a>
 */
public class CvBoost {

    protected final long nativeObj;
    protected CvBoost(long addr) { nativeObj = addr; }


    public static final int
            DISCRETE = 0,
            REAL = 1,
            LOGIT = 2,
            GENTLE = 3,
            DEFAULT = 0,
            GINI = 1,
            MISCLASS = 3,
            SQERR = 4;


    //
    // C++:   CvBoost::CvBoost()
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost()
    {

        nativeObj = CvBoost_0();

        return;
    }


    //
    // C++:   CvBoost::CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvBoostParams params = CvBoostParams())
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvBoostParams params)
    {

        nativeObj = CvBoost_1(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        nativeObj = CvBoost_2(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        nativeObj = CvBoost_3(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        nativeObj = CvBoost_4(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        nativeObj = CvBoost_5(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-cvboost">org.opencv.ml.CvBoost.CvBoost</a>
 */
    public   CvBoost(Mat trainData, int tflag, Mat responses)
    {

        nativeObj = CvBoost_6(trainData.nativeObj, tflag, responses.nativeObj);

        return;
    }


    //
    // C++:  void CvBoost::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  float CvBoost::predict(Mat sample, Mat missing = cv::Mat(), Range slice = cv::Range::all(), bool rawMode = false, bool returnSum = false)
    //

/**
 * Predicts a response for an input sample.
 *
 * The method runs the sample through the trees in the ensemble and returns the
 * output class label based on the weighted voting.
 *
 * @param sample Input sample.
 * @param missing Optional mask of missing measurements. To handle missing
 * measurements, the weak classifiers must include surrogate splits (see
 * "CvDTreeParams.use_surrogates").
 * @param slice Continuous subset of the sequence of weak classifiers to be used
 * for prediction. By default, all the weak classifiers are used.
 * @param rawMode a rawMode
 * @param returnSum a returnSum
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-predict">org.opencv.ml.CvBoost.predict</a>
 */
    public  float predict(Mat sample, Mat missing, Range slice, boolean rawMode, boolean returnSum)
    {

        float retVal = predict_0(nativeObj, sample.nativeObj, missing.nativeObj, slice.start, slice.end, rawMode, returnSum);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method runs the sample through the trees in the ensemble and returns the
 * output class label based on the weighted voting.
 *
 * @param sample Input sample.
 * @param missing Optional mask of missing measurements. To handle missing
 * measurements, the weak classifiers must include surrogate splits (see
 * "CvDTreeParams.use_surrogates").
 * @param slice Continuous subset of the sequence of weak classifiers to be used
 * for prediction. By default, all the weak classifiers are used.
 * @param rawMode a rawMode
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-predict">org.opencv.ml.CvBoost.predict</a>
 */
    public  float predict(Mat sample, Mat missing, Range slice, boolean rawMode)
    {

        float retVal = predict_1(nativeObj, sample.nativeObj, missing.nativeObj, slice.start, slice.end, rawMode);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method runs the sample through the trees in the ensemble and returns the
 * output class label based on the weighted voting.
 *
 * @param sample Input sample.
 * @param missing Optional mask of missing measurements. To handle missing
 * measurements, the weak classifiers must include surrogate splits (see
 * "CvDTreeParams.use_surrogates").
 * @param slice Continuous subset of the sequence of weak classifiers to be used
 * for prediction. By default, all the weak classifiers are used.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-predict">org.opencv.ml.CvBoost.predict</a>
 */
    public  float predict(Mat sample, Mat missing, Range slice)
    {

        float retVal = predict_2(nativeObj, sample.nativeObj, missing.nativeObj, slice.start, slice.end);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method runs the sample through the trees in the ensemble and returns the
 * output class label based on the weighted voting.
 *
 * @param sample Input sample.
 * @param missing Optional mask of missing measurements. To handle missing
 * measurements, the weak classifiers must include surrogate splits (see
 * "CvDTreeParams.use_surrogates").
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-predict">org.opencv.ml.CvBoost.predict</a>
 */
    public  float predict(Mat sample, Mat missing)
    {

        float retVal = predict_3(nativeObj, sample.nativeObj, missing.nativeObj);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method runs the sample through the trees in the ensemble and returns the
 * output class label based on the weighted voting.
 *
 * @param sample Input sample.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-predict">org.opencv.ml.CvBoost.predict</a>
 */
    public  float predict(Mat sample)
    {

        float retVal = predict_4(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  void CvBoost::prune(CvSlice slice)
    //

/**
 * Removes the specified weak classifiers.
 *
 * The method removes the specified weak classifiers from the sequence.
 *
 * Note: Do not confuse this method with the pruning of individual decision
 * trees, which is currently not supported.
 *
 * @param slice Continuous subset of the sequence of weak classifiers to be
 * removed.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-prune">org.opencv.ml.CvBoost.prune</a>
 */
    public  void prune(Range slice)
    {

        prune_0(nativeObj, slice.start, slice.end);

        return;
    }


    //
    // C++:  bool CvBoost::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvBoostParams params = CvBoostParams(), bool update = false)
    //

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 * @param params a params
 * @param update Specifies whether the classifier needs to be updated ("true",
 * the new weak tree classifiers added to the existing ensemble) or the
 * classifier needs to be rebuilt from scratch ("false").
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvBoostParams params, boolean update)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj, update);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvBoostParams params)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_4(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        boolean retVal = train_5(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a boosted tree classifier.
 *
 * The train method follows the common template of "CvStatModel.train". The
 * responses must be categorical, which means that boosted trees cannot be built
 * for regression, and there should be two classes.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/boosting.html#cvboost-train">org.opencv.ml.CvBoost.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses)
    {

        boolean retVal = train_6(nativeObj, trainData.nativeObj, tflag, responses.nativeObj);

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

    // C++:   CvBoost::CvBoost()
    private static native long CvBoost_0();

    // C++:   CvBoost::CvBoost(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvBoostParams params = CvBoostParams())
    private static native long CvBoost_1(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj);
    private static native long CvBoost_2(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj);
    private static native long CvBoost_3(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj);
    private static native long CvBoost_4(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native long CvBoost_5(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj);
    private static native long CvBoost_6(long trainData_nativeObj, int tflag, long responses_nativeObj);

    // C++:  void CvBoost::clear()
    private static native void clear_0(long nativeObj);

    // C++:  float CvBoost::predict(Mat sample, Mat missing = cv::Mat(), Range slice = cv::Range::all(), bool rawMode = false, bool returnSum = false)
    private static native float predict_0(long nativeObj, long sample_nativeObj, long missing_nativeObj, int slice_start, int slice_end, boolean rawMode, boolean returnSum);
    private static native float predict_1(long nativeObj, long sample_nativeObj, long missing_nativeObj, int slice_start, int slice_end, boolean rawMode);
    private static native float predict_2(long nativeObj, long sample_nativeObj, long missing_nativeObj, int slice_start, int slice_end);
    private static native float predict_3(long nativeObj, long sample_nativeObj, long missing_nativeObj);
    private static native float predict_4(long nativeObj, long sample_nativeObj);

    // C++:  void CvBoost::prune(CvSlice slice)
    private static native void prune_0(long nativeObj, int slice_start, int slice_end);

    // C++:  bool CvBoost::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvBoostParams params = CvBoostParams(), bool update = false)
    private static native boolean train_0(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj, boolean update);
    private static native boolean train_1(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj);
    private static native boolean train_2(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj);
    private static native boolean train_3(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj);
    private static native boolean train_4(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_5(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj);
    private static native boolean train_6(long nativeObj, long trainData_nativeObj, int tflag, long responses_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
