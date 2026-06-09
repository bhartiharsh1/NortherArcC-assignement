package Module1.day3.ExceptionHandling;
import java.util.Scanner;
public class RunTime {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String str = sc.next();
            try {
                if (!str.equalsIgnoreCase("siva") && !str.equalsIgnoreCase("priya") && !str.equalsIgnoreCase("gokul")) {
                    throw new RTNotFound.RunTimeNotFound("Invalid name");
                }
                System.out.println("Allowed");
            } catch (RTNotFound.RunTimeNotFound e) {
                System.out.println("Not allowed " + e.getMessage());
            }
        }
    }

