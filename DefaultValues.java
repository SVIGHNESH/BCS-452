public class DefaultValues {
  // Instance variables to show default values
  byte byteVar;
  short shortVar;
  int intVar;
  long longVar;
  float floatVar;
  double doubleVar;
  char charVar;
  boolean booleanVar;
  String stringVar;

  public static void main(String[] args) {
    DefaultValues obj = new DefaultValues();

    System.out.println("Default values of all data types:");
    System.out.println("byte: " + obj.byteVar);
    System.out.println("short: " + obj.shortVar);
    System.out.println("int: " + obj.intVar);
    System.out.println("long: " + obj.longVar);
    System.out.println("float: " + obj.floatVar);
    System.out.println("double: " + obj.doubleVar);
    System.out.println("char: '" + obj.charVar + "' (ASCII: " + (int) obj.charVar + ")");
    System.out.println("boolean: " + obj.booleanVar);
    System.out.println("String: " + obj.stringVar);
  }
}
