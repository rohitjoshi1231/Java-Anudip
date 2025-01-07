package LeetCode;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int index = 0;
        int[][] result = new int[r][c];

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                result[index / c][index % c] = ints[j];
                index++;
            }
        }

        return result;
    }

}
