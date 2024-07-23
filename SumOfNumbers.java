import java.util.Scanner;

class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements must be positive.");
            return;
        }

        int[] numbers = new int[n];

        // Input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        try {
            for (int i = 0; i <= n; i++) { // Note: Loop goes one step beyond array size
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Attempted to access index beyond array size.");
        }

        // Output result
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}