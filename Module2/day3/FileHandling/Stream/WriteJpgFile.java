package Module2.day3.FileHandling.Stream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteJpgFile {
    public static void main(String[] args) {
        try (OutputStream fos = new FileOutputStream("image.jpg")) {

            byte[] imageData = { (byte)255, (byte)216, (byte)255 }; // dummy JPEG header bytes
            fos.write(imageData);

            System.out.println("JPG file written");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
