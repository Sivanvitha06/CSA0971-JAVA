import java.util.Scanner;

class DecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
    }
}