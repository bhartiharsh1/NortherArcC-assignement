package Module2.day1.Collection.Set.HashSet;

import java.util.HashSet;

public class Integer {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate ignored

        System.out.println("HashSet Numbers: " + numbers);
    }
}
