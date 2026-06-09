package Module2.day1.BasicAsso;

public class Main1 {
    public static void main(String[] args) {
        Department itdep = new Department("IT", "Mumbai");
        Employee emp = new Employee("Sachin");
        itdep.setList(emp);
        itdep.addEmployee(new Employee("harsh"));

        System.out.println(itdep);
        
        Department hrDept = new HrDept("Hr", "bombay");
        hrDept.addEmployee(emp);
        hrDept.addEmployee(new Employee("harsh"));
        
        System.out.println(hrDept);

        System.out.println();
        
        // Driver and Car Association
        Car car = new Car("Tesla Model S");
        Driver driver = new Driver("Harsh");
        driver.drive(car);
    }
}
