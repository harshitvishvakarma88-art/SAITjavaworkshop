public class MobilePhone {

    {
        System.out.println("Inventory Entry Started");
    }

    private String brand;
    private String model;
    private double price;

    public MobilePhone() {
        this("Samsung", "Basic", 0);
    }

    public MobilePhone(String model) {
        this("Samsung", model, 0);
    }

    public MobilePhone(String model, double price) {
        this("Samsung", model, price);
    }

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        new MobilePhone("S24", 65000);
    }
}