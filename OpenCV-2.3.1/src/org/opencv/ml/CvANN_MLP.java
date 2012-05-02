
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.Mat;

// C++: class CvANN_MLP
/**
 * MLP model.
 *
 * Unlike many other models in ML that are constructed and trained at once, in
 * the MLP model these steps are separated. First, a network with the specified
 * topology is created using the non-default constructor or the method
 * "CvANN_MLP.create". All the weights are set to zeros. Then, the network is
 * trained using a set of input and output vectors. The training procedure can
 * be repeated more than once, that is, the weights can be adjusted based on the
 * new training data.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp">org.opencv.ml.CvANN_MLP</a>
 */
public class CvANN_MLP {

    protected final long nativeObj;
    protected CvANN_MLP(long addr) { nativeObj = addr; }


    public static final int
            IDENTITY = 0,
            SIGMOID_SYM = 1,
            GAUSSIAN = 2,
            UPDATE_WEIGHTS = 1,
            NO_INPUT_SCALE = 2,
            NO_OUTPUT_SCALE = 4;


    //
    // C++:   CvANN_MLP::CvANN_MLP()
    //

/**
 * The constructors.
 *
 * The advanced constructor allows to create MLP with the specified topology.
 * See "CvANN_MLP.create" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-cvann-mlp">org.opencv.ml.CvANN_MLP.CvANN_MLP</a>
 */
    public   CvANN_MLP()
    {

        nativeObj = CvANN_MLP_0();

        return;
    }


    //
    // C++:   CvANN_MLP::CvANN_MLP(Mat layerSizes, int activateFunc = CvANN_MLP::SIGMOID_SYM, double fparam1 = 0, double fparam2 = 0)
    //

/**
 * The constructors.
 *
 * The advanced constructor allows to create MLP with the specified topology.
 * See "CvANN_MLP.create" for details.
 *
 * @param layerSizes a layerSizes
 * @param activateFunc a activateFunc
 * @param fparam1 a fparam1
 * @param fparam2 a fparam2
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-cvann-mlp">org.opencv.ml.CvANN_MLP.CvANN_MLP</a>
 */
    public   CvANN_MLP(Mat layerSizes, int activateFunc, double fparam1, double fparam2)
    {

        nativeObj = CvANN_MLP_1(layerSizes.nativeObj, activateFunc, fparam1, fparam2);

        return;
    }

/**
 * The constructors.
 *
 * The advanced constructor allows to create MLP with the specified topology.
 * See "CvANN_MLP.create" for details.
 *
 * @param layerSizes a layerSizes
 * @param activateFunc a activateFunc
 * @param fparam1 a fparam1
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-cvann-mlp">org.opencv.ml.CvANN_MLP.CvANN_MLP</a>
 */
    public   CvANN_MLP(Mat layerSizes, int activateFunc, double fparam1)
    {

        nativeObj = CvANN_MLP_2(layerSizes.nativeObj, activateFunc, fparam1);

        return;
    }

/**
 * The constructors.
 *
 * The advanced constructor allows to create MLP with the specified topology.
 * See "CvANN_MLP.create" for details.
 *
 * @param layerSizes a layerSizes
 * @param activateFunc a activateFunc
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-cvann-mlp">org.opencv.ml.CvANN_MLP.CvANN_MLP</a>
 */
    public   CvANN_MLP(Mat layerSizes, int activateFunc)
    {

        nativeObj = CvANN_MLP_3(layerSizes.nativeObj, activateFunc);

        return;
    }

/**
 * The constructors.
 *
 * The advanced constructor allows to create MLP with the specified topology.
 * See "CvANN_MLP.create" for details.
 *
 * @param layerSizes a layerSizes
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-cvann-mlp">org.opencv.ml.CvANN_MLP.CvANN_MLP</a>
 */
    public   CvANN_MLP(Mat layerSizes)
    {

        nativeObj = CvANN_MLP_4(layerSizes.nativeObj);

        return;
    }


