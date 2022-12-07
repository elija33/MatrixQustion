# MatrixQustion
                                             Snake Pattern
Given an n x n matrix. In the given matrix, you have to print the elements of the matrix in the snake pattern.

Examples:
Input: mat[][] = { {10, 20, 30, 40}, 
                   {15, 25, 35, 45},
                   {27, 29, 37, 48},
                    {32, 33, 39, 50}};

Output: 10, 20, 30, 40, 45, 35, 25, 15, 27, 29, 37, 48, 50, 39, 33 32

Approach: Follow the steps below to solve the problem:

Traverse thought the all rows by looping thought it. 
For every row, check the indeex, if it is even or odd. 
If even, we print from left to right 
else print from right to left. 