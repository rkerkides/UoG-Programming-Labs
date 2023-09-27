import java.util.Random;

public class Lab7Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        double randomInt = random.nextDouble(100);
        timesTable(randomInt, 99);

    }

    public static void timesTable(double number, int numOfEntries) {
        if (number < 0 || number > 99 || numOfEntries < 1 || numOfEntries > 99) {
            System.out.println("Invalid input. Please ensure the number is between 0 and 99, and numOfEntries is between 1 and 99.");
            return;
        }
        String original = String.format("%05.3f", number);
        if (number < 10) {
            original = "0" + original;
        }
        for (int i = 1; i <= numOfEntries; i++) {
            String currentNum = String.format("%02d", i);
            String product = String.format("%09.3f", i*number);
            System.out.println(original + " x " + currentNum + " = " + product);
        }
    }
}