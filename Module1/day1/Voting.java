package Module1.day1;

import java.util.Scanner;

public class Voting {
    public static String checkEligibility(int age) {
        if (age >= 18) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age (range: 0 to 100): ");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            System.out.println("Age should be between 0 and 100");
        } else {
            String result = checkEligibility(age);
            System.out.println(result + " for Voting");
        }

        sc.close();
    }
}