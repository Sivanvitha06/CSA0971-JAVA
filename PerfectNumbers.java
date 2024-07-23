import java.util.Scanner;
class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of perfect numbers to find
        System.out.print("Enter the number of perfect numbers to find: ");
        int n = scanner.nextInt();

        System.out.println("First " + n + " perfect numbers are:");
        int count = 0;
        int num = 2; // Start checking from 2
        
        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        scanner.close();
    }

    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is a proper divisor of every number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}