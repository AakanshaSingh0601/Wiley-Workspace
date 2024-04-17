import java.util.*;
public class guessNum {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to the Mysterious Number Guesser!\n" +
                "I have selected a number between 1 and 100. Can you guess it?");
        int ans = (int)Math.random()*100;
        System.out.println(ans);

        while(true){
            var val = sc.nextInt();
            double diff = Math.abs(val-ans);
            if(diff==0) {
                System.out.println("Congralutions!!! You guessed it right");
                break;
            }
            if(diff<10) System.out.println("You are getting closer");
            else System.out.println("You getting far");
        }
    }
}
