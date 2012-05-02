
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.calib3d;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Point3;
import org.opencv.core.Rect;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

public class Calib3d {

    private static final int
            CV_LMEDS = 4,
            CV_RANSAC = 8,
            CV_FM_LMEDS = CV_LMEDS,
            CV_FM_RANSAC = CV_RANSAC,
            CV_FM_7POINT = 1,
            CV_FM_8POINT = 2,
            CV_CALIB_USE_INTRINSIC_GUESS = 1,
            CV_CALIB_FIX_ASPECT_RATIO = 2,
            CV_CALIB_FIX_PRINCIPAL_POINT = 4,
            CV_CALIB_ZERO_TANGENT_DIST = 8,
            CV_CALIB_FIX_FOCAL_LENGTH = 16,
            CV_CALIB_FIX_K1 = 32,
            CV_CALIB_FIX_K2 = 64,
            CV_CALIB_FIX_K3 = 128,
            CV_CALIB_FIX_K4 = 2048,
            CV_CALIB_FIX_K5 = 4096,
            CV_CALIB_FIX_K6 = 8192,
            CV_CALIB_RATIONAL_MODEL = 16384,
            CV_CALIB_FIX_INTRINSIC = 256,
            CV_CALIB_SAME_FOCAL_LENGTH = 512,
            CV_CALIB_ZERO_DISPARITY = 1024;


    public static final int
            LMEDS = CV_LMEDS,
            RANSAC = CV_RANSAC,
            CALIB_CB_ADAPTIVE_THRESH = 1,
            CALIB_CB_NORMALIZE_IMAGE = 2,
            CALIB_CB_FILTER_QUADS = 4,
            CALIB_CB_FAST_CHECK = 8,
            CALIB_CB_SYMMETRIC_GRID = 1,
            CALIB_CB_ASYMMETRIC_GRID = 2,
            CALIB_CB_CLUSTERING = 4,
            CALIB_USE_INTRINSIC_GUESS = CV_CALIB_USE_INTRINSIC_GUESS,
            CALIB_FIX_ASPECT_RATIO = CV_CALIB_FIX_ASPECT_RATIO,
            CALIB_FIX_PRINCIPAL_POINT = CV_CALIB_FIX_PRINCIPAL_POINT,
            CALIB_ZERO_TANGENT_DIST = CV_CALIB_ZERO_TANGENT_DIST,
            CALIB_FIX_FOCAL_LENGTH = CV_CALIB_FIX_FOCAL_LENGTH,
            CALIB_FIX_K1 = CV_CALIB_FIX_K1,
            CALIB_FIX_K2 = CV_CALIB_FIX_K2,
            CALIB_FIX_K3 = CV_CALIB_FIX_K3,
            CALIB_FIX_K4 = CV_CALIB_FIX_K4,
            CALIB_FIX_K5 = CV_CALIB_FIX_K5,
            CALIB_FIX_K6 = CV_CALIB_FIX_K6,
            CALIB_RATIONAL_MODEL = CV_CALIB_RATIONAL_MODEL,
            CALIB_FIX_INTRINSIC = CV_CALIB_FIX_INTRINSIC,
            CALIB_SAME_FOCAL_LENGTH = CV_CALIB_SAME_FOCAL_LENGTH,
            CALIB_ZERO_DISPARITY = CV_CALIB_ZERO_DISPARITY,
            FM_7POINT = CV_FM_7POINT,
            FM_8POINT = CV_FM_8POINT,
            FM_LMEDS = CV_FM_LMEDS,
            FM_RANSAC = CV_FM_RANSAC;


    //
    // C++:  Vec3d RQDecomp3x3(Mat src, Mat& mtxR, Mat& mtxQ, Mat& Qx = Mat(), Mat& Qy = Mat(), Mat& Qz = Mat())
    //

/**
 * Computes an RQ decomposition of 3x3 matrices.
 *
 * The function computes a RQ decomposition using the given rotations. This
 * function is used in "DecomposeProjectionMatrix" to decompose the left 3x3
 * submatrix of a projection matrix into a camera and a rotation matrix.
 *
 * It optionally returns three rotation matrices, one for each axis, and the
 * three Euler angles (as the return value) that could be used in OpenGL.
 *
 * @param src a src
 * @param mtxR a mtxR
 * @param mtxQ a mtxQ
 * @param Qx Optional output 3x3 rotation matrix around x-axis.
 * @param Qy Optional output 3x3 rotation matrix around y-axis.
 * @param Qz Optional output 3x3 rotation matrix around z-axis.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rqdecomp3x3">org.opencv.calib3d.Calib3d.RQDecomp3x3</a>
 */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy, Mat Qz)
    {

        double[] retVal = RQDecomp3x3_0(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj, Qz.nativeObj);

        return retVal;
    }

/**
 * Computes an RQ decomposition of 3x3 matrices.
 *
 * The function computes a RQ decomposition using the given rotations. This
 * function is used in "DecomposeProjectionMatrix" to decompose the left 3x3
 * submatrix of a projection matrix into a camera and a rotation matrix.
 *
 * It optionally returns three rotation matrices, one for each axis, and the
 * three Euler angles (as the return value) that could be used in OpenGL.
 *
 * @param src a src
 * @param mtxR a mtxR
 * @param mtxQ a mtxQ
 * @param Qx Optional output 3x3 rotation matrix around x-axis.
 * @param Qy Optional output 3x3 rotation matrix around y-axis.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rqdecomp3x3">org.opencv.calib3d.Calib3d.RQDecomp3x3</a>
 */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy)
    {

        double[] retVal = RQDecomp3x3_1(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj);

        return retVal;
    }

/**
 * Computes an RQ decomposition of 3x3 matrices.
 *
 * The function computes a RQ decomposition using the given rotations. This
 * function is used in "DecomposeProjectionMatrix" to decompose the left 3x3
 * submatrix of a projection matrix into a camera and a rotation matrix.
 *
 * It optionally returns three rotation matrices, one for each axis, and the
 * three Euler angles (as the return value) that could be used in OpenGL.
 *
 * @param src a src
 * @param mtxR a mtxR
 * @param mtxQ a mtxQ
 * @param Qx Optional output 3x3 rotation matrix around x-axis.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rqdecomp3x3">org.opencv.calib3d.Calib3d.RQDecomp3x3</a>
 */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx)
    {

        double[] retVal = RQDecomp3x3_2(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj);

        return retVal;
    }

/**
 * Computes an RQ decomposition of 3x3 matrices.
 *
 * The function computes a RQ decomposition using the given rotations. This
 * function is used in "DecomposeProjectionMatrix" to decompose the left 3x3
 * submatrix of a projection matrix into a camera and a rotation matrix.
 *
 * It optionally returns three rotation matrices, one for each axis, and the
 * three Euler angles (as the return value) that could be used in OpenGL.
 *
 * @param src a src
 * @param mtxR a mtxR
 * @param mtxQ a mtxQ
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rqdecomp3x3">org.opencv.calib3d.Calib3d.RQDecomp3x3</a>
 */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ)
    {

        double[] retVal = RQDecomp3x3_3(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj);

        return retVal;
    }


    //
    // C++:  void Rodrigues(Mat src, Mat& dst, Mat& jacobian = Mat())
    //

/**
 * Converts a rotation matrix to a rotation vector or vice versa.
 *
 * theta <- norm(r)
 * r <- r/ theta
 * R = cos(theta) I + (1- cos(theta)) r r^T + sin(theta)
 * |0 -r_z r_y|
 * |r_z 0 -r_x|
 * |-r_y r_x 0|
 *
 *
 * Inverse transformation can be also done easily, since
 *
 * sin(theta)
 * |0 -r_z r_y|
 * |r_z 0 -r_x|
 * |-r_y r_x 0|
 * = (R - R^T)/2
 *
 * A rotation vector is a convenient and most compact representation of a
 * rotation matrix (since any rotation matrix has just 3 degrees of freedom).
 * The representation is used in the global 3D geometry optimization procedures
 * like "calibrateCamera", "stereoCalibrate", or "solvePnP".
 *
 * @param src Input rotation vector (3x1 or 1x3) or rotation matrix (3x3).
 * @param dst Output rotation matrix (3x3) or rotation vector (3x1 or 1x3),
 * respectively.
 * @param jacobian Optional output Jacobian matrix, 3x9 or 9x3, which is a
 * matrix of partial derivatives of the output array components with respect to
 * the input array components.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rodrigues">org.opencv.calib3d.Calib3d.Rodrigues</a>
 */
    public static void Rodrigues(Mat src, Mat dst, Mat jacobian)
    {

        Rodrigues_0(src.nativeObj, dst.nativeObj, jacobian.nativeObj);

        return;
    }

