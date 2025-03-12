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

    public Account(String accountHolder, int accountNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
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
