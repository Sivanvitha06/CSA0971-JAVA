import java.util.Scanner;

class FactorialCalculator {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of n: ");
            String input = scanner.nextLine();

            // Validate input
            int n;
            try {
                n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                return;
            }

            // Calculate and display the factorial
            long result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}