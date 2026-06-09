package Module2.day1.DAO;

public abstract class BookDao {
    public abstract void save(Book book);

    public abstract Book findById(int id);

    public abstract void deleteById(int id);

    public abstract void update(Book book);

    public abstract void deleteAll();

    public abstract Iterable<Book> findAll();

    public abstract Iterable<Book> findByAuthor(String author);

    public abstract Iterable<Book> findByTitle(String title);

    public abstract Iterable<Book> sortByTitleAsc();

    public abstract Iterable<Book> sortByTitleDesc();


    }


