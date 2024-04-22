import java.util.Scanner;

public class CheckStr {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String special = greet(name);
        System.out.println(special);
        CheckStr cs = new CheckStr();
        System.out.println(cs.checkMethod());
    }

    public static String greet(String name){
        String greet = "Glad to see you " + name;
       // System.out.println(greet);
        return greet;
    }
    public String checkMethod(){
        return "check";
    }
}

