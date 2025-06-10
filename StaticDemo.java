class StaticExample {
  // Static variable - shared by all instances
  static int count = 0;
  private String name;

  // Static initializer block
  static {
    System.out.println("Static initializer block executed");
    count = 100;
  }

  public StaticExample(String name) {
    this.name = name;
    count++; // Incrementing static variable
  }

  // Static method in same class
  public static void displayCount() {
    System.out.println("Current count: " + count);
  }

  public void display() {
    System.out.println("Name: " + name + ", Count: " + count);
  }
}

class AnotherClass {
  // Static method in different class
  public static void callStaticMethod() {
    System.out.println("Calling static method from different class:");
    StaticExample.displayCount(); // Calling static method from different class
  }
}

public class StaticDemo {
  public static void main(String[] args) {

    StaticExample.displayCount();

    StaticExample obj1 = new StaticExample("Object1");
    StaticExample obj2 = new StaticExample("Object2");

    obj1.display();
    obj2.display();

    AnotherClass.callStaticMethod();
  }
}
