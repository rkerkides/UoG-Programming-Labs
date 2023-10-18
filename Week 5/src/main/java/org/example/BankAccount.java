package org.example;

public class BankAccount {
    private Person person;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 0;

    public BankAccount(Person person) {
        this.person = person;
        this.accountNumber = nextAccountNumber;
        this.balance = 0.0;
        nextAccountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositFunds(double fundsToDeposit) {
        this.balance += fundsToDeposit;
    }

    public void withdrawFunds(double fundsToWithdraw) {
        if (this.balance >= fundsToWithdraw) {
            this.balance -= fundsToWithdraw;
        } else {
            throw new InsufficientFundsException(this.balance, fundsToWithdraw);
        }
    }

    public void transferFunds(BankAccount receiver, double fundsToTransfer) {
        if (this.balance >= fundsToTransfer) {
            withdrawFunds(fundsToTransfer);
            receiver.depositFunds(fundsToTransfer);
        } else {
            throw new InsufficientFundsException(this.balance, fundsToTransfer);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + person.getName() + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
