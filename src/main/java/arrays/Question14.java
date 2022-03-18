package arrays;

public class Question14 {
  int[][] matrix = new int[2][3];

  int a[] = {1, 2, 3};
  int b[] = {4, 5, 6};

  public static void main(String[] args) {
    Question14 qf = new Question14();
    qf.loadMatrix();
  }

  public int compute(int x, int y) {
    return a[x] * b[y];
  }

  public void loadMatrix() {
    for (int x = 0; x < matrix.length; x++) {
      for (int y = 0; y < matrix[x].length; y++) {
        matrix[x][y] = compute(x, y);
      }
    }
  }
}
