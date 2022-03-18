public class QuestionSeven {
  public static void main(String[] args) throws Exception {
    QuestionSeven tc = new QuestionSeven();
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
