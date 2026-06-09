package Module2.day1.Collection.Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Integer {
    public static void main(String[] args) {
        Deque numbers = new LinkedList();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.addFirst(30);

        System.out.println("Numbers: " + numbers);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.pollFirst());
        }
    }
}
