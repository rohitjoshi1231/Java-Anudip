package Assignment3;


/*


1. Matrix Search
Question Statement:
Given a matrix where:
1. Each row is sorted in ascending order.
2. The first integer of each row is greater than the last integer of the previous row.
Write a function to determine if a given target integer exists in the matrix.
 */

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20},
                {30, 40},
                {50, 60}
        };

        int target = 60;
        boolean isPresent = false;
        for (int[] elements : matrix) {
            for (int element : elements) {
                if (element == target) {
                    isPresent = true;
                    break;
                }
            }
        }

        System.out.println(isPresent);

    }
}