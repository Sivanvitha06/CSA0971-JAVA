import java.util.Hashtable;

class BankDetails {

    public static void main(String[] args) {
        // Create Hashtable
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        // i) Add 3 records
        bankDetails.put(1001, "Alice");
        bankDetails.put(1002, "Bob");
        bankDetails.put(1003, "Charlie");

        // ii) Display the size of Hashtable
        System.out.println("Size of Hashtable: " + bankDetails.size());

        // iii) Clear the Hashtable
        bankDetails.clear();
        System.out.println("Hashtable cleared.");
    }
}