package Module1.day1;

import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        obj.printSeries(n);

        sc.close();
    }
}
