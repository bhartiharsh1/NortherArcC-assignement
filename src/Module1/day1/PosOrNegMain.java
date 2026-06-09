package Module1.day1;

import java.util.Scanner;

public class PosOrNegMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       PosOrNeg obj = new PosOrNeg();
        obj.checkNumber(num);

        sc.close();
    }
}
