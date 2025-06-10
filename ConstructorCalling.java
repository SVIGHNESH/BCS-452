class Child {
  private int age;

  public Child() {
    super(); // Calling parent's default constructor
    System.out.println("Child default constructor called");
    this.age = 0;
  }

  public Child(int age) {
    this(); // Calling same class default constructor
    System.out.println("Child constructor with age parameter");
    this.age = age;
  }

  public void display() {
    System.out.println(" Age: " + age);
  }
}

public class ConstructorCalling {
  public static void main(String[] args) {
    System.out.println("Demonstration of Constructor Calling:\n");

    Child child1 = new Child();
    child1.display();

    Child child3 = new Child(30);
    child3.display();
  }
}
