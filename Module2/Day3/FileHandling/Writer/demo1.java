package Module2.Day3.FileHandling.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class demo1 {
    public static void main(String[] args) {

        try (Writer fw = new FileWriter("Demo11.csv",true);) {
            fw.write("hello world");
            fw.write("hello universe");
            fw.write("thank you");
            System.out.println("data has been appended");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
