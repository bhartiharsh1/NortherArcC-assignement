package Module2.day1.Collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class Integer {
    public static void main(String[] args) {
        PriorityQueue numbers = new PriorityQueue();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Numbers: " + numbers);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
