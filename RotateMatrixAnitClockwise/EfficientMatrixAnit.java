package RotateMatrixAnitClockwise;

public class EfficientMatrixAnit {
    static int n = 4;

    static void swap(int number[][], int i, int j) {
        int temp = number[i][j];
        number[i][j] = number[j][i];
        number[j][i] = temp;
    }

    static void swap2(int low, int high, int i, int number[][]) {
        int temp = number[low][i];
        number[low][i] = number[high][i];
        number[high][i] = temp;
    }

    public static void efficientMatrix(int number[][]) {
        /*
         * 4 8 12 16
         * 3 7 11 15
         * 2 6 10 14
         * 1 5 9 13
         */

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(number, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                swap2(low, high, i, number);
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = {
                { 4, 8, 12, 16 },
                { 3, 7, 11, 15 },
                { 2, 6, 10, 14 },
                { 1, 5, 9, 13 } };
        efficientMatrix(number);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
