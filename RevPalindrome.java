import java.util.*;
import java.io.*;
import java.util.Scanner;

class RevPalindrome{
    public static void main(String[] args) {
        int num, rev=0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();

        temp = num;

        while(num>0)
        {
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;

        }
        System.out.println("Reverse of a number " + rev);

        if(temp==rev)
        {
            System.out.println("Given Number is Palindrome");
        }
        else
            System.out.println("Given Number is not a Palindrome");
    }
}
