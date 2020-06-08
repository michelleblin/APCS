public class MatrixMultTester
{
  public static void main(String[] args) {
    int a[][] = {{1, 2, -2, 0},
                 {-3, 4, 7, 2},
                 {6, 0, 3, 1}};
    int b[][] = {{-1, 3},
                 {0, 9},
                 {1, -11},
                 {4, -5}};
    // int[][] a = {{2, 1, 4}, {0, 1, 1}};
    // int[][] b = {{6, 3, -1, 0}, {1, 1, 0, 4}, {-2, 5, 0, 2}};
    int product[][] = MatrixMult.mult(a, b);
    for(int[] row :product){
      for(int col : row)
        System.out.print(col +"\t");
      System.out.println();
    }
  }
}
