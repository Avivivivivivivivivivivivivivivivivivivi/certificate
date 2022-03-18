public class QuestionEleven {
  public static void main(String[] args) {
    String myStr = "good";
    char[] myCharArr = {'g', 'o', 'o', 'd'};
    String newStr = null;
    for (char ch : myCharArr) {
      newStr = newStr + ch;
    }
    test((String) null);
    System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
  }

  private static void test(Object test) {
    System.out.println(test);
  }


  private static void test(char test[]) {
    System.out.println(test);
  }

}
