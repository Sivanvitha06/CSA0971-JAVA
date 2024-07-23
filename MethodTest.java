class Parent {
    void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is child class");
    }
}

class MethodTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentChild = new Child();
        
        // 1. Method of parent class by object of parent class
        parent.print();
        
        // 2. Method of child class by object of child class
        child.print();
        
        // 3. Method of parent class by object of child class
        parentChild.print();
    }
}