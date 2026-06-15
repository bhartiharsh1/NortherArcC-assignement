package Module2.day2.DAO_Package.Student.dao;

import Module2.day2.DAO_Package.Student.Entity.Student;

public interface StudentDao {
    void save(Student S);
    void MarksPerSub();
    void TopperOfAll();

    void topperPerSub();
    void AboveAvgP();


}
