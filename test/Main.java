package test;
import java.util.Arrays;

import com.algos.ml.models.*;;

public class Main {
    public static void main(String[] args) {
         SimpleLinearRegression model = new SimpleLinearRegression();
         double[] x = new double[]{2, 4, 6, 8}; //independent
         double[] y = new double[]{3, 7, 5, 10}; //dependent   
         System.out.println(model.predict(10, model.fit(x,y)));
    }
}
