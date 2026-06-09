package Module2.day1;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main3Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.add(10);
        q.add(2);
        q.add(300);
        q.add(400);
        System.out.println("Removing" + +q.remove());
        System.out.println("Removing" + +q.remove());
        System.out.println("Removing" + +q.remove());
        System.out.println("Removing" + +q.peek());
        System.out.println("Removing" + +q.peek());

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(2);
        q1.add(300);
        q1.add(400);
        System.out.println("Removing" + +q1.remove());
        System.out.println("Removing" + +q1.remove());
        System.out.println("Removing" + +q1.remove());
        System.out.println("Removing" + +q1.peek());
        System.out.println("Removing" + +q1.peek());

    }
}