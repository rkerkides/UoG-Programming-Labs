import java.util.Random;

public class Lab6Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        timesTable(randomInt, 5);

    }

    public static void timesTable(int number, int numOfEntries) {
        for (int i = 1; i <= numOfEntries; i++) {
            System.out.println(i*number);
        }
    }
}