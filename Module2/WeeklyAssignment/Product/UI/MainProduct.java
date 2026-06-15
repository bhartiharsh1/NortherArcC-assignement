package Module2.WeeklyAssignment.Product.UI;

import Module2.WeeklyAssignment.Product.Entity.Product;
import Module2.WeeklyAssignment.Product.dao.ProductDao;
import Module2.WeeklyAssignment.Product.dao.ProductDaoImpl;

import java.util.List;
import java.util.Scanner;

public class MainProduct {

    private static final Scanner sc = new Scanner(System.in);
    private static final ProductDao productDao = new ProductDaoImpl();

    public static void main(String[] args) {

        int choice;

        do {
            printMenu();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();   // consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateProduct();
                case 3 -> deleteProduct();
                case 4 -> getProductById();
                case 5 -> getAllProducts();
                case 6 -> findByCategory();
                case 7 -> findByBrand();
                case 8 -> findByName();
                case 9 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 9);
    }

    // ========================= MENU ==========================================

    static void printMenu() {
        System.out.println("\n===== PRODUCT MANAGEMENT MENU =====");
        System.out.println("--- INSERT ---");
        System.out.println("1. Add Product");
        System.out.println("--- SELECT ---");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Get Product By ID");
        System.out.println("5. Get All Products");
        System.out.println("6. Find By Category");
        System.out.println("7. Find By Brand");
        System.out.println("8. Find By Name");
        System.out.println("9. Exit");
    }

    // ========================= HELPER METHODS ================================

    static void addProduct() {
        System.out.print("Product ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Price: ");
        int price = sc.nextInt();

        System.out.print("Discount (%): ");
        int discount = sc.nextInt();

        System.out.print("Rating (0.0 - 5.0): ");
        double rating = sc.nextDouble();
        sc.nextLine();

        productDao.addProduct(new Product(price, brand, category, discount, name, id, rating));
    }

    static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String updateId = sc.nextLine();

        System.out.println("Enter new details:");

        System.out.print("New Name: ");
        String newName = sc.nextLine();

        System.out.print("New Category: ");
        String newCategory = sc.nextLine();

        System.out.print("New Brand: ");
        String newBrand = sc.nextLine();

        System.out.print("New Price: ");
        int newPrice = sc.nextInt();

        System.out.print("New Discount (%): ");
        int newDiscount = sc.nextInt();

        System.out.print("New Rating (0.0 - 5.0): ");
        double newRating = sc.nextDouble();
        sc.nextLine();

        productDao.updateProduct(updateId,
                new Product(newPrice, newBrand, newCategory, newDiscount, newName, updateId, newRating));
    }

    static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String deleteId = sc.nextLine();
        productDao.deleteProduct(deleteId);
    }

    static void getProductById() {
        System.out.print("Enter Product ID: ");
        String getId = sc.nextLine();
        Product product = productDao.getProductById(getId);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found with ID: " + getId);
        }
    }

    static void getAllProducts() {
        List<Product> products = productDao.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("\n--- All Products (" + products.size() + ") ---");
            products.forEach(System.out::println);
        }
    }

    static void findByCategory() {
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        List<Product> result = productDao.findByCategory(category);
        if (result.isEmpty()) {
            System.out.println("No products found in category: " + category);
        } else {
            System.out.println("\n--- Products in category: " + category + " ---");
            result.forEach(System.out::println);
        }
    }

    static void findByBrand() {
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        List<Product> result = productDao.findByBrand(brand);
        if (result.isEmpty()) {
            System.out.println("No products found for brand: " + brand);
        } else {
            System.out.println("\n--- Products by brand: " + brand + " ---");
            result.forEach(System.out::println);
        }
    }

    static void findByName() {
        System.out.print("Enter Name (or partial name): ");
        String name = sc.nextLine();
        List<Product> result = productDao.findByName(name);
        if (result.isEmpty()) {
            System.out.println("No products found matching: " + name);
        } else {
            System.out.println("\n--- Products matching: '" + name + "' ---");
            result.forEach(System.out::println);
        }
    }
}