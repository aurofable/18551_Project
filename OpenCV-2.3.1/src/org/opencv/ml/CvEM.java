
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class CvEM
/**
 * The class implements the EM algorithm as described in the beginning of this
 * section.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem">org.opencv.ml.CvEM</a>
 */
public class CvEM {

    protected final long nativeObj;
    protected CvEM(long addr) { nativeObj = addr; }


    public static final int
            COV_MAT_SPHERICAL = 0,
            COV_MAT_DIAGONAL = 1,
            COV_MAT_GENERIC = 2,
            START_E_STEP = 1,
            START_M_STEP = 2,
            START_AUTO_STEP = 0;


    //
    // C++:   CvEM::CvEM()
    //

    public   CvEM()
    {

        nativeObj = CvEM_0();

        return;
    }


    //
    // C++:   CvEM::CvEM(Mat samples, Mat sampleIdx = cv::Mat(), CvEMParams params = CvEMParams())
    //

    public   CvEM(Mat samples, Mat sampleIdx, CvEMParams params)
    {

        nativeObj = CvEM_1(samples.nativeObj, sampleIdx.nativeObj, params.nativeObj);

        return;
    }

    public   CvEM(Mat samples, Mat sampleIdx)
    {

        nativeObj = CvEM_2(samples.nativeObj, sampleIdx.nativeObj);

        return;
    }

    public   CvEM(Mat samples)
    {

        nativeObj = CvEM_3(samples.nativeObj);

        return;
    }


    //
    // C++:  double CvEM::calcLikelihood(Mat sample)
    //

