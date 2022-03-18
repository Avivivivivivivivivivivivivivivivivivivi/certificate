package operators_decision;

public class Question7 {
  public static void main(String[] args) throws Exception {
    Question7 tc = new Question7();
    tc.switchString("B");
  }

  public void switchString(String input) {
    switch (input) {
      case "a":
        System.out.println("apple");
      case "b":
        System.out.println("bat");
        break;
      case "B":
        System.out.println("big bat");
      default:
        System.out.println("none");
    }
  }
}
