package Module2.day1.Collection.Array.ArrayList;

import java.util.ArrayList;

public class String {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
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