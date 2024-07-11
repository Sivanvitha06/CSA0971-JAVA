import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        if (days >= 0) {
            int years = days / 365;
            int remainingDays = days % 365;
            int weeks = remainingDays / 7;
            int finalDays = remainingDays % 7;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + finalDays);
        } else {
            System.out.println("Invalid input: Days cannot be negative.");
        }
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            LocalDate date = LocalDate.of(year, month, day);
            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

            System.out.println("The day of the week is: " + dayOfWeek);
        } else {
            System.out.println("Invalid date.");
        }

        scanner.close();
    }

    private static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}