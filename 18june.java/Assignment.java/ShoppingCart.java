public class ShoppingCart {

    private String productName;
    private double price;
    private int quantity;

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getFinalAmount() {
        double total = price * quantity;

        if (total > 5000) {
            total = total - (total * 10 / 100);
        }

        return total;
    }

    // Main Method
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setProductName("Laptop");
        cart.setPrice(6000);
        cart.setQuantity(1);

        System.out.println("Product Name: " + cart.getProductName());
        System.out.println("Final Payable Amount: ₹" + cart.getFinalAmount());
    }
}