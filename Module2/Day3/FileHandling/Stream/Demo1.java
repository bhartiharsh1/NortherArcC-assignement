package Module2.Day3.FileHandling.Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo1 {
    public static void main(String[] args) {
        try(OutputStream
                    fos = new FileOutputStream("harsh.txt");){
            String data ="hello world";
            fos.write(data.getBytes());
            System.out.println("data has been written to the file");
        }
        catch (Exception e){
            throw new RuntimeException((e));
        }
    }
}
