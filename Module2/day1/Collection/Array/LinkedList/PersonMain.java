package Module2.day1.Collection.Array.LinkedList;

import java.util.LinkedList;

public class PersonMain {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();

        persons.add(new Person(101, "Ravi", 22));
        persons.add(new Person(102, "Kiran", 24));
        persons.add(new Person(103, "Asha", 21));

        System.out.println("Person LinkedList:");

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
