package org.example;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter a number to find the nth fibonacci number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " +b);
       // int count = 2;

        for(int i=2; i<num;i++){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(" "+b);
        }
        System.out.println();
        if(num == 1){
            System.out.println("1st Fibonacci Number is "+b);
        }
        if (num==2){
            System.out.println(num + "nd Fibonacci Number is "+b);
        }
        if (num==3){
            System.out.println(num + "rd Fibonacci Number is "+b);
        }
        System.out.println(num + "th Fibonacci Number is "+b);
    }
}
