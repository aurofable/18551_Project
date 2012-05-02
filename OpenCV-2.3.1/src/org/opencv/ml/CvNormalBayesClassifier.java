
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;

// C++: class CvNormalBayesClassifier
/**
 * Bayes classifier for normally distributed data.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier">org.opencv.ml.CvNormalBayesClassifier</a>
 */
public class CvNormalBayesClassifier {

    protected final long nativeObj;
    protected CvNormalBayesClassifier(long addr) { nativeObj = addr; }


    //
    // C++:   CvNormalBayesClassifier::CvNormalBayesClassifier()
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-cvnormalbayesclassifier">org.opencv.ml.CvNormalBayesClassifier.CvNormalBayesClassifier</a>
 */
    public   CvNormalBayesClassifier()
    {

        nativeObj = CvNormalBayesClassifier_0();

        return;
    }


    //
    // C++:   CvNormalBayesClassifier::CvNormalBayesClassifier(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat())
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-cvnormalbayesclassifier">org.opencv.ml.CvNormalBayesClassifier.CvNormalBayesClassifier</a>
 */
    public   CvNormalBayesClassifier(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        nativeObj = CvNormalBayesClassifier_1(trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-cvnormalbayesclassifier">org.opencv.ml.CvNormalBayesClassifier.CvNormalBayesClassifier</a>
 */
    public   CvNormalBayesClassifier(Mat trainData, Mat responses, Mat varIdx)
    {

        nativeObj = CvNormalBayesClassifier_2(trainData.nativeObj, responses.nativeObj, varIdx.nativeObj);

        return;
    }

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @param trainData a trainData
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-cvnormalbayesclassifier">org.opencv.ml.CvNormalBayesClassifier.CvNormalBayesClassifier</a>
 */
    public   CvNormalBayesClassifier(Mat trainData, Mat responses)
    {

        nativeObj = CvNormalBayesClassifier_3(trainData.nativeObj, responses.nativeObj);

        return;
    }


    //
    // C++:  void CvNormalBayesClassifier::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  float CvNormalBayesClassifier::predict(Mat samples, Mat* results = 0)
    //

/**
 * Predicts the response for sample(s).
 *
 * The method estimates the most probable classes for input vectors. Input
 * vectors (one or more) are stored as rows of the matrix "samples". In case of
 * multiple input vectors, there should be one output vector "results". The
 * predicted class for a single input vector is returned by the method.
 *
 * @param samples a samples
 * @param results a results
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-predict">org.opencv.ml.CvNormalBayesClassifier.predict</a>
 */
    public  float predict(Mat samples, Mat results)
    {

        float retVal = predict_0(nativeObj, samples.nativeObj, results.nativeObj);

        return retVal;
    }

/**
 * Predicts the response for sample(s).
 *
 * The method estimates the most probable classes for input vectors. Input
 * vectors (one or more) are stored as rows of the matrix "samples". In case of
 * multiple input vectors, there should be one output vector "results". The
 * predicted class for a single input vector is returned by the method.
 *
 * @param samples a samples
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-predict">org.opencv.ml.CvNormalBayesClassifier.predict</a>
 */
    public  float predict(Mat samples)
    {

        float retVal = predict_1(nativeObj, samples.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvNormalBayesClassifier::train(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), bool update = false)
    //

/**
 * Trains the model.
 *
 * The method trains the Normal Bayes classifier. It follows the conventions of
 * the generic "CvStatModel.train" approach with the following limitations:
 *   * Only "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variable is categorical, which means that elements of "responses"
 * must be integer numbers, though the vector may have the "CV_32FC1" type.
 *   * Missing measurements are not supported.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param update Identifies whether the model should be trained from scratch
 * ("update=false") or should be updated using the new training data
 * ("update=true").
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-train">org.opencv.ml.CvNormalBayesClassifier.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, boolean update)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, update);

        return retVal;
    }

/**
 * Trains the model.
 *
 * The method trains the Normal Bayes classifier. It follows the conventions of
 * the generic "CvStatModel.train" approach with the following limitations:
 *   * Only "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variable is categorical, which means that elements of "responses"
 * must be integer numbers, though the vector may have the "CV_32FC1" type.
 *   * Missing measurements are not supported.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-train">org.opencv.ml.CvNormalBayesClassifier.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains the model.
 *
 * The method trains the Normal Bayes classifier. It follows the conventions of
 * the generic "CvStatModel.train" approach with the following limitations:
 *   * Only "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variable is categorical, which means that elements of "responses"
 * must be integer numbers, though the vector may have the "CV_32FC1" type.
 *   * Missing measurements are not supported.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-train">org.opencv.ml.CvNormalBayesClassifier.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains the model.
 *
 * The method trains the Normal Bayes classifier. It follows the conventions of
 * the generic "CvStatModel.train" approach with the following limitations:
 *   * Only "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variable is categorical, which means that elements of "responses"
 * must be integer numbers, though the vector may have the "CV_32FC1" type.
 *   * Missing measurements are not supported.
 *
 * @param trainData a trainData
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/normal_bayes_classifier.html#cvnormalbayesclassifier-train">org.opencv.ml.CvNormalBayesClassifier.train</a>
 */
    public  boolean train(Mat trainData, Mat responses)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, responses.nativeObj);

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

    // C++:   CvNormalBayesClassifier::CvNormalBayesClassifier()
    private static native long CvNormalBayesClassifier_0();

    // C++:   CvNormalBayesClassifier::CvNormalBayesClassifier(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat())
    private static native long CvNormalBayesClassifier_1(long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native long CvNormalBayesClassifier_2(long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj);
    private static native long CvNormalBayesClassifier_3(long trainData_nativeObj, long responses_nativeObj);

    // C++:  void CvNormalBayesClassifier::clear()
    private static native void clear_0(long nativeObj);

    // C++:  float CvNormalBayesClassifier::predict(Mat samples, Mat* results = 0)
    private static native float predict_0(long nativeObj, long samples_nativeObj, long results_nativeObj);
    private static native float predict_1(long nativeObj, long samples_nativeObj);

    // C++:  bool CvNormalBayesClassifier::train(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), bool update = false)
    private static native boolean train_0(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, boolean update);
    private static native boolean train_1(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_2(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj);
    private static native boolean train_3(long nativeObj, long trainData_nativeObj, long responses_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
