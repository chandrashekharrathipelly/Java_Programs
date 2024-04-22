package org.example;

public class Change1 {
    public static void ram (int[] arr){
        for(int i = 0;i<arr.length;i++){
            int mul = 1;
            for(int j = 1; j<=arr[i];j++){
                mul = mul*j;
            }
            arr[i] = mul;
        }
    }

}
