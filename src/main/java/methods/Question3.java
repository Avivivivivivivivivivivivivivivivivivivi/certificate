package methods;

public class Question3 {
  static String s1 = sM1("a");
  static String s2 = sM1("c");

  static {
    s1 = sM1("b");
  }

  String s3 = sM1("2");
  String s4 = sM1("4");

  {
    s1 = sM1("3");
  }

  public Question3() {
    s1 = sM1("1");
  }

  public static void main(String args[]) {
    Question3 it = new Question3();
  }

  private static String sM1(String s) {
    System.out.println(s);
    return s;
  }
}
