public class Laptop {

    {
        System.out.println("Purchase Initialized");
    }

    private String model;
    private double price;
    private String warranty = "1 Year";

    public Laptop() {
        this("Unknown", 0);
    }

    public Laptop(String model) {
        this(model, 0);
    }

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;

        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty);
    }

    public static void main(String[] args) {
        new Laptop("Dell Inspiron", 55000);
    }
}