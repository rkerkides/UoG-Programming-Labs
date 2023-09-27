import java.util.Scanner;

public class Lab5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name and your age with a space in between");
        String data = scanner.nextLine();
        Scanner secondScanner = new Scanner(data);
        String name = secondScanner.next();
        int age = secondScanner.nextInt();
        System.out.println(name);
    }
}
