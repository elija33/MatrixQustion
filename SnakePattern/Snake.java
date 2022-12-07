package SnakePattern;

public class Snake {
    static int R = 4, C = 4;

    public static void snakeway(int number[][]) {
        // loop thought the row
        for (int i = 0; i < R; i++) {
            // checking if the index is even
            if (i % 2 == 0) {
                // Loop thought the column
                for (int j = 0; j < C; j++) {
                    System.out.print(number[i][j] + " ");
                }
            } else {
                for (int k = C - 1; k >= 0; k--) {
                    System.out.print(number[i][k] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        snakeway(number);
    }
}
