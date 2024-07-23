import java.util.Arrays;
class MissingNumberFinder {
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6}; // Example array

        // Find the sum of first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Find the sum of elements in the array
        int arraySum = Arrays.stream(a).sum();

        // The missing number
        int missingNumber = totalSum - arraySum;

        System.out.println("The missing number is: " + missingNumber);
    }
}