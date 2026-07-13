public class BankAccount {

    {
        System.out.println("Account Initialization Started");
    }

    private String customerName;
    private double balance;
    private String accountType;

    public BankAccount() {
        this("Unknown", 0);
    }

    public BankAccount(String customerName) {
        this(customerName, 0);
    }

    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;

        System.out.println("Customer: " + this.customerName);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        new BankAccount("Amit", 5000);
    }
}