package org.example;

public class Main {
    public static void main(String[] args) {
        var john = new Person("John", 24, 185);
        john.sayHello();
        System.out.println(john);

        var bank1 = new BankAccount(john);
        var bank2 = new BankAccount(new Person("Vanessa", 23, 156));

        System.out.println(bank1.getAccountNumber() + " " + bank2.getAccountNumber());
        bank1.depositFunds(5324.2);
        System.out.println(bank1);
        bank1.withdrawFunds(123.41);
        System.out.println(bank1);

        var bank3 = new BankAccount(john);
        bank1.transferFunds(bank3, 4213.23);
        System.out.println(bank3 + " " + bank1);
    }
}