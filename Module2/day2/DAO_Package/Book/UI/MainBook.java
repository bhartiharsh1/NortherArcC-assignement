package Module2.day2.DAO_Package.Book.UI;

import Module2.day2.DAO_Package.Book.Entity.Book;
import Module2.day2.DAO_Package.Book.dao.BookDaoImplementor;

public class MainBook {

    public static void main(String[] args) {

        BookDaoImplementor list = new BookDaoImplementor();

        list.save(new Book("Java Basics", "Harsh", 250));
        list.save(new Book("Python Guide", "Aman", 300));
        list.save(new Book("DSA", "Harsh", 450));
        list.save(new Book("Spring Boot", "Rahul", 350));
        list.save(new Book("Java Basics", "Karan", 280));

        System.out.println("Find By Author:");
        System.out.println(list.findByAuthor("Harsh"));

        System.out.println("\nFind By Title:");
        System.out.println(list.findByTitle("Java Basics"));

        System.out.println("\nSorted By Pages:");
        System.out.println(list.sortByPages());

        list.removeByAuthor("Rahul");

        System.out.println("\nAfter Removing Rahul's Books:");
        System.out.println(list.findAll());

        list.removeByTitle("Python Guide");

        System.out.println("\nAfter Removing Python Guide:");
        System.out.println(list.findAll());
    }
}