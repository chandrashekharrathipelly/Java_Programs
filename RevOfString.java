
import java.io.*;
import java.util.Scanner;
import java.util.*;

class RevOfString{
    public static void main(String[] args) {
        // #1 using string concatenation operator
       String stri = "ABCD";
       String rev = "";

       int len = stri.length();

       for (int i=len-1; i>=0;i--)
       {
           rev = rev+stri.charAt(i);
       }
        System.out.println(rev);
    }
}
