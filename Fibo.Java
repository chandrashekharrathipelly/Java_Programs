import java.util.Scanner;
import java.io.*;
import java.util.*;

class Fibo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below ");
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int count = 2;

        while(count<n)
        {
            int temp= s;
            s = f + s;
            f=temp;
            count++;
        }
        System.out.println(n+"th fibonacci number is "+s);
    }
}
