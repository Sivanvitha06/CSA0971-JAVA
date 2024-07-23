import java.util.Scanner;
class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Arithmetic operations
        try {
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2; // May throw ArithmeticException
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
    }
}