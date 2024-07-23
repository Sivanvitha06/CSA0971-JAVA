class Student {
    private String name;
    private int registerNumber;
    private int[] marks;
    
    // Constructor
    public Student(String name, int registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }
    
    // Method to calculate total and average
    public void displayDetails() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / (double) marks.length;
        
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Marks: ");
        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
    
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 76}; // Example marks
        Student student = new Student("John Doe", 12345, marks);
        student.displayDetails();
    }
}