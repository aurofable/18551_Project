
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import java.lang.String;

// C++: class CvStatModel
/**
 * Base class for statistical models in ML.
 *
 * In this declaration, some methods are commented off. These are methods for
 * which there is no unified API (with the exception of the default
 * constructor). However, there are many similarities in the syntax and
 * semantics that are briefly described below in this section, as if they are
 * part of the base class.
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel">org.opencv.ml.CvStatModel</a>
 */
public class CvStatModel {

    protected final long nativeObj;
    protected CvStatModel(long addr) { nativeObj = addr; }


    //
    // C++:  void CvStatModel::load(c_string filename, c_string name = 0)
    //

/**
 * Loads the model from a file.
 *
 * The method "load" loads the complete model state with the specified name (or
 * default model-dependent name) from the specified XML or YAML file. The
 * previous model state is cleared by "CvStatModel.clear".
 *
 * @param filename a filename
 * @param name a name
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel-load">org.opencv.ml.CvStatModel.load</a>
 */
    public  void load(String filename, String name)
    {

        load_0(nativeObj, filename, name);

        return;
    }

/**
 * Loads the model from a file.
 *
 * The method "load" loads the complete model state with the specified name (or
 * default model-dependent name) from the specified XML or YAML file. The
 * previous model state is cleared by "CvStatModel.clear".
 *
 * @param filename a filename
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel-load">org.opencv.ml.CvStatModel.load</a>
 */
    public  void load(String filename)
    {

        load_1(nativeObj, filename);

        return;
    }


    //
    // C++:  void CvStatModel::save(c_string filename, c_string name = 0)
    //

/**
 * Saves the model to a file.
 *
 * The method "save" saves the complete model state to the specified XML or YAML
 * file with the specified name or default name (which depends on a particular
 * class). *Data persistence* functionality from "CxCore" is used.
 *
 * @param filename a filename
 * @param name a name
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel-save">org.opencv.ml.CvStatModel.save</a>
 */
    public  void save(String filename, String name)
    {

        save_0(nativeObj, filename, name);

        return;
    }

/**
 * Saves the model to a file.
 *
 * The method "save" saves the complete model state to the specified XML or YAML
 * file with the specified name or default name (which depends on a particular
 * class). *Data persistence* functionality from "CxCore" is used.
 *
 * @param filename a filename
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel-save">org.opencv.ml.CvStatModel.save</a>
 */
    public  void save(String filename)
    {

        save_1(nativeObj, filename);

        return;
    }


/**
 * The default constuctor.
 *
 * Each statistical model class in ML has a default constructor without
 * parameters. This constructor is useful for a two-stage model construction,
 * when the default constructor is followed by "CvStatModel.train" or
 * "CvStatModel.load".
 *
 * @see <a href="http://opencv.itseez.com/modules/ml/doc/statistical_models.html#cvstatmodel-cvstatmodel">org.opencv.ml.CvStatModel.CvStatModel</a>
 */
public CvStatModel() {
    nativeObj = n_newObj();
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

    // C++:  void CvStatModel::load(c_string filename, c_string name = 0)
    private static native void load_0(long nativeObj, String filename, String name);
    private static native void load_1(long nativeObj, String filename);

    // C++:  void CvStatModel::save(c_string filename, c_string name = 0)
    private static native void save_0(long nativeObj, String filename, String name);
    private static native void save_1(long nativeObj, String filename);
private static native long n_newObj();
    // native support for java finalize()
    private static native void delete(long nativeObj);

}