/**
 * Converts a rotation matrix to a rotation vector or vice versa.
 *
 * theta <- norm(r)
 * r <- r/ theta
 * R = cos(theta) I + (1- cos(theta)) r r^T + sin(theta)
 * |0 -r_z r_y|
 * |r_z 0 -r_x|
 * |-r_y r_x 0|
 *
 *
 * Inverse transformation can be also done easily, since
 *
 * sin(theta)
 * |0 -r_z r_y|
 * |r_z 0 -r_x|
 * |-r_y r_x 0|
 * = (R - R^T)/2
 *
 * A rotation vector is a convenient and most compact representation of a
 * rotation matrix (since any rotation matrix has just 3 degrees of freedom).
 * The representation is used in the global 3D geometry optimization procedures
 * like "calibrateCamera", "stereoCalibrate", or "solvePnP".
 *
 * @param src Input rotation vector (3x1 or 1x3) or rotation matrix (3x3).
 * @param dst Output rotation matrix (3x3) or rotation vector (3x1 or 1x3),
 * respectively.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#rodrigues">org.opencv.calib3d.Calib3d.Rodrigues</a>
 */
    public static void Rodrigues(Mat src, Mat dst)
    {

        Rodrigues_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  double calibrateCamera(vector_Mat objectPoints, vector_Mat imagePoints, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, int flags = 0)
    //

/**
 * Finds the camera intrinsic and extrinsic parameters from several views of a
 * calibration pattern.
 *
 * The function estimates the intrinsic camera parameters and extrinsic
 * parameters for each of the views. The algorithm is based on [Zhang2000] and
 * [BoughuetMCT]. The coordinates of 3D object points and their corresponding 2D
 * projections in each view must be specified. That may be achieved by using an
 * object with a known geometry and easily detectable feature points.
 * Such an object is called a calibration rig or calibration pattern, and OpenCV
 * has built-in support for a chessboard as a calibration rig (see
 * "findChessboardCorners"). Currently, initialization of intrinsic parameters
 * (when "CV_CALIB_USE_INTRINSIC_GUESS" is not set) is only implemented for
 * planar calibration patterns (where Z-coordinates of the object points must be
 * all zeros). 3D calibration rigs can also be used as long as initial
 * "cameraMatrix" is provided.
 *
 * The algorithm performs the following steps:
 *   #. Compute the initial intrinsic parameters (the option only available for
 * planar calibration patterns) or read them from the input parameters. The
 * distortion coefficients are all set to zeros initially unless some of
 * "CV_CALIB_FIX_K?" are specified.
 *   #. Estimate the initial camera pose as if the intrinsic parameters have
 * been already known. This is done using "solvePnP".
 *   #. Run the global Levenberg-Marquardt optimization algorithm to minimize
 * the reprojection error, that is, the total sum of squared distances between
 * the observed feature points "imagePoints" and the projected (using the
 * current estimates for camera parameters and the poses) object points
 * "objectPoints". See "projectPoints" for details.
 *
 * The function returns the final re-projection error.
 *
 * Note:
 *
 * If you use a non-square (=non-NxN) grid and "findChessboardCorners" for
 * calibration, and "calibrateCamera" returns bad values (zero distortion
 * coefficients, an image center very far from "(w/2-0.5,h/2-0.5)", and/or large
 * differences between f_x and f_y (ratios of 10:1 or more)), then you have
 * probably used "patternSize=cvSize(rows,cols)" instead of using
 * "patternSize=cvSize(cols,rows)" in "findChessboardCorners".
 *
 * @param objectPoints In the new interface it is a vector of vectors of
 * calibration pattern points in the calibration pattern coordinate space. The
 * outer vector contains as many elements as the number of the pattern views. If
 * the same calibration pattern is shown in each view and it is fully visible,
 * all the vectors will be the same. Although, it is possible to use partially
 * occluded patterns, or even different patterns in different views. Then, the
 * vectors will be different. The points are 3D, but since they are in a pattern
 * coordinate system, then, if the rig is planar, it may make sense to put the
 * model to a XY coordinate plane so that Z-coordinate of each input object
 * point is 0.
 *
 * In the old interface all the vectors of object points from different views
 * are concatenated together.
 * @param imagePoints In the new interface it is a vector of vectors of the
 * projections of calibration pattern points. "imagePoints.size()" and
 * "objectPoints.size()" and "imagePoints[i].size()" must be equal to
 * "objectPoints[i].size()" for each "i".
 *
 * In the old interface all the vectors of object points from different views
 * are concatenated together.
 * @param imageSize Size of the image used only to initialize the intrinsic
 * camera matrix.
 * @param cameraMatrix Output 3x3 floating-point camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 1|. If "CV_CALIB_USE_INTRINSIC_GUESS" and/or "CV_CALIB_FIX_ASPECT_RATIO"
 * are specified, some or all of "fx, fy, cx, cy" must be initialized before
 * calling the function.
 * @param distCoeffs Output vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements.
 * @param rvecs Output vector of rotation vectors (see "Rodrigues") estimated
 * for each pattern view. That is, each k-th rotation vector together with the
 * corresponding k-th translation vector (see the next output parameter
 * description) brings the calibration pattern from the model coordinate space
 * (in which object points are specified) to the world coordinate space, that
 * is, a real position of the calibration pattern in the k-th pattern view
 * (k=0.. *M* -1).
 * @param tvecs Output vector of translation vectors estimated for each pattern
 * view.
 * @param flags Different flags that may be zero or a combination of the
 * following values:
 *   * CV_CALIB_USE_INTRINSIC_GUESS "cameraMatrix" contains valid initial values
 * of "fx, fy, cx, cy" that are optimized further. Otherwise, "(cx, cy)" is
 * initially set to the image center ("imageSize" is used), and focal distances
 * are computed in a least-squares fashion. Note, that if intrinsic parameters
 * are known, there is no need to use this function just to estimate extrinsic
 * parameters. Use "solvePnP" instead.
 *   * CV_CALIB_FIX_PRINCIPAL_POINT The principal point is not changed during
 * the global optimization. It stays at the center or at a different location
 * specified when "CV_CALIB_USE_INTRINSIC_GUESS" is set too.
 *   * CV_CALIB_FIX_ASPECT_RATIO The functions considers only "fy" as a free
 * parameter. The ratio "fx/fy" stays the same as in the input "cameraMatrix".
 * When "CV_CALIB_USE_INTRINSIC_GUESS" is not set, the actual input values of
 * "fx" and "fy" are ignored, only their ratio is computed and used further.
 *   * CV_CALIB_ZERO_TANGENT_DIST Tangential distortion coefficients (p_1, p_2)
 * are set to zeros and stay zero.
 *   * CV_CALIB_FIX_K1,...,CV_CALIB_FIX_K6 The corresponding radial distortion
 * coefficient is not changed during the optimization. If "CV_CALIB_USE_INTRINSIC_GUESS"
 * is set, the coefficient from the supplied "distCoeffs" matrix is used.
 * Otherwise, it is set to 0.
 *   * CV_CALIB_RATIONAL_MODEL Coefficients k4, k5, and k6 are enabled. To
 * provide the backward compatibility, this extra flag should be explicitly
 * specified to make the calibration function use the rational model and return
 * 8 coefficients. If the flag is not set, the function computes and returns
 * only 5 distortion coefficients.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#calibratecamera">org.opencv.calib3d.Calib3d.calibrateCamera</a>
 * @see org.opencv.calib3d.Calib3d.initCameraMatrix2D
 * @see org.opencv.calib3d.Calib3d.stereoCalibrate
 * @see FindChessboardCorners
 * @see org.opencv.calib3d.Calib3d.solvePnP
 * @see org.opencv.imgproc.Imgproc.undistort
 */
    public static double calibrateCamera(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCamera_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        return retVal;
    }

/**
 * Finds the camera intrinsic and extrinsic parameters from several views of a
 * calibration pattern.
 *
 * The function estimates the intrinsic camera parameters and extrinsic
 * parameters for each of the views. The algorithm is based on [Zhang2000] and
 * [BoughuetMCT]. The coordinates of 3D object points and their corresponding 2D
 * projections in each view must be specified. That may be achieved by using an
 * object with a known geometry and easily detectable feature points.
 * Such an object is called a calibration rig or calibration pattern, and OpenCV
 * has built-in support for a chessboard as a calibration rig (see
 * "findChessboardCorners"). Currently, initialization of intrinsic parameters
 * (when "CV_CALIB_USE_INTRINSIC_GUESS" is not set) is only implemented for
 * planar calibration patterns (where Z-coordinates of the object points must be
 * all zeros). 3D calibration rigs can also be used as long as initial
 * "cameraMatrix" is provided.
 *
 * The algorithm performs the following steps:
 *   #. Compute the initial intrinsic parameters (the option only available for
 * planar calibration patterns) or read them from the input parameters. The
 * distortion coefficients are all set to zeros initially unless some of
 * "CV_CALIB_FIX_K?" are specified.
 *   #. Estimate the initial camera pose as if the intrinsic parameters have
 * been already known. This is done using "solvePnP".
 *   #. Run the global Levenberg-Marquardt optimization algorithm to minimize
 * the reprojection error, that is, the total sum of squared distances between
 * the observed feature points "imagePoints" and the projected (using the
 * current estimates for camera parameters and the poses) object points
 * "objectPoints". See "projectPoints" for details.
 *
 * The function returns the final re-projection error.
 *
 * Note:
 *
 * If you use a non-square (=non-NxN) grid and "findChessboardCorners" for
 * calibration, and "calibrateCamera" returns bad values (zero distortion
 * coefficients, an image center very far from "(w/2-0.5,h/2-0.5)", and/or large
 * differences between f_x and f_y (ratios of 10:1 or more)), then you have
 * probably used "patternSize=cvSize(rows,cols)" instead of using
 * "patternSize=cvSize(cols,rows)" in "findChessboardCorners".
 *
 * @param objectPoints In the new interface it is a vector of vectors of
 * calibration pattern points in the calibration pattern coordinate space. The
 * outer vector contains as many elements as the number of the pattern views. If
 * the same calibration pattern is shown in each view and it is fully visible,
 * all the vectors will be the same. Although, it is possible to use partially
 * occluded patterns, or even different patterns in different views. Then, the
 * vectors will be different. The points are 3D, but since they are in a pattern
 * coordinate system, then, if the rig is planar, it may make sense to put the
 * model to a XY coordinate plane so that Z-coordinate of each input object
 * point is 0.
 *
 * In the old interface all the vectors of object points from different views
 * are concatenated together.
 * @param imagePoints In the new interface it is a vector of vectors of the
 * projections of calibration pattern points. "imagePoints.size()" and
 * "objectPoints.size()" and "imagePoints[i].size()" must be equal to
 * "objectPoints[i].size()" for each "i".
 *
 * In the old interface all the vectors of object points from different views
 * are concatenated together.
 * @param imageSize Size of the image used only to initialize the intrinsic
 * camera matrix.
 * @param cameraMatrix Output 3x3 floating-point camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 1|. If "CV_CALIB_USE_INTRINSIC_GUESS" and/or "CV_CALIB_FIX_ASPECT_RATIO"
 * are specified, some or all of "fx, fy, cx, cy" must be initialized before
 * calling the function.
 * @param distCoeffs Output vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements.
 * @param rvecs Output vector of rotation vectors (see "Rodrigues") estimated
 * for each pattern view. That is, each k-th rotation vector together with the
 * corresponding k-th translation vector (see the next output parameter
 * description) brings the calibration pattern from the model coordinate space
 * (in which object points are specified) to the world coordinate space, that
 * is, a real position of the calibration pattern in the k-th pattern view
 * (k=0.. *M* -1).
 * @param tvecs Output vector of translation vectors estimated for each pattern
 * view.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#calibratecamera">org.opencv.calib3d.Calib3d.calibrateCamera</a>
 * @see org.opencv.calib3d.Calib3d.initCameraMatrix2D
 * @see org.opencv.calib3d.Calib3d.stereoCalibrate
 * @see FindChessboardCorners
 * @see org.opencv.calib3d.Calib3d.solvePnP
 * @see org.opencv.imgproc.Imgproc.undistort
 */
    public static double calibrateCamera(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        double retVal = calibrateCamera_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        return retVal;
    }


    //
    // C++:  void calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double& fovx, double& fovy, double& focalLength, Point2d& principalPoint, double& aspectRatio)
    //

/**
 * Computes useful camera characteristics from the camera matrix.
 *
 * The function computes various useful camera characteristics from the
 * previously estimated camera matrix.
 *
 * @param cameraMatrix Input camera matrix that can be estimated by
 * "calibrateCamera" or "stereoCalibrate".
 * @param imageSize Input image size in pixels.
 * @param apertureWidth Physical width of the sensor.
 * @param apertureHeight Physical height of the sensor.
 * @param fovx Output field of view in degrees along the horizontal sensor axis.
 * @param fovy Output field of view in degrees along the vertical sensor axis.
 * @param focalLength Focal length of the lens in mm.
 * @param principalPoint Principal point in pixels.
 * @param aspectRatio f_y/f_x
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#calibrationmatrixvalues">org.opencv.calib3d.Calib3d.calibrationMatrixValues</a>
 */
    public static void calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double[] fovx, double[] fovy, double[] focalLength, Point principalPoint, double[] aspectRatio)
    {
        double[] fovx_out = new double[1];
        double[] fovy_out = new double[1];
        double[] focalLength_out = new double[1];
        double[] principalPoint_out = new double[2];
        double[] aspectRatio_out = new double[1];
        calibrationMatrixValues_0(cameraMatrix.nativeObj, imageSize.width, imageSize.height, apertureWidth, apertureHeight, fovx_out, fovy_out, focalLength_out, principalPoint_out, aspectRatio_out);
        if(fovx!=null) fovx[0] = (double)fovx_out[0];
        if(fovy!=null) fovy[0] = (double)fovy_out[0];
        if(focalLength!=null) focalLength[0] = (double)focalLength_out[0];
        if(principalPoint!=null){ principalPoint.x = principalPoint_out[0]; principalPoint.y = principalPoint_out[1]; }
        if(aspectRatio!=null) aspectRatio[0] = (double)aspectRatio_out[0];
        return;
    }


    //
    // C++:  void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat& rvec3, Mat& tvec3, Mat& dr3dr1 = Mat(), Mat& dr3dt1 = Mat(), Mat& dr3dr2 = Mat(), Mat& dr3dt2 = Mat(), Mat& dt3dr1 = Mat(), Mat& dt3dt1 = Mat(), Mat& dt3dr2 = Mat(), Mat& dt3dt2 = Mat())
    //

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 * @param dr3dt2 a dr3dt2
 * @param dt3dr1 a dt3dr1
 * @param dt3dt1 a dt3dt1
 * @param dt3dr2 a dt3dr2
 * @param dt3dt2 a dt3dt2
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2, Mat dt3dt2)
    {

        composeRT_0(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj, dt3dt2.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 * @param dr3dt2 a dr3dt2
 * @param dt3dr1 a dt3dr1
 * @param dt3dt1 a dt3dt1
 * @param dt3dr2 a dt3dr2
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2)
    {

        composeRT_1(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 * @param dr3dt2 a dr3dt2
 * @param dt3dr1 a dt3dr1
 * @param dt3dt1 a dt3dt1
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1)
    {

        composeRT_2(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 * @param dr3dt2 a dr3dt2
 * @param dt3dr1 a dt3dr1
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1)
    {

        composeRT_3(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 * @param dr3dt2 a dr3dt2
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2)
    {

        composeRT_4(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 * @param dr3dr2 a dr3dr2
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2)
    {

        composeRT_5(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 * @param dr3dt1 a dr3dt1
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1)
    {

        composeRT_6(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 * @param dr3dr1 a dr3dr1
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1)
    {

        composeRT_7(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj);

        return;
    }

/**
 * Combines two rotation-and-shift transformations.
 *
 * The functions compute:
 *
 * rvec3 = rodrigues ^(-1)(rodrigues(rvec2) * rodrigues(rvec1))
 * tvec3 = rodrigues(rvec2) * tvec1 + tvec2,
 *
 * where rodrigues denotes a rotation vector to a rotation matrix
 * transformation, and rodrigues^(-1) denotes the inverse transformation. See
 * "Rodrigues" for details.
 *
 * Also, the functions can compute the derivatives of the output vectors with
 * regards to the input vectors (see "matMulDeriv").
 * The functions are used inside "stereoCalibrate" but can also be used in your
 * own code where Levenberg-Marquardt or another gradient-based solver is used
 * to optimize a function that contains a matrix multiplication.
 *
 * @param rvec1 First rotation vector.
 * @param tvec1 First translation vector.
 * @param rvec2 Second rotation vector.
 * @param tvec2 Second translation vector.
 * @param rvec3 Output rotation vector of the superposition.
 * @param tvec3 Output translation vector of the superposition.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#composert">org.opencv.calib3d.Calib3d.composeRT</a>
 */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3)
    {

        composeRT_8(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj);

        return;
    }


    //
    // C++:  void convertPointsFromHomogeneous(Mat src, Mat& dst)
    //

/**
 * Converts points from homogeneous to Euclidean space.
 *
 * The function converts points homogeneous to Euclidean space using perspective
 * projection. That is, each point "(x1, x2,... x(n-1), xn)" is converted to
 * "(x1/xn, x2/xn,..., x(n-1)/xn)". When "xn=0", the output point coordinates
 * will be "(0,0,0,...)".
 *
 * @param src Input vector of "N"-dimensional points.
 * @param dst Output vector of "N-1"-dimensional points.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#convertpointsfromhomogeneous">org.opencv.calib3d.Calib3d.convertPointsFromHomogeneous</a>
 */
    public static void convertPointsFromHomogeneous(Mat src, Mat dst)
    {

        convertPointsFromHomogeneous_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void convertPointsToHomogeneous(Mat src, Mat& dst)
    //

/**
 * Converts points from Euclidean to homogeneous space.
 *
 * The function converts points from Euclidean to homogeneous space by appending
 * 1's to the tuple of point coordinates. That is, each point "(x1, x2,..., xn)"
 * is converted to "(x1, x2,..., xn, 1)".
 *
 * @param src Input vector of "N"-dimensional points.
 * @param dst Output vector of "N+1"-dimensional points.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#convertpointstohomogeneous">org.opencv.calib3d.Calib3d.convertPointsToHomogeneous</a>
 */
    public static void convertPointsToHomogeneous(Mat src, Mat dst)
    {

        convertPointsToHomogeneous_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void decomposeProjectionMatrix(Mat projMatrix, Mat& cameraMatrix, Mat& rotMatrix, Mat& transVect, Mat& rotMatrixX = Mat(), Mat& rotMatrixY = Mat(), Mat& rotMatrixZ = Mat(), Mat& eulerAngles = Mat())
    //

/**
 * Decomposes a projection matrix into a rotation matrix and a camera matrix.
 *
 * The function computes a decomposition of a projection matrix into a
 * calibration and a rotation matrix and the position of a camera.
 *
 * It optionally returns three rotation matrices, one for each axis, and three
 * Euler angles that could be used in OpenGL.
 *
 * The function is based on "RQDecomp3x3".
 *
 * @param projMatrix 3x4 input projection matrix P.
 * @param cameraMatrix Output 3x3 camera matrix K.
 * @param rotMatrix Output 3x3 external rotation matrix R.
 * @param transVect Output 4x1 translation vector T.
 * @param rotMatrixX a rotMatrixX
 * @param rotMatrixY a rotMatrixY
 * @param rotMatrixZ a rotMatrixZ
 * @param eulerAngles Optional three-element vector containing three Euler
 * angles of rotation.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#decomposeprojectionmatrix">org.opencv.calib3d.Calib3d.decomposeProjectionMatrix</a>
 */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ, Mat eulerAngles)
    {

        decomposeProjectionMatrix_0(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj, eulerAngles.nativeObj);

        return;
    }

/**
 * Decomposes a projection matrix into a rotation matrix and a camera matrix.
 *
 * The function computes a decomposition of a projection matrix into a
 * calibration and a rotation matrix and the position of a camera.
 *
 * It optionally returns three rotation matrices, one for each axis, and three
 * Euler angles that could be used in OpenGL.
 *
 * The function is based on "RQDecomp3x3".
 *
 * @param projMatrix 3x4 input projection matrix P.
 * @param cameraMatrix Output 3x3 camera matrix K.
 * @param rotMatrix Output 3x3 external rotation matrix R.
 * @param transVect Output 4x1 translation vector T.
 * @param rotMatrixX a rotMatrixX
 * @param rotMatrixY a rotMatrixY
 * @param rotMatrixZ a rotMatrixZ
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#decomposeprojectionmatrix">org.opencv.calib3d.Calib3d.decomposeProjectionMatrix</a>
 */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ)
    {

        decomposeProjectionMatrix_1(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj);

        return;
    }

/**
 * Decomposes a projection matrix into a rotation matrix and a camera matrix.
 *
 * The function computes a decomposition of a projection matrix into a
 * calibration and a rotation matrix and the position of a camera.
 *
 * It optionally returns three rotation matrices, one for each axis, and three
 * Euler angles that could be used in OpenGL.
 *
 * The function is based on "RQDecomp3x3".
 *
 * @param projMatrix 3x4 input projection matrix P.
 * @param cameraMatrix Output 3x3 camera matrix K.
 * @param rotMatrix Output 3x3 external rotation matrix R.
 * @param transVect Output 4x1 translation vector T.
 * @param rotMatrixX a rotMatrixX
 * @param rotMatrixY a rotMatrixY
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#decomposeprojectionmatrix">org.opencv.calib3d.Calib3d.decomposeProjectionMatrix</a>
 */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY)
    {

        decomposeProjectionMatrix_2(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj);

        return;
    }

/**
 * Decomposes a projection matrix into a rotation matrix and a camera matrix.
 *
 * The function computes a decomposition of a projection matrix into a
 * calibration and a rotation matrix and the position of a camera.
 *
 * It optionally returns three rotation matrices, one for each axis, and three
 * Euler angles that could be used in OpenGL.
 *
 * The function is based on "RQDecomp3x3".
 *
 * @param projMatrix 3x4 input projection matrix P.
 * @param cameraMatrix Output 3x3 camera matrix K.
 * @param rotMatrix Output 3x3 external rotation matrix R.
 * @param transVect Output 4x1 translation vector T.
 * @param rotMatrixX a rotMatrixX
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#decomposeprojectionmatrix">org.opencv.calib3d.Calib3d.decomposeProjectionMatrix</a>
 */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX)
    {

        decomposeProjectionMatrix_3(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj);

        return;
    }

/**
 * Decomposes a projection matrix into a rotation matrix and a camera matrix.
 *
 * The function computes a decomposition of a projection matrix into a
 * calibration and a rotation matrix and the position of a camera.
 *
 * It optionally returns three rotation matrices, one for each axis, and three
 * Euler angles that could be used in OpenGL.
 *
 * The function is based on "RQDecomp3x3".
 *
 * @param projMatrix 3x4 input projection matrix P.
 * @param cameraMatrix Output 3x3 camera matrix K.
 * @param rotMatrix Output 3x3 external rotation matrix R.
 * @param transVect Output 4x1 translation vector T.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#decomposeprojectionmatrix">org.opencv.calib3d.Calib3d.decomposeProjectionMatrix</a>
 */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect)
    {

        decomposeProjectionMatrix_4(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj);

        return;
    }


    //
    // C++:  void drawChessboardCorners(Mat& image, Size patternSize, Mat corners, bool patternWasFound)
    //

/**
 * Renders the detected chessboard corners.
 *
 * The function draws individual chessboard corners detected either as red
 * circles if the board was not found, or as colored corners connected with
 * lines if the board was found.
 *
 * @param image Destination image. It must be an 8-bit color image.
 * @param patternSize Number of inner corners per a chessboard row and column
 * "(patternSize = cv.Size(points_per_row,points_per_column))".
 * @param corners Array of detected corners, the output of "findChessboardCorners".
 * @param patternWasFound Parameter indicating whether the complete board was
 * found or not. The return value of "findChessboardCorners" should be passed
 * here.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#drawchessboardcorners">org.opencv.calib3d.Calib3d.drawChessboardCorners</a>
 */
    public static void drawChessboardCorners(Mat image, Size patternSize, Mat corners, boolean patternWasFound)
    {

        drawChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, patternWasFound);

        return;
    }


    //
    // C++:  int estimateAffine3D(Mat _from, Mat _to, Mat& _out, Mat& _inliers, double param1 = 3, double param2 = 0.99)
    //

/**
 * Computes an optimal affine transformation between two 3D point sets.
 *
 * The function estimates an optimal 3D affine transformation between two 3D
 * point sets using the RANSAC algorithm.
 *
 * @param _from a _from
 * @param _to a _to
 * @param _out a _out
 * @param _inliers a _inliers
 * @param param1 a param1
 * @param param2 a param2
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#estimateaffine3d">org.opencv.calib3d.Calib3d.estimateAffine3D</a>
 */
    public static int estimateAffine3D(Mat _from, Mat _to, Mat _out, Mat _inliers, double param1, double param2)
    {

        int retVal = estimateAffine3D_0(_from.nativeObj, _to.nativeObj, _out.nativeObj, _inliers.nativeObj, param1, param2);

        return retVal;
    }

/**
 * Computes an optimal affine transformation between two 3D point sets.
 *
 * The function estimates an optimal 3D affine transformation between two 3D
 * point sets using the RANSAC algorithm.
 *
 * @param _from a _from
 * @param _to a _to
 * @param _out a _out
 * @param _inliers a _inliers
 * @param param1 a param1
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#estimateaffine3d">org.opencv.calib3d.Calib3d.estimateAffine3D</a>
 */
    public static int estimateAffine3D(Mat _from, Mat _to, Mat _out, Mat _inliers, double param1)
    {

        int retVal = estimateAffine3D_1(_from.nativeObj, _to.nativeObj, _out.nativeObj, _inliers.nativeObj, param1);

        return retVal;
    }

/**
 * Computes an optimal affine transformation between two 3D point sets.
 *
 * The function estimates an optimal 3D affine transformation between two 3D
 * point sets using the RANSAC algorithm.
 *
 * @param _from a _from
 * @param _to a _to
 * @param _out a _out
 * @param _inliers a _inliers
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#estimateaffine3d">org.opencv.calib3d.Calib3d.estimateAffine3D</a>
 */
    public static int estimateAffine3D(Mat _from, Mat _to, Mat _out, Mat _inliers)
    {

        int retVal = estimateAffine3D_2(_from.nativeObj, _to.nativeObj, _out.nativeObj, _inliers.nativeObj);

        return retVal;
    }


    //
    // C++:  void filterSpeckles(Mat& img, double newVal, int maxSpeckleSize, double maxDiff, Mat& buf = Mat())
    //

/**
 * Filters off small noise blobs (speckles) in the disparity map
 *
 * @param img The input 16-bit signed disparity image
 * @param newVal The disparity value used to paint-off the speckles
 * @param maxSpeckleSize The maximum speckle size to consider it a speckle.
 * Larger blobs are not affected by the algorithm
 * @param maxDiff Maximum difference between neighbor disparity pixels to put
 * them into the same blob. Note that since StereoBM, StereoSGBM and may be
 * other algorithms return a fixed-point disparity map, where disparity values
 * are multiplied by 16, this scale factor should be taken into account when
 * specifying this parameter value.
 * @param buf The optional temporary buffer to avoid memory allocation within
 * the function.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#filterspeckles">org.opencv.calib3d.Calib3d.filterSpeckles</a>
 */
    public static void filterSpeckles(Mat img, double newVal, int maxSpeckleSize, double maxDiff, Mat buf)
    {

        filterSpeckles_0(img.nativeObj, newVal, maxSpeckleSize, maxDiff, buf.nativeObj);

        return;
    }

/**
 * Filters off small noise blobs (speckles) in the disparity map
 *
 * @param img The input 16-bit signed disparity image
 * @param newVal The disparity value used to paint-off the speckles
 * @param maxSpeckleSize The maximum speckle size to consider it a speckle.
 * Larger blobs are not affected by the algorithm
 * @param maxDiff Maximum difference between neighbor disparity pixels to put
 * them into the same blob. Note that since StereoBM, StereoSGBM and may be
 * other algorithms return a fixed-point disparity map, where disparity values
 * are multiplied by 16, this scale factor should be taken into account when
 * specifying this parameter value.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#filterspeckles">org.opencv.calib3d.Calib3d.filterSpeckles</a>
 */
    public static void filterSpeckles(Mat img, double newVal, int maxSpeckleSize, double maxDiff)
    {

        filterSpeckles_1(img.nativeObj, newVal, maxSpeckleSize, maxDiff);

        return;
    }


    //
    // C++:  bool findChessboardCorners(Mat image, Size patternSize, Mat& corners, int flags = CALIB_CB_ADAPTIVE_THRESH+ CALIB_CB_NORMALIZE_IMAGE)
    //

/**
 * Finds the positions of internal corners of the chessboard.
 *
 * The function attempts to determine whether the input image is a view of the
 * chessboard pattern and locate the internal chessboard corners. The function
 * returns a non-zero value if all of the corners are found and they are placed
 * in a certain order (row by row, left to right in every row). Otherwise, if
 * the function fails to find all the corners or reorder them, it returns 0. For
 * example, a regular chessboard has 8 x 8 squares and 7 x 7 internal corners,
 * that is, points where the black squares touch each other.
 * The detected coordinates are approximate, and to determine their positions
 * more accurately, the function calls "cornerSubPix".
 * You also may use the function "cornerSubPix" with different parameters if
 * returned coordinates are not accurate enough.
 *
 * Sample usage of detecting and drawing chessboard corners:
 *
 * Note: The function requires white space (like a square-thick border, the
 * wider the better) around the board to make the detection more robust in
 * various environments. Otherwise, if there is no border and the background is
 * dark, the outer black squares cannot be segmented properly and so the square
 * grouping and ordering algorithm fails.
 *
 * @param image Source chessboard view. It must be an 8-bit grayscale or color
 * image.
 * @param patternSize Number of inner corners per a chessboard row and column
 * "(patternSize = cvSize(points_per_row,points_per_colum) = cvSize(columns,rows))".
 * @param corners Output array of detected corners.
 * @param flags Various operation flags that can be zero or a combination of the
 * following values:
 *   * CV_CALIB_CB_ADAPTIVE_THRESH Use adaptive thresholding to convert the
 * image to black and white, rather than a fixed threshold level (computed from
 * the average image brightness).
 *   * CV_CALIB_CB_NORMALIZE_IMAGE Normalize the image gamma with "EqualizeHist"
 * before applying fixed or adaptive thresholding.
 *   * CV_CALIB_CB_FILTER_QUADS Use additional criteria (like contour area,
 * perimeter, square-like shape) to filter out false quads extracted at the
 * contour retrieval stage.
 *   * CALIB_CB_FAST_CHECK Run a fast check on the image that looks for
 * chessboard corners, and shortcut the call if none is found. This can
 * drastically speed up the call in the degenerate condition when no chessboard
 * is observed.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findchessboardcorners">org.opencv.calib3d.Calib3d.findChessboardCorners</a>
 */
    public static boolean findChessboardCorners(Mat image, Size patternSize, Mat corners, int flags)
    {

        boolean retVal = findChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, flags);

        return retVal;
    }

/**
 * Finds the positions of internal corners of the chessboard.
 *
 * The function attempts to determine whether the input image is a view of the
 * chessboard pattern and locate the internal chessboard corners. The function
 * returns a non-zero value if all of the corners are found and they are placed
 * in a certain order (row by row, left to right in every row). Otherwise, if
 * the function fails to find all the corners or reorder them, it returns 0. For
 * example, a regular chessboard has 8 x 8 squares and 7 x 7 internal corners,
 * that is, points where the black squares touch each other.
 * The detected coordinates are approximate, and to determine their positions
 * more accurately, the function calls "cornerSubPix".
 * You also may use the function "cornerSubPix" with different parameters if
 * returned coordinates are not accurate enough.
 *
 * Sample usage of detecting and drawing chessboard corners:
 *
 * Note: The function requires white space (like a square-thick border, the
 * wider the better) around the board to make the detection more robust in
 * various environments. Otherwise, if there is no border and the background is
 * dark, the outer black squares cannot be segmented properly and so the square
 * grouping and ordering algorithm fails.
 *
 * @param image Source chessboard view. It must be an 8-bit grayscale or color
 * image.
 * @param patternSize Number of inner corners per a chessboard row and column
 * "(patternSize = cvSize(points_per_row,points_per_colum) = cvSize(columns,rows))".
 * @param corners Output array of detected corners.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findchessboardcorners">org.opencv.calib3d.Calib3d.findChessboardCorners</a>
 */
    public static boolean findChessboardCorners(Mat image, Size patternSize, Mat corners)
    {

        boolean retVal = findChessboardCorners_1(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj);

        return retVal;
    }


    //
    // C++:  bool findCirclesGridDefault(Mat image, Size patternSize, Mat& centers, int flags = CALIB_CB_SYMMETRIC_GRID)
    //

    public static boolean findCirclesGridDefault(Mat image, Size patternSize, Mat centers, int flags)
    {

        boolean retVal = findCirclesGridDefault_0(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj, flags);

        return retVal;
    }

    public static boolean findCirclesGridDefault(Mat image, Size patternSize, Mat centers)
    {

        boolean retVal = findCirclesGridDefault_1(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj);

        return retVal;
    }


    //
    // C++:  Mat findFundamentalMat(vector_Point2d points1, vector_Point2d points2, int method = FM_RANSAC, double param1 = 3., double param2 = 0.99, Mat& mask = Mat())
    //

/**
 * Calculates a fundamental matrix from the corresponding points in two images.
 *
 * The epipolar geometry is described by the following equation:
 *
 * [p_2; 1]^T F [p_1; 1] = 0
 *
 * where F is a fundamental matrix, p_1 and p_2 are corresponding points in the
 * first and the second images, respectively.
 *
 * The function calculates the fundamental matrix using one of four methods
 * listed above and returns the found fundamental matrix. Normally just one
 * matrix is found. But in case of the 7-point algorithm, the function may
 * return up to 3 solutions (9 x 3 matrix that stores all 3 matrices
 * sequentially).
 *
 * The calculated fundamental matrix may be passed further to "ComputeCorrespondEpilines"
 * that finds the epipolar lines corresponding to the specified points. It can
 * also be passed to "StereoRectifyUncalibrated" to compute the rectification
 * transformation.
 *
 * @param points1 Array of "N" points from the first image. The point
 * coordinates should be floating-point (single or double precision).
 * @param points2 Array of the second image points of the same size and format
 * as "points1".
 * @param method Method for computing a fundamental matrix.
 *   * CV_FM_7POINT for a 7-point algorithm. N = 7
 *   * CV_FM_8POINT for an 8-point algorithm. N >= 8
 *   * CV_FM_RANSAC for the RANSAC algorithm. N >= 8
 *   * CV_FM_LMEDS for the LMedS algorithm. N >= 8
 * @param param1 Parameter used for RANSAC. It is the maximum distance from a
 * point to an epipolar line in pixels, beyond which the point is considered an
 * outlier and is not used for computing the final fundamental matrix. It can be
 * set to something like 1-3, depending on the accuracy of the point
 * localization, image resolution, and the image noise.
 * @param param2 Parameter used for the RANSAC or LMedS methods only. It
 * specifies a desirable level of confidence (probability) that the estimated
 * matrix is correct.
 * @param mask a mask
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findfundamentalmat">org.opencv.calib3d.Calib3d.findFundamentalMat</a>
 */
    public static Mat findFundamentalMat(List<Point> points1, List<Point> points2, int method, double param1, double param2, Mat mask)
    {
        Mat points1_mat = Converters.vector_Point2d_to_Mat(points1);
        Mat points2_mat = Converters.vector_Point2d_to_Mat(points2);
        Mat retVal = new Mat(findFundamentalMat_0(points1_mat.nativeObj, points2_mat.nativeObj, method, param1, param2, mask.nativeObj));

        return retVal;
    }

/**
 * Calculates a fundamental matrix from the corresponding points in two images.
 *
 * The epipolar geometry is described by the following equation:
 *
 * [p_2; 1]^T F [p_1; 1] = 0
 *
 * where F is a fundamental matrix, p_1 and p_2 are corresponding points in the
 * first and the second images, respectively.
 *
 * The function calculates the fundamental matrix using one of four methods
 * listed above and returns the found fundamental matrix. Normally just one
 * matrix is found. But in case of the 7-point algorithm, the function may
 * return up to 3 solutions (9 x 3 matrix that stores all 3 matrices
 * sequentially).
 *
 * The calculated fundamental matrix may be passed further to "ComputeCorrespondEpilines"
 * that finds the epipolar lines corresponding to the specified points. It can
 * also be passed to "StereoRectifyUncalibrated" to compute the rectification
 * transformation.
 *
 * @param points1 Array of "N" points from the first image. The point
 * coordinates should be floating-point (single or double precision).
 * @param points2 Array of the second image points of the same size and format
 * as "points1".
 * @param method Method for computing a fundamental matrix.
 *   * CV_FM_7POINT for a 7-point algorithm. N = 7
 *   * CV_FM_8POINT for an 8-point algorithm. N >= 8
 *   * CV_FM_RANSAC for the RANSAC algorithm. N >= 8
 *   * CV_FM_LMEDS for the LMedS algorithm. N >= 8
 * @param param1 Parameter used for RANSAC. It is the maximum distance from a
 * point to an epipolar line in pixels, beyond which the point is considered an
 * outlier and is not used for computing the final fundamental matrix. It can be
 * set to something like 1-3, depending on the accuracy of the point
 * localization, image resolution, and the image noise.
 * @param param2 Parameter used for the RANSAC or LMedS methods only. It
 * specifies a desirable level of confidence (probability) that the estimated
 * matrix is correct.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findfundamentalmat">org.opencv.calib3d.Calib3d.findFundamentalMat</a>
 */
    public static Mat findFundamentalMat(List<Point> points1, List<Point> points2, int method, double param1, double param2)
    {
        Mat points1_mat = Converters.vector_Point2d_to_Mat(points1);
        Mat points2_mat = Converters.vector_Point2d_to_Mat(points2);
        Mat retVal = new Mat(findFundamentalMat_1(points1_mat.nativeObj, points2_mat.nativeObj, method, param1, param2));

        return retVal;
    }

/**
 * Calculates a fundamental matrix from the corresponding points in two images.
 *
 * The epipolar geometry is described by the following equation:
 *
 * [p_2; 1]^T F [p_1; 1] = 0
 *
 * where F is a fundamental matrix, p_1 and p_2 are corresponding points in the
 * first and the second images, respectively.
 *
 * The function calculates the fundamental matrix using one of four methods
 * listed above and returns the found fundamental matrix. Normally just one
 * matrix is found. But in case of the 7-point algorithm, the function may
 * return up to 3 solutions (9 x 3 matrix that stores all 3 matrices
 * sequentially).
 *
 * The calculated fundamental matrix may be passed further to "ComputeCorrespondEpilines"
 * that finds the epipolar lines corresponding to the specified points. It can
 * also be passed to "StereoRectifyUncalibrated" to compute the rectification
 * transformation.
 *
 * @param points1 Array of "N" points from the first image. The point
 * coordinates should be floating-point (single or double precision).
 * @param points2 Array of the second image points of the same size and format
 * as "points1".
 * @param method Method for computing a fundamental matrix.
 *   * CV_FM_7POINT for a 7-point algorithm. N = 7
 *   * CV_FM_8POINT for an 8-point algorithm. N >= 8
 *   * CV_FM_RANSAC for the RANSAC algorithm. N >= 8
 *   * CV_FM_LMEDS for the LMedS algorithm. N >= 8
 * @param param1 Parameter used for RANSAC. It is the maximum distance from a
 * point to an epipolar line in pixels, beyond which the point is considered an
 * outlier and is not used for computing the final fundamental matrix. It can be
 * set to something like 1-3, depending on the accuracy of the point
 * localization, image resolution, and the image noise.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findfundamentalmat">org.opencv.calib3d.Calib3d.findFundamentalMat</a>
 */
    public static Mat findFundamentalMat(List<Point> points1, List<Point> points2, int method, double param1)
    {
        Mat points1_mat = Converters.vector_Point2d_to_Mat(points1);
        Mat points2_mat = Converters.vector_Point2d_to_Mat(points2);
        Mat retVal = new Mat(findFundamentalMat_2(points1_mat.nativeObj, points2_mat.nativeObj, method, param1));

        return retVal;
    }

/**
 * Calculates a fundamental matrix from the corresponding points in two images.
 *
 * The epipolar geometry is described by the following equation:
 *
 * [p_2; 1]^T F [p_1; 1] = 0
 *
 * where F is a fundamental matrix, p_1 and p_2 are corresponding points in the
 * first and the second images, respectively.
 *
 * The function calculates the fundamental matrix using one of four methods
 * listed above and returns the found fundamental matrix. Normally just one
 * matrix is found. But in case of the 7-point algorithm, the function may
 * return up to 3 solutions (9 x 3 matrix that stores all 3 matrices
 * sequentially).
 *
 * The calculated fundamental matrix may be passed further to "ComputeCorrespondEpilines"
 * that finds the epipolar lines corresponding to the specified points. It can
 * also be passed to "StereoRectifyUncalibrated" to compute the rectification
 * transformation.
 *
 * @param points1 Array of "N" points from the first image. The point
 * coordinates should be floating-point (single or double precision).
 * @param points2 Array of the second image points of the same size and format
 * as "points1".
 * @param method Method for computing a fundamental matrix.
 *   * CV_FM_7POINT for a 7-point algorithm. N = 7
 *   * CV_FM_8POINT for an 8-point algorithm. N >= 8
 *   * CV_FM_RANSAC for the RANSAC algorithm. N >= 8
 *   * CV_FM_LMEDS for the LMedS algorithm. N >= 8
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findfundamentalmat">org.opencv.calib3d.Calib3d.findFundamentalMat</a>
 */
    public static Mat findFundamentalMat(List<Point> points1, List<Point> points2, int method)
    {
        Mat points1_mat = Converters.vector_Point2d_to_Mat(points1);
        Mat points2_mat = Converters.vector_Point2d_to_Mat(points2);
        Mat retVal = new Mat(findFundamentalMat_3(points1_mat.nativeObj, points2_mat.nativeObj, method));

        return retVal;
    }

/**
 * Calculates a fundamental matrix from the corresponding points in two images.
 *
 * The epipolar geometry is described by the following equation:
 *
 * [p_2; 1]^T F [p_1; 1] = 0
 *
 * where F is a fundamental matrix, p_1 and p_2 are corresponding points in the
 * first and the second images, respectively.
 *
 * The function calculates the fundamental matrix using one of four methods
 * listed above and returns the found fundamental matrix. Normally just one
 * matrix is found. But in case of the 7-point algorithm, the function may
 * return up to 3 solutions (9 x 3 matrix that stores all 3 matrices
 * sequentially).
 *
 * The calculated fundamental matrix may be passed further to "ComputeCorrespondEpilines"
 * that finds the epipolar lines corresponding to the specified points. It can
 * also be passed to "StereoRectifyUncalibrated" to compute the rectification
 * transformation.
 *
 * @param points1 Array of "N" points from the first image. The point
 * coordinates should be floating-point (single or double precision).
 * @param points2 Array of the second image points of the same size and format
 * as "points1".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findfundamentalmat">org.opencv.calib3d.Calib3d.findFundamentalMat</a>
 */
    public static Mat findFundamentalMat(List<Point> points1, List<Point> points2)
    {
        Mat points1_mat = Converters.vector_Point2d_to_Mat(points1);
        Mat points2_mat = Converters.vector_Point2d_to_Mat(points2);
        Mat retVal = new Mat(findFundamentalMat_4(points1_mat.nativeObj, points2_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  Mat findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, int method = 0, double ransacReprojThreshold = 3, Mat& mask = Mat())
    //

/**
 * Finds a perspective transformation between two planes.
 *
 * The functions find and return the perspective transformation H between the
 * source and the destination planes:
 *
 * s_i [x'_i y'_i 1] ~ H [x_i y_i 1]
 *
 * so that the back-projection error
 *
 * sum _i(x'_i- (h_11 x_i + h_12 y_i + h_13)/(h_(31) x_i + h_32 y_i + h_33))^2+
 * (y'_i- (h_21 x_i + h_22 y_i + h_23)/(h_(31) x_i + h_32 y_i + h_33))^2
 *
 * is minimized. If the parameter "method" is set to the default value 0, the
 * function uses all the point pairs to compute an initial homography estimate
 * with a simple least-squares scheme.
 *
 * However, if not all of the point pairs (srcPoints_i,dstPoints_i) fit the
 * rigid perspective transformation (that is, there are some outliers), this
 * initial estimate will be poor.
 * In this case, you can use one of the two robust methods. Both methods,
 * "RANSAC" and "LMeDS", try many different random subsets of the corresponding
 * point pairs (of four pairs each), estimate the homography matrix using this
 * subset and a simple least-square algorithm, and then compute the
 * quality/goodness of the computed homography (which is the number of inliers
 * for RANSAC or the median re-projection error for LMeDs). The best subset is
 * then used to produce the initial estimate of the homography matrix and the
 * mask of inliers/outliers.
 *
 * Regardless of the method, robust or not, the computed homography matrix is
 * refined further (using inliers only in case of a robust method) with the
 * Levenberg-Marquardt method to reduce the re-projection error even more.
 *
 * The method "RANSAC" can handle practically any ratio of outliers but it needs
 * a threshold to distinguish inliers from outliers.
 * The method "LMeDS" does not need any threshold but it works correctly only
 * when there are more than 50% of inliers. Finally, if there are no outliers
 * and the noise is rather small, use the default method ("method=0").
 *
 * The function is used to find initial intrinsic and extrinsic matrices.
 * Homography matrix is determined up to a scale. Thus, it is normalized so that
 * h_33=1.
 *
 * @param srcPoints Coordinates of the points in the original plane, a matrix of
 * the type "CV_32FC2" or "vector<Point2f>".
 * @param dstPoints Coordinates of the points in the target plane, a matrix of
 * the type "CV_32FC2" or a "vector<Point2f>".
 * @param method Method used to computed a homography matrix. The following
 * methods are possible:
 *   * 0 - a regular method using all the points
 *   * CV_RANSAC - RANSAC-based robust method
 *   * CV_LMEDS - Least-Median robust method
 * @param ransacReprojThreshold Maximum allowed reprojection error to treat a
 * point pair as an inlier (used in the RANSAC method only). That is, if
 *
 * | dstPoints _i - convertPointsHomogeneous(H * srcPoints _i)| >
 * ransacReprojThreshold
 *
 * then the point i is considered an outlier. If "srcPoints" and "dstPoints" are
 * measured in pixels, it usually makes sense to set this parameter somewhere in
 * the range of 1 to 10.
 * @param mask a mask
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findhomography">org.opencv.calib3d.Calib3d.findHomography</a>
 * @see PerspectiveTransform
 * @see WarpPerspective
 * @see GetAffineTransform
 * @see EstimateRigidMotion
 * @see GetPerspectiveTransform
 */
    public static Mat findHomography(List<Point> srcPoints, List<Point> dstPoints, int method, double ransacReprojThreshold, Mat mask)
    {
        Mat srcPoints_mat = Converters.vector_Point2f_to_Mat(srcPoints);
        Mat dstPoints_mat = Converters.vector_Point2f_to_Mat(dstPoints);
        Mat retVal = new Mat(findHomography_0(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold, mask.nativeObj));

        return retVal;
    }

/**
 * Finds a perspective transformation between two planes.
 *
 * The functions find and return the perspective transformation H between the
 * source and the destination planes:
 *
 * s_i [x'_i y'_i 1] ~ H [x_i y_i 1]
 *
 * so that the back-projection error
 *
 * sum _i(x'_i- (h_11 x_i + h_12 y_i + h_13)/(h_(31) x_i + h_32 y_i + h_33))^2+
 * (y'_i- (h_21 x_i + h_22 y_i + h_23)/(h_(31) x_i + h_32 y_i + h_33))^2
 *
 * is minimized. If the parameter "method" is set to the default value 0, the
 * function uses all the point pairs to compute an initial homography estimate
 * with a simple least-squares scheme.
 *
 * However, if not all of the point pairs (srcPoints_i,dstPoints_i) fit the
 * rigid perspective transformation (that is, there are some outliers), this
 * initial estimate will be poor.
 * In this case, you can use one of the two robust methods. Both methods,
 * "RANSAC" and "LMeDS", try many different random subsets of the corresponding
 * point pairs (of four pairs each), estimate the homography matrix using this
 * subset and a simple least-square algorithm, and then compute the
 * quality/goodness of the computed homography (which is the number of inliers
 * for RANSAC or the median re-projection error for LMeDs). The best subset is
 * then used to produce the initial estimate of the homography matrix and the
 * mask of inliers/outliers.
 *
 * Regardless of the method, robust or not, the computed homography matrix is
 * refined further (using inliers only in case of a robust method) with the
 * Levenberg-Marquardt method to reduce the re-projection error even more.
 *
 * The method "RANSAC" can handle practically any ratio of outliers but it needs
 * a threshold to distinguish inliers from outliers.
 * The method "LMeDS" does not need any threshold but it works correctly only
 * when there are more than 50% of inliers. Finally, if there are no outliers
 * and the noise is rather small, use the default method ("method=0").
 *
 * The function is used to find initial intrinsic and extrinsic matrices.
 * Homography matrix is determined up to a scale. Thus, it is normalized so that
 * h_33=1.
 *
 * @param srcPoints Coordinates of the points in the original plane, a matrix of
 * the type "CV_32FC2" or "vector<Point2f>".
 * @param dstPoints Coordinates of the points in the target plane, a matrix of
 * the type "CV_32FC2" or a "vector<Point2f>".
 * @param method Method used to computed a homography matrix. The following
 * methods are possible:
 *   * 0 - a regular method using all the points
 *   * CV_RANSAC - RANSAC-based robust method
 *   * CV_LMEDS - Least-Median robust method
 * @param ransacReprojThreshold Maximum allowed reprojection error to treat a
 * point pair as an inlier (used in the RANSAC method only). That is, if
 *
 * | dstPoints _i - convertPointsHomogeneous(H * srcPoints _i)| >
 * ransacReprojThreshold
 *
 * then the point i is considered an outlier. If "srcPoints" and "dstPoints" are
 * measured in pixels, it usually makes sense to set this parameter somewhere in
 * the range of 1 to 10.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findhomography">org.opencv.calib3d.Calib3d.findHomography</a>
 * @see PerspectiveTransform
 * @see WarpPerspective
 * @see GetAffineTransform
 * @see EstimateRigidMotion
 * @see GetPerspectiveTransform
 */
    public static Mat findHomography(List<Point> srcPoints, List<Point> dstPoints, int method, double ransacReprojThreshold)
    {
        Mat srcPoints_mat = Converters.vector_Point2f_to_Mat(srcPoints);
        Mat dstPoints_mat = Converters.vector_Point2f_to_Mat(dstPoints);
        Mat retVal = new Mat(findHomography_1(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold));

        return retVal;
    }

/**
 * Finds a perspective transformation between two planes.
 *
 * The functions find and return the perspective transformation H between the
 * source and the destination planes:
 *
 * s_i [x'_i y'_i 1] ~ H [x_i y_i 1]
 *
 * so that the back-projection error
 *
 * sum _i(x'_i- (h_11 x_i + h_12 y_i + h_13)/(h_(31) x_i + h_32 y_i + h_33))^2+
 * (y'_i- (h_21 x_i + h_22 y_i + h_23)/(h_(31) x_i + h_32 y_i + h_33))^2
 *
 * is minimized. If the parameter "method" is set to the default value 0, the
 * function uses all the point pairs to compute an initial homography estimate
 * with a simple least-squares scheme.
 *
 * However, if not all of the point pairs (srcPoints_i,dstPoints_i) fit the
 * rigid perspective transformation (that is, there are some outliers), this
 * initial estimate will be poor.
 * In this case, you can use one of the two robust methods. Both methods,
 * "RANSAC" and "LMeDS", try many different random subsets of the corresponding
 * point pairs (of four pairs each), estimate the homography matrix using this
 * subset and a simple least-square algorithm, and then compute the
 * quality/goodness of the computed homography (which is the number of inliers
 * for RANSAC or the median re-projection error for LMeDs). The best subset is
 * then used to produce the initial estimate of the homography matrix and the
 * mask of inliers/outliers.
 *
 * Regardless of the method, robust or not, the computed homography matrix is
 * refined further (using inliers only in case of a robust method) with the
 * Levenberg-Marquardt method to reduce the re-projection error even more.
 *
 * The method "RANSAC" can handle practically any ratio of outliers but it needs
 * a threshold to distinguish inliers from outliers.
 * The method "LMeDS" does not need any threshold but it works correctly only
 * when there are more than 50% of inliers. Finally, if there are no outliers
 * and the noise is rather small, use the default method ("method=0").
 *
 * The function is used to find initial intrinsic and extrinsic matrices.
 * Homography matrix is determined up to a scale. Thus, it is normalized so that
 * h_33=1.
 *
 * @param srcPoints Coordinates of the points in the original plane, a matrix of
 * the type "CV_32FC2" or "vector<Point2f>".
 * @param dstPoints Coordinates of the points in the target plane, a matrix of
 * the type "CV_32FC2" or a "vector<Point2f>".
 * @param method Method used to computed a homography matrix. The following
 * methods are possible:
 *   * 0 - a regular method using all the points
 *   * CV_RANSAC - RANSAC-based robust method
 *   * CV_LMEDS - Least-Median robust method
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findhomography">org.opencv.calib3d.Calib3d.findHomography</a>
 * @see PerspectiveTransform
 * @see WarpPerspective
 * @see GetAffineTransform
 * @see EstimateRigidMotion
 * @see GetPerspectiveTransform
 */
    public static Mat findHomography(List<Point> srcPoints, List<Point> dstPoints, int method)
    {
        Mat srcPoints_mat = Converters.vector_Point2f_to_Mat(srcPoints);
        Mat dstPoints_mat = Converters.vector_Point2f_to_Mat(dstPoints);
        Mat retVal = new Mat(findHomography_2(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method));

        return retVal;
    }

/**
 * Finds a perspective transformation between two planes.
 *
 * The functions find and return the perspective transformation H between the
 * source and the destination planes:
 *
 * s_i [x'_i y'_i 1] ~ H [x_i y_i 1]
 *
 * so that the back-projection error
 *
 * sum _i(x'_i- (h_11 x_i + h_12 y_i + h_13)/(h_(31) x_i + h_32 y_i + h_33))^2+
 * (y'_i- (h_21 x_i + h_22 y_i + h_23)/(h_(31) x_i + h_32 y_i + h_33))^2
 *
 * is minimized. If the parameter "method" is set to the default value 0, the
 * function uses all the point pairs to compute an initial homography estimate
 * with a simple least-squares scheme.
 *
 * However, if not all of the point pairs (srcPoints_i,dstPoints_i) fit the
 * rigid perspective transformation (that is, there are some outliers), this
 * initial estimate will be poor.
 * In this case, you can use one of the two robust methods. Both methods,
 * "RANSAC" and "LMeDS", try many different random subsets of the corresponding
 * point pairs (of four pairs each), estimate the homography matrix using this
 * subset and a simple least-square algorithm, and then compute the
 * quality/goodness of the computed homography (which is the number of inliers
 * for RANSAC or the median re-projection error for LMeDs). The best subset is
 * then used to produce the initial estimate of the homography matrix and the
 * mask of inliers/outliers.
 *
 * Regardless of the method, robust or not, the computed homography matrix is
 * refined further (using inliers only in case of a robust method) with the
 * Levenberg-Marquardt method to reduce the re-projection error even more.
 *
 * The method "RANSAC" can handle practically any ratio of outliers but it needs
 * a threshold to distinguish inliers from outliers.
 * The method "LMeDS" does not need any threshold but it works correctly only
 * when there are more than 50% of inliers. Finally, if there are no outliers
 * and the noise is rather small, use the default method ("method=0").
 *
 * The function is used to find initial intrinsic and extrinsic matrices.
 * Homography matrix is determined up to a scale. Thus, it is normalized so that
 * h_33=1.
 *
 * @param srcPoints Coordinates of the points in the original plane, a matrix of
 * the type "CV_32FC2" or "vector<Point2f>".
 * @param dstPoints Coordinates of the points in the target plane, a matrix of
 * the type "CV_32FC2" or a "vector<Point2f>".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#findhomography">org.opencv.calib3d.Calib3d.findHomography</a>
 * @see PerspectiveTransform
 * @see WarpPerspective
 * @see GetAffineTransform
 * @see EstimateRigidMotion
 * @see GetPerspectiveTransform
 */
    public static Mat findHomography(List<Point> srcPoints, List<Point> dstPoints)
    {
        Mat srcPoints_mat = Converters.vector_Point2f_to_Mat(srcPoints);
        Mat dstPoints_mat = Converters.vector_Point2f_to_Mat(dstPoints);
        Mat retVal = new Mat(findHomography_3(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj));

        return retVal;
    }


    //
    // C++:  Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize = Size(), Rect* validPixROI = 0, bool centerPrincipalPoint = false)
    //

/**
 * Returns the new camera matrix based on the free scaling parameter.
 *
 * The function computes and returns the optimal new camera matrix based on the
 * free scaling parameter. By varying this parameter, you may retrieve only
 * sensible pixels "alpha=0", keep all the original image pixels if there is
 * valuable information in the corners "alpha=1", or get something in between.
 * When "alpha>0", the undistortion result is likely to have some black pixels
 * corresponding to "virtual" pixels outside of the captured distorted image.
 * The original camera matrix, distortion coefficients, the computed new camera
 * matrix, and "newImageSize" should be passed to "initUndistortRectifyMap" to
 * produce the maps for "remap".
 *
 * @param cameraMatrix Input camera matrix.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imageSize Original image size.
 * @param alpha Free scaling parameter between 0 (when all the pixels in the
 * undistorted image are valid) and 1 (when all the source image pixels are
 * retained in the undistorted image). See "stereoRectify" for details.
 * @param newImgSize a newImgSize
 * @param validPixROI Optional output rectangle that outlines all-good-pixels
 * region in the undistorted image. See "roi1, roi2" description in
 * "StereoRectify".
 * @param centerPrincipalPoint Optional flag that indicates whether in the new
 * camera matrix the principal point should be at the image center or not. By
 * default, the principal point is chosen to best fit a subset of the source
 * image (determined by "alpha") to the corrected image.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#getoptimalnewcameramatrix">org.opencv.calib3d.Calib3d.getOptimalNewCameraMatrix</a>
 */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI, boolean centerPrincipalPoint)
    {
        double[] validPixROI_out = new double[4];
        Mat retVal = new Mat(getOptimalNewCameraMatrix_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out, centerPrincipalPoint));
        if(validPixROI!=null){ validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; }
        return retVal;
    }

/**
 * Returns the new camera matrix based on the free scaling parameter.
 *
 * The function computes and returns the optimal new camera matrix based on the
 * free scaling parameter. By varying this parameter, you may retrieve only
 * sensible pixels "alpha=0", keep all the original image pixels if there is
 * valuable information in the corners "alpha=1", or get something in between.
 * When "alpha>0", the undistortion result is likely to have some black pixels
 * corresponding to "virtual" pixels outside of the captured distorted image.
 * The original camera matrix, distortion coefficients, the computed new camera
 * matrix, and "newImageSize" should be passed to "initUndistortRectifyMap" to
 * produce the maps for "remap".
 *
 * @param cameraMatrix Input camera matrix.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imageSize Original image size.
 * @param alpha Free scaling parameter between 0 (when all the pixels in the
 * undistorted image are valid) and 1 (when all the source image pixels are
 * retained in the undistorted image). See "stereoRectify" for details.
 * @param newImgSize a newImgSize
 * @param validPixROI Optional output rectangle that outlines all-good-pixels
 * region in the undistorted image. See "roi1, roi2" description in
 * "StereoRectify".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#getoptimalnewcameramatrix">org.opencv.calib3d.Calib3d.getOptimalNewCameraMatrix</a>
 */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI)
    {
        double[] validPixROI_out = new double[4];
        Mat retVal = new Mat(getOptimalNewCameraMatrix_1(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out));
        if(validPixROI!=null){ validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; }
        return retVal;
    }

