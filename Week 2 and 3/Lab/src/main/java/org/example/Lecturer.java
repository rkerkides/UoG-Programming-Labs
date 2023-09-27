package org.example;

public class Lecturer extends Person {
    private double salary;
    public Lecturer(String s, int a, int h, double salary) {
        super(s, a, h);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
