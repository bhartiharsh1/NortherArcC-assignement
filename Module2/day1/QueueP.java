package Module2.day1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueP {
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


        Queue<String> q2 = new PriorityQueue<>(Comparator.reverseOrder());
        q2.add("harsh");
        q2.add("b");
        q2.add("cd");
        q2.add("mad");
        System.out.println("Removing" + q2.remove());
        System.out.println("Removing" + q2.remove());
        System.out.println("Removing" + q2.remove());
        System.out.println("Removing" + q2.peek());
        System.out.println("Removing" + q2.peek());


        Queue<Person> q21 = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o2.getAge() - o1.getAge());
            }
        });

        q21.add(new Person("harsh", "bharti", 23));
        q21.add(new Person("kalyan", "S", 25));
        q21.add(new Person("Shashank", "sir", 46));
        q21.add(new Person("apoorup", "P", 22));
        q21.add(new Person("Nikash", "K", 23));

        System.out.println(q21);
        System.out.println("Removing: " + q21.remove());
        System.out.println("Removing: " + q21.remove());
        System.out.println("Removing: " + q21.remove());
        System.out.println("Removing: " + q21.peek());
        System.out.println("Removing: " + q21.peek());
    }
}