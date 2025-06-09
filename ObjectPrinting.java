class Student {
  private String name;
  private int rollNo;
  private String course;

  public Student(String name, int rollNo, String course) {
    this.name = name;
    this.rollNo = rollNo;
    this.course = course;
  }

  // Override toString() method to customize object printing
  @Override
  public String toString() {
    return "Student{name='" + name + "', rollNo=" + rollNo + ", course='" + course + "'}";
  }

  public void printSpecificMessage() {
    System.out.println("This is a specific message from " + name + " (Roll No: " + rollNo + ")");
  }
}

public class ObjectPrinting {
  public static void main(String[] args) {
    Student student = new Student("Vighnesh Shukla", 33, "Computer Science & Engg.");

    System.out.println("Printing object:");
    System.out.println(student); // This calls toString() method

    System.out.println("\nPrinting specific message:");
    student.printSpecificMessage();
  }
}
