package Module2.day2.DAO_Package.Product.dao;

import Module2.day2.DAO_Package.Product.Entity.Product;

public interface ProductDao {
    void save(Product product);
    void delete(int id);
    Iterable<Product> findAll();
    Product findById(int id);
    Iterable<Product> findByName(String name);
    Iterable<Product> findByPrice(double price);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> sortByNameAsc();
    Iterable<Product> sortByNameDesc();
}

