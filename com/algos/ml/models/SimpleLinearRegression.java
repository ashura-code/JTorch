package com.algos.ml.models;


import com.algos.ml.utils.Operations;


public class SimpleLinearRegression {

    Operations utils = new Operations();
    
    public double[] fit(double[] x,double[] y){ 
       double[] x_sq = new double[x.length];
       for (int i = 0; i < x.length; i++) x_sq[i] = x[i]*x[i];

       double mean_x = utils.mean(x);
       double mean_y = utils.mean(y);
       double mean_xy = utils.vm(x,y)/x.length;

       double slope = (mean_xy - mean_x*mean_y ) / (utils.mean(x_sq) - mean_x*mean_x);
       double intercept = mean_y-slope*mean_x;

       return new double[]{slope,intercept};
    }


   public double predict(double predictor , double[] params) {
       // y  = intercept+slope*x
       return params[0]+params[1]*predictor;
   }
}
