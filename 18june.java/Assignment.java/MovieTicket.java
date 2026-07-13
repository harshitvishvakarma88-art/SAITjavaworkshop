public class MovieTicket {

    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public double getTotalPrice() {
        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total = total - (total * 5 / 100);
        }

        return total;
    }

    // Main Method
    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.setMovieName("Pushpa 2");
        ticket.setTicketPrice(200);
        ticket.setNumberOfTickets(6);

        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Total Price: ₹" + ticket.getTotalPrice());
    }
}