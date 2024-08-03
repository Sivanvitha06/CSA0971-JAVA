import java.util.Scanner;

class Factorss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        System.out.print("N = ");
        int N = scanner.nextInt();
        int count = 0;
        int nthFactor = -1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == N) {
                    nthFactor = i;
                }
            }
        }
        System.out.println("Number of factors = " + count);
        if (nthFactor != -1) {
            System.out.println(N + "th factor of " + number + " = " + nthFactor);
        } else {
            System.out.println("The " + N + "th factor does not exist.");
        } 
        scanner.close();
    }
}
