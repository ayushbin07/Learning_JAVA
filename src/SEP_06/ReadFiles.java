package SEP_06;

//How to read a file using Java (3 popular options)
//BufferedReader +
//FileInputStream:
//RandomAccessFiIe :
//FileReader: Best for reading text files line-by-tine
//Best for binary filesll (e.g. ,
//images, audio files)
//Best for read/wpite specific portions of a large file


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ayush\\OneDrive\\Desktop\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("That file exists. Contents:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}