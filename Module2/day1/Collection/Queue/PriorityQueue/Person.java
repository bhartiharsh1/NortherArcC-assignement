package Module2.day1.Collection.Queue.PriorityQueue;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && java.util.Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
