
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.highgui;

import java.lang.String;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

public class Highgui {

    public static final int
            CV_FONT_LIGHT = 25,
            CV_FONT_NORMAL = 50,
            CV_FONT_DEMIBOLD = 63,
            CV_FONT_BOLD = 75,
            CV_FONT_BLACK = 87,
            CV_STYLE_NORMAL = 0,
            CV_STYLE_ITALIC = 1,
            CV_STYLE_OBLIQUE = 2,
            CV_LOAD_IMAGE_UNCHANGED = -1,
            CV_LOAD_IMAGE_GRAYSCALE = 0,
            CV_LOAD_IMAGE_COLOR = 1,
            CV_LOAD_IMAGE_ANYDEPTH = 2,
            CV_LOAD_IMAGE_ANYCOLOR = 4,
            CV_IMWRITE_JPEG_QUALITY = 1,
            CV_IMWRITE_PNG_COMPRESSION = 16,
            CV_IMWRITE_PXM_BINARY = 32,
            CV_CVTIMG_FLIP = 1,
            CV_CVTIMG_SWAP_RB = 2,
            CV_CAP_ANDROID = 1000,
            CV_CAP_XIAPI = 1100,
            CV_CAP_PROP_FRAME_WIDTH = 3,
            CV_CAP_PROP_FRAME_HEIGHT = 4,
            CV_CAP_PROP_AUTOGRAB = 1024,
            CV_CAP_PROP_PREVIEW_FORMAT = 1026,
            CV_CAP_PROP_XI_DOWNSAMPLING = 400,
            CV_CAP_PROP_XI_DATA_FORMAT = 401,
            CV_CAP_PROP_XI_OFFSET_X = 402,
            CV_CAP_PROP_XI_OFFSET_Y = 403,
            CV_CAP_PROP_XI_TRG_SOURCE = 404,
            CV_CAP_PROP_XI_TRG_SOFTWARE = 405,
            CV_CAP_PROP_XI_GPI_SELECTOR = 406,
            CV_CAP_PROP_XI_GPI_MODE = 407,
            CV_CAP_PROP_XI_GPI_LEVEL = 408,
            CV_CAP_PROP_XI_GPO_SELECTOR = 409,
            CV_CAP_PROP_XI_GPO_MODE = 410,
            CV_CAP_PROP_XI_LED_SELECTOR = 411,
            CV_CAP_PROP_XI_LED_MODE = 412,
            CV_CAP_PROP_XI_MANUAL_WB = 413,
            CV_CAP_PROP_XI_AUTO_WB = 414,
            CV_CAP_PROP_XI_AEAG = 415,
            CV_CAP_PROP_XI_EXP_PRIORITY = 416,
            CV_CAP_PROP_XI_AE_MAX_LIMIT = 417,
            CV_CAP_PROP_XI_AG_MAX_LIMIT = 418,
            CV_CAP_PROP_XI_AEAG_LEVEL = 419,
            CV_CAP_PROP_XI_TIMEOUT = 420,
            CV_CAP_ANDROID_COLOR_FRAME_BGR = 0,
            CV_CAP_ANDROID_COLOR_FRAME = CV_CAP_ANDROID_COLOR_FRAME_BGR,
            CV_CAP_ANDROID_GREY_FRAME = 1,
            CV_CAP_ANDROID_COLOR_FRAME_RGB = 2,
            CV_CAP_ANDROID_COLOR_FRAME_BGRA = 3,
            CV_CAP_ANDROID_COLOR_FRAME_RGBA = 4;


    //
    // C++:  Mat imdecode(Mat buf, int flags)
    //

/**
 * Reads an image from a buffer in memory.
 *
 * The function reads an image from the specified buffer in the memory.
 * If the buffer is too short or contains invalid data, the empty matrix/image
 * is returned.
 *
 * See "imread" for the list of supported formats and flags description.
 *
 * @param buf Input array or vector of bytes.
 * @param flags The same flags as in "imread".
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imdecode">org.opencv.highgui.Highgui.imdecode</a>
 */
    public static Mat imdecode(Mat buf, int flags)
    {

        Mat retVal = new Mat(imdecode_0(buf.nativeObj, flags));

        return retVal;
    }


