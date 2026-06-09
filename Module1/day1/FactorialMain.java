package Module1.day1;

import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();
        obj.findFactorial(num);

        sc.close();
    }
}