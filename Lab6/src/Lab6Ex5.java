public class Lab6Ex5 {
    public static void main(String[] args) {
        intDiv(6.3, 4);
        System.out.println(pad("john", "@", 24));
    }
    public static void intDiv(double a, double b) {
        int div = (int) (a / b);
        double remainder = a % b;
        System.out.println(b + " can fit into " + a + " " + div + " times, with a remainder of " + remainder);
    }

    public static String pad(String string, String padding, int length) {
        while (string.length() < length) {
            string = padding + string;
        }
        return string;
    }
}
