
import java.util.Scanner;

class And{

    public static void main(String[] args) {
        for(int i=0;i<6;i++)
        {
            for (int j=1;j<6-i;j++)
            {
                System.out.print(" "+j+" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" & ");
            }
            System.out.println();
        }
    }
}
