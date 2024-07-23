import java.util.Scanner;

class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        scanner.close();

        // i) Replace any word
        String replacedStr = str.replace("Saveetha", "NewName");
        System.out.println("Replaced String: " + replacedStr);

        // ii) Find the length
        int length = str.length();
        System.out.println("Length of the String: " + length);

        // iii) Uppercase Conversion
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseStr);
    }
}