    //
    // C++:  bool imencode(string ext, Mat img, vector_uchar buf, vector_int params = vector<int>())
    //

/**
 * Encodes an image into a memory buffer.
 *
 * The function compresses the image and stores it in the memory buffer that is
 * resized to fit the result.
 * See "imwrite" for the list of supported formats and flags description.
 *
 * Note: "cvEncodeImage" returns single-row matrix of type "CV_8UC1" that
 * contains encoded image as array of bytes.
 *
 * @param ext File extension that defines the output format.
 * @param img Image to be written.
 * @param buf Output buffer resized to fit the compressed image.
 * @param params Format-specific parameters. See "imwrite".
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imencode">org.opencv.highgui.Highgui.imencode</a>
 */
    public static boolean imencode(String ext, Mat img, List<Byte> buf, List<Integer> params)
    {
        Mat buf_mat = Converters.vector_uchar_to_Mat(buf);
        Mat params_mat = Converters.vector_int_to_Mat(params);
        boolean retVal = imencode_0(ext, img.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);

        return retVal;
    }

/**
 * Encodes an image into a memory buffer.
 *
 * The function compresses the image and stores it in the memory buffer that is
 * resized to fit the result.
 * See "imwrite" for the list of supported formats and flags description.
 *
 * Note: "cvEncodeImage" returns single-row matrix of type "CV_8UC1" that
 * contains encoded image as array of bytes.
 *
 * @param ext File extension that defines the output format.
 * @param img Image to be written.
 * @param buf Output buffer resized to fit the compressed image.
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imencode">org.opencv.highgui.Highgui.imencode</a>
 */
    public static boolean imencode(String ext, Mat img, List<Byte> buf)
    {
        Mat buf_mat = Converters.vector_uchar_to_Mat(buf);
        boolean retVal = imencode_1(ext, img.nativeObj, buf_mat.nativeObj);

        return retVal;
    }


    //
    // C++:  Mat imread(string filename, int flags = 1)
    //

/**
 * Loads an image from a file.
 *
 * The function "imread" loads an image from the specified file and returns it.
 * If the image cannot be read (because of missing file, improper permissions,
 * unsupported or invalid format), the function returns an empty matrix
 * ("Mat.data==NULL"). Currently, the following file formats are supported:
 *   * Windows bitmaps - "*.bmp, *.dib" (always supported)
 *   * JPEG files - "*.jpeg, *.jpg, *.jpe" (see the *Notes* section)
 *   * JPEG 2000 files - "*.jp2" (see the *Notes* section)
 *   * Portable Network Graphics - "*.png" (see the *Notes* section)
 *   * Portable image format - "*.pbm, *.pgm, *.ppm" (always supported)
 *   * Sun rasters - "*.sr, *.ras" (always supported)
 *   * TIFF files - "*.tiff, *.tif" (see the *Notes* section)
 *
 * Note:
 *   * The function determines the type of an image by the content, not by the
 * file extension.
 *   * On Microsoft Windows* OS and MacOSX*, the codecs shipped with an OpenCV
 * image (libjpeg, libpng, libtiff, and libjasper) are used by default. So,
 * OpenCV can always read JPEGs, PNGs, and TIFFs. On MacOSX, there is also an
 * option to use native MacOSX image readers. But beware that currently these
 * native image loaders give images with different pixel values because of the
 * color management embedded into MacOSX.
 *   * On Linux*, BSD flavors and other Unix-like open-source operating systems,
 * OpenCV looks for codecs supplied with an OS image. Install the relevant
 * packages (do not forget the development files, for example, "libjpeg-dev", in
 * Debian* and Ubuntu*) to get the codec support or turn on the
 * "OPENCV_BUILD_3RDPARTY_LIBS" flag in CMake.
 *
 * @param filename Name of file to be loaded.
 * @param flags Flags specifying the color type of a loaded image:
 *   * >0 Return a 3-channel color image
 *   * =0 Return a grayscale image
 *   * <0 Return the loaded image as is. Note that in the current implementation
 * the alpha channel, if any, is stripped from the output image. For example, a
 * 4-channel RGBA image is loaded as RGB if flags >= 0.
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imread">org.opencv.highgui.Highgui.imread</a>
 */
    public static Mat imread(String filename, int flags)
    {

        Mat retVal = new Mat(imread_0(filename, flags));

        return retVal;
    }

/**
 * Loads an image from a file.
 *
 * The function "imread" loads an image from the specified file and returns it.
 * If the image cannot be read (because of missing file, improper permissions,
 * unsupported or invalid format), the function returns an empty matrix
 * ("Mat.data==NULL"). Currently, the following file formats are supported:
 *   * Windows bitmaps - "*.bmp, *.dib" (always supported)
 *   * JPEG files - "*.jpeg, *.jpg, *.jpe" (see the *Notes* section)
 *   * JPEG 2000 files - "*.jp2" (see the *Notes* section)
 *   * Portable Network Graphics - "*.png" (see the *Notes* section)
 *   * Portable image format - "*.pbm, *.pgm, *.ppm" (always supported)
 *   * Sun rasters - "*.sr, *.ras" (always supported)
 *   * TIFF files - "*.tiff, *.tif" (see the *Notes* section)
 *
 * Note:
 *   * The function determines the type of an image by the content, not by the
 * file extension.
 *   * On Microsoft Windows* OS and MacOSX*, the codecs shipped with an OpenCV
 * image (libjpeg, libpng, libtiff, and libjasper) are used by default. So,
 * OpenCV can always read JPEGs, PNGs, and TIFFs. On MacOSX, there is also an
 * option to use native MacOSX image readers. But beware that currently these
 * native image loaders give images with different pixel values because of the
 * color management embedded into MacOSX.
 *   * On Linux*, BSD flavors and other Unix-like open-source operating systems,
 * OpenCV looks for codecs supplied with an OS image. Install the relevant
 * packages (do not forget the development files, for example, "libjpeg-dev", in
 * Debian* and Ubuntu*) to get the codec support or turn on the
 * "OPENCV_BUILD_3RDPARTY_LIBS" flag in CMake.
 *
 * @param filename Name of file to be loaded.
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imread">org.opencv.highgui.Highgui.imread</a>
 */
    public static Mat imread(String filename)
    {

        Mat retVal = new Mat(imread_1(filename));

        return retVal;
    }


