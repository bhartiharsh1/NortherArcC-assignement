package Module2.day1.Collection.Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class String {
    public static void main(String[] args) {
        Deque names = new LinkedList();
        names.addFirst("Ravi");
        names.addLast("Kiran");
        names.addFirst("Asha");

        System.out.println("Names: " + names);

        while (!names.isEmpty()) {
            System.out.println(names.pollFirst());
        }
    }
}
