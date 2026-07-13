public class Ride {

    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public double getFinalFare() {

        double baseFare = distanceTravelled * pricePerKm;
        double finalFare = baseFare * surgeMultiplier;

        // 10% discount for distance > 20 km
        if (distanceTravelled > 20) {
            finalFare = finalFare - (finalFare * 10 / 100);
        }

        // ₹50 service charge if surge > 1.5
        if (surgeMultiplier > 1.5) {
            finalFare = finalFare + 50;
        }

        return finalFare;
    }

    // Main Method
    public static void main(String[] args) {

        Ride ride = new Ride();

        ride.setCustomerName("Aditya");
        ride.setDistanceTravelled(25);
        ride.setPricePerKm(15);
        ride.setSurgeMultiplier(1.8);

        System.out.println("Customer Name: " + ride.getCustomerName());
        System.out.println("Final Fare: ₹" + ride.getFinalFare());
    }
}