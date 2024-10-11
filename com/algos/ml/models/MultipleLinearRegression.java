package com.algos.ml.models;
import java.util.Arrays;
import java.Math;
import Jama.Matrix;

public class MultipleLinearRegression {

    public double[][] fit(double[][] x, double[] y) { 
        if (x.length != y.length) { 
            throw new IllegalArgumentException("Sizes do not match!");
        }

        Matrix X = new Matrix(x); // Features matrix
        Matrix Mat_y = new Matrix(y, y.length); // Target (as a column vector)
        Matrix Xt = X.transpose();

        // Formula: ((Xt * X)^-1 * Xt) * Mat_y
        return (Xt.times(X).inverse().times(Xt).times(Mat_y)).getArrayCopy();
    }

    public double predict(double[][] vars ,double[] p ){
        double result = vars[0][0];

        for(int i=1;i<vars.length;i++){
         result = result+vars[i][0]*Math.round(p[i-1]);
        }
         return result;
     }
}
