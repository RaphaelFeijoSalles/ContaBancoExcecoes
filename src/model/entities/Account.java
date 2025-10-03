package model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setWithdrawLimit(Double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        this.balance -= amount;
    }

}
