package CreateTwoDArray;

public class DArray {
    public static void main(String[] args) {
        int number[][] = { { 10, 9, 8, 7, 6 }, { 5, 4, 3, 2, 1, 0 } };
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + " ");
            }
        }
    }
}