/**
 * Returns the new camera matrix based on the free scaling parameter.
 *
 * The function computes and returns the optimal new camera matrix based on the
 * free scaling parameter. By varying this parameter, you may retrieve only
 * sensible pixels "alpha=0", keep all the original image pixels if there is
 * valuable information in the corners "alpha=1", or get something in between.
 * When "alpha>0", the undistortion result is likely to have some black pixels
 * corresponding to "virtual" pixels outside of the captured distorted image.
 * The original camera matrix, distortion coefficients, the computed new camera
 * matrix, and "newImageSize" should be passed to "initUndistortRectifyMap" to
 * produce the maps for "remap".
 *
 * @param cameraMatrix Input camera matrix.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imageSize Original image size.
 * @param alpha Free scaling parameter between 0 (when all the pixels in the
 * undistorted image are valid) and 1 (when all the source image pixels are
 * retained in the undistorted image). See "stereoRectify" for details.
 * @param newImgSize a newImgSize
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#getoptimalnewcameramatrix">org.opencv.calib3d.Calib3d.getOptimalNewCameraMatrix</a>
 */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize)
    {

        Mat retVal = new Mat(getOptimalNewCameraMatrix_2(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height));

        return retVal;
    }

/**
 * Returns the new camera matrix based on the free scaling parameter.
 *
 * The function computes and returns the optimal new camera matrix based on the
 * free scaling parameter. By varying this parameter, you may retrieve only
 * sensible pixels "alpha=0", keep all the original image pixels if there is
 * valuable information in the corners "alpha=1", or get something in between.
 * When "alpha>0", the undistortion result is likely to have some black pixels
 * corresponding to "virtual" pixels outside of the captured distorted image.
 * The original camera matrix, distortion coefficients, the computed new camera
 * matrix, and "newImageSize" should be passed to "initUndistortRectifyMap" to
 * produce the maps for "remap".
 *
 * @param cameraMatrix Input camera matrix.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imageSize Original image size.
 * @param alpha Free scaling parameter between 0 (when all the pixels in the
 * undistorted image are valid) and 1 (when all the source image pixels are
 * retained in the undistorted image). See "stereoRectify" for details.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#getoptimalnewcameramatrix">org.opencv.calib3d.Calib3d.getOptimalNewCameraMatrix</a>
 */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha)
    {

        Mat retVal = new Mat(getOptimalNewCameraMatrix_3(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha));

        return retVal;
    }


    //
    // C++:  Rect getValidDisparityROI(Rect roi1, Rect roi2, int minDisparity, int numberOfDisparities, int SADWindowSize)
    //

    public static Rect getValidDisparityROI(Rect roi1, Rect roi2, int minDisparity, int numberOfDisparities, int SADWindowSize)
    {

        Rect retVal = new Rect(getValidDisparityROI_0(roi1.x, roi1.y, roi1.width, roi1.height, roi2.x, roi2.y, roi2.width, roi2.height, minDisparity, numberOfDisparities, SADWindowSize));

        return retVal;
    }


    //
    // C++:  Mat initCameraMatrix2D(vector_Mat objectPoints, vector_Mat imagePoints, Size imageSize, double aspectRatio = 1.)
    //

