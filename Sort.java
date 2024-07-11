import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        // Input names
        int numberOfNames = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.println("Enter the number of names:");
                numberOfNames = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();  // Clear the invalid input
            }
        }

        System.out.println("Enter the names:");
        for (int i = 0; i < numberOfNames; i++) {
            names.add(scanner.nextLine());
        }

        // Sort names
        Collections.sort(names);

        // Output sorted names
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
