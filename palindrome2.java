
import java.util.Scanner;
class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        int rem;

        while(num>0)
        {

            rev = (rev*10)+num%10;;
            num=num/10;
        }
        System.out.println("Reverse of a number"+temp+" is "+rev);

            if (temp==rev)
            {
                System.out.println("Your number is a Palindrome");
            }
            else
            {
                System.out.println("Your number is not a Palindrome");
            }


    }
}
