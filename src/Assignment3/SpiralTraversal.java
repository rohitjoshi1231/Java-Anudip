package Assignment3;

import java.util.Arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] traverse = new int[rows * columns];
        int[] matrixR1 = matrix[0];
        int traverseIndex = 0;
        for (int x : matrixR1) {
            traverse[traverseIndex] = x;
        }

        for (int[] ints : matrix) {
            int x = ints[2];
            traverse[traverseIndex] = x;
        }

        for (int i = rows; i > 0; i--) {
            int x = matrix[2][i - 1];
            traverse[traverseIndex] = x;
        }

        for (int i = 0; i < rows; i++) {
            int x = matrix[1][i];
            traverse[traverseIndex] = x;
        }

        for (int i = 0; i < rows * columns; i++) {
            traverseIndex++;
        }

        System.out.println(Arrays.toString(traverse));
    }


}
