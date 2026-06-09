package Module2.day1.Collection.Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class PersonMain {
    public static void main(String[] args) {
        Deque<Person> persons = new LinkedList<>();

        persons.add(new Person(101, "Ravi", 22));
        persons.add(new Person(102, "Kiran", 24));
        persons.add(new Person(103, "Asha", 21));

        System.out.println("Person Dequeue:");

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
