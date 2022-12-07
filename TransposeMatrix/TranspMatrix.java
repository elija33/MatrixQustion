package TransposeMatrix;

public class TranspMatrix {
    static int n = 5;

    public static void Trans(int number[][]) {
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = number[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                number[j][i] = number[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = {
                { 1, 2, 3, 0, 8 },
                { 4, 5, 6, 1, 7 },
                { 7, 8, 9, 4, 7 },
                { 6, 1, 4, 5, 8 },
                { 7, 4, 5, 3, 9 } };
        System.out.println();
        Trans(number);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
