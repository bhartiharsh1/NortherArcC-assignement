package Module2.day5.Connection.JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Module2.day5.Connection.DBManager;
import Module2.day5.Connection.JDBC.Entity.Book;

public class BookDaoImple implements BookDao {

    public BookDaoImple() {
        String createSql = "CREATE TABLE IF NOT EXISTS book(id SERIAL PRIMARY KEY, title VARCHAR(255), author VARCHAR(255), genre VARCHAR(255))";
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(createSql);
            ps.execute();
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void addBook(Book book) {
        // id is SERIAL (auto-generated), so we do NOT insert it manually
        try {
            Connection conn = DBManager.getConnection();
            String sql = "INSERT INTO book(title, author, genre) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateBook(int id, Book book) {
        try {
            Connection conn = DBManager.getConnection();
            String sql = "UPDATE book SET title = ?, author = ?, genre = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            ps.setInt(4, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated.");
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteBook(int id) {
        try {
            Connection conn = DBManager.getConnection();
            String sql = "DELETE FROM book WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) deleted.");
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Book getBookById(int id) {
        try {
            Connection conn = DBManager.getConnection();
            String sql = "SELECT * FROM book WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setGenre(rs.getString("genre"));
                DBManager.closeConnection(conn);
                return book;
            }
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return findBooks("SELECT * FROM book");
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return findBooks("SELECT * FROM book WHERE author = ?", author);
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return findBooks("SELECT * FROM book WHERE genre = ?", genre);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return findBooks("SELECT * FROM book WHERE title = ?", title);
    }

    private List<Book> findBooks(String sql) {
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            List<Book> books = readBooks(ps.executeQuery());
            DBManager.closeConnection(conn);
            return books;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new ArrayList<>();
    }

    private List<Book> findBooks(String sql, String value) {
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, value);
            List<Book> books = readBooks(ps.executeQuery());
            DBManager.closeConnection(conn);
            return books;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new ArrayList<>();
    }

    private List<Book> readBooks(ResultSet rs) throws SQLException {
        List<Book> books = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setGenre(rs.getString("genre"));
            books.add(book);
        }
        return books;
    }
}