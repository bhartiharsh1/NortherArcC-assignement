package Module2.day1.Interconversion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
   public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        System.out.println(list);
        System.out.println("------------");
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
        System.out.println("________________");
        list = new ArrayList<>(set);
        System.out.println("________________");
    System.out.println(list instanceof Set);
        System.out.println(list instanceof List);

    }
}
