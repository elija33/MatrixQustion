package SearchRowColumnWiseSorted.EfficientSearchingRow;

public class SearchingSort {
    static int R = 4, C = 4;

    public static void searching(int number[][], int target) {
        /*
         * Begin from the top right core.
         * if x is same, print position and return.
         * if x is smaller, move left
         * if x is greater, move down.
         */
        int i = 0, j = C - 1;
        while (i < R && j >= 0) {
            if (number[i][j] == target) {
                System.out.println("Found at (" + i + " ," + j + ")");
                return;
            } else if (number[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int number[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 35, 45 },
                { 32, 33, 39, 50 } };
        int target = 33;
        searching(number, target);
    }
}
