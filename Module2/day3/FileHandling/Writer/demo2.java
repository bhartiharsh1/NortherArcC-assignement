package Module2.day3.FileHandling.Writer;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("Demo11.csv");
                FileWriter fw = new FileWriter("output.csv")
        ) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("Copied");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
