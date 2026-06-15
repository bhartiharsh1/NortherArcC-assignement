package Module2.day2.DAO_Package.Student.dao;

import Module2.day2.DAO_Package.Student.Entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDaoImplement implements StudentDao {
    private List<Student> Stud = new ArrayList<>();

    @Override
    public void save(Student S) {
        Stud.add(S);
    }

    @Override
    public void MarksPerSub() {
        System.out.println("Marks Per Subject");
        for (Student s : Stud) {
            System.out.println(s.getName()
                    + " -> P:" + s.getPmarks()
                    + " M:" + s.getMmarks()
                    + " H:" + s.getHmarks()
                    + " G:" + s.getGmarks()
                    + " C:" + s.getCmarks());
        }
    }

    @Override
    public void TopperOfAll() {
        System.out.println("Topper");
        Student topper = Stud.stream()
                .max(Comparator.comparingInt(s -> s.getPmarks() + s.getMmarks() + s.getHmarks() + s.getGmarks() + s.getCmarks()))
                .orElse(null);
        if (topper != null) {
            int total = topper.getPmarks() + topper.getMmarks() + topper.getHmarks() + topper.getGmarks() + topper.getCmarks();
            System.out.println(topper.getName() + total);
        }
    }

    @Override
    public void topperPerSub() {
        System.out.println(
                "\nChems: "+ Stud.stream().max((s1,s2)->s1.getCmarks()- s2.getCmarks()).orElse(null) +
                        "\nPhys: "+ Stud.stream().max((s1,s2)->s1.getPmarks()- s2.getPmarks()).orElse(null) +
                        "\nMaths: "+ Stud.stream().max((s1,s2)->s1.getMmarks()- s2.getMmarks()).orElse(null) +
                        "\nHist: "+ Stud.stream().max((s1,s2)->s1.getHmarks()- s2.getHmarks()).orElse(null) +
                        "\nGeo: "+ Stud.stream().max((s1,s2)->s1.getGmarks()- s2.getGmarks()));

    }
        @Override
    public void AboveAvgP() {
        System.out.println("Students Above Average in Physic");
        double avgP = Stud.stream().mapToInt(Student::getPmarks).average().orElse(0);
        System.out.println("Physics Average: " + avgP);
        Stud.stream()
                .filter(s -> s.getPmarks() > avgP)
                .forEach(s -> System.out.println(s.getName()  + s.getPmarks()));
    }

}