/**
 * Finds an initial camera matrix from 3D-2D point correspondences.
 *
 * The function estimates and returns an initial camera matrix for the camera
 * calibration process.
 * Currently, the function only supports planar calibration patterns, which are
 * patterns where each object point has z-coordinate =0.
 *
 * @param objectPoints Vector of vectors of the calibration pattern points in
 * the calibration pattern coordinate space. In the old interface all the
 * per-view vectors are concatenated. See "calibrateCamera" for details.
 * @param imagePoints Vector of vectors of the projections of the calibration
 * pattern points. In the old interface all the per-view vectors are
 * concatenated.
 * @param imageSize Image size in pixels used to initialize the principal point.
 * @param aspectRatio If it is zero or negative, both f_x and f_y are estimated
 * independently. Otherwise, f_x = f_y * aspectRatio.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#initcameramatrix2d">org.opencv.calib3d.Calib3d.initCameraMatrix2D</a>
 */
    public static Mat initCameraMatrix2D(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize, double aspectRatio)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
        Mat retVal = new Mat(initCameraMatrix2D_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height, aspectRatio));

        return retVal;
    }

/**
 * Finds an initial camera matrix from 3D-2D point correspondences.
 *
 * The function estimates and returns an initial camera matrix for the camera
 * calibration process.
 * Currently, the function only supports planar calibration patterns, which are
 * patterns where each object point has z-coordinate =0.
 *
 * @param objectPoints Vector of vectors of the calibration pattern points in
 * the calibration pattern coordinate space. In the old interface all the
 * per-view vectors are concatenated. See "calibrateCamera" for details.
 * @param imagePoints Vector of vectors of the projections of the calibration
 * pattern points. In the old interface all the per-view vectors are
 * concatenated.
 * @param imageSize Image size in pixels used to initialize the principal point.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#initcameramatrix2d">org.opencv.calib3d.Calib3d.initCameraMatrix2D</a>
 */
    public static Mat initCameraMatrix2D(List<Mat> objectPoints, List<Mat> imagePoints, Size imageSize)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Mat_to_Mat(imagePoints);
        Mat retVal = new Mat(initCameraMatrix2D_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, imageSize.width, imageSize.height));

        return retVal;
    }


    //
    // C++:  void matMulDeriv(Mat A, Mat B, Mat& dABdA, Mat& dABdB)
    //

