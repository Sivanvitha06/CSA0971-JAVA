import java.util.Scanner;

class AverageCalculator {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0, countNegative = 0;
        double sumPositive = 0, sumNegative = 0;

        System.out.println("Enter -1 to exit...");
        
        while (true) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            
            if (num == -1) {
                break;
            }
            
            if (num > 0) {
                sumPositive += num;
                countPositive++;
            } else if (num < 0) {
                sumNegative += num;
                countNegative++;
            }
        }
        
        // Calculate averages
        double averagePositive = countPositive == 0 ? 0 : sumPositive / countPositive;
        double averageNegative = countNegative == 0 ? 0 : sumNegative / countNegative;
        
        // Output the results
        System.out.println("The average of negative numbers is: " + averageNegative);
        System.out.println("The average of positive numbers is: " + averagePositive);
        
        scanner.close();
    }
}