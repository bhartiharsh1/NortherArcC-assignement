package Module2.day1.Collection.Set.TreeSet;

public class Person implements Comparable<Person> {
    public static int choice = 1;
    String fname;
    String lname;
    int age;

    public Person(String fname, String lname, int age) {

        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return fname + " " + lname + " " + age;
    }

    public void display() {
        System.out.println(fname + " " + lname + " " + age);
    }

    @Override
    public int compareTo(Person o) {
        switch (choice) {
            case 1:
                return this.fname.compareToIgnoreCase(o.fname);
            case 2:
                return this.lname.compareToIgnoreCase(o.lname);
            case 3:
                return this.age - o.age;
            default:
                return 0;
        }
    }
}
