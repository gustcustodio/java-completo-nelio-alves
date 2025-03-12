package secao09.entities;

public class Account {
    private String accountHolder;
    private int accountNumber;
    private double accountBalance;

    public Account() {

    }

    public Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public Account(String accountHolder, int accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double deposit) {
        accountBalance += deposit;
    }

    public void withdraw(double withdraw) {
        accountBalance -= withdraw + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder:  "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }
}
