package Module2.WeeklyAssignment.Product.Entity;

public class Product {
    private String id;
    private String name;
    private String category;
    private String brand;
    private int price;
    private int discount;
    private double rating;

    public Product() {}

    public Product(int price, String brand, String category, int discount, String name, String id, double rating) {
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.name = name;
        this.id = id;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{ Id: " + id + " | Name: " + name + " | Category: " + category
                + " | Brand: " + brand + " | Price: " + price
                + " | Discount: " + discount + "% | Rating: " + rating + " }";
    }

    public String getId()           { return id; }
    public void setId(String id)    { this.id = id; }

    public String getName()             { return name; }
    public void setName(String name)    { this.name = name; }

    public String getCategory()                 { return category; }
    public void setCategory(String category)    { this.category = category; }

    public String getBrand()            { return brand; }
    public void setBrand(String brand)  { this.brand = brand; }

    public int getPrice()           { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getDiscount()                { return discount; }
    public void setDiscount(int discount)   { this.discount = discount; }

    public double getRating()               { return rating; }
    public void setRating(double rating)    { this.rating = rating; }
}