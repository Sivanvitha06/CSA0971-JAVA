// Superclass with a parameterized constructor
class SuperClass {
    int value;

    // Parameterized constructor
    SuperClass(int value) {
        this.value = value;
        System.out.println("SuperClass constructor called with value: " + value);
    }

    // Method to display the value
    void display() {
        System.out.println("SuperClass value: " + value);
    }
}

// Subclass hiding the display method of the superclass
class SubClass extends SuperClass {

    int value;

    // Parameterized constructor
    SubClass(int superValue, int subValue) {
        super(superValue); // Call the parameterized constructor of the superclass
        this.value = subValue;
        System.out.println("SubClass constructor called with value: " + subValue);
    }

    // Method to display the value
    @Override
    void display() {
        System.out.println("SubClass value: " + value);
    }

    // Method to display values from both superclass and subclass
    void showValues() {
        System.out.print("Superclass value: ");
        super.display(); // Call the superclass display method
        System.out.println("Subclass value: " + value);
    }
}

class MemberHidingExample {

    public static void main(String[] args) {
        // Create an instance of SubClass
        SubClass obj = new SubClass(100, 200);

        // Display values
        obj.showValues();
    }
}