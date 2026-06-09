package Module1.day4;
import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // take array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // take indexes
        System.out.print("Enter first index: ");
        int i = sc.nextInt();

        System.out.print("Enter second index: ");
        int j = sc.nextInt();

        try {
            // check valid indexes
            if (i < 0 || j < 0 || i >= n || j >= n) {
                throw new Exception("Invalid index!");
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // print result
            System.out.println("Array after swapping:");
            for (int x : arr) {
                System.out.print(x + " ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
