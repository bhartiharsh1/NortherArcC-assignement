package Module2.day2.DAO_Package.Book.dao;

import Module2.day2.DAO_Package.Book.Entity.Book;

import java.util.List;

public interface BookDao {

    void save(Book b);

    Iterable<Book> findAll();

    void addBook(Book book);

    void deleteBook(int id);

    List<Book> getAllBooks();

    Iterable<Book> findByAuthor(String author);

    Iterable<Book> findByTitle(String title);

    void removeByAuthor(String author);

    void removeByTitle(String title);

    List<Book> sortByPages();
}