import java.util.*;
import java.io.*;

class SumOfN{
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        for(int i=1;i<n;i++)
            sum= sum+i;
        System.out.println("sum of first " + n + " natural numbers is " + sum);

    }
}
