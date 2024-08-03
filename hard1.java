import java.util.Scanner;
 class hard1 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaffUsers = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Staff Users: " + staffUsers);
        System.out.println("Non-Teaching Staff Users: " + nonTeachingStaffUsers);
        System.out.println("Student Users: " + studentUsers);
    }
}