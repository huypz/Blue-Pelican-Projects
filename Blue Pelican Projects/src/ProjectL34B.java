import java.util.*;
import java.io.*;

public class ProjectL34B {
    public static void main(String[] args) throws IOException {
        int[][] a = new int[][]{}, b = new int[][]{};
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL34B.in"));
        StringBuilder sb = new StringBuilder();
        while (sf.hasNextLine()) {
            sb.append(sf.nextLine());
            sb.append(" ");
        }
        String matrixData = sb.toString();
        //System.out.println(matrixData);

        Scanner sc = new Scanner(matrixData);
        sc.useDelimiter("\\s*matrix\\s*row\\s*");
        int arrNum = 1;
        while (sc.hasNext()) {
            if (arrNum == 1) {
                a = create2DArray(sc.next());
            }
            else if (arrNum == 2) {
                b = create2DArray(sc.next());
            }
            arrNum++;
        }
        sf.close();

        int[][] c = MatrixMult.mult(a, b);
        for (int[] cRow : c) {
            for (int num : cRow) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] create2DArray(String s) {
        Scanner scCountRows = new Scanner(s);
        scCountRows.useDelimiter("\\s*row\\s*");
        int maxRows = 0;
        while (scCountRows.hasNext()) {
            scCountRows.next();
            maxRows++;
        }
        //System.out.println("Max rows: " + maxRows);
        int maxCols = 0;
        scCountRows = new Scanner(s);
        scCountRows.useDelimiter("\\s*row\\s*");
        Scanner scCountCols = new Scanner(scCountRows.next());
        while (scCountCols.hasNextInt()) {
            scCountCols.nextInt();
            maxCols++;
        }
        scCountRows.close();
        //System.out.println("Max cols: " + maxCols);
        int[][] temp = new int[maxRows][maxCols];
        Scanner scRow = new Scanner(s);
        scRow.useDelimiter("\\s*row\\s*");
        int row = 0;
        while (scRow.hasNext()) {
            temp[row] = create1DArray(scRow.next(), maxCols);
            row++;
        }
        scRow.close();
        return temp;
    }

    public static int[] create1DArray(String s, int maxCols) {
        int[] temp = new int[maxCols];
        int index = 0;
        Scanner sc = new Scanner(s);
        while (sc.hasNextInt()) {
            temp[index] = sc.nextInt();
            index++;
        }
        return temp;
    }
}

/*
R=0 C=0 a[0][x] * b[x][0]
R=1 C=0
R2 C=0
R=0 C=1
R=1 C=1
R=2 C=1
 */
class MatrixMult {
    public static int[][] mult(int[][] a, int[][] b) throws InternalError {
        if (a[0].length == b.length) {
            // R=3 C=2
            int[][] c = new int[a.length][b[0].length];
            for (int col = 0; col < a.length; col++) {
                for (int row = 0; row < b[0].length; row++) {
                    for (int i = 0; i < a[0].length; i++) {
                        c[col][row] += a[col][i] * b[i][row];
                    }
                }
            }
            return c;
        }
        else {
            throw new InternalError("Matrices are not compatible!");
        }
    }
}