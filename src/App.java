import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by LordwolF on 8/10/2016.
 */



public class App {
    public static void main(String[] args) {

        File  file = new File("test.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("this is line one");
            bw.newLine();
            bw.write("this is line two");
            bw.newLine();
            bw.write("this is the last line");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
