import java.util.Scanner;

class CharacterCounter {

    public static void main(String[] args) {
        // Initialize counters
        int countUppercase = 0;
        int countLowercase = 0;
        int countDigits = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter * to exit…");

        while (true) {
            System.out.print("Enter any character: ");
            String input = scanner.nextLine();

            // Check if input is a single character
            if (input.length() != 1) {
                System.out.println("Please enter only one character.");
                continue;
            }

            char ch = input.charAt(0);

            if (ch == '*') {
                break;
            } else if (Character.isUpperCase(ch)) {
                countUppercase++;
            } else if (Character.isLowerCase(ch)) {
                countLowercase++;
            } else if (Character.isDigit(ch)) {
                countDigits++;
            }
        }

        // Output the results
        System.out.println("Total count of lower case: " + countLowercase);
        System.out.println("Total count of upper case: " + countUppercase);
        System.out.println("Total count of numbers: " + countDigits);

        scanner.close();
    }
}