package org.example;

public class SavingsAccount extends BankAccount{

    private double interestRate;
    public SavingsAccount(Person person, double interestRate) {
        super(person);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        super.depositFunds(interestRate/100.0);
    }

    public String toString() {
        return "Different here!";
    }
}
