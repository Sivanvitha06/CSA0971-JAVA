import java.util.*;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the denominations available
        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[4];

        // Get the priority of denominations from the user
        System.out.println("Enter the priority of denominations (e.g., 0 for 2000, 1 for 500, 2 for 200, 3 for 100):");
        int[] priority = new int[4];
        for (int i = 0; i < 4; i++) {
            priority[i] = sc.nextInt();
        }

        // Get the number of notes for each denomination from the user
        System.out.println("Enter the number of notes for each denomination in the order of the priority provided:");
        for (int i = 0; i < 4; i++) {
            notes[priority[i]] = sc.nextInt();
        }

        // Calculate the total amount available in the ATM
        int totalAmount = 0;
        for (int i = 0; i < 4; i++) {
            totalAmount += denominations[i] * notes[i];
        }

        // Display the total available balance
        System.out.println("Total amount available in the ATM: " + totalAmount);
    }
}