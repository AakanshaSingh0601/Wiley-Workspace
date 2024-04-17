import java.util.Scanner;

public class InputUser {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double result = num1 +num2;
        System.out.println(result);
    }
}
