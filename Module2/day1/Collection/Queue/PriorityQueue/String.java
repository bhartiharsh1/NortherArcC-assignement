package Module2.day1.Collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class String {
    public static void main(String[] args) {
        PriorityQueue names = new PriorityQueue();
        names.add("Ravi");
        names.add("Kiran");
        names.add("Asha");
        names.add("Priya");

        System.out.println("Names: " + names);

        while (!names.isEmpty()) {
            System.out.println(names.poll());
        }
    }
}
