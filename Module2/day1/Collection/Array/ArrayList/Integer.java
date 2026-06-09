package Module2.day1.Collection.Array.ArrayList;

import java.util.ArrayList;

public class Integer {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        for (Object n : numbers) {
            System.out.println(n);
        }
    }
}