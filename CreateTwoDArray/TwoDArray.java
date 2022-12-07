package CreateTwoDArray;

public class TwoDArray {
    public static void Darray(int number[][]) {
        for (int i = 0; i < number.length; i++)
            for (int j = 0; j < number[i].length; j++)
                System.out.print(number[i][j] + " ");
    }

    public static void main(String[] args) {
        int number[][] = { { 0, 9, 8, 7, 6 }, { 1, 2, 3, 4, 5 } };
        Darray(number);
    }
}