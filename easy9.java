import java.util.Arrays;

class easy9 {
    public static void main(String arg[]) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int n = 3; // Change this value to find the Nth largest number

        int nthLargest = findNthLargest(array, n);
        System.out.println(n + "th largest number is " + nthLargest);
    }

    public static int findNthLargest(int[] array, int n) {
        Arrays.sort(array);
        return array[array.length - n];
    }
}