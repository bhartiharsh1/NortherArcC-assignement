package Module2.day1.Collection.Set.HashSet;

import java.util.HashSet;

public class PersonMain {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("Harsh", "Bharti", 23));
        set.add(new Person("Kalyan", "S", 25));
        set.add(new Person("Harsh", "Bharti", 23)); // Duplicate Person, will be ignored

        System.out.println("HashSet of Persons (Duplicates avoided):");
        for (Person p : set) {
            System.out.println(p);
        }
    }
}
