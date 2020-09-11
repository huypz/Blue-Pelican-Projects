public class ProjectL34A {
    public static void main(String[] args) {
        // R=3 C=4
        int[][] a = { {1, 2, -2, 0},
                      {-3, 4, 7, 2},
                      {6, 0, 3, 1} };
        // R=4 C=2
        int[][] b = { {-1, 3},
                      {0, 9},
                      {1, -11},
                      {4, -5} };

        int[][] c = MatrixMult.mult(a, b);
        for (int[] cRow : c) {
            for (int num : cRow) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}