/**
 * Computes partial derivatives of the matrix product for each multiplied
 * matrix.
 *
 * The function computes partial derivatives of the elements of the matrix
 * product A*B with regard to the elements of each of the two input matrices.
 * The function is used to compute the Jacobian matrices in "stereoCalibrate"
 * but can also be used in any other similar optimization function.
 *
 * @param A First multiplied matrix.
 * @param B Second multiplied matrix.
 * @param dABdA First output derivative matrix "d(A*B)/dA" of size A.rows*B.cols
 * x (A.rows*A.cols).
 * @param dABdB Second output derivative matrix "d(A*B)/dB" of size
 * A.rows*B.cols x (B.rows*B.cols).
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#matmulderiv">org.opencv.calib3d.Calib3d.matMulDeriv</a>
 */
    public static void matMulDeriv(Mat A, Mat B, Mat dABdA, Mat dABdB)
    {

        matMulDeriv_0(A.nativeObj, B.nativeObj, dABdA.nativeObj, dABdB.nativeObj);

        return;
    }


    //
    // C++:  void projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat& imagePoints, Mat& jacobian = Mat(), double aspectRatio = 0)
    //

/**
 * Projects 3D points to an image plane.
 *
 * The function computes projections of 3D points to the image plane given
 * intrinsic and extrinsic camera parameters. Optionally, the function computes
 * Jacobians - matrices of partial derivatives of image points coordinates (as
 * functions of all the input parameters) with respect to the particular
 * parameters, intrinsic and/or extrinsic. The Jacobians are used during the
 * global optimization in "calibrateCamera", "solvePnP", and "stereoCalibrate".
 * The function itself can also be used to compute a re-projection error given
 * the current intrinsic and extrinsic parameters.
 *
 * Note: By setting "rvec=tvec=(0,0,0)" or by setting "cameraMatrix" to a 3x3
 * identity matrix, or by passing zero distortion coefficients, you can get
 * various useful partial cases of the function. This means that you can compute
 * the distorted coordinates for a sparse set of points or apply a perspective
 * transformation (and also compute the derivatives) in the ideal
 * zero-distortion setup.
 *
 * @param objectPoints Array of object points, 3xN/Nx3 1-channel or 1xN/Nx1
 * 3-channel (or "vector<Point3f>"), where N is the number of points in the
 * view.
 * @param rvec Rotation vector. See "Rodrigues" for details.
 * @param tvec Translation vector.
 * @param cameraMatrix Camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 _1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imagePoints Output array of image points, 2xN/Nx2 1-channel or 1xN/Nx1
 * 2-channel, or "vector<Point2f>".
 * @param jacobian Optional output 2Nx(10+<numDistCoeffs>) jacobian matrix of
 * derivatives of image points with respect to components of the rotation
 * vector, translation vector, focal lengths, coordinates of the principal point
 * and the distortion coefficients. In the old interface different components of
 * the jacobian are returned via different output parameters.
 * @param aspectRatio Optional "fixed aspect ratio" parameter. If the parameter
 * is not 0, the function assumes that the aspect ratio (*fx/fy*) is fixed and
 * correspondingly adjusts the jacobian matrix.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#projectpoints">org.opencv.calib3d.Calib3d.projectPoints</a>
 */
    public static void projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat jacobian, double aspectRatio)
    {

        projectPoints_0(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, jacobian.nativeObj, aspectRatio);

        return;
    }

