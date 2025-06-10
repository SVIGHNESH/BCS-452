class Vehicle {
  protected String brand;
  protected String model;

  public Vehicle() {
    System.out.println("Vehicle default constructor");
    this.brand = "Unknown";
    this.model = "Unknown";
  }

  public Vehicle(String brand, String model) {
    System.out.println("Vehicle parameterized constructor");
    this.brand = brand;
    this.model = model;
  }

  public void displayVehicle() {
    System.out.println("Vehicle: " + brand + " " + model);
  }
}

class Car extends Vehicle {
  private int doors;

  public Car() {
    super(); // Calls parent's default constructor
    System.out.println("Car default constructor");
    this.doors = 4;
  }

  public Car(String brand, String model, int doors) {
    super(brand, model); // Calls parent's parameterized constructor
    System.out.println("Car parameterized constructor");
    this.doors = doors;
  }

  public void displayCar() {
    super.displayVehicle(); // Calls parent's method
    System.out.println("Doors: " + doors);
  }
}

public class SuperConstructorDemo {
  public static void main(String[] args) {

    Car car1 = new Car();
    car1.displayCar();

    Car car2 = new Car("TATA", "SAFARI", 4);
    car2.displayCar();
  }
}
