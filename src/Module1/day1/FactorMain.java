package Module1.day1;

import java.util.Scanner;

public class FactorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factor obj = new Factor();
        obj.findFactors(num);

        sc.close();
    }
}
