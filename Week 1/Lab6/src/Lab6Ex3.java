import java.util.Random;
import java.util.Scanner;

public class Lab6Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        if (guessLoop(randomNum)) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Nope! Try again.");
        }

    }

    public static boolean guessLoop(int number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess!");
        for (int i = 1; i <= 10; i++) {
            int guess = scan.nextInt();
            if (guess == number) {
                return true;
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
        return false;
    }

}
