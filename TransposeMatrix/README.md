# MatrixQustion
                            Transpose of a matrix

Transpose of a matris is obtained by changing rows to columns and columns to rows. In other words, transpose of A[N][M] is obtained by changing A[i][j] to A[j][i].

Example:
Input :
        [1, 2, 3]
        [4, 5, 6]
        [7, 8, 9]

Output :
        [1, 4, 7]
        [2, 5, 8]
        [3, 6, 9]

Approach: 
    Run a nested loop using two integer pointers i and j for 0 <= i < N and 0 <= j < M
    Set B[i][j] equal to A[j][i]

                                    Efficient 
Run a nested loop using two integer pointers i and j for 0 <= i < N and 0 <= j < M
Swap A[i][j] with A[j][i]
