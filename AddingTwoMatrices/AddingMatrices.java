package AddingTwoMatrices;

public class AddingMatrices {
    static int R = 2, C = 3;

    public static void sumMatrix(int number[][], int numbers[][], int total[][]) {
        for (int i = 0; i < C; i++)
            for (int j = 0; j < R; j++)
                total[i][j] = number[i][j] + numbers[i][j];
    }

    public static void main(String[] args) {
        int[][] number = { { 1, 3, 5 }, { 9, 8, 7 } };
        int[][] numbers = { { 2, 4, 6 }, { 3, 5, 7 } };
        int total[][] = new int[R][C];
        sumMatrix(number, numbers, total);

        System.out.println("Result matrix is \n");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println(total[i][j] + " ");
                System.out.println("\n");
            }
        }
    }
}
