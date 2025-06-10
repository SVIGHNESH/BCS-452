class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public void display() {
    System.out.println("Rectangle - Length: " + length + ", Width: " + width + ", Area: " + getArea());
  }

  // Getters
  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }
}

class Calculator {
  // Method that takes object as parameter and returns object
  public static Rectangle compareAndReturnLarger(Rectangle rect1, Rectangle rect2) {
    System.out.println("Comparing two rectangles:");
    rect1.display();
    rect2.display();

    if (rect1.getArea() > rect2.getArea()) {
      System.out.println("First rectangle is larger");
      return rect1;
    } else {
      System.out.println("Second rectangle is larger or equal");
      return rect2;
    }
  }

  // Method that takes object as parameter
  public static void printRectangleInfo(Rectangle rect) {
    System.out.println("Rectangle Information:");
    rect.display();
  }
}

public class ObjectParameter {
  public static void main(String[] args) {

    Rectangle rect1 = new Rectangle(5.0, 3.0);
    Rectangle rect2 = new Rectangle(4.0, 4.0);

    Rectangle largerRect = Calculator.compareAndReturnLarger(rect1, rect2);

    largerRect.display();
  }
}
