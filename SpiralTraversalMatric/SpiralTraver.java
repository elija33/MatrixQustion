package SpiralTraversalMatric;

public class SpiralTraver {
    static int R = 4, C = 4;

    public static void spiral(int spiralTra[][]) {
        for (int i = 0; i < C; i++) {
            System.out.println(spiralTra[0][i] + " ");
        }
        for (int j = 1; j < R; j++) {
            System.out.println(spiralTra[j][C - 1] + " ");
        }
        for (int k = R - 2; k >= 0; k--) {
            System.out.println(spiralTra[R - 1][k] + " ");
        }
        for (int y = C - 2; y >= 1; y--) {
            System.out.println(spiralTra[C][y] + " ");
        }
        for (int x = 1; x < R - 2; x++) {
            System.out.println(spiralTra[R - 2][x] + " ");
        }
    }

    public static void main(String[] args) {
        /*
         * 1, 2, 3, 4,
         * 5, 6, 7, 8,
         * 9, 10, 11, 12,
         * 13, 14, 15, 16
         */
    }
}
