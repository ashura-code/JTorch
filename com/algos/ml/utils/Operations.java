package com.algos.ml.utils;

public class Operations {

    public double vm(double[] ...args){ 

       int  length = args.length;
       int total = 0;

       for(int i = 0;i<args[0].length;i++){ 
          int mulp = 1;
          for(int j=0;j<length;j++){ 
             mulp *= args[j][i];
          }
          total += mulp;
    }
    return (double)total;
 }

    public double mean(double[] x){ 
          int total = 0;
          for(double i :x){ 
              total += i;
          }
          return (double)total/x.length;    
    }
}
