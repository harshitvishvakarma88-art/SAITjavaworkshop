public class HotelBooking {

    {
        System.out.println("Booking Initialized");
    }

    private String customer;
    private String roomType = "Standard";

    public HotelBooking() {
        this("Guest", "Standard");
    }

    public HotelBooking(String customer) {
        this(customer, "Standard");
    }

    public HotelBooking(String customer, String roomType) {
        this.customer = customer;
        this.roomType = roomType;

        System.out.println("Customer: " + customer);
        System.out.println("Room Type: " + roomType);
    }

    public static void main(String[] args) {
        new HotelBooking("Aman", "Deluxe");
    }
}