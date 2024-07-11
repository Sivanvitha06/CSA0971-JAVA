import java.util.Scanner;

public class NumberAndSquareArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the lower and upper range from the user
        System.out.print("Enter the lower range: ");
        int lowerRange = input.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = input.nextInt();

        // Calculate the number of elements in the array
        int size = upperRange - lowerRange + 1;
        int[][] array = new int[size][2];

        // Populate the array
        for (int i = 0; i < size; i++) {
            int number = lowerRange + i;
            array[i][0] = number;
            array[i][1] = number * number;
        }

        // Print the array
        System.out.println("Number and its Square:");
        for (int i = 0; i < size; i++) {
            System.out.print(" (" + array[i][0] +","+ array[i][1]+")");
        }
    }
}
