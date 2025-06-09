class MyClass {
  private String message;

  // Private constructor
  private MyClass(String msg) {
    this.message = msg;
    System.out.println("Private constructor called: " + msg);
  }

  // Method 1: Static factory method
  public static MyClass createInstance(String msg) {
    return new MyClass(msg);
  }

  // Method 2: Static method that uses private constructor
  public static void demonstratePrivateConstructor() {
    MyClass obj = new MyClass("Created using static method");
    obj.display();
  }

  public void display() {
    System.out.println("Message: " + message);
  }
}

public class PrivateConstructorDemo {
  public static void main(String[] args) {
    System.out.println("Calling private constructor outside the class:\n");

    // Method 1: Using static factory method
    System.out.println("Method 1: Using static factory method");
    MyClass obj1 = MyClass.createInstance("Hello from factory method");
    obj1.display();

    System.out.println("\nMethod 2: Using static method");
    MyClass.demonstratePrivateConstructor();

    // This would cause compilation error:
    // MyClass obj = new MyClass("Direct call"); // ERROR!
  }
}
