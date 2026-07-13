public class MovieTicket {

    {
        System.out.println("Booking Started");
    }

    private String movie;
    private String seat;

    public MovieTicket() {
        this("General", "A1");
    }

    public MovieTicket(String movie) {
        this(movie, "A1");
    }

    public MovieTicket(String movie, String seat) {
        this.movie = movie;
        this.seat = seat;

        System.out.println("Movie: " + movie);
        System.out.println("Seat No: " + seat);
    }

    public static void main(String[] args) {
        new MovieTicket("Avengers", "A12");
    }
}