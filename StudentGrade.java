import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for four subjects
        System.out.print("Enter the marks in Python: ");
        int marksPython = scanner.nextInt();
        
        System.out.print("Enter the marks in C Programming: ");
        int marksCProgramming = scanner.nextInt();
        
        System.out.print("Enter the marks in Mathematics: ");
        int marksMathematics = scanner.nextInt();
        
        System.out.print("Enter the marks in Physics: ");
        int marksPhysics = scanner.nextInt();
        
        // Calculate total and aggregate
        int totalMarks = marksPython + marksCProgramming + marksMathematics + marksPhysics;
        double aggregate = totalMarks / 4.0;
        
        // Determine grade
        String grade;
        if (aggregate > 75) {
            grade = "DISTINCTION";
        } else if (aggregate >= 60) {
            grade = "First Division";
        } else if (aggregate >= 50) {
            grade = "Second Division";
        } else if (aggregate >= 40) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }
        
        // Output the results
        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);
        System.out.println(grade);
        
        scanner.close();
    }
}