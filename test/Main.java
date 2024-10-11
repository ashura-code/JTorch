package test;
import java.util.Arrays;


import com.algos.ml.models.*;;

public class Main {
    public static void main(String[] args) {
        // SimpleLinearRegression model = new SimpleLinearRegression();
        // double[] x = new double[]{2, 4, 6, 8}; //independent
        // double[] y = new double[]{3, 7, 5, 10}; //dependent   
        // System.out.println(model.predict(10, model.fit(x,y)));
        MultipleLinearRegression model = new MultipleLinearRegression();
        double[][] x = { {  1,  1,  4 },
                         {  1,  2,  5 },
                         {  1,  3,  8 },
                         {  1,  4,  2 }};
        double[] y = { 1 , 6, 8, 12 };
        double[][] ok = model.fit(x,y);
        for(double[] i:ok) {
             System.out.println(Arrays.toString(i));
        }

        System.out.println(model.predict(ok,new double[]{1,2}));

        
    }
}
