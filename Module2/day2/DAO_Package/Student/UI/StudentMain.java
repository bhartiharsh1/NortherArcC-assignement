package Module2.day2.DAO_Package.Student.UI;

import Module2.day2.DAO_Package.Student.Entity.Student;
import Module2.day2.DAO_Package.Student.dao.StudentDaoImplement;

public class StudentMain {
    public static void main(String[] args) {
        StudentDaoImplement Stud = new StudentDaoImplement();

        Stud.save(new Student("harsh",88,97,89,65,98));
        Stud.save(new Student("nikash",78,47,88,82,88));
        Stud.save(new Student("apoorup",98,87,79,52,18));
        Stud.save(new Student("kalyan",78,77,89,98,48));
        Stud.save(new Student("rishav",68,72,75,18,38));

        Stud.MarksPerSub();
        Stud.TopperOfAll();
        Stud.topperPerSub();
        Stud.AboveAvgP();
    }
}
