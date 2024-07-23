import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee grade and salary
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);
        
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        
        double bonus = 0;

        // Calculate bonus based on grade
        if (grade == 'A' || grade == 'a') {
            bonus = 0.05 * salary;
        } else if (grade == 'B' || grade == 'b') {
            bonus = 0.10 * salary;
        } else {
            System.out.println("Invalid grade entered.");
            return;
        }

        // Additional bonus for salary less than $10,000
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

        double totalPay = salary + bonus;

        // Output the results
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + totalPay);

        scanner.close();
    }
}