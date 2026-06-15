package Module2.day3.FileHandling.Reading;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
        try(Reader fr = new FileReader("Demo11.csv");) {
            int value;
            do {
                value = fr.read();
                System.out.println((char) value);
            } while (value != -1);

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("file not found");
    }
}

