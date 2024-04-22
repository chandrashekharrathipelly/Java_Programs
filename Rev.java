import java.util.Scanner;
import java.util.*;
import java.io.*;

class Rev{
    public static void main(String[] args) {
        int rev = 0, rem, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int temp = n;
        while(n>0)
        {
            rem = n % 10;
            rev = (rev * 10)+ rem;
            n=n/10;
        }
        System.out.println("reverse of a number is "+ rev);
        if(temp==rev)
        {
            System.out.println("Given number is palindrome");
        }
        else
        {
            System.out.println("Given number is not palindrome");
        }
    }
}
