public class BraceChecker {

  public static void main(String[] args) {
    // Add code here
    String braces = "()[]{}";
    if (braces.split("}").length != braces.split("{").length) {
      System.out.println(false);
    }
    if (braces.split(")").length != braces.split("(").length) {
      System.out.println(false);
    }
    if (braces.split("]").length != braces.split("[").length) {
      System.out.println(false);
    }
    System.out.println(true);
  }

}