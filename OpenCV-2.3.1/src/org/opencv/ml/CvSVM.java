
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;

// C++: class CvSVM
/**
 * Support Vector Machines.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm">org.opencv.ml.CvSVM</a>
 */
public class CvSVM {

    protected final long nativeObj;
    protected CvSVM(long addr) { nativeObj = addr; }


    public static final int
            C_SVC = 100,
            NU_SVC = 101,
            ONE_CLASS = 102,
            EPS_SVR = 103,
            NU_SVR = 104,
            LINEAR = 0,
            POLY = 1,
            RBF = 2,
            SIGMOID = 3,
            C = 0,
            GAMMA = 1,
            P = 2,
            NU = 3,
            COEF = 4,
            DEGREE = 5;


    //
    // C++:   CvSVM::CvSVM()
    //

/**
 * Default and training constructors.
 *
 * The constructors follow conventions of "CvStatModel.CvStatModel". See
 * "CvStatModel.train" for parameters descriptions.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-cvsvm">org.opencv.ml.CvSVM.CvSVM</a>
 */
    public   CvSVM()
    {

        nativeObj = CvSVM_0();

        return;
    }


    //
    // C++:   CvSVM::CvSVM(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), CvSVMParams params = CvSVMParams())
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
 * @param params a params
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-cvsvm">org.opencv.ml.CvSVM.CvSVM</a>
 */
    public   CvSVM(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params)
    {

        nativeObj = CvSVM_1(trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj);

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
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-cvsvm">org.opencv.ml.CvSVM.CvSVM</a>
 */
    public   CvSVM(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        nativeObj = CvSVM_2(trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-cvsvm">org.opencv.ml.CvSVM.CvSVM</a>
 */
    public   CvSVM(Mat trainData, Mat responses, Mat varIdx)
    {

        nativeObj = CvSVM_3(trainData.nativeObj, responses.nativeObj, varIdx.nativeObj);

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
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-cvsvm">org.opencv.ml.CvSVM.CvSVM</a>
 */
    public   CvSVM(Mat trainData, Mat responses)
    {

        nativeObj = CvSVM_4(trainData.nativeObj, responses.nativeObj);

        return;
    }


    //
    // C++:  void CvSVM::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  int CvSVM::get_support_vector_count()
    //

    public  int get_support_vector_count()
    {

        int retVal = get_support_vector_count_0(nativeObj);

        return retVal;
    }


    //
    // C++:  int CvSVM::get_var_count()
    //

/**
 * Returns the number of used features (variables count).
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-get-var-count">org.opencv.ml.CvSVM.get_var_count</a>
 */
    public  int get_var_count()
    {

        int retVal = get_var_count_0(nativeObj);

        return retVal;
    }


    //
    // C++:  float CvSVM::predict(Mat sample, bool returnDFVal = false)
    //

/**
 * Predicts the response for input sample(s).
 *
 * If you pass one sample then prediction result is returned. If you want to get
 * responses for several samples then you should pass the "results" matrix where
 * prediction results will be stored.
 *
 * @param sample a sample
 * @param returnDFVal Specifies a type of the return value. If "true" and the
 * problem is 2-class classification then the method returns the decision
 * function value that is signed distance to the margin, else the function
 * returns a class label (classification) or estimated function value
 * (regression).
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-predict">org.opencv.ml.CvSVM.predict</a>
 */
    public  float predict(Mat sample, boolean returnDFVal)
    {

        float retVal = predict_0(nativeObj, sample.nativeObj, returnDFVal);

        return retVal;
    }

/**
 * Predicts the response for input sample(s).
 *
 * If you pass one sample then prediction result is returned. If you want to get
 * responses for several samples then you should pass the "results" matrix where
 * prediction results will be stored.
 *
 * @param sample a sample
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-predict">org.opencv.ml.CvSVM.predict</a>
 */
    public  float predict(Mat sample)
    {

        float retVal = predict_1(nativeObj, sample.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvSVM::train(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), CvSVMParams params = CvSVMParams())
    //

/**
 * Trains an SVM.
 *
 * The method trains the SVM model. It follows the conventions of the generic
 * "CvStatModel.train" approach with the following limitations:
 *   * Only the "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variables can be either categorical ("params.svm_type=CvSVM.C_SVC"
 * or "params.svm_type=CvSVM.NU_SVC"), or ordered ("params.svm_type=CvSVM.EPS_SVR"
 * or "params.svm_type=CvSVM.NU_SVR"), or not required at all ("params.svm_type=CvSVM.ONE_CLASS").
 *   * Missing measurements are not supported.
 *
 * All the other parameters are gathered in the "CvSVMParams" structure.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train">org.opencv.ml.CvSVM.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params)
    {

        boolean retVal = train_0(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM.
 *
 * The method trains the SVM model. It follows the conventions of the generic
 * "CvStatModel.train" approach with the following limitations:
 *   * Only the "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variables can be either categorical ("params.svm_type=CvSVM.C_SVC"
 * or "params.svm_type=CvSVM.NU_SVC"), or ordered ("params.svm_type=CvSVM.EPS_SVR"
 * or "params.svm_type=CvSVM.NU_SVR"), or not required at all ("params.svm_type=CvSVM.ONE_CLASS").
 *   * Missing measurements are not supported.
 *
 * All the other parameters are gathered in the "CvSVMParams" structure.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train">org.opencv.ml.CvSVM.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx)
    {

        boolean retVal = train_1(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM.
 *
 * The method trains the SVM model. It follows the conventions of the generic
 * "CvStatModel.train" approach with the following limitations:
 *   * Only the "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variables can be either categorical ("params.svm_type=CvSVM.C_SVC"
 * or "params.svm_type=CvSVM.NU_SVC"), or ordered ("params.svm_type=CvSVM.EPS_SVR"
 * or "params.svm_type=CvSVM.NU_SVR"), or not required at all ("params.svm_type=CvSVM.ONE_CLASS").
 *   * Missing measurements are not supported.
 *
 * All the other parameters are gathered in the "CvSVMParams" structure.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train">org.opencv.ml.CvSVM.train</a>
 */
    public  boolean train(Mat trainData, Mat responses, Mat varIdx)
    {

        boolean retVal = train_2(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM.
 *
 * The method trains the SVM model. It follows the conventions of the generic
 * "CvStatModel.train" approach with the following limitations:
 *   * Only the "CV_ROW_SAMPLE" data layout is supported.
 *   * Input variables are all ordered.
 *   * Output variables can be either categorical ("params.svm_type=CvSVM.C_SVC"
 * or "params.svm_type=CvSVM.NU_SVC"), or ordered ("params.svm_type=CvSVM.EPS_SVR"
 * or "params.svm_type=CvSVM.NU_SVR"), or not required at all ("params.svm_type=CvSVM.ONE_CLASS").
 *   * Missing measurements are not supported.
 *
 * All the other parameters are gathered in the "CvSVMParams" structure.
 *
 * @param trainData a trainData
 * @param responses a responses
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train">org.opencv.ml.CvSVM.train</a>
 */
    public  boolean train(Mat trainData, Mat responses)
    {

        boolean retVal = train_3(nativeObj, trainData.nativeObj, responses.nativeObj);

        return retVal;
    }


    //
    // C++:  bool CvSVM::train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold = 10, CvParamGrid Cgrid = CvSVM::get_default_grid(CvSVM::C), CvParamGrid gammaGrid = CvSVM::get_default_grid(CvSVM::GAMMA), CvParamGrid pGrid = CvSVM::get_default_grid(CvSVM::P), CvParamGrid nuGrid = CvSVM::get_default_grid(CvSVM::NU), CvParamGrid coeffGrid = CvSVM::get_default_grid(CvSVM::COEF), CvParamGrid degreeGrid = CvSVM::get_default_grid(CvSVM::DEGREE), bool balanced = false)
    //

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 * @param pGrid a pGrid
 * @param nuGrid a nuGrid
 * @param coeffGrid a coeffGrid
 * @param degreeGrid a degreeGrid
 * @param balanced If "true" and the problem is 2-class classification then the
 * method creates more balanced cross-validation subsets that is proportions
 * between classes in subsets are close to such proportion in the whole train
 * dataset.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid, CvParamGrid pGrid, CvParamGrid nuGrid, CvParamGrid coeffGrid, CvParamGrid degreeGrid, boolean balanced)
    {

        boolean retVal = train_auto_0(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj, pGrid.nativeObj, nuGrid.nativeObj, coeffGrid.nativeObj, degreeGrid.nativeObj, balanced);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 * @param pGrid a pGrid
 * @param nuGrid a nuGrid
 * @param coeffGrid a coeffGrid
 * @param degreeGrid a degreeGrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid, CvParamGrid pGrid, CvParamGrid nuGrid, CvParamGrid coeffGrid, CvParamGrid degreeGrid)
    {

        boolean retVal = train_auto_1(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj, pGrid.nativeObj, nuGrid.nativeObj, coeffGrid.nativeObj, degreeGrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 * @param pGrid a pGrid
 * @param nuGrid a nuGrid
 * @param coeffGrid a coeffGrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid, CvParamGrid pGrid, CvParamGrid nuGrid, CvParamGrid coeffGrid)
    {

        boolean retVal = train_auto_2(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj, pGrid.nativeObj, nuGrid.nativeObj, coeffGrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 * @param pGrid a pGrid
 * @param nuGrid a nuGrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid, CvParamGrid pGrid, CvParamGrid nuGrid)
    {

        boolean retVal = train_auto_3(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj, pGrid.nativeObj, nuGrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 * @param pGrid a pGrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid, CvParamGrid pGrid)
    {

        boolean retVal = train_auto_4(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj, pGrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 * @param gammaGrid a gammaGrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid, CvParamGrid gammaGrid)
    {

        boolean retVal = train_auto_5(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj, gammaGrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 * @param Cgrid a Cgrid
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold, CvParamGrid Cgrid)
    {

        boolean retVal = train_auto_6(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold, Cgrid.nativeObj);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 * @param k_fold Cross-validation parameter. The training set is divided into
 * "k_fold" subsets. One subset is used to train the model, the others form the
 * test set. So, the SVM algorithm is executed "k_fold" times.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold)
    {

        boolean retVal = train_auto_7(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj, k_fold);

        return retVal;
    }

/**
 * Trains an SVM with optimal parameters.
 *
 * The method trains the SVM model automatically by choosing the optimal
 * parameters "C", "gamma", "p", "nu", "coef0", "degree" from "CvSVMParams".
 * Parameters are considered optimal when the cross-validation estimate of the
 * test set error is minimal.
 *
 * If there is no need to optimize a parameter, the corresponding grid step
 * should be set to any value less than or equal to 1. For example, to avoid
 * optimization in "gamma", set "gamma_grid.step = 0", "gamma_grid.min_val",
 * "gamma_grid.max_val" as arbitrary numbers. In this case, the value
 * "params.gamma" is taken for "gamma".
 *
 * And, finally, if the optimization in a parameter is required but the
 * corresponding grid is unknown, you may call the function "CvSVM.get_default_grid".
 * To generate a grid, for example, for "gamma", call "CvSVM.get_default_grid(CvSVM.GAMMA)".
 *
 * This function works for the classification ("params.svm_type=CvSVM.C_SVC" or
 * "params.svm_type=CvSVM.NU_SVC") as well as for the regression
 * ("params.svm_type=CvSVM.EPS_SVR" or "params.svm_type=CvSVM.NU_SVR"). If
 * "params.svm_type=CvSVM.ONE_CLASS", no optimization is made and the usual SVM
 * with parameters specified in "params" is executed.
 *
 * @param trainData a trainData
 * @param responses a responses
 * @param varIdx a varIdx
 * @param sampleIdx a sampleIdx
 * @param params a params
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/support_vector_machines.html#cvsvm-train-auto">org.opencv.ml.CvSVM.train_auto</a>
 */
    public  boolean train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params)
    {

        boolean retVal = train_auto_8(nativeObj, trainData.nativeObj, responses.nativeObj, varIdx.nativeObj, sampleIdx.nativeObj, params.nativeObj);

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

    // C++:   CvSVM::CvSVM()
    private static native long CvSVM_0();

    // C++:   CvSVM::CvSVM(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), CvSVMParams params = CvSVMParams())
    private static native long CvSVM_1(long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);
    private static native long CvSVM_2(long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native long CvSVM_3(long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj);
    private static native long CvSVM_4(long trainData_nativeObj, long responses_nativeObj);

    // C++:  void CvSVM::clear()
    private static native void clear_0(long nativeObj);

    // C++:  int CvSVM::get_support_vector_count()
    private static native int get_support_vector_count_0(long nativeObj);

    // C++:  int CvSVM::get_var_count()
    private static native int get_var_count_0(long nativeObj);

    // C++:  float CvSVM::predict(Mat sample, bool returnDFVal = false)
    private static native float predict_0(long nativeObj, long sample_nativeObj, boolean returnDFVal);
    private static native float predict_1(long nativeObj, long sample_nativeObj);

    // C++:  bool CvSVM::train(Mat trainData, Mat responses, Mat varIdx = cv::Mat(), Mat sampleIdx = cv::Mat(), CvSVMParams params = CvSVMParams())
    private static native boolean train_0(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);
    private static native boolean train_1(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj);
    private static native boolean train_2(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj);
    private static native boolean train_3(long nativeObj, long trainData_nativeObj, long responses_nativeObj);

    // C++:  bool CvSVM::train_auto(Mat trainData, Mat responses, Mat varIdx, Mat sampleIdx, CvSVMParams params, int k_fold = 10, CvParamGrid Cgrid = CvSVM::get_default_grid(CvSVM::C), CvParamGrid gammaGrid = CvSVM::get_default_grid(CvSVM::GAMMA), CvParamGrid pGrid = CvSVM::get_default_grid(CvSVM::P), CvParamGrid nuGrid = CvSVM::get_default_grid(CvSVM::NU), CvParamGrid coeffGrid = CvSVM::get_default_grid(CvSVM::COEF), CvParamGrid degreeGrid = CvSVM::get_default_grid(CvSVM::DEGREE), bool balanced = false)
    private static native boolean train_auto_0(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj, long pGrid_nativeObj, long nuGrid_nativeObj, long coeffGrid_nativeObj, long degreeGrid_nativeObj, boolean balanced);
    private static native boolean train_auto_1(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj, long pGrid_nativeObj, long nuGrid_nativeObj, long coeffGrid_nativeObj, long degreeGrid_nativeObj);
    private static native boolean train_auto_2(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj, long pGrid_nativeObj, long nuGrid_nativeObj, long coeffGrid_nativeObj);
    private static native boolean train_auto_3(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj, long pGrid_nativeObj, long nuGrid_nativeObj);
    private static native boolean train_auto_4(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj, long pGrid_nativeObj);
    private static native boolean train_auto_5(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj, long gammaGrid_nativeObj);
    private static native boolean train_auto_6(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold, long Cgrid_nativeObj);
    private static native boolean train_auto_7(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int k_fold);
    private static native boolean train_auto_8(long nativeObj, long trainData_nativeObj, long responses_nativeObj, long varIdx_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
