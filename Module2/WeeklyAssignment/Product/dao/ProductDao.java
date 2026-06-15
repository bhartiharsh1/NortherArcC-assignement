package Module2.WeeklyAssignment.Product.dao;

import Module2.WeeklyAssignment.Product.Entity.Product;

import java.util.List;

public interface ProductDao {

    // ================= INSERT =================
    void addProduct(Product product);

    // ================= SELECT =================
    Product getProductById(String id);
    List<Product> getAllProducts();
    List<Product> findByCategory(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByName(String name);

    // ================= UPDATE =================
    void updateProduct(String id, Product product);

    // ================= DELETE =================
    void deleteProduct(String id);
}