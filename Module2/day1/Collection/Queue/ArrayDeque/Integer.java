package Module2.day1.Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class Integer {
    public static void main(String[] args) {
        ArrayDeque numbers = new ArrayDeque();
        numbers.offer(10);
        numbers.offer(20);
        numbers.push(30);

        System.out.println("ArrayDeque Numbers: " + numbers);
        System.out.println("Pop element: " + numbers.pop());
        System.out.println("ArrayDeque after pop: " + numbers);
    }
}