/**
 * Projects 3D points to an image plane.
 *
 * The function computes projections of 3D points to the image plane given
 * intrinsic and extrinsic camera parameters. Optionally, the function computes
 * Jacobians - matrices of partial derivatives of image points coordinates (as
 * functions of all the input parameters) with respect to the particular
 * parameters, intrinsic and/or extrinsic. The Jacobians are used during the
 * global optimization in "calibrateCamera", "solvePnP", and "stereoCalibrate".
 * The function itself can also be used to compute a re-projection error given
 * the current intrinsic and extrinsic parameters.
 *
 * Note: By setting "rvec=tvec=(0,0,0)" or by setting "cameraMatrix" to a 3x3
 * identity matrix, or by passing zero distortion coefficients, you can get
 * various useful partial cases of the function. This means that you can compute
 * the distorted coordinates for a sparse set of points or apply a perspective
 * transformation (and also compute the derivatives) in the ideal
 * zero-distortion setup.
 *
 * @param objectPoints Array of object points, 3xN/Nx3 1-channel or 1xN/Nx1
 * 3-channel (or "vector<Point3f>"), where N is the number of points in the
 * view.
 * @param rvec Rotation vector. See "Rodrigues" for details.
 * @param tvec Translation vector.
 * @param cameraMatrix Camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 _1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imagePoints Output array of image points, 2xN/Nx2 1-channel or 1xN/Nx1
 * 2-channel, or "vector<Point2f>".
 * @param jacobian Optional output 2Nx(10+<numDistCoeffs>) jacobian matrix of
 * derivatives of image points with respect to components of the rotation
 * vector, translation vector, focal lengths, coordinates of the principal point
 * and the distortion coefficients. In the old interface different components of
 * the jacobian are returned via different output parameters.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#projectpoints">org.opencv.calib3d.Calib3d.projectPoints</a>
 */
    public static void projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat jacobian)
    {

        projectPoints_1(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, jacobian.nativeObj);

        return;
    }

/**
 * Projects 3D points to an image plane.
 *
 * The function computes projections of 3D points to the image plane given
 * intrinsic and extrinsic camera parameters. Optionally, the function computes
 * Jacobians - matrices of partial derivatives of image points coordinates (as
 * functions of all the input parameters) with respect to the particular
 * parameters, intrinsic and/or extrinsic. The Jacobians are used during the
 * global optimization in "calibrateCamera", "solvePnP", and "stereoCalibrate".
 * The function itself can also be used to compute a re-projection error given
 * the current intrinsic and extrinsic parameters.
 *
 * Note: By setting "rvec=tvec=(0,0,0)" or by setting "cameraMatrix" to a 3x3
 * identity matrix, or by passing zero distortion coefficients, you can get
 * various useful partial cases of the function. This means that you can compute
 * the distorted coordinates for a sparse set of points or apply a perspective
 * transformation (and also compute the derivatives) in the ideal
 * zero-distortion setup.
 *
 * @param objectPoints Array of object points, 3xN/Nx3 1-channel or 1xN/Nx1
 * 3-channel (or "vector<Point3f>"), where N is the number of points in the
 * view.
 * @param rvec Rotation vector. See "Rodrigues" for details.
 * @param tvec Translation vector.
 * @param cameraMatrix Camera matrix A =
 * |f_x 0 c_x|
 * |0 f_y c_y|
 * |0 0 _1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param imagePoints Output array of image points, 2xN/Nx2 1-channel or 1xN/Nx1
 * 2-channel, or "vector<Point2f>".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#projectpoints">org.opencv.calib3d.Calib3d.projectPoints</a>
 */
    public static void projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints)
    {

        projectPoints_2(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj);

        return;
    }


    //
    // C++:  float rectify3Collinear(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat cameraMatrix3, Mat distCoeffs3, vector_Mat imgpt1, vector_Mat imgpt3, Size imageSize, Mat R12, Mat T12, Mat R13, Mat T13, Mat& R1, Mat& R2, Mat& R3, Mat& P1, Mat& P2, Mat& P3, Mat& Q, double alpha, Size newImgSize, Rect* roi1, Rect* roi2, int flags)
    //

    public static float rectify3Collinear(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat cameraMatrix3, Mat distCoeffs3, List<Mat> imgpt1, List<Mat> imgpt3, Size imageSize, Mat R12, Mat T12, Mat R13, Mat T13, Mat R1, Mat R2, Mat R3, Mat P1, Mat P2, Mat P3, Mat Q, double alpha, Size newImgSize, Rect roi1, Rect roi2, int flags)
    {
        Mat imgpt1_mat = Converters.vector_Mat_to_Mat(imgpt1);
        Mat imgpt3_mat = Converters.vector_Mat_to_Mat(imgpt3);
        double[] roi1_out = new double[4];
        double[] roi2_out = new double[4];
        float retVal = rectify3Collinear_0(cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, cameraMatrix3.nativeObj, distCoeffs3.nativeObj, imgpt1_mat.nativeObj, imgpt3_mat.nativeObj, imageSize.width, imageSize.height, R12.nativeObj, T12.nativeObj, R13.nativeObj, T13.nativeObj, R1.nativeObj, R2.nativeObj, R3.nativeObj, P1.nativeObj, P2.nativeObj, P3.nativeObj, Q.nativeObj, alpha, newImgSize.width, newImgSize.height, roi1_out, roi2_out, flags);
        if(roi1!=null){ roi1.x = (int)roi1_out[0]; roi1.y = (int)roi1_out[1]; roi1.width = (int)roi1_out[2]; roi1.height = (int)roi1_out[3]; }
        if(roi2!=null){ roi2.x = (int)roi2_out[0]; roi2.y = (int)roi2_out[1]; roi2.width = (int)roi2_out[2]; roi2.height = (int)roi2_out[3]; }
        return retVal;
    }


    //
    // C++:  void reprojectImageTo3D(Mat disparity, Mat& _3dImage, Mat Q, bool handleMissingValues = false, int ddepth = -1)
    //

/**
 * Reprojects a disparity image to 3D space.
 *
 * The function transforms a single-channel disparity map to a 3-channel image
 * representing a 3D surface. That is, for each pixel "(x,y)" andthe
 * corresponding disparity "d=disparity(x,y)", it computes:
 *
 * [X Y Z W]^T = Q *[x y disparity(x,y) 1]^T
 * _3dImage(x,y) = (X/W, Y/W, Z/W)
 *
 * The matrix "Q" can be an arbitrary 4 x 4 matrix (for example, the one
 * computed by "StereoRectify"). To reproject a sparse set of points
 * {(x,y,d),...} to 3D space, use "PerspectiveTransform".
 *
 * @param disparity Input single-channel 8-bit unsigned, 16-bit signed, 32-bit
 * signed or 32-bit floating-point disparity image.
 * @param _3dImage Output 3-channel floating-point image of the same size as
 * "disparity". Each element of "_3dImage(x,y)" contains 3D coordinates of the
 * point "(x,y)" computed from the disparity map.
 * @param Q 4 x 4 perspective transformation matrix that can be obtained with
 * "StereoRectify".
 * @param handleMissingValues Indicates, whether the function should handle
 * missing values (i.e. points where the disparity was not computed). If
 * "handleMissingValues=true", then pixels with the minimal disparity that
 * corresponds to the outliers (see "StereoBM.operator()") are transformed to
 * 3D points with a very large Z value (currently set to 10000).
 * @param ddepth The optional output array depth. If it is "-1", the output
 * image will have "CV_32F" depth. "ddepth" can also be set to "CV_16S",
 * "CV_32S" or "CV_32F".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#reprojectimageto3d">org.opencv.calib3d.Calib3d.reprojectImageTo3D</a>
 */
    public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q, boolean handleMissingValues, int ddepth)
    {

        reprojectImageTo3D_0(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj, handleMissingValues, ddepth);

        return;
    }

/**
 * Reprojects a disparity image to 3D space.
 *
 * The function transforms a single-channel disparity map to a 3-channel image
 * representing a 3D surface. That is, for each pixel "(x,y)" andthe
 * corresponding disparity "d=disparity(x,y)", it computes:
 *
 * [X Y Z W]^T = Q *[x y disparity(x,y) 1]^T
 * _3dImage(x,y) = (X/W, Y/W, Z/W)
 *
 * The matrix "Q" can be an arbitrary 4 x 4 matrix (for example, the one
 * computed by "StereoRectify"). To reproject a sparse set of points
 * {(x,y,d),...} to 3D space, use "PerspectiveTransform".
 *
 * @param disparity Input single-channel 8-bit unsigned, 16-bit signed, 32-bit
 * signed or 32-bit floating-point disparity image.
 * @param _3dImage Output 3-channel floating-point image of the same size as
 * "disparity". Each element of "_3dImage(x,y)" contains 3D coordinates of the
 * point "(x,y)" computed from the disparity map.
 * @param Q 4 x 4 perspective transformation matrix that can be obtained with
 * "StereoRectify".
 * @param handleMissingValues Indicates, whether the function should handle
 * missing values (i.e. points where the disparity was not computed). If
 * "handleMissingValues=true", then pixels with the minimal disparity that
 * corresponds to the outliers (see "StereoBM.operator()") are transformed to
 * 3D points with a very large Z value (currently set to 10000).
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#reprojectimageto3d">org.opencv.calib3d.Calib3d.reprojectImageTo3D</a>
 */
    public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q, boolean handleMissingValues)
    {

        reprojectImageTo3D_1(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj, handleMissingValues);

        return;
    }

/**
 * Reprojects a disparity image to 3D space.
 *
 * The function transforms a single-channel disparity map to a 3-channel image
 * representing a 3D surface. That is, for each pixel "(x,y)" andthe
 * corresponding disparity "d=disparity(x,y)", it computes:
 *
 * [X Y Z W]^T = Q *[x y disparity(x,y) 1]^T
 * _3dImage(x,y) = (X/W, Y/W, Z/W)
 *
 * The matrix "Q" can be an arbitrary 4 x 4 matrix (for example, the one
 * computed by "StereoRectify"). To reproject a sparse set of points
 * {(x,y,d),...} to 3D space, use "PerspectiveTransform".
 *
 * @param disparity Input single-channel 8-bit unsigned, 16-bit signed, 32-bit
 * signed or 32-bit floating-point disparity image.
 * @param _3dImage Output 3-channel floating-point image of the same size as
 * "disparity". Each element of "_3dImage(x,y)" contains 3D coordinates of the
 * point "(x,y)" computed from the disparity map.
 * @param Q 4 x 4 perspective transformation matrix that can be obtained with
 * "StereoRectify".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#reprojectimageto3d">org.opencv.calib3d.Calib3d.reprojectImageTo3D</a>
 */
    public static void reprojectImageTo3D(Mat disparity, Mat _3dImage, Mat Q)
    {

        reprojectImageTo3D_2(disparity.nativeObj, _3dImage.nativeObj, Q.nativeObj);

        return;
    }


    //
    // C++:  void solvePnP(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    //

/**
 * Finds an object pose from 3D-2D point correspondences.
 *
 * The function estimates the object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints".
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnp">org.opencv.calib3d.Calib3d.solvePnP</a>
 */
    public static void solvePnP(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnP_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences.
 *
 * The function estimates the object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints".
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnp">org.opencv.calib3d.Calib3d.solvePnP</a>
 */
    public static void solvePnP(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnP_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);

        return;
    }


    //
    // C++:  void solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, int minInliersCount = 100, Mat& inliers = Mat())
    //

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 * @param iterationsCount Number of iterations.
 * @param reprojectionError Inlier threshold value used by the RANSAC procedure.
 * The parameter value is the maximum allowed distance between the observed and
 * computed point projections to consider it an inlier.
 * @param minInliersCount Number of inliers. If the algorithm at some stage
 * finds more inliers than "minInliersCount", it finishes.
 * @param inliers Output vector that contains indices of inliers in
 * "objectPoints" and "imagePoints".
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, int minInliersCount, Mat inliers)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, minInliersCount, inliers.nativeObj);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 * @param iterationsCount Number of iterations.
 * @param reprojectionError Inlier threshold value used by the RANSAC procedure.
 * The parameter value is the maximum allowed distance between the observed and
 * computed point projections to consider it an inlier.
 * @param minInliersCount Number of inliers. If the algorithm at some stage
 * finds more inliers than "minInliersCount", it finishes.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, int minInliersCount)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, minInliersCount);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 * @param iterationsCount Number of iterations.
 * @param reprojectionError Inlier threshold value used by the RANSAC procedure.
 * The parameter value is the maximum allowed distance between the observed and
 * computed point projections to consider it an inlier.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 * @param iterationsCount Number of iterations.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_3(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 * @param useExtrinsicGuess If true (1), the function uses the provided "rvec"
 * and "tvec" values as initial approximations of the rotation and translation
 * vectors, respectively, and further optimizes them.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_4(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);

        return;
    }

/**
 * Finds an object pose from 3D-2D point correspondences using the RANSAC
 * scheme.
 *
 * The function estimates an object pose given a set of object points, their
 * corresponding image projections, as well as the camera matrix and the
 * distortion coefficients. This function finds such a pose that minimizes
 * reprojection error, that is, the sum of squared distances between the
 * observed projections "imagePoints" and the projected (using "projectPoints")
 * "objectPoints". The use of RANSAC makes the function resistant to outliers.
 *
 * @param objectPoints Array of object points in the object coordinate space,
 * 3xN/Nx3 1-channel or 1xN/Nx1 3-channel, where N is the number of points.
 * "vector<Point3f>" can be also passed here.
 * @param imagePoints Array of corresponding image points, 2xN/Nx2 1-channel or
 * 1xN/Nx1 2-channel, where N is the number of points. "vector<Point2f>" can be
 * also passed here.
 * @param cameraMatrix Input camera matrix A =
 * |fx 0 cx|
 * |0 fy cy|
 * |0 0 1|.
 * @param distCoeffs Input vector of distortion coefficients (k_1, k_2, p_1,
 * p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. If the vector is
 * NULL/empty, the zero distortion coefficients are assumed.
 * @param rvec Output rotation vector (see "Rodrigues") that, together with
 * "tvec", brings points from the model coordinate system to the camera
 * coordinate system.
 * @param tvec Output translation vector.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#solvepnpransac">org.opencv.calib3d.Calib3d.solvePnPRansac</a>
 */
    public static void solvePnPRansac(List<Point3> objectPoints, List<Point> imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec)
    {
        Mat objectPoints_mat = Converters.vector_Point3f_to_Mat(objectPoints);
        Mat imagePoints_mat = Converters.vector_Point2f_to_Mat(imagePoints);
        solvePnPRansac_5(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);

        return;
    }


    //
    // C++:  double stereoCalibrate(vector_Mat objectPoints, vector_Mat imagePoints1, vector_Mat imagePoints2, Mat& cameraMatrix1, Mat& distCoeffs1, Mat& cameraMatrix2, Mat& distCoeffs2, Size imageSize, Mat& R, Mat& T, Mat& E, Mat& F, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+ TermCriteria::EPS, 30, 1e-6), int flags = CALIB_FIX_INTRINSIC)
    //

