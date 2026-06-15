package Module2.day3.FileHandling.Writer;
import java.io.*;

public class CopyJPG {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("image.jpg");
                FileOutputStream fos = new FileOutputStream("output.jpg")
        ) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("JPG copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
