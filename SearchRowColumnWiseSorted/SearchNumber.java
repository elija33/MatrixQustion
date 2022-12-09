package SearchRowColumnWiseSorted;

public class SearchNumber {
    static int R = 4, C = 4;

    public static void findingNumber(int number[][], int searchingnumber) {
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                if (number[i][j] == searchingnumber) {
                    System.out.println("Found at (" + i + ", " + j + ")");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 35, 45 },
                { 32, 33, 39, 50 } };
        int searchingnumber = 29;
        findingNumber(number, searchingnumber);
    }
}
