import java.util.Scanner;
import java.io.*;
import java.util.*;

class Rem{
    public static void main(String[] args) {
        int num = 4533;
        int count = 0;
        while (num>0)
        {
            int rem = num % 10;
            if(rem==3)
            {
                count++;
            }
            num = num/10;

        }
        System.out.println(count);
    }
}