    //
    // C++:  void CvANN_MLP::clear()
    //

    public  void clear()
    {

        clear_0(nativeObj);

        return;
    }


    //
    // C++:  void CvANN_MLP::create(Mat layerSizes, int activateFunc = CvANN_MLP::SIGMOID_SYM, double fparam1 = 0, double fparam2 = 0)
    //

/**
 * Constructs MLP with the specified topology.
 *
 * The method creates an MLP network with the specified topology and assigns the
 * same activation function to all the neurons.
 *
 * @param layerSizes Integer vector specifying the number of neurons in each
 * layer including the input and output layers.
 * @param activateFunc Parameter specifying the activation function for each
 * neuron: one of "CvANN_MLP.IDENTITY", "CvANN_MLP.SIGMOID_SYM", and
 * "CvANN_MLP.GAUSSIAN".
 * @param fparam1 a fparam1
 * @param fparam2 a fparam2
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-create">org.opencv.ml.CvANN_MLP.create</a>
 */
    public  void create(Mat layerSizes, int activateFunc, double fparam1, double fparam2)
    {

        create_0(nativeObj, layerSizes.nativeObj, activateFunc, fparam1, fparam2);

        return;
    }

/**
 * Constructs MLP with the specified topology.
 *
 * The method creates an MLP network with the specified topology and assigns the
 * same activation function to all the neurons.
 *
 * @param layerSizes Integer vector specifying the number of neurons in each
 * layer including the input and output layers.
 * @param activateFunc Parameter specifying the activation function for each
 * neuron: one of "CvANN_MLP.IDENTITY", "CvANN_MLP.SIGMOID_SYM", and
 * "CvANN_MLP.GAUSSIAN".
 * @param fparam1 a fparam1
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-create">org.opencv.ml.CvANN_MLP.create</a>
 */
    public  void create(Mat layerSizes, int activateFunc, double fparam1)
    {

        create_1(nativeObj, layerSizes.nativeObj, activateFunc, fparam1);

        return;
    }

/**
 * Constructs MLP with the specified topology.
 *
 * The method creates an MLP network with the specified topology and assigns the
 * same activation function to all the neurons.
 *
 * @param layerSizes Integer vector specifying the number of neurons in each
 * layer including the input and output layers.
 * @param activateFunc Parameter specifying the activation function for each
 * neuron: one of "CvANN_MLP.IDENTITY", "CvANN_MLP.SIGMOID_SYM", and
 * "CvANN_MLP.GAUSSIAN".
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-create">org.opencv.ml.CvANN_MLP.create</a>
 */
    public  void create(Mat layerSizes, int activateFunc)
    {

        create_2(nativeObj, layerSizes.nativeObj, activateFunc);

        return;
    }

/**
 * Constructs MLP with the specified topology.
 *
 * The method creates an MLP network with the specified topology and assigns the
 * same activation function to all the neurons.
 *
 * @param layerSizes Integer vector specifying the number of neurons in each
 * layer including the input and output layers.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-create">org.opencv.ml.CvANN_MLP.create</a>
 */
    public  void create(Mat layerSizes)
    {

        create_3(nativeObj, layerSizes.nativeObj);

        return;
    }


    //
    // C++:  float CvANN_MLP::predict(Mat inputs, Mat outputs)
    //

/**
 * Predicts responses for input samples.
 *
 * The method returns a dummy value which should be ignored.
 *
 * @param inputs Input samples.
 * @param outputs Predicted responses for corresponding samples.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-predict">org.opencv.ml.CvANN_MLP.predict</a>
 */
    public  float predict(Mat inputs, Mat outputs)
    {

        float retVal = predict_0(nativeObj, inputs.nativeObj, outputs.nativeObj);

        return retVal;
    }


