package Module2.day1.Collection.Set.LinkedSet;

import java.util.LinkedHashSet;

public class PersonMain {
    public static void main(String[] args) {
        LinkedHashSet<Person> set = new LinkedHashSet<>();
        set.add(new Person("Harsh", "Bharti", 23));
        set.add(new Person("Kalyan", "S", 25));
        set.add(new Person("Harsh", "Bharti", 23)); // Duplicate Person, will be ignored

        System.out.println("LinkedHashSet of Persons (maintains insertion order, no duplicates):");
        for (Person p : set) {
            System.out.println(p);
        }
    }
}
