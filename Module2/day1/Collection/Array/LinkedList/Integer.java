package Module2.day1.Collection.Array.LinkedList;

import java.util.LinkedList;

public class Integer {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
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
