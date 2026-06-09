package Module2.day1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String[] names = {"harsh", "Apoorup", "kalyan", "nikash"}; // array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();

        boolean match = false;

        try {
            for (String name : names) {
                if (name.equalsIgnoreCase(input)) {
                    System.out.println("Welcome " + input + "!");
                    match = true;
                    break;
                }
            }

            // if not matched → throw exception
            if (!match) {
                throw new Exception("Name not found!, sorry you are not allowedvi");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}


