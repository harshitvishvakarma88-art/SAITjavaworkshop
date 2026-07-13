public class Product {

    {
        System.out.println("Product Management Started");
        category = "General";
    }

    private String name;
    private double price;
    private String category;

    public Product() {
        this("Unknown", 0, "General");
    }

    public Product(String name) {
        this(name, 0, "General");
    }

    public Product(String name, double price) {
        this(name, price, "General");
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;

        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    public static void main(String[] args) {
        new Product("Laptop", 60000, "Electronics");
    }
}