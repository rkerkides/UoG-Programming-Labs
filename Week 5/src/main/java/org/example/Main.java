package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter an integer!");
                String line = scanner.nextLine();
                Scanner scan = new Scanner(line);
                int number = scan.nextInt();
                System.out.println("You chose " + number + "!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Not an integer! Try again.");
            }
        }
        Person john = new Person("John", 23, 190);
        BankAccount johnBank = new SavingsAccount(john, 10);
        johnBank.withdrawFunds(2313123);
    }
}