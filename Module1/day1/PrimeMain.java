package Module1.day1;

import java.util.Scanner;

public class PrimeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Prime obj = new Prime();
        obj.checkPrime(num);

        sc.close();
    }
}