    public  double calcLikelihood(Mat sample)
    {

        double retVal = calcLikelihood_0(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  void CvEM::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  void CvEM::getCovs(vector_Mat& covs)
    //

/**
 * Returns mixture covariance matrices S_k.
 *
 * @param covs a covs
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getcovs">org.opencv.ml.CvEM.getCovs</a>
 */
    public  void getCovs(List<Mat> covs)
    {
        Mat covs_mat = new Mat();
        getCovs_0(nativeObj, covs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(covs_mat, covs);
        return;
    }


    //
    // C++:  double CvEM::getLikelihood()
    //

/**
 * Returns logarithm of likelihood.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getlikelihood">org.opencv.ml.CvEM.getLikelihood</a>
 */
    public  double getLikelihood()
    {

        double retVal = getLikelihood_0(nativeObj);

        return retVal;
    }


    //
    // C++:  double CvEM::getLikelihoodDelta()
    //

/**
 * Returns difference between logarithm of likelihood on the last iteration and
 * logarithm of likelihood on the previous iteration.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getlikelihooddelta">org.opencv.ml.CvEM.getLikelihoodDelta</a>
 */
    public  double getLikelihoodDelta()
    {

        double retVal = getLikelihoodDelta_0(nativeObj);

        return retVal;
    }


    //
    // C++:  Mat CvEM::getMeans()
    //

/**
 * Returns mixture means a_k.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getmeans">org.opencv.ml.CvEM.getMeans</a>
 */
    public  Mat getMeans()
    {

        Mat retVal = new Mat(getMeans_0(nativeObj));

        return retVal;
    }


    //
    // C++:  int CvEM::getNClusters()
    //

/**
 * Returns the number of mixture components M in the gaussian mixture model.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getnclusters">org.opencv.ml.CvEM.getNClusters</a>
 */
    public  int getNClusters()
    {

        int retVal = getNClusters_0(nativeObj);

        return retVal;
    }


    //
    // C++:  Mat CvEM::getProbs()
    //

/**
 * Returns vectors of probabilities for each training sample.
 *
 * For each training sample i (that have been passed to the constructor or to
 * "CvEM.train") returns probabilites p_(i,k) to belong to a mixture component
 * k.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getprobs">org.opencv.ml.CvEM.getProbs</a>
 */
    public  Mat getProbs()
    {

        Mat retVal = new Mat(getProbs_0(nativeObj));

        return retVal;
    }


    //
    // C++:  Mat CvEM::getWeights()
    //

/**
 * Returns mixture weights pi_k.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-getweights">org.opencv.ml.CvEM.getWeights</a>
 */
    public  Mat getWeights()
    {

        Mat retVal = new Mat(getWeights_0(nativeObj));

        return retVal;
    }


    //
    // C++:  float CvEM::predict(Mat sample, Mat* probs = 0)
    //

/**
 * Returns a mixture component index of a sample.
 *
 * @param sample A sample for classification.
 * @param probs If it is not null then the method will write posterior
 * probabilities of each component given the sample data to this parameter.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-predict">org.opencv.ml.CvEM.predict</a>
 */
    public  float predict(Mat sample, Mat probs)
    {

        float retVal = predict_0(nativeObj, sample.nativeObj, probs.nativeObj);

        return retVal;
    }

/**
 * Returns a mixture component index of a sample.
 *
 * @param sample A sample for classification.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-predict">org.opencv.ml.CvEM.predict</a>
 */
    public  float predict(Mat sample)
    {

        float retVal = predict_1(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvEM::train(Mat samples, Mat sampleIdx = cv::Mat(), CvEMParams params = CvEMParams(), Mat* labels = 0)
    //

/**
 * Estimates the Gaussian mixture parameters from a sample set.
 *
 * Unlike many of the ML models, EM is an unsupervised learning algorithm and it
 * does not take responses (class labels or function values) as input. Instead,
 * it computes the *Maximum Likelihood Estimate* of the Gaussian mixture
 * parameters from an input sample set, stores all the parameters inside the
 * structure: p_(i,k) in "probs", a_k in "means", S_k in "covs[k]", pi_k in
 * "weights", and optionally computes the output "class label" for each sample:
 * labels_i=arg max_k(p_(i,k)), i=1..N (indices of the most probable mixture
 * component for each sample).
 *
 * The trained model can be used further for prediction, just like any other
 * classifier. The trained model is similar to the "CvBayesClassifier".
 *
 * For an example of clustering random samples of the multi-Gaussian
 * distribution using EM, see "em.cpp" sample in the OpenCV distribution.
 *
 * @param samples Samples from which the Gaussian mixture model will be
 * estimated.
 * @param sampleIdx a sampleIdx
 * @param params Parameters of the EM algorithm.
 * @param labels The optional output "class label" for each sample: labels_i=arg
 * max_k(p_(i,k)), i=1..N (indices of the most probable mixture component for
 * each sample).
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-train">org.opencv.ml.CvEM.train</a>
 */
    public  boolean train(Mat samples, Mat sampleIdx, CvEMParams params, Mat labels)
    {

        boolean retVal = train_0(nativeObj, samples.nativeObj, sampleIdx.nativeObj, params.nativeObj, labels.nativeObj);

        return retVal;
    }

/**
 * Estimates the Gaussian mixture parameters from a sample set.
 *
 * Unlike many of the ML models, EM is an unsupervised learning algorithm and it
 * does not take responses (class labels or function values) as input. Instead,
 * it computes the *Maximum Likelihood Estimate* of the Gaussian mixture
 * parameters from an input sample set, stores all the parameters inside the
 * structure: p_(i,k) in "probs", a_k in "means", S_k in "covs[k]", pi_k in
 * "weights", and optionally computes the output "class label" for each sample:
 * labels_i=arg max_k(p_(i,k)), i=1..N (indices of the most probable mixture
 * component for each sample).
 *
 * The trained model can be used further for prediction, just like any other
 * classifier. The trained model is similar to the "CvBayesClassifier".
 *
 * For an example of clustering random samples of the multi-Gaussian
 * distribution using EM, see "em.cpp" sample in the OpenCV distribution.
 *
 * @param samples Samples from which the Gaussian mixture model will be
 * estimated.
 * @param sampleIdx a sampleIdx
 * @param params Parameters of the EM algorithm.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-train">org.opencv.ml.CvEM.train</a>
 */
    public  boolean train(Mat samples, Mat sampleIdx, CvEMParams params)
    {

        boolean retVal = train_1(nativeObj, samples.nativeObj, sampleIdx.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Estimates the Gaussian mixture parameters from a sample set.
 *
 * Unlike many of the ML models, EM is an unsupervised learning algorithm and it
 * does not take responses (class labels or function values) as input. Instead,
 * it computes the *Maximum Likelihood Estimate* of the Gaussian mixture
 * parameters from an input sample set, stores all the parameters inside the
 * structure: p_(i,k) in "probs", a_k in "means", S_k in "covs[k]", pi_k in
 * "weights", and optionally computes the output "class label" for each sample:
 * labels_i=arg max_k(p_(i,k)), i=1..N (indices of the most probable mixture
 * component for each sample).
 *
 * The trained model can be used further for prediction, just like any other
 * classifier. The trained model is similar to the "CvBayesClassifier".
 *
 * For an example of clustering random samples of the multi-Gaussian
 * distribution using EM, see "em.cpp" sample in the OpenCV distribution.
 *
 * @param samples Samples from which the Gaussian mixture model will be
 * estimated.
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-train">org.opencv.ml.CvEM.train</a>
 */
    public  boolean train(Mat samples, Mat sampleIdx)
    {

        boolean retVal = train_2(nativeObj, samples.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Estimates the Gaussian mixture parameters from a sample set.
 *
 * Unlike many of the ML models, EM is an unsupervised learning algorithm and it
 * does not take responses (class labels or function values) as input. Instead,
 * it computes the *Maximum Likelihood Estimate* of the Gaussian mixture
 * parameters from an input sample set, stores all the parameters inside the
 * structure: p_(i,k) in "probs", a_k in "means", S_k in "covs[k]", pi_k in
 * "weights", and optionally computes the output "class label" for each sample:
 * labels_i=arg max_k(p_(i,k)), i=1..N (indices of the most probable mixture
 * component for each sample).
 *
 * The trained model can be used further for prediction, just like any other
 * classifier. The trained model is similar to the "CvBayesClassifier".
 *
 * For an example of clustering random samples of the multi-Gaussian
 * distribution using EM, see "em.cpp" sample in the OpenCV distribution.
 *
 * @param samples Samples from which the Gaussian mixture model will be
 * estimated.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/expectation_maximization.html#cvem-train">org.opencv.ml.CvEM.train</a>
 */
    public  boolean train(Mat samples)
    {

        boolean retVal = train_3(nativeObj, samples.nativeObj);

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

    // C++:   CvEM::CvEM()
    private static native long CvEM_0();

    // C++:   CvEM::CvEM(Mat samples, Mat sampleIdx = cv::Mat(), CvEMParams params = CvEMParams())
    private static native long CvEM_1(long samples_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);
    private static native long CvEM_2(long samples_nativeObj, long sampleIdx_nativeObj);
    private static native long CvEM_3(long samples_nativeObj);

    // C++:  double CvEM::calcLikelihood(Mat sample)
    private static native double calcLikelihood_0(long nativeObj, long sample_nativeObj);

    // C++:  void CvEM::clear()
    private static native void clear_0(long nativeObj);

    // C++:  void CvEM::getCovs(vector_Mat& covs)
    private static native void getCovs_0(long nativeObj, long covs_mat_nativeObj);

    // C++:  double CvEM::getLikelihood()
    private static native double getLikelihood_0(long nativeObj);

    // C++:  double CvEM::getLikelihoodDelta()
    private static native double getLikelihoodDelta_0(long nativeObj);

    // C++:  Mat CvEM::getMeans()
    private static native long getMeans_0(long nativeObj);

    // C++:  int CvEM::getNClusters()
    private static native int getNClusters_0(long nativeObj);

    // C++:  Mat CvEM::getProbs()
    private static native long getProbs_0(long nativeObj);

    // C++:  Mat CvEM::getWeights()
    private static native long getWeights_0(long nativeObj);

    // C++:  float CvEM::predict(Mat sample, Mat* probs = 0)
    private static native float predict_0(long nativeObj, long sample_nativeObj, long probs_nativeObj);
    private static native float predict_1(long nativeObj, long sample_nativeObj);

    // C++:  bool CvEM::train(Mat samples, Mat sampleIdx = cv::Mat(), CvEMParams params = CvEMParams(), Mat* labels = 0)
    private static native boolean train_0(long nativeObj, long samples_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, long labels_nativeObj);
    private static native boolean train_1(long nativeObj, long samples_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);
    private static native boolean train_2(long nativeObj, long samples_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_3(long nativeObj, long samples_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
