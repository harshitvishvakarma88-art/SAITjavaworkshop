public class LibraryBook {

    private String bookName;
    private int daysLate;
    private double finePerDay;

    // Setters
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public double getTotalFine() {
        double totalFine = daysLate * finePerDay;

        if (daysLate > 10) {
            totalFine = totalFine + 100;
        }

        return totalFine;
    }

    // Main Method
    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();

        book.setBookName("Java Programming");
        book.setDaysLate(12);
        book.setFinePerDay(20);

        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Total Fine: ₹" + book.getTotalFine());
    }
}