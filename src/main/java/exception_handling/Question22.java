package exception_handling;

public class Question22 {
  public static void main(String[] args) {
    try {
      throw new SecurityException();
    } catch (SecurityException e) {
      throw new ClassCastException();
    } catch (ClassCastException e) {
      throw new NullPointerException();
    } catch (NullPointerException e) {
      throw new IndexOutOfBoundsException();
    } catch (IndexOutOfBoundsException e) {
//      throw new CloneNotSupportedException();
    }
  }
}
