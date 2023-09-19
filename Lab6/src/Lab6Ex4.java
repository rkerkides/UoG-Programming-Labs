import java.util.Scanner;

public class Lab6Ex4 {
    public static void main(String[] args) {
        System.out.println("Number of rows?");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        for (int i = 1; i<=rows; i++) {
            printSpace(rows-i);
            for (int j = 0; j<i; j++) {
                System.out.print(i);
                printSpace(1);
            }
            printSpace(rows-i);
            System.out.println();
        }
    }

    public static void printSpace(int num) {
        for (int i = 0; i<num; i++) {
            System.out.print(" ");
        }
    }
}
