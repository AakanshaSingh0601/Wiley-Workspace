import java.util.Scanner;

public class positiveNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number");
        while(true){
            int val = sc.nextInt();
            if(val<0) break;
        }
        System.out.println("Negative Number");
    }
}
