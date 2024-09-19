// A class with an explicitly defined parameterized constructor
class MyClass {
    // Parameterized constructor
    public MyClass(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }

    // Some fields or methods can be added here
}

public class NoDefaultConstructorDemo {
    public static void main(String[] args) {
        // Attempting to create an object without a default constructor
        // This will result in a compilation error
        // Uncommenting the line below will result in a compilation error
        // MyClass myObject = new MyClass();

        // Creating an object of MyClass using the parameterized constructor
        MyClass myObjectWithParameter = new MyClass(42);

        // You can perform operations with the object as needed
        // For this example, let's just print the object's reference
        System.out.println("Object reference: " + myObjectWithParameter);
    }
}
