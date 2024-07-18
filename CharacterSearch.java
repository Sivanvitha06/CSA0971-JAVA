import java.util.Scanner;
class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter a character to search:");
        char searchChar = scanner.next().charAt(0);

        // Initialize a variable to keep track of the index
        int index = -1;

        // Iterate through the string to find the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i;
                break; // Exit the loop once the character is found
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("The character '" + searchChar + "' is present at index " + index + ".");
        } else {
            System.out.println("The character '" + searchChar + "' is not present in the string.");
        }

        scanner.close();
    }
}