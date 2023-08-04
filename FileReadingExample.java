import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileReadingExample {
    public static void main(String[] args) {
        File f = new File("dog.txt");
        try {
            PrintWriter writer = new PrintWriter(f);
            writer.println("Cool");
            writer.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}