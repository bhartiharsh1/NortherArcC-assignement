package Module1.day2.Encapsulation;
class Main {

    public static void main(String[] args) {


        SuperHero hero1 = new SuperHero();
        hero1.setName("IronMan");
        hero1.superpower = "Advanced Technology";
        System.out.println(hero1.getName());
        hero1.useSuperPower();
        hero1.saveTheWorld();

        SuperVillian villain1 = new SuperVillian();
        villain1.name = "DarkLord";
        villain1.superpower = "Dark Energy";
        villain1.useSuperPower();
        villain1.destroyTheWorld();


        Person person1 = new Person("Arjun", "Verma", 25);
        person1.eat();
        person1.talk();
        person1.walk();


        Book book1 = new Book();
        book1.author = "R.K. Narayan";
        book1.title = "The Guide";
        book1.pages = 200;
        book1.read();
        book1.getSummary();


        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, "Leonardo DiCaprio");
        movie1.Details();


        Employee emp1 = new Employee(102, "Rahul", 60000);
        emp1.display();


        Car car1 = new Car("Honda", "Civic", 2022, "Blue");
        car1.displayInfo();



    }
}
