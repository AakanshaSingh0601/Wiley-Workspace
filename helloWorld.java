import java.util.Scanner;

public class helloWorld {
    public static void main (String args[]){
        String s ="Aakansha";
        String pss ="12345";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username :");
        String username = sc.nextLine();
        System.out.print("Enter the password :");
        String password = sc.nextLine();

        if(s.equals (username)  && password.equals(pss)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Invalid");
        }

    }
}



