import java.util.Scanner;

public class Lab5Ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the circle radius");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();
        summariseCircle(radius);
    }

    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double compCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void summariseCircle(double radius) {
        System.out.println("For a circle of radius " + radius + " - Area: " + computeArea(radius) + ", Circumference: " + compCircumference(radius));
    }
}
