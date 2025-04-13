package secao14.challenge.model.entities;

import secao14.challenge.model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws BusinessException {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) throws BusinessException {
        if (amount > getBalance()) {
            throw new BusinessException("Not enough balance");
        }
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("The amount exceeds withdraw limit");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number=" + number +
                ", holder='" + holder + '\'' +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
