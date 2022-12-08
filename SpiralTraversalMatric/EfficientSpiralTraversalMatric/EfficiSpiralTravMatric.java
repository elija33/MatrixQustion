package SpiralTraversalMatric.EfficientSpiralTraversalMatric;

public class EfficiSpiralTravMatric {

    /*
     * top -> 1, 2, 3, 4, <- right
     * 5, 6, 7, 8,
     * 9, 10, 11, 12,
     * left -> 13, 14, 15, 16 <- botton
     */

    public static void SpiralTraver(int number[][], int R, int C) {
        int top = 0, right = C - 1, bottom = R - 1, left = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(number[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(number[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(number[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(number[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int number[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        SpiralTraver(number, 4, 4);
    }
}
