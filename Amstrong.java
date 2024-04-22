import java.util.Scanner;
import java.util.*;
import java.io.*;

class Amstrong{
    public static void main(String[] args) {
        int rem, arm=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to check whether a given number is aromostrong or not");
        int num = input.nextInt();

        int temp= num;
        while(num>0)
        {
            rem = num%10;
            num = num/10;
            arm = arm+(rem*rem*rem);
        }
        System.out.println("sum of cubes of every digit in a given number is "+arm);
        if(temp==arm)
            System.out.println("given number is armostrong");
        else
            System.out.println("given number is not a aromstrong number");
    }
}
