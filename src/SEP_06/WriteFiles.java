package SEP_06;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        //Writing a file using 4 popular option.

        try(FileWriter writer = new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\test.txt");){
            writer.write("I'like pizza!");
        } catch (FileNotFoundException e){
            System.out.println("couldn't locate the file location.");
        } catch (IOException e){
            System.out.println("Couldn't Write file.");
        }
        finally {
            System.out.println("Something bad has happended.");
        }
    }
}
