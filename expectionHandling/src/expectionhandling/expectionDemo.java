package expectionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class expectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput) {
            try {
                System.out.println("Enter first numbers");
                int a = sc.nextInt();
                System.out.println("Enter second numbers");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Result =   " + result);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!! Please enter a number");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
