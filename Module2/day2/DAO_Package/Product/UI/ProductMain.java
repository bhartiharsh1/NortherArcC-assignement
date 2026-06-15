package Module2.day2.DAO_Package.Product.UI;

import Module2.day2.DAO_Package.Product.Entity.Product;
import Module2.day2.DAO_Package.Product.dao.ProductDao;
import Module2.day2.DAO_Package.Product.dao.ProductDaoImplementor;

public class ProductMain {
    public static void main(String[] args) {
        ProductDao dao = new ProductDaoImplementor();

        dao.save(new Product(101, "Laptop", 65000, "Electronics"));
        dao.save(new Product(102, "Mouse", 500, "Electronics"));
        dao.save(new Product(103, "Shirt", 1200, "Clothing"));
        dao.save(new Product(104, "Laptop", 70000, "Electronics"));

        System.out.println("All Products");
        for (Product p : dao.findAll()) {
            System.out.println(p);
        }

        System.out.println("\nFind By ID");
        System.out.println(dao.findById(102));

        System.out.println("\nFind By Name");
        for (Product p : dao.findByName("Laptop")) {
            System.out.println(p);
        }

        System.out.println("\nFind By Price");
        for (Product p : dao.findByPrice(500)) {
            System.out.println(p);
        }

        System.out.println("\nFind By Category");
        for (Product p : dao.findByCategory("Electronics")) {
            System.out.println(p);
        }

        System.out.println("\nSort By Name Asc");
        for (Product p : dao.sortByNameAsc()) {
            System.out.println(p);
        }

        System.out.println("\nSort By Name Desc");
        for (Product p : dao.sortByNameDesc()) {
            System.out.println(p);
        }
    }
}

