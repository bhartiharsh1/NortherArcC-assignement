package Module1.day1;
import java.util.Scanner;
public class LeapMain {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            LeapYear obj = new LeapYear();

            if (obj.checkLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

            sc.close();
        }
    }

