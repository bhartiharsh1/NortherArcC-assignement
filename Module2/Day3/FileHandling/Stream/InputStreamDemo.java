package Module2.Day3.FileHandling.Stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream("harsh.txt")) {

            int value;
            while ((value = fis.read()) != -1) {
                System.out.print((char) value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}