    //
    // C++:  bool imwrite(string filename, Mat img, vector_int params = vector<int>())
    //

/**
 * Saves an image to a specified file.
 *
 * The function "imwrite" saves the image to the specified file. The image
 * format is chosen based on the "filename" extension (see "imread" for the list
 * of extensions). Only 8-bit (or 16-bit in case of PNG, JPEG 2000, and TIFF)
 * single-channel or 3-channel (with 'BGR' channel order) images can be saved
 * using this function. If the format, depth or channel order is different, use
 * "Mat.convertTo", and "cvtColor" to convert it before saving. Or, use the
 * universal XML I/O functions to save the image to XML or YAML format.
 *
 * @param filename Name of the file.
 * @param img a img
 * @param params Format-specific save parameters encoded as pairs "paramId_1,
 * paramValue_1, paramId_2, paramValue_2,...". The following parameters are
 * currently supported:
 *   * For JPEG, it can be a quality ("CV_IMWRITE_JPEG_QUALITY") from 0 to 100
 * (the higher is the better). Default value is 95.
 *   * For PNG, it can be the compression level ("CV_IMWRITE_PNG_COMPRESSION")
 * from 0 to 9. A higher value means a smaller size and longer compression time.
 * Default value is 3.
 *   * For PPM, PGM, or PBM, it can be a binary format flag ("CV_IMWRITE_PXM_BINARY"),
 * 0 or 1. Default value is 1.
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imwrite">org.opencv.highgui.Highgui.imwrite</a>
 */
    public static boolean imwrite(String filename, Mat img, List<Integer> params)
    {
        Mat params_mat = Converters.vector_int_to_Mat(params);
        boolean retVal = imwrite_0(filename, img.nativeObj, params_mat.nativeObj);

        return retVal;
    }

/**
 * Saves an image to a specified file.
 *
 * The function "imwrite" saves the image to the specified file. The image
 * format is chosen based on the "filename" extension (see "imread" for the list
 * of extensions). Only 8-bit (or 16-bit in case of PNG, JPEG 2000, and TIFF)
 * single-channel or 3-channel (with 'BGR' channel order) images can be saved
 * using this function. If the format, depth or channel order is different, use
 * "Mat.convertTo", and "cvtColor" to convert it before saving. Or, use the
 * universal XML I/O functions to save the image to XML or YAML format.
 *
 * @param filename Name of the file.
 * @param img a img
 *
 * @see <a href="http://opencv.itseez.com/modules/highgui/doc/reading_and_writing_images_and_video.html#imwrite">org.opencv.highgui.Highgui.imwrite</a>
 */
    public static boolean imwrite(String filename, Mat img)
    {

        boolean retVal = imwrite_1(filename, img.nativeObj);

        return retVal;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  Mat imdecode(Mat buf, int flags)
    private static native long imdecode_0(long buf_nativeObj, int flags);

    // C++:  bool imencode(string ext, Mat img, vector_uchar buf, vector_int params = vector<int>())
    private static native boolean imencode_0(String ext, long img_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencode_1(String ext, long img_nativeObj, long buf_mat_nativeObj);

    // C++:  Mat imread(string filename, int flags = 1)
    private static native long imread_0(String filename, int flags);
    private static native long imread_1(String filename);

    // C++:  bool imwrite(string filename, Mat img, vector_int params = vector<int>())
    private static native boolean imwrite_0(String filename, long img_nativeObj, long params_mat_nativeObj);
    private static native boolean imwrite_1(String filename, long img_nativeObj);

}
