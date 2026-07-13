public class BankAccount {

    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Setters
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getRemainingBalance() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }

    // Main Method
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Aditya");
        acc.setBalance(10000);
        acc.setWithdrawAmount(3000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Remaining Balance: ₹" + acc.getRemainingBalance());
    }
}