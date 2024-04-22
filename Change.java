package org.example;

public class Change {

     public static void ram (int[] arr){
        for(int i = 0;i<arr.length;i++){
            long fact = factorial(arr[i]);
            arr[i] = (int) fact;
            }
        }
public static long factorial(long a){
         long val = 1;
         for (int i = (int)a; i>0; i--){
             val = val*i;
         }
         return val;
    }


}
