package MatrixBoundaryTraver;

public class BoundaryTraver {
    static int R = 4, C = 4;

    public static void boundaryprint(int number[][]) {
        if (R == 1) {
            for (int i = 0; i < C; i++)
                System.out.println(number[0][i]);
        } else if (C == 1) {
            for (int j = 0; j < R; j++) {
                System.out.println(number[j][0]);
            }
        } else {
            for (int i = 0; i < C; i++) {
                System.out.println(number[0][i] + " ");
            }
            for (int j = 0; j < R; j++) {
                System.out.println(number[j][C - 1] + " ");
            }
            for (int k = C - 2; k >= 0; k--) {
                System.out.println(number[R - 1][k] + " ");
            }
            for (int y = R - 2; y >= 1; y--) {
                System.out.println(number[y][0] + " ");
            }
        }
    }

    /*
     * 1 2 3 4
     * 5 6 7 8
     * 1 2 3 4
     * 5 6 7 8
     */
    public static void main(String[] args) {
        int number[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };
        boundaryprint(number);
    }
}