    //
    // C++:  int CvANN_MLP::train(Mat inputs, Mat outputs, Mat sampleWeights, Mat sampleIdx = cv::Mat(), CvANN_MLP_TrainParams params = CvANN_MLP_TrainParams(), int flags = 0)
    //

/**
 * Trains/updates MLP.
 *
 * This method applies the specified training algorithm to computing/adjusting
 * the network weights. It returns the number of done iterations.
 *
 * @param inputs Floating-point matrix of input vectors, one vector per row.
 * @param outputs Floating-point matrix of the corresponding output vectors, one
 * vector per row.
 * @param sampleWeights (RPROP only) Optional floating-point vector of weights
 * for each sample. Some samples may be more important than others for training.
 * You may want to raise the weight of certain classes to find the right balance
 * between hit-rate and false-alarm rate, and so on.
 * @param sampleIdx Optional integer vector indicating the samples (rows of
 * "inputs" and "outputs") that are taken into account.
 * @param params Training parameters. See the "CvANN_MLP_TrainParams"
 * description.
 * @param flags Various parameters to control the training algorithm. A
 * combination of the following parameters is possible:
 *   * UPDATE_WEIGHTS Algorithm updates the network weights, rather than
 * computes them from scratch. In the latter case the weights are initialized
 * using the Nguyen-Widrow algorithm.
 *   * NO_INPUT_SCALE Algorithm does not normalize the input vectors. If this
 * flag is not set, the training algorithm normalizes each input feature
 * independently, shifting its mean value to 0 and making the standard deviation
 * equal to 1. If the network is assumed to be updated frequently, the new
 * training data could be much different from original one. In this case, you
 * should take care of proper normalization.
 *   * NO_OUTPUT_SCALE Algorithm does not normalize the output vectors. If the
 * flag is not set, the training algorithm normalizes each output feature
 * independently, by transforming it to the certain range depending on the used
 * activation function.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-train">org.opencv.ml.CvANN_MLP.train</a>
 */
    public  int train(Mat inputs, Mat outputs, Mat sampleWeights, Mat sampleIdx, CvANN_MLP_TrainParams params, int flags)
    {

        int retVal = train_0(nativeObj, inputs.nativeObj, outputs.nativeObj, sampleWeights.nativeObj, sampleIdx.nativeObj, params.nativeObj, flags);

        return retVal;
    }

/**
 * Trains/updates MLP.
 *
 * This method applies the specified training algorithm to computing/adjusting
 * the network weights. It returns the number of done iterations.
 *
 * @param inputs Floating-point matrix of input vectors, one vector per row.
 * @param outputs Floating-point matrix of the corresponding output vectors, one
 * vector per row.
 * @param sampleWeights (RPROP only) Optional floating-point vector of weights
 * for each sample. Some samples may be more important than others for training.
 * You may want to raise the weight of certain classes to find the right balance
 * between hit-rate and false-alarm rate, and so on.
 * @param sampleIdx Optional integer vector indicating the samples (rows of
 * "inputs" and "outputs") that are taken into account.
 * @param params Training parameters. See the "CvANN_MLP_TrainParams"
 * description.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-train">org.opencv.ml.CvANN_MLP.train</a>
 */
    public  int train(Mat inputs, Mat outputs, Mat sampleWeights, Mat sampleIdx, CvANN_MLP_TrainParams params)
    {

        int retVal = train_1(nativeObj, inputs.nativeObj, outputs.nativeObj, sampleWeights.nativeObj, sampleIdx.nativeObj, params.nativeObj);

        return retVal;
    }

/**
 * Trains/updates MLP.
 *
 * This method applies the specified training algorithm to computing/adjusting
 * the network weights. It returns the number of done iterations.
 *
 * @param inputs Floating-point matrix of input vectors, one vector per row.
 * @param outputs Floating-point matrix of the corresponding output vectors, one
 * vector per row.
 * @param sampleWeights (RPROP only) Optional floating-point vector of weights
 * for each sample. Some samples may be more important than others for training.
 * You may want to raise the weight of certain classes to find the right balance
 * between hit-rate and false-alarm rate, and so on.
 * @param sampleIdx Optional integer vector indicating the samples (rows of
 * "inputs" and "outputs") that are taken into account.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-train">org.opencv.ml.CvANN_MLP.train</a>
 */
    public  int train(Mat inputs, Mat outputs, Mat sampleWeights, Mat sampleIdx)
    {

        int retVal = train_2(nativeObj, inputs.nativeObj, outputs.nativeObj, sampleWeights.nativeObj, sampleIdx.nativeObj);

        return retVal;
    }

/**
 * Trains/updates MLP.
 *
 * This method applies the specified training algorithm to computing/adjusting
 * the network weights. It returns the number of done iterations.
 *
 * @param inputs Floating-point matrix of input vectors, one vector per row.
 * @param outputs Floating-point matrix of the corresponding output vectors, one
 * vector per row.
 * @param sampleWeights (RPROP only) Optional floating-point vector of weights
 * for each sample. Some samples may be more important than others for training.
 * You may want to raise the weight of certain classes to find the right balance
 * between hit-rate and false-alarm rate, and so on.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/neural_networks.html#cvann-mlp-train">org.opencv.ml.CvANN_MLP.train</a>
 */
    public  int train(Mat inputs, Mat outputs, Mat sampleWeights)
    {

        int retVal = train_3(nativeObj, inputs.nativeObj, outputs.nativeObj, sampleWeights.nativeObj);

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

    // C++:   CvANN_MLP::CvANN_MLP()
    private static native long CvANN_MLP_0();

    // C++:   CvANN_MLP::CvANN_MLP(Mat layerSizes, int activateFunc = CvANN_MLP::SIGMOID_SYM, double fparam1 = 0, double fparam2 = 0)
    private static native long CvANN_MLP_1(long layerSizes_nativeObj, int activateFunc, double fparam1, double fparam2);
    private static native long CvANN_MLP_2(long layerSizes_nativeObj, int activateFunc, double fparam1);
    private static native long CvANN_MLP_3(long layerSizes_nativeObj, int activateFunc);
    private static native long CvANN_MLP_4(long layerSizes_nativeObj);

    // C++:  void CvANN_MLP::clear()
    private static native void clear_0(long nativeObj);

    // C++:  void CvANN_MLP::create(Mat layerSizes, int activateFunc = CvANN_MLP::SIGMOID_SYM, double fparam1 = 0, double fparam2 = 0)
    private static native void create_0(long nativeObj, long layerSizes_nativeObj, int activateFunc, double fparam1, double fparam2);
    private static native void create_1(long nativeObj, long layerSizes_nativeObj, int activateFunc, double fparam1);
    private static native void create_2(long nativeObj, long layerSizes_nativeObj, int activateFunc);
    private static native void create_3(long nativeObj, long layerSizes_nativeObj);

    // C++:  float CvANN_MLP::predict(Mat inputs, Mat outputs)
    private static native float predict_0(long nativeObj, long inputs_nativeObj, long outputs_nativeObj);

    // C++:  int CvANN_MLP::train(Mat inputs, Mat outputs, Mat sampleWeights, Mat sampleIdx = cv::Mat(), CvANN_MLP_TrainParams params = CvANN_MLP_TrainParams(), int flags = 0)
    private static native int train_0(long nativeObj, long inputs_nativeObj, long outputs_nativeObj, long sampleWeights_nativeObj, long sampleIdx_nativeObj, long params_nativeObj, int flags);
    private static native int train_1(long nativeObj, long inputs_nativeObj, long outputs_nativeObj, long sampleWeights_nativeObj, long sampleIdx_nativeObj, long params_nativeObj);
    private static native int train_2(long nativeObj, long inputs_nativeObj, long outputs_nativeObj, long sampleWeights_nativeObj, long sampleIdx_nativeObj);
    private static native int train_3(long nativeObj, long inputs_nativeObj, long outputs_nativeObj, long sampleWeights_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
