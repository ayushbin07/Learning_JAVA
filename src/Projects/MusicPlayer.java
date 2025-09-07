package Projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ayush\\Downloads\\Resolution Or Reflection - The Grey Room _ Clark Sims.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){

            String response="";

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println(("R = Reset"));
                System.out.println("Q = Quit");
                System.out.print("Enter Your Choice: ");

                response = scanner.nextLine().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The File was not found.");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resources.");
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Bye Bye");
        }
    }
}
