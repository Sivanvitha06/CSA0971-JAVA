import java.util.Arrays;
import java.util.Scanner;

class NthLargestNumber {

    public static int findNthLargest(int[] arr, int N) {
        if (N <= 0 || N > arr.length) {
            throw new IllegalArgumentException("N must be between 1 and the size of the array.");
        }

        // Sort the array in descending order
        Arrays.sort(arr);
        int length = arr.length;
        return arr[length - N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array
            System.out.println("Enter the array elements separated by spaces:");
            String[] inputArray = scanner.nextLine().split(" ");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            // Input N
            System.out.print("Enter the value of N: ");
            String inputN = scanner.nextLine();

            int N;
            try {
                N = Integer.parseInt(inputN);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for N. Please enter a positive integer.");
                return;
            }

            // Calculate and display the Nth largest number
            try {
                int result = findNthLargest(arr, N);
                System.out.println(N + "th Largest number: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}