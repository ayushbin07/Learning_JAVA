package Sep_07;

//enums
//(Enumerations) A special kind of class that
//represents a fixed set of constants.
//They improve code readability and are easy to maintain.
//More efficient with switches when comparing Strings.

import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a day of the week: ");
            String response = sc.nextLine().toUpperCase();
            Day day = Day.valueOf(response);
            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch(day){
                case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("It is a weekday.");
                case SATURDAY,SUNDAY -> System.out.println("Happy weekends");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Please only type days.");
        }
    }
}

