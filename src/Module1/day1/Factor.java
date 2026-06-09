package Module1.day1;

public class Factor {

    public void findFactors(int num) {

        int count = 0;
        int sum = 0;

        System.out.print("Factors are: ");

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nTotal Factors = " + count);
        System.out.println("Sum of Factors = " + sum);
    }
}
