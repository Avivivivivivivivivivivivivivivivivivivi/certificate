package strings;

public class Question13 {
  public static void main(String[] args) {
    String hello = "Hello", lo = "lo";
    System.out.print((strings.Other.hello == hello) + " ");
    System.out.print((other.Other.hello == hello) + " ");
    System.out.print((hello == ("Hel" + "lo")) + " ");
    System.out.print((hello == ("Hel" + lo)) + " ");
    System.out.println(hello == ("Hel" + lo).intern());
  }
}

class Other {
  static String hello = "Hello";
}
