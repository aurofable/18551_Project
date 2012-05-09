% Code provided by Ruslan Salakhutdinov and Geoff Hinton
%
% Permission is granted for anyone to copy, use, modify, or distribute this
% program and accompanying programs and documents for any purpose, provided
% this copyright notice is retained and prominently displayed, along with
% a note saying that the original programs are available from our
% web page.
% The programs and documents are distributed without any warranty, express or
% implied.  As the programs were written for research purposes only, they have
% not been tested to the degree that would be advisable in any important
% application.  All use of these programs is entirely at the user's own risk.

* ---------------- *
* AutoEncoder (AE) *
* ---------------- *

S. Martin
3/21/2007

This directory contains Matlab code for training an Autoencoder using the
methods in (Hinton & Salakhutdinov, 2006) "Reducing the Dimensionality of Data
with Neural Networks."  The code is an improved version based on the original code
provided on Hinton's webpage http://www.cs.toronto.edu/~hinton/.  The results
produced by this code should be the same as the results produced by the original
code.  However, in re-writing the code, it may have been altered in a few spots.

Installation
------------

First get the MNIST data from http://yann.lecun.com/exdb/mnist/ and put them in
the examples/mnist folder.  The data consists of four files t10k-images-idx3-ubtye,
t10k-labels-idx1-ubyte, train-images-idx3-ubyte, and train-labels-idx1-ubtye.

Next get the minimize.m code from C. Rasmussen's web page and put that file in the
bin directory.  The code is at:

http://www.kyb.tuebingen.mpg.de/bs/people/carl/code/minimize/minimize.m

Finally, to install the code type (from this directory in Matlab) "install_AE".

Small MNIST example
-------------------

1. Go to the examples/mnist directory in Matlab.

2. Prepare a smaller subset of the images for testing purposes.

>> [train_images, train_labels, test_images, test_labels] = ...
	get_sample_mnist ( 500, 500 );

3. Train an autoencoder by typing

>> [Wb, RBM_error, BP_error] = ...
	train_AE ( train_images, test_images, [784 1000 500 250 2], [10, 20], [50, 500] );

These results are saved in small_mnist_ex.mat.

4. Visualize the results and look at the errors by typing

>> plot_mnist ( train_images, train_labels, test_images, test_labels, ...
	Wb, [784 1000 500 250 2], RBM_error, BP_error );

Full MNIST example
------------------

1. Go to the examples/mnist directory in Matlab.

2. Get the full mnist dataset by typing

>> [train_images, train_labels, test_images, test_labels] = ...
	get_sample_mnist ( 60000, 10000 );

3. Train an autoencoder as per (Hinton & Salakhutdinov, 2006) by typing

>> [Wb, RBM_error, BP_error] = ...
	train_AE ( train_images, test_images, [784 1000 500 250 2], ...
        [50, 200], [100, 1000] );

This takes 1 week on a standard workstation (2 Ghz).  The results are saved
in full_mnist_ex.mat.  You can also see plots in mnist.ppt.

4. To visualize the results type

>> plot_mnist ( train_images, train_labels, test_images, test_labels, Wb, ...
	[784 1000 500 250 2], RBM_error, BP_error );

Swiss Roll example
------------------

1. Go to the swiss_roll directory in Matlab and type

>> swiss_roll ( [3 8 4 2], [4000 1000], [50 500], 1 );

This script generates data then feeds it to the autoencoder
and plots the results.  You can see plots in swiss_roll.ppt.


* ----- *
* Notes *
* ----- *

Autoencoder Formulation in Matlab
---------------------------------

An autoencoder is given by a sequence of weight matrices, biases and unit functions.
These parameters specify the encoder and the decoder which together make up the
autoencoder.  Suppose that AE is an n1-n2-n3-...-nd autoencoder.  It is recorded
in Matlab as a very long column vector Wb.  In Matlab, Wb is given by

Wb = [W1(:);b1;W2(:);b2;... ]', where W1 is n2xn1 and b1 is n1x1, and so on.  Note
that once we reach the ndxn(d-1) matrix W(d-1) we switch to the inverse map (decoder),
which is an n(d-1)xnd matrix Wd, continuing until we reach the original dimension.

The encoder is assumed to have all logistic unit functions of the form
1/(1+exp(-x)) except for one linear unit function mapping n(d-1) -> nd.

If X is the n1 by N data matrix with points as columns then the first step
of the forward map is given by 

1./(1+exp(-W1*X - repmat(b1,1,N))

The full forward map is given by compositions of these functions, the last being
linear of the form W(d-1)*X(d-1) + repmat(b(d-1),1,N), where W(d-1) and b(d-1) are
the d-1 weight matrix and bias vector, respectively, and X(d-1) is the d-1 image
of X under the previous logistic maps.  The inverse map is also a composition, but
without any linear maps.  The first inverse map is of the form

1./(1+exp(-W(d)*Y - repmat(b(d),1,N))

The full forward and inverse maps for the autoencoder are computed using
AE_forward.m and AE_inverse.m.

Training a Restricted Boltzmann Machine (RBM)
---------------------------------------------

In (Hinton & Salakhutdinov, 2006), the autoencoder is pre-trained by first training
Restricted Boltzmann Machines (RBMs) at each layer.  Training an RBM means computing
weights and biases given data X, dimensions (e.g. n1 and n2), and unit functions
(e.g. logistic).  For the RBM, the weights for the inverse map are given by W', where
W contains the weights for the forward map.

The RBM is trained using contrastive divergence.  Contrastive divergence is an iterative
method which updates the weights and biases of the RBM by computing one link in a
Markov chain.  In train_RBM.m this is done by computing X0->Y1->X1->Y1, where X0 is
a batch subset of the original data.  Given the values X0, Y1, X1, Y1, the updates
are computed according to formulas given in (Hinton & Salakhutdinv, 2006).  However,
it seems that these formulas may be slightly different from the formulas given in
(Bengio et al., 2006).  This might be worth further investigation.

Fine Tuning using Backpropagation of Errors
-------------------------------------------

In (Hinton & Salakhutdinov, 2006), the autoencoder is fine tuned after RBM training
using back propagation of errors, run for a set number of iterations.
For each iteration, the dataset is split into batches.  For each batch, 3 line
searchs using a conjugate gradent minimizer by Carl Rasmussen are performed.
This minimizer is contained in the script minimize.m.  The script minimize.m calls
another script called cross_entropy.m (originally CG_MNIST.m).  The script cross_entropy.m
is responsible for computing the cross entropy error of a given batch as well
as the derivatives of the function giving the cross entropy error.  The cross entropy error
is computed as the sum of x*log(xtilde) + (1-x)*log(1-xtilde), where xtilde is the 
reconstructed data.

This version of cross_entropy.m, in comparison to the original version of 
found on Hinton's webpage corrects a small error in computing the derivatives of
the cross entropy function.  This error occurs in the first derivative, which
is computed incorrectly in the original code.  This error does not seem to 
affect the final results very much.