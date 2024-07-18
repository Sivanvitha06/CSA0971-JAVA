import java.util.Scanner;
class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        String vowels = "";
        String consonants = "";

        // Convert the word to lowercase for easier comparison
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch;
            } 
            // Check if the character is a letter and not a vowel (thus a consonant)
            else if (Character.isLetter(ch)) {
                consonants += ch;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}