import java.util.Scanner;

class PalindromeRev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.next();
        int len = str.length();
        String rev="";
        String org_str = str;

        for(int i=len-1;i>=0;i--)
        {
           rev = rev+str.charAt(i);
        }
        System.out.println("Reverse of a given string is :"+ rev);
        if(org_str.equals(rev))
        {
            System.out.println("Your string is a Palindrome");
        }
        else
        {
            System.out.println("Your string is not a Palindrome");
        }
    }
}
