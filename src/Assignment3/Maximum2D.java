package Assignment3;

public class Maximum2D {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 100},
                {30, 90},
                {50, 60}
        };

        int max = matrix[0][0];

        int r = 0;
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        System.out.println("Maximum: " + max + " at position " + " (" + r + ", " + c + ")");


    }


}
