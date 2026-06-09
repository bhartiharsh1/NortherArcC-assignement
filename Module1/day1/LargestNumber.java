package Module1.day1;

public class LargestNumber {

        public void findLargest(int a, int b, int c) {

            if (a >= b && a >= c) {
                System.out.println("Largest Number = " + a);
            }
            else if (b >= a && b >= c) {
                System.out.println("Largest Number = " + b);
            }
            else {
                System.out.println("Largest Number = " + c);
            }
        }
    }

