package Module2.day1.Iteration;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("harsh");
        list.add("nikash");
        list.add("kalyan");
        list.add("apuroop");
        System.out.println("__________________");
        for (String str : list) {
            System.out.println(str);
            Iterator<String> itr = list.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        List<String> list2 = new LinkedList<>();
        list2.add("harsh");
        list2.add("nikash");
        list2.add("kalyan");
        list2.add("apuroop");
        System.out.println("__________________");
        for (String str : list2) {
            System.out.println(str);
            Iterator<String> itr = list2.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(5);
        list3.add(4);
        list3.add(7);
        System.out.println("__________________");
        for (Integer num : list3) {
            System.out.println(num);
            Iterator<Integer> itr = list3.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        Set<String> list4 = new HashSet<>();
        list4.add("harsh");
        list4.add("nikash");
        list4.add("kalyan");
        list4.add("apuroop");
        System.out.println("__________________");
        for (String str : list4) {
            System.out.println(str);
            Iterator<String> itr = list4.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        List<String> list5 = new LinkedList<>();
        list5.add("harsh");
        list5.add("nikash");
        list5.add("kalyan");
        list5.add("apuroop");
        System.out.println("__________________");
        for (String str : list5) {
            System.out.println(str);
            Iterator<String> itr = list5.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        List<Person> person = new ArrayList<>();
        person.add(new Person("harsh", 23));
        person.add(new Person("kalyan", 25));
        person.add(new Person("Shashank", 46));
        person.add(new Person("apoorup", 22));
        person.add(new Person("Nikash", 23));
        System.out.println("__________________");
        for (Person p : person) {
            System.out.println(p);
            Iterator<Person> itr = person.iterator();
            System.out.println(itr.getClass().getName());
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
