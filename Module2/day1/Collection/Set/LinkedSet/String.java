package Module2.day1.Collection.Set.LinkedSet;

import java.util.LinkedHashSet;

public class String {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Ravi");
        names.add("Kiran");
        names.add("Ravi"); // Duplicate ignored

        System.out.println("LinkedHashSet Names (maintains insertion order): " + names);
    }
}
