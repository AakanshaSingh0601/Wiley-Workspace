import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class leapYear {
    public static void main(String args[]){
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

       String msg = switch (dayOfWeek) {
           case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Work HARD";
           case SATURDAY, SUNDAY -> "ENJOY";
       };
       System.out.println(msg);



}
}
