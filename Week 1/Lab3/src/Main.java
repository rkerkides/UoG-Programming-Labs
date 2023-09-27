public class Main {
    public static void main(String[] args) {
        double r = 5.6;
        summariseCircle(r);

        String myString = "This is my string.";
        scopeShowcase(myString);
        System.out.println(myString);
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

    public static void scopeShowcase(String myString) {
        myString = myString + " While the variable is changed within the method," +
                " \nit won't change outside of it so this part will not be displayed!";
        System.out.println(myString);
    }
}