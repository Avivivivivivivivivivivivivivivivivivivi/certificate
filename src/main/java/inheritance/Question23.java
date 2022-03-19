package inheritance;

class ABCD {
  static int y = 20;
  int x = 10;
}

class MNOP extends ABCD {
  static int y = 40;
  int x = 30;
}

public class Question23 {
  public static void main(String[] args) {
    System.out.println(new MNOP().x + ", " + new MNOP().y);
  }
}
