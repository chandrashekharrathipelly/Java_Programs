import java.io.*;
import java.util.*;


class PalindromeOfNumber{

    public static void main(String[] args) {
        int r, sum = 0, temp, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n = s.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum = (sum*10)+r;
            r= n/10;

        }
        System.out.println("reverse of a number is"+ sum);
        if(temp==sum)
            System.out.println("Your number is palindrome");
        else
            System.out.println("Your number is not a palindrome");
    }
}
