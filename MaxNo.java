import java.util.Scanner;
import java.util.*;
import java.io.*;

class MaxNo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers");
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        float num3 = input.nextInt();
        float max = Math.max(num1, Math.max(num2,num3));
        float sum = num1+ num2+num3;
        System.out.println("sum = "+ sum);
        System.out.println("Largest number is "+max);
    }
}
