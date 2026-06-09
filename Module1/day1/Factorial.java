package Module1.day1;

public class Factorial {

    public void findFactorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}