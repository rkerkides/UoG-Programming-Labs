package org.example;

public class Student extends Person {
    private double GPA;
    public Student(String s, int a, int h, double GPA) {
        super(s, a, h);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format("Student %s is %d years old, %dcm tall, and has a GPA of %1.1f", super.getName(), super.getAge(), super.getHeight(), getGPA());
    }
}