/**
 * Calibrates the stereo camera.
 *
 * The function estimates transformation between two cameras making a stereo
 * pair. If you have a stereo camera where the relative position and orientation
 * of two cameras is fixed, and if you computed poses of an object relative to
 * the first camera and to the second camera, (R1, T1) and (R2, T2),
 * respectively (this can be done with "solvePnP"), then those poses definitely
 * relate to each other. This means that, given (R_1,T_1), it should be possible
 * to compute (R_2,T_2). You only need to know the position and orientation of
 * the second camera relative to the first camera. This is what the described
 * function does. It computes (R,T) so that:.. math
 *
 * R_2=R*R_1 T_2=R*T_1 + T,
 *
 * Optionally, it computes the essential matrix E:
 *
 * E=
 * |0 -T_2 T_1|
 * |T_2 0 -T_0|
 * |-T_1 T_0 0|
 *   *R
 *
 * where T_i are components of the translation vector T : T=[T_0, T_1, T_2]^T.
 * And the function can also compute the fundamental matrix F:
 *
 * F = cameraMatrix2^(-T) E cameraMatrix1^(-1)
 *
 * Besides the stereo-related information, the function can also perform a full
 * calibration of each of two cameras. However, due to the high dimensionality
 * of the parameter space and noise in the input data, the function can diverge
 * from the correct solution. If the intrinsic parameters can be estimated with
 * high accuracy for each of the cameras individually (for example, using
 * "calibrateCamera"), you are recommended to do so and then pass
 * "CV_CALIB_FIX_INTRINSIC" flag to the function along with the computed
 * intrinsic parameters. Otherwise, if all the parameters are estimated at once,
 * it makes sense to restrict some parameters, for example, pass
 * "CV_CALIB_SAME_FOCAL_LENGTH" and "CV_CALIB_ZERO_TANGENT_DIST" flags, which is
 * usually a reasonable assumption.
 *
 * Similarly to "calibrateCamera", the function minimizes the total
 * re-projection error for all the points in all the available views from both
 * cameras. The function returns the final value of the re-projection error.
 *
 * @param objectPoints Vector of vectors of the calibration pattern points.
 * @param imagePoints1 Vector of vectors of the projections of the calibration
 * pattern points, observed by the first camera.
 * @param imagePoints2 Vector of vectors of the projections of the calibration
 * pattern points, observed by the second camera.
 * @param cameraMatrix1 Input/output first camera matrix:
 * |f_x^j 0 c_x^j|
 * |0 f_y^j c_y^j|
 * |0 0 1|
 * , j = 0, 1. If any of "CV_CALIB_USE_INTRINSIC_GUESS", "CV_CALIB_FIX_ASPECT_RATIO",
 * "CV_CALIB_FIX_INTRINSIC", or "CV_CALIB_FIX_FOCAL_LENGTH" are specified, some
 * or all of the matrix components must be initialized. See the flags
 * description for details.
 * @param distCoeffs1 Input/output vector of distortion coefficients (k_1, k_2,
 * p_1, p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. The output vector
 * length depends on the flags.
 * @param cameraMatrix2 Input/output second camera matrix. The parameter is
 * similar to "cameraMatrix1".
 * @param distCoeffs2 Input/output lens distortion coefficients for the second
 * camera. The parameter is similar to "distCoeffs1".
 * @param imageSize Size of the image used only to initialize intrinsic camera
 * matrix.
 * @param R Output rotation matrix between the 1st and the 2nd camera coordinate
 * systems.
 * @param T Output translation vector between the coordinate systems of the
 * cameras.
 * @param E Output essential matrix.
 * @param F Output fundamental matrix.
 * @param criteria a criteria
 * @param flags Different flags that may be zero or a combination of the
 * following values:
 *   * CV_CALIB_FIX_INTRINSIC Fix "cameraMatrix?" and "distCoeffs?" so that only
 * "R, T, E", and "F" matrices are estimated.
 *   * CV_CALIB_USE_INTRINSIC_GUESS Optimize some or all of the intrinsic
 * parameters according to the specified flags. Initial values are provided by
 * the user.
 *   * CV_CALIB_FIX_PRINCIPAL_POINT Fix the principal points during the
 * optimization.
 *   * CV_CALIB_FIX_FOCAL_LENGTH Fix f^j_x and f^j_y.
 *   * CV_CALIB_FIX_ASPECT_RATIO Optimize f^j_y. Fix the ratio f^j_x/f^j_y.
 *   * CV_CALIB_SAME_FOCAL_LENGTH Enforce f^0_x=f^1_x and f^0_y=f^1_y.
 *   * CV_CALIB_ZERO_TANGENT_DIST Set tangential distortion coefficients for
 * each camera to zeros and fix there.
 *   * CV_CALIB_FIX_K1,...,CV_CALIB_FIX_K6 Do not change the corresponding
 * radial distortion coefficient during the optimization. If "CV_CALIB_USE_INTRINSIC_GUESS"
 * is set, the coefficient from the supplied "distCoeffs" matrix is used.
 * Otherwise, it is set to 0.
 *   * CV_CALIB_RATIONAL_MODEL Enable coefficients k4, k5, and k6. To provide
 * the backward compatibility, this extra flag should be explicitly specified to
 * make the calibration function use the rational model and return 8
 * coefficients. If the flag is not set, the function computes and returns only
 * 5 distortion coefficients.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereocalibrate">org.opencv.calib3d.Calib3d.stereoCalibrate</a>
 */
    public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, TermCriteria criteria, int flags)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
        Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
        double retVal = stereoCalibrate_0(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, flags);

        return retVal;
    }

/**
 * Calibrates the stereo camera.
 *
 * The function estimates transformation between two cameras making a stereo
 * pair. If you have a stereo camera where the relative position and orientation
 * of two cameras is fixed, and if you computed poses of an object relative to
 * the first camera and to the second camera, (R1, T1) and (R2, T2),
 * respectively (this can be done with "solvePnP"), then those poses definitely
 * relate to each other. This means that, given (R_1,T_1), it should be possible
 * to compute (R_2,T_2). You only need to know the position and orientation of
 * the second camera relative to the first camera. This is what the described
 * function does. It computes (R,T) so that:.. math
 *
 * R_2=R*R_1 T_2=R*T_1 + T,
 *
 * Optionally, it computes the essential matrix E:
 *
 * E=
 * |0 -T_2 T_1|
 * |T_2 0 -T_0|
 * |-T_1 T_0 0|
 *   *R
 *
 * where T_i are components of the translation vector T : T=[T_0, T_1, T_2]^T.
 * And the function can also compute the fundamental matrix F:
 *
 * F = cameraMatrix2^(-T) E cameraMatrix1^(-1)
 *
 * Besides the stereo-related information, the function can also perform a full
 * calibration of each of two cameras. However, due to the high dimensionality
 * of the parameter space and noise in the input data, the function can diverge
 * from the correct solution. If the intrinsic parameters can be estimated with
 * high accuracy for each of the cameras individually (for example, using
 * "calibrateCamera"), you are recommended to do so and then pass
 * "CV_CALIB_FIX_INTRINSIC" flag to the function along with the computed
 * intrinsic parameters. Otherwise, if all the parameters are estimated at once,
 * it makes sense to restrict some parameters, for example, pass
 * "CV_CALIB_SAME_FOCAL_LENGTH" and "CV_CALIB_ZERO_TANGENT_DIST" flags, which is
 * usually a reasonable assumption.
 *
 * Similarly to "calibrateCamera", the function minimizes the total
 * re-projection error for all the points in all the available views from both
 * cameras. The function returns the final value of the re-projection error.
 *
 * @param objectPoints Vector of vectors of the calibration pattern points.
 * @param imagePoints1 Vector of vectors of the projections of the calibration
 * pattern points, observed by the first camera.
 * @param imagePoints2 Vector of vectors of the projections of the calibration
 * pattern points, observed by the second camera.
 * @param cameraMatrix1 Input/output first camera matrix:
 * |f_x^j 0 c_x^j|
 * |0 f_y^j c_y^j|
 * |0 0 1|
 * , j = 0, 1. If any of "CV_CALIB_USE_INTRINSIC_GUESS", "CV_CALIB_FIX_ASPECT_RATIO",
 * "CV_CALIB_FIX_INTRINSIC", or "CV_CALIB_FIX_FOCAL_LENGTH" are specified, some
 * or all of the matrix components must be initialized. See the flags
 * description for details.
 * @param distCoeffs1 Input/output vector of distortion coefficients (k_1, k_2,
 * p_1, p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. The output vector
 * length depends on the flags.
 * @param cameraMatrix2 Input/output second camera matrix. The parameter is
 * similar to "cameraMatrix1".
 * @param distCoeffs2 Input/output lens distortion coefficients for the second
 * camera. The parameter is similar to "distCoeffs1".
 * @param imageSize Size of the image used only to initialize intrinsic camera
 * matrix.
 * @param R Output rotation matrix between the 1st and the 2nd camera coordinate
 * systems.
 * @param T Output translation vector between the coordinate systems of the
 * cameras.
 * @param E Output essential matrix.
 * @param F Output fundamental matrix.
 * @param criteria a criteria
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereocalibrate">org.opencv.calib3d.Calib3d.stereoCalibrate</a>
 */
    public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F, TermCriteria criteria)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
        Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
        double retVal = stereoCalibrate_1(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);

        return retVal;
    }

/**
 * Calibrates the stereo camera.
 *
 * The function estimates transformation between two cameras making a stereo
 * pair. If you have a stereo camera where the relative position and orientation
 * of two cameras is fixed, and if you computed poses of an object relative to
 * the first camera and to the second camera, (R1, T1) and (R2, T2),
 * respectively (this can be done with "solvePnP"), then those poses definitely
 * relate to each other. This means that, given (R_1,T_1), it should be possible
 * to compute (R_2,T_2). You only need to know the position and orientation of
 * the second camera relative to the first camera. This is what the described
 * function does. It computes (R,T) so that:.. math
 *
 * R_2=R*R_1 T_2=R*T_1 + T,
 *
 * Optionally, it computes the essential matrix E:
 *
 * E=
 * |0 -T_2 T_1|
 * |T_2 0 -T_0|
 * |-T_1 T_0 0|
 *   *R
 *
 * where T_i are components of the translation vector T : T=[T_0, T_1, T_2]^T.
 * And the function can also compute the fundamental matrix F:
 *
 * F = cameraMatrix2^(-T) E cameraMatrix1^(-1)
 *
 * Besides the stereo-related information, the function can also perform a full
 * calibration of each of two cameras. However, due to the high dimensionality
 * of the parameter space and noise in the input data, the function can diverge
 * from the correct solution. If the intrinsic parameters can be estimated with
 * high accuracy for each of the cameras individually (for example, using
 * "calibrateCamera"), you are recommended to do so and then pass
 * "CV_CALIB_FIX_INTRINSIC" flag to the function along with the computed
 * intrinsic parameters. Otherwise, if all the parameters are estimated at once,
 * it makes sense to restrict some parameters, for example, pass
 * "CV_CALIB_SAME_FOCAL_LENGTH" and "CV_CALIB_ZERO_TANGENT_DIST" flags, which is
 * usually a reasonable assumption.
 *
 * Similarly to "calibrateCamera", the function minimizes the total
 * re-projection error for all the points in all the available views from both
 * cameras. The function returns the final value of the re-projection error.
 *
 * @param objectPoints Vector of vectors of the calibration pattern points.
 * @param imagePoints1 Vector of vectors of the projections of the calibration
 * pattern points, observed by the first camera.
 * @param imagePoints2 Vector of vectors of the projections of the calibration
 * pattern points, observed by the second camera.
 * @param cameraMatrix1 Input/output first camera matrix:
 * |f_x^j 0 c_x^j|
 * |0 f_y^j c_y^j|
 * |0 0 1|
 * , j = 0, 1. If any of "CV_CALIB_USE_INTRINSIC_GUESS", "CV_CALIB_FIX_ASPECT_RATIO",
 * "CV_CALIB_FIX_INTRINSIC", or "CV_CALIB_FIX_FOCAL_LENGTH" are specified, some
 * or all of the matrix components must be initialized. See the flags
 * description for details.
 * @param distCoeffs1 Input/output vector of distortion coefficients (k_1, k_2,
 * p_1, p_2[, k_3[, k_4, k_5, k_6]]) of 4, 5, or 8 elements. The output vector
 * length depends on the flags.
 * @param cameraMatrix2 Input/output second camera matrix. The parameter is
 * similar to "cameraMatrix1".
 * @param distCoeffs2 Input/output lens distortion coefficients for the second
 * camera. The parameter is similar to "distCoeffs1".
 * @param imageSize Size of the image used only to initialize intrinsic camera
 * matrix.
 * @param R Output rotation matrix between the 1st and the 2nd camera coordinate
 * systems.
 * @param T Output translation vector between the coordinate systems of the
 * cameras.
 * @param E Output essential matrix.
 * @param F Output fundamental matrix.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereocalibrate">org.opencv.calib3d.Calib3d.stereoCalibrate</a>
 */
    public static double stereoCalibrate(List<Mat> objectPoints, List<Mat> imagePoints1, List<Mat> imagePoints2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Size imageSize, Mat R, Mat T, Mat E, Mat F)
    {
        Mat objectPoints_mat = Converters.vector_Mat_to_Mat(objectPoints);
        Mat imagePoints1_mat = Converters.vector_Mat_to_Mat(imagePoints1);
        Mat imagePoints2_mat = Converters.vector_Mat_to_Mat(imagePoints2);
        double retVal = stereoCalibrate_2(objectPoints_mat.nativeObj, imagePoints1_mat.nativeObj, imagePoints2_mat.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, imageSize.width, imageSize.height, R.nativeObj, T.nativeObj, E.nativeObj, F.nativeObj);

        return retVal;
    }


    //
    // C++:  bool stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat& H1, Mat& H2, double threshold = 5)
    //

/**
 * Computes a rectification transform for an uncalibrated stereo camera.
 *
 * The function computes the rectification transformations without knowing
 * intrinsic parameters of the cameras and their relative position in the space,
 * which explains the suffix "uncalibrated". Another related difference from
 * "StereoRectify" is that the function outputs not the rectification
 * transformations in the object (3D) space, but the planar perspective
 * transformations encoded by the homography matrices "H1" and "H2". The
 * function implements the algorithm [Hartley99].
 *
 * Note:
 *
 * While the algorithm does not need to know the intrinsic parameters of the
 * cameras, it heavily depends on the epipolar geometry. Therefore, if the
 * camera lenses have a significant distortion, it would be better to correct it
 * before computing the fundamental matrix and calling this function. For
 * example, distortion coefficients can be estimated for each head of stereo
 * camera separately by using "calibrateCamera". Then, the images can be
 * corrected using "undistort", or just the point coordinates can be corrected
 * with "undistortPoints".
 *
 * @param points1 Array of feature points in the first image.
 * @param points2 The corresponding points in the second image. The same formats
 * as in "findFundamentalMat" are supported.
 * @param F Input fundamental matrix. It can be computed from the same set of
 * point pairs using "findFundamentalMat".
 * @param imgSize a imgSize
 * @param H1 Output rectification homography matrix for the first image.
 * @param H2 Output rectification homography matrix for the second image.
 * @param threshold Optional threshold used to filter out the outliers. If the
 * parameter is greater than zero, all the point pairs that do not comply with
 * the epipolar geometry (that is, the points for which |points2[i]^T*F*points1[i]|>threshold)
 * are rejected prior to computing the homographies. Otherwise,all the points
 * are considered inliers.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereorectifyuncalibrated">org.opencv.calib3d.Calib3d.stereoRectifyUncalibrated</a>
 */
    public static boolean stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat H1, Mat H2, double threshold)
    {

        boolean retVal = stereoRectifyUncalibrated_0(points1.nativeObj, points2.nativeObj, F.nativeObj, imgSize.width, imgSize.height, H1.nativeObj, H2.nativeObj, threshold);

        return retVal;
    }

