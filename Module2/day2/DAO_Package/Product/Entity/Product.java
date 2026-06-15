package Module2.day2.DAO_Package.Product.Entity;

public class Product {
    private int pid;
    private String name;
    private double price;
    private String category;
    public Product(int pid, String name, double price, String category) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Price: " + price + ", Category: " + category);
    }

    @Override
    public String toString() {
        return "Product{pid=" + pid + ", name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

