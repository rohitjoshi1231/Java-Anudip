package Assignment3;

public class RotatingMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, // 0
                {4, 5, 6},
                {7, 8, 9} // 2
        };
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            int matrix1 = matrix[0][i];
            int matrix2 = matrix[1][i];
            int matrix3 = matrix[2][i];

            System.out.print(matrix3 + "");
            System.out.print(matrix2 + "");
            System.out.print(matrix1 + "\n");

        }

    }

}
