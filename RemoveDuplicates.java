import java.util.*;

class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize array
        int[] array = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Remove duplicates using a HashSet
        Set<Integer> uniqueItems = new LinkedHashSet<>();
        for (int num : array) {
            uniqueItems.add(num);
        }

        // Convert Set to List for display
        List<Integer> resultList = new ArrayList<>(uniqueItems);

        // Output the result
        System.out.println("Non-duplicate items:");
        System.out.println(resultList);

        scanner.close();
    }
}