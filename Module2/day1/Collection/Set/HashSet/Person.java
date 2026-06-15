//package Module2.day1.Collection.Set.HashSet;
//
//import java.util.Objects;
//
//public class Person implements Comparable<Person> {
//    public static int choice = 1;
//    private String fname;
//    private String lname;
//    int age;
//
//    public Person(String fname, String lname, int age) {
//        this.fname = fname;
//        this.lname = lname;
//        this.age = age;
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(fname, person.fname) &&
//                Objects.equals(lname, person.lname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(fname, lname, age);
//    }
//
//    @Override
//    public String toString() {
//        return fname + " " + lname + " " + age;
//    }
//
//    public void display() {
//        System.out.println(fname + " " + lname + " " + age);
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        switch (choice) {
//            case 1:
//                return this.fname.compareToIgnoreCase(o.fname);
//            case 2:
//                return this.lname.compareToIgnoreCase(o.lname);
//            case 3:
//                return this.age - o.age;
//            default:
//                return 0;
//        }
//    }
//}
