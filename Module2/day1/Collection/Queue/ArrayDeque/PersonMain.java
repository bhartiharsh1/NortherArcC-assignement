package Module2.day1.Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class PersonMain {
    public static void main(String[] args) {
        ArrayDeque<Person> ad = new ArrayDeque<>();
        ad.offer(new Person("Harsh", "Bharti", 23));
        ad.offer(new Person("Kalyan", "S", 25));
        ad.push(new Person("Shashank", "Sir", 46));

        System.out.println("ArrayDeque of Persons:");
        for (Person p : ad) {
            System.out.println(p);
        }
    }
}
