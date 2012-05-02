
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;
import org.opencv.core.Range;

// C++: class CvGBTrees
/**
 * The class implements the Gradient boosted tree model as described in the
 * beginning of this section.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees">org.opencv.ml.CvGBTrees</a>
 */
public class CvGBTrees {

    protected final long nativeObj;
    protected CvGBTrees(long addr) { nativeObj = addr; }


    public static final int
            SQUARED_LOSS = 0,
            ABSOLUTE_LOSS = 0+1,
            HUBER_LOSS = 3,
            DEVIANCE_LOSS = 3+1;


    //
    // C++:   CvGBTrees::CvGBTrees()
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees()
    {

        nativeObj = CvGBTrees_0();

        return;
    }


    //
    // C++:   CvGBTrees::CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvGBTreesParams params = CvGBTreesParams())
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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvGBTreesParams params)
    {

        nativeObj = CvGBTrees_1(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        nativeObj = CvGBTrees_2(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        nativeObj = CvGBTrees_3(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        nativeObj = CvGBTrees_4(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        nativeObj = CvGBTrees_5(trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-cvgbtrees">org.opencv.ml.CvGBTrees.CvGBTrees</a>
 */
    public   CvGBTrees(Mat trainData, int tflag, Mat responses)
    {

        nativeObj = CvGBTrees_6(trainData.nativeObj, tflag, responses.nativeObj);

        return;
    }


    //
    // C++:  void CvGBTrees::clear()
    //

/**
 * Clears the model.
 *
 * The function deletes the data set information and all the weak models and
 * sets all internal variables to the initial state. The function is called in
 * "CvGBTrees.train" and in the destructor.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-clear">org.opencv.ml.CvGBTrees.clear</a>
 */
    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  float CvGBTrees::predict(Mat sample, Mat missing = cv::Mat(), Range slice = cv::Range::all(), int k = -1)
    //

/**
 * Predicts a response for an input sample.
 *
 * The method predicts the response corresponding to the given sample (see
 * "Predicting with GBT").
 * The result is either the class label or the estimated function value. The
 * "predict" method enables using the parallel version of the GBT model
 * prediction if the OpenCV is built with the TBB library. In this case,
 * predictions of single trees are computed in a parallel fashion.
 *
 * @param sample Input feature vector that has the same format as every training
 * set element. If not all the variables were actualy used during training,
 * "sample" contains forged values at the appropriate places.
 * @param missing Missing values mask, which is a dimentional matrix of the same
 * size as "sample" having the "CV_8U" type. "1" corresponds to the missing
 * value in the same position in the "sample" vector. If there are no missing
 * values in the feature vector, an empty matrix can be passed instead of the
 * missing mask.
 * @param slice Parameter defining the part of the ensemble used for prediction.
 * If "slice = Range.all()", all trees are used. Use this parameter to get
 * predictions of the GBT models with different ensemble sizes learning only one
 * model.
 * @param k Number of tree ensembles built in case of the classification problem
 * (see "Training GBT"). Use this parameter to change the ouput to sum of the
 * trees' predictions in the "k"-th ensemble only. To get the total GBT model
 * prediction, "k" value must be -1. For regression problems, "k" is also equal
 * to -1.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-predict">org.opencv.ml.CvGBTrees.predict</a>
 */
    public  float predict(Mat sample, Mat missing, Range slice, int k)
    {

        float retVal = predict_0(nativeObj, sample.nativeObj, missing.nativeObj, slice.start, slice.end, k);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method predicts the response corresponding to the given sample (see
 * "Predicting with GBT").
 * The result is either the class label or the estimated function value. The
 * "predict" method enables using the parallel version of the GBT model
 * prediction if the OpenCV is built with the TBB library. In this case,
 * predictions of single trees are computed in a parallel fashion.
 *
 * @param sample Input feature vector that has the same format as every training
 * set element. If not all the variables were actualy used during training,
 * "sample" contains forged values at the appropriate places.
 * @param missing Missing values mask, which is a dimentional matrix of the same
 * size as "sample" having the "CV_8U" type. "1" corresponds to the missing
 * value in the same position in the "sample" vector. If there are no missing
 * values in the feature vector, an empty matrix can be passed instead of the
 * missing mask.
 * @param slice Parameter defining the part of the ensemble used for prediction.
 * If "slice = Range.all()", all trees are used. Use this parameter to get
 * predictions of the GBT models with different ensemble sizes learning only one
 * model.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-predict">org.opencv.ml.CvGBTrees.predict</a>
 */
    public  float predict(Mat sample, Mat missing, Range slice)
    {

        float retVal = predict_1(nativeObj, sample.nativeObj, missing.nativeObj, slice.start, slice.end);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method predicts the response corresponding to the given sample (see
 * "Predicting with GBT").
 * The result is either the class label or the estimated function value. The
 * "predict" method enables using the parallel version of the GBT model
 * prediction if the OpenCV is built with the TBB library. In this case,
 * predictions of single trees are computed in a parallel fashion.
 *
 * @param sample Input feature vector that has the same format as every training
 * set element. If not all the variables were actualy used during training,
 * "sample" contains forged values at the appropriate places.
 * @param missing Missing values mask, which is a dimentional matrix of the same
 * size as "sample" having the "CV_8U" type. "1" corresponds to the missing
 * value in the same position in the "sample" vector. If there are no missing
 * values in the feature vector, an empty matrix can be passed instead of the
 * missing mask.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-predict">org.opencv.ml.CvGBTrees.predict</a>
 */
    public  float predict(Mat sample, Mat missing)
    {

        float retVal = predict_2(nativeObj, sample.nativeObj, missing.nativeObj);

        return retVal;
    }

/**
 * Predicts a response for an input sample.
 *
 * The method predicts the response corresponding to the given sample (see
 * "Predicting with GBT").
 * The result is either the class label or the estimated function value. The
 * "predict" method enables using the parallel version of the GBT model
 * prediction if the OpenCV is built with the TBB library. In this case,
 * predictions of single trees are computed in a parallel fashion.
 *
 * @param sample Input feature vector that has the same format as every training
 * set element. If not all the variables were actualy used during training,
 * "sample" contains forged values at the appropriate places.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-predict">org.opencv.ml.CvGBTrees.predict</a>
 */
    public  float predict(Mat sample)
    {

        float retVal = predict_3(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvGBTrees::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvGBTreesParams params = CvGBTreesParams(), bool update = false)
    //

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 * @param params a params
 * @param update a update
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvGBTreesParams params, boolean update)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj, update);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask, CvGBTreesParams params)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 * @param missingDataMask a missingDataMask
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType, Mat missingDataMask)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj, missingDataMask.nativeObj);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param varType a varType
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx, Mat varType)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, varType.nativeObj);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_4(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
 */
    public  boolean train(Mat trainData, int tflag, Mat responses, Mat varIdx)
    {

        boolean retVal = train_5(nativeObj, trainData.nativeObj, tflag, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains a Gradient boosted tree model.
 *
 * The first train method follows the common template (see "CvStatModel.train").
 * Both "tflag" values ("CV_ROW_SAMPLE", "CV_COL_SAMPLE") are supported.
 * "trainData" must be of the "CV_32F" type. "responses" must be a matrix of
 * type "CV_32S" or "CV_32F". In both cases it is converted into the "CV_32F"
 * matrix inside the training procedure. "varIdx" and "sampleIdx" must be a list
 * of indices ("CV_32S") or a mask ("CV_8U" or "CV_8S"). "update" is a dummy
 * parameter.
 *
 * The second form of "CvGBTrees.train" function uses "CvMLData" as a data set
 * container. "update" is still a dummy parameter.
 *
 * All parameters specific to the GBT model are passed into the training
 * function as a "CvGBTreesParams" structure.
 *
 * @param trainData a trainData
 * @param tflag a tflag
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/gradient_boosted_trees.html#cvgbtrees-train">org.opencv.ml.CvGBTrees.train</a>
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

    // C++:   CvGBTrees::CvGBTrees()
    private static native long CvGBTrees_0();

    // C++:   CvGBTrees::CvGBTrees(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvGBTreesParams params = CvGBTreesParams())
    private static native long CvGBTrees_1(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj, long params_nativeObj);
    private static native long CvGBTrees_2(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj, long missingDataMask_nativeObj);
    private static native long CvGBTrees_3(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long varType_nativeObj);
    private static native long CvGBTrees_4(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native long CvGBTrees_5(long trainData_nativeObj, int tflag, long responses_nativeObj, long varIdx_nativeObj);
    private static native long CvGBTrees_6(long trainData_nativeObj, int tflag, long responses_nativeObj);

    // C++:  void CvGBTrees::clear()
    private static native void clear_0(long nativeObj);

    // C++:  float CvGBTrees::predict(Mat sample, Mat missing = cv::Mat(), Range slice = cv::Range::all(), int k = -1)
    private static native float predict_0(long nativeObj, long sample_nativeObj, long missing_nativeObj, int slice_start, int slice_end, int k);
    private static native float predict_1(long nativeObj, long sample_nativeObj, long missing_nativeObj, int slice_start, int slice_end);
    private static native float predict_2(long nativeObj, long sample_nativeObj, long missing_nativeObj);
    private static native float predict_3(long nativeObj, long sample_nativeObj);

    // C++:  bool CvGBTrees::train(Mat trainData, int tflag, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), Mat varType = cv::Mat(), Mat missingDataMask = cv::Mat(), CvGBTreesParams params = CvGBTreesParams(), bool update = false)
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
