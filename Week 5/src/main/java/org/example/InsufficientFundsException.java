package org.example;

class InsufficientFundsException extends RuntimeException {
    private double balance;
    private double amount;

    public InsufficientFundsException(double balance, double amount) {
        super(String.format("Insufficient funds: balance is %.2f, attempted withdrawal is %.2f", balance, amount));
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}