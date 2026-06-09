package Module2.day1.BasicAsso;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public String HqLocation;
    private List<Employee> List;

    public Department(String name, String HqLocation) {
        this.name = name;
        this.HqLocation = HqLocation;
        this.List = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHqLocation() {
        return this.HqLocation;
    }

    public void setHqLocation(String hqLocation) {
        HqLocation = hqLocation;
    }

    public List<Employee> getList() {
        return this.List;
    }

    public void setList(Employee e) {
        this.List.add(e);
    }


    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", HqLocation='" + HqLocation + '\'' +
                ", List=" + List +
                '}';
    }

    public void addEmployee(Employee emp) {
        this.List.add(emp);
    }
}
