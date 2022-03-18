package inheritance;

interface Bozo {
  int type = 0;

  public void jump();
}

public class Question18 implements Bozo {
  public Question18() {
//    type = 1; interface fields are final
  }

  public static void main(String[] args) {
    Bozo b = new Question18();
    b.jump();
  }

  public void jump() {
    System.out.println("jumping..." + type);
  }
}
