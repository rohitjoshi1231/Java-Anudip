package LeetCode;

import java.util.Arrays;

public class ModifyMatrix {
    public static int max(int[] arr) {

        int max = arr[arr.length - 1];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int[] getColumn(int[][] matrix, int columnIndex) {
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnIndex];
        }
        return column;
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {

                    int[] columnC = getColumn(matrix, j);
                    int maxCol = max(columnC);
                    matrix[i][j] = maxCol;

                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] inp = {{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        int[][] answer = modifiedMatrix(inp);
        System.out.println(Arrays.deepToString(answer));
    }
}
