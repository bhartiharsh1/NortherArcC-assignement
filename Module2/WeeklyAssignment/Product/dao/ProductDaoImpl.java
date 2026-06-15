package Module2.WeeklyAssignment.Product.dao;

import Module2.WeeklyAssignment.Product.Entity.Product;
import Module2.day5.Connection.DBManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Product DAO Implementation using PostgreSQL (JDBC)
 * Table DDL:
 *   CREATE TABLE IF NOT EXISTS products (
 *       id       VARCHAR(20) PRIMARY KEY,
 *       name     VARCHAR(100),
 *       category VARCHAR(50),
 *       brand    VARCHAR(50),
 *       price    INT,
 *       discount INT,
 *       rating   DOUBLE PRECISION
 *   );
 */
public class ProductDaoImpl implements ProductDao {

    private static final String TABLE_NAME = "products";
    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS products (" +
            "id       VARCHAR(20) PRIMARY KEY, " +
            "name     VARCHAR(100), " +
            "category VARCHAR(50), " +
            "brand    VARCHAR(50), " +
            "price    INT, " +
            "discount INT, " +
            "rating   DOUBLE PRECISION)";

    // ── Constructor: auto-creates / validates table ───────────────────────────
    public ProductDaoImpl() {
        try {
            Connection conn = DBManager.getConnection();
            if (shouldResetTable(conn)) {
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate("DROP TABLE IF EXISTS " + TABLE_NAME);
                }
            }
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(CREATE_TABLE_SQL);
            }
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error initialising products table: " + e.getMessage());
        }
    }

    // ── Schema validation ─────────────────────────────────────────────────────
    private boolean shouldResetTable(Connection conn) throws SQLException {
        Set<String> columns = new HashSet<>();
        DatabaseMetaData meta = conn.getMetaData();
        try (ResultSet rs = meta.getColumns(null, null, TABLE_NAME, null)) {
            while (rs.next()) {
                columns.add(rs.getString("COLUMN_NAME").toLowerCase());
            }
        }
        if (columns.isEmpty()) return false;   // table doesn't exist yet — no reset needed
        return !(columns.contains("id")
                && columns.contains("name")
                && columns.contains("category")
                && columns.contains("brand")
                && columns.contains("price")
                && columns.contains("discount")
                && columns.contains("rating"));
    }

    // ── Helper: map a ResultSet row → Product ─────────────────────────────────
    private Product mapProduct(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId(rs.getString("id"));
        p.setName(rs.getString("name"));
        p.setCategory(rs.getString("category"));
        p.setBrand(rs.getString("brand"));
        p.setPrice(rs.getInt("price"));
        p.setDiscount(rs.getInt("disco unt"));
        p.setRating(rs.getDouble("rating"));
        return p;
    }

    // ========================= INSERT ========================================

    @Override
    public void addProduct(Product product) {
        String sql = "INSERT INTO products (id, name, category, brand, price, discount, rating) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, product.getId());
            pstmt.setString(2, product.getName());
            pstmt.setString(3, product.getCategory());
            pstmt.setString(4, product.getBrand());
            pstmt.setInt(5, product.getPrice());
            pstmt.setInt(6, product.getDiscount());
            pstmt.setDouble(7, product.getRating());
            int rows = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rows);
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error adding product: " + e.getMessage());
        }
    }

    // ========================= SELECT ========================================

    @Override
    public Product getProductById(String id) {
        String sql = "SELECT * FROM products WHERE id = ?";
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Product product = mapProduct(rs);
                DBManager.closeConnection(conn);
                return product;
            }
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error finding product: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        List<Product> list = new ArrayList<>();
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) list.add(mapProduct(rs));
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error retrieving products: " + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Product> findByCategory(String category) {
        String sql = "SELECT * FROM products WHERE category = ?";
        List<Product> list = new ArrayList<>();
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, category);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) list.add(mapProduct(rs));
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error finding products by category: " + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Product> findByBrand(String brand) {
        String sql = "SELECT * FROM products WHERE brand = ?";
        List<Product> list = new ArrayList<>();
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, brand);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) list.add(mapProduct(rs));
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error finding products by brand: " + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Product> findByName(String name) {
        String sql = "SELECT * FROM products WHERE name ILIKE ?";   // case-insensitive search
        List<Product> list = new ArrayList<>();
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) list.add(mapProduct(rs));
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error finding products by name: " + e.getMessage());
        }
        return list;
    }

    // ========================= UPDATE ========================================

    @Override
    public void updateProduct(String id, Product product) {
        String sql = "UPDATE products SET name = ?, category = ?, brand = ?, price = ?, discount = ?, rating = ? WHERE id = ?";
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, product.getName());
            pstmt.setString(2, product.getCategory());
            pstmt.setString(3, product.getBrand());
            pstmt.setInt(4, product.getPrice());
            pstmt.setInt(5, product.getDiscount());
            pstmt.setDouble(6, product.getRating());
            pstmt.setString(7, id);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rows);
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error updating product: " + e.getMessage());
        }
    }

    // ========================= DELETE ========================================

    @Override
    public void deleteProduct(String id) {
        String sql = "DELETE FROM products WHERE id = ?";
        try {
            Connection conn = DBManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rows);
            DBManager.closeConnection(conn);
        } catch (SQLException e) {
            System.out.println("Error deleting product: " + e.getMessage());
        }
    }
}