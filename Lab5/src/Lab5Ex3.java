import java.util.Scanner;

public class Lab5Ex3 {
    public static void main(String[] args) {
        System.out.println("DOB: d m y");
        Scanner scanner = new Scanner(System.in);
        String dob = scanner.nextLine();
        Scanner scanner1 = new Scanner(dob);
        int day = scanner1.nextInt();
        int month = scanner1.nextInt();
        int year = scanner1.nextInt();
        int age = compAge(day, month, year);
        System.out.println(age);
    }

    public static int compAge(int day, int month, int year) {
        int dayToday = 18;
        int monthToday = 9;
        int yearToday = 2023;
        int age = 0;
        if (month > monthToday) {
            age = yearToday - year - 1;
        } else if (month == monthToday && day>dayToday) {
            age = yearToday - year - 1;
        } else {
            age = yearToday - year;
        }
        return age;
    }
}

