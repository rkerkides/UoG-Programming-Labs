public class Main {
    public static void main(String[] args) {
        String month = "Jan";
        int year = 2000;
        int numberOfDays = daysInMonth(year, month);
        System.out.println(numberOfDays);
        int age = compAge(18,3,2000);
        System.out.println(age);
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static int daysInMonth(int year, String month) {
        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            return 31;
        } else if (month.equals("Feb")) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
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