/**
 * Computes a rectification transform for an uncalibrated stereo camera.
 *
 * The function computes the rectification transformations without knowing
 * intrinsic parameters of the cameras and their relative position in the space,
 * which explains the suffix "uncalibrated". Another related difference from
 * "StereoRectify" is that the function outputs not the rectification
 * transformations in the object (3D) space, but the planar perspective
 * transformations encoded by the homography matrices "H1" and "H2". The
 * function implements the algorithm [Hartley99].
 *
 * Note:
 *
 * While the algorithm does not need to know the intrinsic parameters of the
 * cameras, it heavily depends on the epipolar geometry. Therefore, if the
 * camera lenses have a significant distortion, it would be better to correct it
 * before computing the fundamental matrix and calling this function. For
 * example, distortion coefficients can be estimated for each head of stereo
 * camera separately by using "calibrateCamera". Then, the images can be
 * corrected using "undistort", or just the point coordinates can be corrected
 * with "undistortPoints".
 *
 * @param points1 Array of feature points in the first image.
 * @param points2 The corresponding points in the second image. The same formats
 * as in "findFundamentalMat" are supported.
 * @param F Input fundamental matrix. It can be computed from the same set of
 * point pairs using "findFundamentalMat".
 * @param imgSize a imgSize
 * @param H1 Output rectification homography matrix for the first image.
 * @param H2 Output rectification homography matrix for the second image.
 *
 * @see <a href="http://opencv.itseez.com/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereorectifyuncalibrated">org.opencv.calib3d.Calib3d.stereoRectifyUncalibrated</a>
 */
    public static boolean stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat H1, Mat H2)
    {

        boolean retVal = stereoRectifyUncalibrated_1(points1.nativeObj, points2.nativeObj, F.nativeObj, imgSize.width, imgSize.height, H1.nativeObj, H2.nativeObj);

        return retVal;
    }


    //
    // C++:  void validateDisparity(Mat& disparity, Mat cost, int minDisparity, int numberOfDisparities, int disp12MaxDisp = 1)
    //

    public static void validateDisparity(Mat disparity, Mat cost, int minDisparity, int numberOfDisparities, int disp12MaxDisp)
    {

        validateDisparity_0(disparity.nativeObj, cost.nativeObj, minDisparity, numberOfDisparities, disp12MaxDisp);

        return;
    }

    public static void validateDisparity(Mat disparity, Mat cost, int minDisparity, int numberOfDisparities)
    {

        validateDisparity_1(disparity.nativeObj, cost.nativeObj, minDisparity, numberOfDisparities);

        return;
    }




    //
    // native stuff
    //
    static { System.loadLibrary("opencv_java"); }

    // C++:  Vec3d RQDecomp3x3(Mat src, Mat& mtxR, Mat& mtxQ, Mat& Qx = Mat(), Mat& Qy = Mat(), Mat& Qz = Mat())
    private static native double[] RQDecomp3x3_0(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj, long Qy_nativeObj, long Qz_nativeObj);
    private static native double[] RQDecomp3x3_1(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj, long Qy_nativeObj);
    private static native double[] RQDecomp3x3_2(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj);
    private static native double[] RQDecomp3x3_3(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj);

    // C++:  void Rodrigues(Mat src, Mat& dst, Mat& jacobian = Mat())
    private static native void Rodrigues_0(long src_nativeObj, long dst_nativeObj, long jacobian_nativeObj);
    private static native void Rodrigues_1(long src_nativeObj, long dst_nativeObj);

    // C++:  double calibrateCamera(vector_Mat objectPoints, vector_Mat imagePoints, Size imageSize, Mat& cameraMatrix, Mat& distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, int flags = 0)
    private static native double calibrateCamera_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);
    private static native double calibrateCamera_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, double imageSize_width, double imageSize_height, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);

    // C++:  void calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double& fovx, double& fovy, double& focalLength, Point2d& principalPoint, double& aspectRatio)
    private static native void calibrationMatrixValues_0(long cameraMatrix_nativeObj, double imageSize_width, double imageSize_height, double apertureWidth, double apertureHeight, double[] fovx_out, double[] fovy_out, double[] focalLength_out, double[] principalPoint_out, double[] aspectRatio_out);

    // C++:  void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat& rvec3, Mat& tvec3, Mat& dr3dr1 = Mat(), Mat& dr3dt1 = Mat(), Mat& dr3dr2 = Mat(), Mat& dr3dt2 = Mat(), Mat& dt3dr1 = Mat(), Mat& dt3dt1 = Mat(), Mat& dt3dr2 = Mat(), Mat& dt3dt2 = Mat())
    private static native void composeRT_0(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj, long dt3dr2_nativeObj, long dt3dt2_nativeObj);
    private static native void composeRT_1(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj, long dt3dr2_nativeObj);
    private static native void composeRT_2(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj);
    private static native void composeRT_3(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj);
    private static native void composeRT_4(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj);
    private static native void composeRT_5(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj);
    private static native void composeRT_6(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj);
    private static native void composeRT_7(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj);
    private static native void composeRT_8(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj);

    // C++:  void convertPointsFromHomogeneous(Mat src, Mat& dst)
    private static native void convertPointsFromHomogeneous_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void convertPointsToHomogeneous(Mat src, Mat& dst)
    private static native void convertPointsToHomogeneous_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void decomposeProjectionMatrix(Mat projMatrix, Mat& cameraMatrix, Mat& rotMatrix, Mat& transVect, Mat& rotMatrixX = Mat(), Mat& rotMatrixY = Mat(), Mat& rotMatrixZ = Mat(), Mat& eulerAngles = Mat())
    private static native void decomposeProjectionMatrix_0(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj, long rotMatrixZ_nativeObj, long eulerAngles_nativeObj);
    private static native void decomposeProjectionMatrix_1(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj, long rotMatrixZ_nativeObj);
    private static native void decomposeProjectionMatrix_2(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj);
    private static native void decomposeProjectionMatrix_3(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj);
    private static native void decomposeProjectionMatrix_4(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj);

    // C++:  void drawChessboardCorners(Mat& image, Size patternSize, Mat corners, bool patternWasFound)
    private static native void drawChessboardCorners_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, boolean patternWasFound);

    // C++:  int estimateAffine3D(Mat _from, Mat _to, Mat& _out, Mat& _inliers, double param1 = 3, double param2 = 0.99)
    private static native int estimateAffine3D_0(long _from_nativeObj, long _to_nativeObj, long _out_nativeObj, long _inliers_nativeObj, double param1, double param2);
    private static native int estimateAffine3D_1(long _from_nativeObj, long _to_nativeObj, long _out_nativeObj, long _inliers_nativeObj, double param1);
    private static native int estimateAffine3D_2(long _from_nativeObj, long _to_nativeObj, long _out_nativeObj, long _inliers_nativeObj);

    // C++:  void filterSpeckles(Mat& img, double newVal, int maxSpeckleSize, double maxDiff, Mat& buf = Mat())
    private static native void filterSpeckles_0(long img_nativeObj, double newVal, int maxSpeckleSize, double maxDiff, long buf_nativeObj);
    private static native void filterSpeckles_1(long img_nativeObj, double newVal, int maxSpeckleSize, double maxDiff);

    // C++:  bool findChessboardCorners(Mat image, Size patternSize, Mat& corners, int flags = CALIB_CB_ADAPTIVE_THRESH+ CALIB_CB_NORMALIZE_IMAGE)
    private static native boolean findChessboardCorners_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, int flags);
    private static native boolean findChessboardCorners_1(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj);

    // C++:  bool findCirclesGridDefault(Mat image, Size patternSize, Mat& centers, int flags = CALIB_CB_SYMMETRIC_GRID)
    private static native boolean findCirclesGridDefault_0(long image_nativeObj, double patternSize_width, double patternSize_height, long centers_nativeObj, int flags);
    private static native boolean findCirclesGridDefault_1(long image_nativeObj, double patternSize_width, double patternSize_height, long centers_nativeObj);

    // C++:  Mat findFundamentalMat(vector_Point2d points1, vector_Point2d points2, int method = FM_RANSAC, double param1 = 3., double param2 = 0.99, Mat& mask = Mat())
    private static native long findFundamentalMat_0(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double param1, double param2, long mask_nativeObj);
    private static native long findFundamentalMat_1(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double param1, double param2);
    private static native long findFundamentalMat_2(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double param1);
    private static native long findFundamentalMat_3(long points1_mat_nativeObj, long points2_mat_nativeObj, int method);
    private static native long findFundamentalMat_4(long points1_mat_nativeObj, long points2_mat_nativeObj);

    // C++:  Mat findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, int method = 0, double ransacReprojThreshold = 3, Mat& mask = Mat())
    private static native long findHomography_0(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold, long mask_nativeObj);
    private static native long findHomography_1(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold);
    private static native long findHomography_2(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method);
    private static native long findHomography_3(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj);

    // C++:  Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize = Size(), Rect* validPixROI = 0, bool centerPrincipalPoint = false)
    private static native long getOptimalNewCameraMatrix_0(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height, double[] validPixROI_out, boolean centerPrincipalPoint);
    private static native long getOptimalNewCameraMatrix_1(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height, double[] validPixROI_out);
    private static native long getOptimalNewCameraMatrix_2(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height);
    private static native long getOptimalNewCameraMatrix_3(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha);

    // C++:  Rect getValidDisparityROI(Rect roi1, Rect roi2, int minDisparity, int numberOfDisparities, int SADWindowSize)
    private static native double[] getValidDisparityROI_0(int roi1_x, int roi1_y, int roi1_width, int roi1_height, int roi2_x, int roi2_y, int roi2_width, int roi2_height, int minDisparity, int numberOfDisparities, int SADWindowSize);

    // C++:  Mat initCameraMatrix2D(vector_Mat objectPoints, vector_Mat imagePoints, Size imageSize, double aspectRatio = 1.)
    private static native long initCameraMatrix2D_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, double imageSize_width, double imageSize_height, double aspectRatio);
    private static native long initCameraMatrix2D_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, double imageSize_width, double imageSize_height);

    // C++:  void matMulDeriv(Mat A, Mat B, Mat& dABdA, Mat& dABdB)
    private static native void matMulDeriv_0(long A_nativeObj, long B_nativeObj, long dABdA_nativeObj, long dABdB_nativeObj);

    // C++:  void projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat& imagePoints, Mat& jacobian = Mat(), double aspectRatio = 0)
    private static native void projectPoints_0(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long jacobian_nativeObj, double aspectRatio);
    private static native void projectPoints_1(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long jacobian_nativeObj);
    private static native void projectPoints_2(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj);

    // C++:  float rectify3Collinear(Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat cameraMatrix3, Mat distCoeffs3, vector_Mat imgpt1, vector_Mat imgpt3, Size imageSize, Mat R12, Mat T12, Mat R13, Mat T13, Mat& R1, Mat& R2, Mat& R3, Mat& P1, Mat& P2, Mat& P3, Mat& Q, double alpha, Size newImgSize, Rect* roi1, Rect* roi2, int flags)
    private static native float rectify3Collinear_0(long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long cameraMatrix3_nativeObj, long distCoeffs3_nativeObj, long imgpt1_mat_nativeObj, long imgpt3_mat_nativeObj, double imageSize_width, double imageSize_height, long R12_nativeObj, long T12_nativeObj, long R13_nativeObj, long T13_nativeObj, long R1_nativeObj, long R2_nativeObj, long R3_nativeObj, long P1_nativeObj, long P2_nativeObj, long P3_nativeObj, long Q_nativeObj, double alpha, double newImgSize_width, double newImgSize_height, double[] roi1_out, double[] roi2_out, int flags);

    // C++:  void reprojectImageTo3D(Mat disparity, Mat& _3dImage, Mat Q, bool handleMissingValues = false, int ddepth = -1)
    private static native void reprojectImageTo3D_0(long disparity_nativeObj, long _3dImage_nativeObj, long Q_nativeObj, boolean handleMissingValues, int ddepth);
    private static native void reprojectImageTo3D_1(long disparity_nativeObj, long _3dImage_nativeObj, long Q_nativeObj, boolean handleMissingValues);
    private static native void reprojectImageTo3D_2(long disparity_nativeObj, long _3dImage_nativeObj, long Q_nativeObj);

    // C++:  void solvePnP(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false)
    private static native void solvePnP_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native void solvePnP_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  void solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, int minInliersCount = 100, Mat& inliers = Mat())
    private static native void solvePnPRansac_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, int minInliersCount, long inliers_nativeObj);
    private static native void solvePnPRansac_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, int minInliersCount);
    private static native void solvePnPRansac_2(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError);
    private static native void solvePnPRansac_3(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount);
    private static native void solvePnPRansac_4(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native void solvePnPRansac_5(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  double stereoCalibrate(vector_Mat objectPoints, vector_Mat imagePoints1, vector_Mat imagePoints2, Mat& cameraMatrix1, Mat& distCoeffs1, Mat& cameraMatrix2, Mat& distCoeffs2, Size imageSize, Mat& R, Mat& T, Mat& E, Mat& F, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+ TermCriteria::EPS, 30, 1e-6), int flags = CALIB_FIX_INTRINSIC)
    private static native double stereoCalibrate_0(long objectPoints_mat_nativeObj, long imagePoints1_mat_nativeObj, long imagePoints2_mat_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, double imageSize_width, double imageSize_height, long R_nativeObj, long T_nativeObj, long E_nativeObj, long F_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, int flags);
    private static native double stereoCalibrate_1(long objectPoints_mat_nativeObj, long imagePoints1_mat_nativeObj, long imagePoints2_mat_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, double imageSize_width, double imageSize_height, long R_nativeObj, long T_nativeObj, long E_nativeObj, long F_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double stereoCalibrate_2(long objectPoints_mat_nativeObj, long imagePoints1_mat_nativeObj, long imagePoints2_mat_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, double imageSize_width, double imageSize_height, long R_nativeObj, long T_nativeObj, long E_nativeObj, long F_nativeObj);

    // C++:  bool stereoRectifyUncalibrated(Mat points1, Mat points2, Mat F, Size imgSize, Mat& H1, Mat& H2, double threshold = 5)
    private static native boolean stereoRectifyUncalibrated_0(long points1_nativeObj, long points2_nativeObj, long F_nativeObj, double imgSize_width, double imgSize_height, long H1_nativeObj, long H2_nativeObj, double threshold);
    private static native boolean stereoRectifyUncalibrated_1(long points1_nativeObj, long points2_nativeObj, long F_nativeObj, double imgSize_width, double imgSize_height, long H1_nativeObj, long H2_nativeObj);

    // C++:  void validateDisparity(Mat& disparity, Mat cost, int minDisparity, int numberOfDisparities, int disp12MaxDisp = 1)
    private static native void validateDisparity_0(long disparity_nativeObj, long cost_nativeObj, int minDisparity, int numberOfDisparities, int disp12MaxDisp);
    private static native void validateDisparity_1(long disparity_nativeObj, long cost_nativeObj, int minDisparity, int numberOfDisparities);

}
