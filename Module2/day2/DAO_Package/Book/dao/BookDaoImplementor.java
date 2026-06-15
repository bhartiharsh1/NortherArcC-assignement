package Module2.day2.DAO_Package.Book.dao;

import Module2.day2.DAO_Package.Book.Entity.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookDaoImplementor implements BookDao {

    private List<Book> list = new ArrayList<>();

    @Override
    public void save(Book b) {
        list.add(b);
    }

    @Override
    public Iterable<Book> findAll() {
        return list;
    }

    @Override
    public void addBook(Book book) {
        list.add(book);
    }

    @Override
    public void deleteBook(int id) {
        if (id >= 0 && id < list.size()) {
            list.remove(id);
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(list);
    }

    @Override
    public Iterable<Book> findByAuthor(String author) {
        return list.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    @Override
    public Iterable<Book> findByTitle(String title) {
        return list.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    @Override
    public void removeByAuthor(String author) {
        list.removeIf(book ->
                book.getAuthor().equalsIgnoreCase(author));
    }

    @Override
    public void removeByTitle(String title) {
        list.removeIf(book ->
                book.getTitle().equalsIgnoreCase(title));
    }

    @Override
    public List<Book> sortByPages() {
        return list.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .toList();
    }
}