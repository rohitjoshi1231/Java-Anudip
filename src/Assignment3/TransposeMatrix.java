package Assignment3;

import java.util.Arrays;

/*
2. Transpose of a Matrix
Question Statement:
matrix, write a function to return its transpose. The transpose of a matrix flips it
Given an
m xn
over its diagonal, switching rows with columns.
Input:
A2D array matrix.
Output:
• A new 2D array representing the transpose of the input matrix.
 */
public class TransposeMatrix {


    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];


        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println(Arrays.deepToString(transpose));
    }
}
