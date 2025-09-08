package Projects;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        // JAVA Alarm cclock
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\ayush\\Downloads\\Resolution Or Reflection - The Grey Room _ Clark Sims.wav";

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm Set for " + alarmTime);
            } catch(DateTimeParseException e) {
                System.out.println("Invalid format. \n Please use HH:MM:SS. ");
            }
        }
        System.out.println("✅ Creating AlarmClockMechanism and starting thread...");

        AlarmClockMechanism alarmClockMechanism = new AlarmClockMechanism(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClockMechanism);
        alarmThread.start();

        //scanner.close();
    }

}
