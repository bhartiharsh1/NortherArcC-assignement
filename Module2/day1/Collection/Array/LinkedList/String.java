package Module2.day1.Collection.Array.LinkedList;

import java.util.LinkedList;

public class String {
    public static void main(String[] args) {
        LinkedList names = new LinkedList();
        names.add("Ravi");
        names.add("Kiran");
        names.add("Asha");
        names.add("Priya");

        System.out.println("Names: " + names);

        for (Object name : names) {
            System.out.println(name);
        }
    }
}
