package TransposeMatrix;

public class EfficiTranspMatrix {
    static int n = 5;

    public static void TranspMatrix(int total[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = total[i][j];
                total[j][i] = total[i][j];
                total[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int total[][] = {
                { 1, 12, 3, 0, 8 },
                { 4, 05, 6, 1, 7 },
                { 7, 18, 9, 4, 7 },
                { 6, 71, 4, 5, 8 },
                { 7, 54, 5, 3, 9 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }
    }
}
