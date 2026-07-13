public class HotelBooking {

    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    // Setters
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // Getters
    public String getGuestName() {
        return guestName;
    }

    public double getFinalBill() {
        double totalBill = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7) {
            totalBill = totalBill - (totalBill * 15 / 100);
        }

        return totalBill;
    }

    // Main Method
    public static void main(String[] args) {

        HotelBooking booking = new HotelBooking();

        booking.setGuestName("Aditya");
        booking.setRoomPricePerNight(2000);
        booking.setNumberOfNights(8);

        System.out.println("Guest Name: " + booking.getGuestName());
        System.out.println("Final Bill: ₹" + booking.getFinalBill());
    }
}