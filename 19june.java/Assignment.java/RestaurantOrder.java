public class RestaurantOrder {

    {
        System.out.println("New Order Started");
    }

    private String item;
    private int quantity;

    public RestaurantOrder() {
        this("Basic Item", 1);
    }

    public RestaurantOrder(String item) {
        this(item, 1);
    }

    public RestaurantOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        new RestaurantOrder("Pizza", 2);
    }
}