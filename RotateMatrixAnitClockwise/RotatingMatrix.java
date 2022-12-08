package RotateMatrixAnitClockwise;

public class RotatingMatrix {
    /*
     * 1 2 3 3 6 9
     * 4 5 6 ==> 2 5 8
     * 7 8 9 1 4 7
     */
    static int n = 4;

    public static void RotatingMatrix(int number[][]) {

        // Create a tem array of sixe n cross n
        int temp[][] = new int[n][n];
        // Loop thougt both array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // copy to the temp arra. The last column become the first row.
                temp[n - j - 1][i] = number[i][j];
            }
        }
        // Loop thought the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Copy the matrix from the temp array to the orig array
                number[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        RotatingMatrix(number);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
