package Module2.Day3.FileHandling.Reading;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {
        try(Reader fr = new FileReader("Demo11.csv");
            BufferedReader FR1 =  new BufferedReader(fr);){
            String line;
            do {
                line = FR1.readLine();
                if(line!=null)
                    System.out.println(line);
            } while (line!= null);


        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("file not found");
    }
}

