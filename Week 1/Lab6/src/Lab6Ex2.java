import java.util.Scanner;

public class Lab6Ex2 {
    public static void main(String[] args) {
        System.out.println("Up to which number?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        while (i < num) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1 ) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
