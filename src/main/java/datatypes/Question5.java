package datatypes;

public class Question5 {
  public static void main(String[] args) {
    String mStr = "123";
    long m = Long.parseLong(mStr);
    m = Long.valueOf(mStr);
    m = Long.valueOf(mStr).longValue();
    m = new Long(mStr);
  }
}
