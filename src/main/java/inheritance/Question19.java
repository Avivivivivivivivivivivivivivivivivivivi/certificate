package inheritance;

class A {
  A() { }

  public void print() {
    System.out.println("A");
  }
}

public class Question19 extends A {
  Question19() { }

  public static void main(String[] args) { new Question19(); }

  public void print() { System.out.println("B"); }
}