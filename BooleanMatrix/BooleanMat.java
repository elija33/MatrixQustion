package BooleanMatrix;

public class BooleanMat {
    static int R, C;

    public static void booleanMatrix(int number[][]) {
        int row[] = new int[R];
        int col[] = new int[C];

        for (int i = 0; i < R; i++)
            row[i] = 0;

        for (int i = 0; i < C; i++)
            col[i] = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (number[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                if (row[i] == 1 || col[j] == 1)
                    number[i][j] = 1;
        }

    }

    public static void printMatrix(int mat[][], int R, int C) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println(mat[i][j] + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = {
                { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 } };

        System.out.println("Matrix Initially");

    }
}
