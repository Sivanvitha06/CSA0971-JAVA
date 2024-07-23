import java.util.Scanner;

class BinaryConverter {

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        // Convert the integer part
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    // Method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Method to convert binary to decimal and octal
    public static void convertBinary(String binary) {
        // Split the binary input into integer and fractional parts
        String[] parts = binary.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        try {
            int decimalIntegerPart = binaryToDecimal(integerPart);

            // Convert the integer part to octal
            String octalIntegerPart = decimalToOctal(decimalIntegerPart);

            System.out.println("Decimal Number: " + decimalIntegerPart);
            System.out.println("Octal: " + octalIntegerPart);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        String binaryInput = scanner.nextLine();

        // Validate binary input
        if (binaryInput.matches("[01]+(\\.[01]+)?")) {
            convertBinary(binaryInput);
        } else {
            System.out.println("Invalid binary number format.");
        }

        scanner.close();
    }
}