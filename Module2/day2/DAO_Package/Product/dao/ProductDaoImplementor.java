package Module2.day2.DAO_Package.Product.dao;

import Module2.day2.DAO_Package.Product.Entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDaoImplementor implements Module2.day2.DAO_Package.Product.dao.ProductDao {

    private final List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        products.removeIf(p -> p.getPid() == id);
    }

    @Override
    public Iterable<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public Product findById(int id) {
        return products.stream()
                .filter(p -> p.getPid() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Iterable<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findByPrice(double price) {
        return products.stream()
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> sortByNameAsc() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> sortByNameDesc() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                .collect(Collectors.toList());
    }
}
