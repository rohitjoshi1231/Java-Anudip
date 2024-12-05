package Assignment2;

/*

3. Find Maximum and Minimum:
• Find the largest and smallest elements in an array without sorting.
Example Input: [7, 2, 9, 4, 1]
Output: Max: 9, Min: 1

*/
public class MaxMinArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 40, 48, 60};

        int max = arr[0];
        int min = arr[arr.length - 1];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }

            if (min > j) {
                min = j;
            }
        }

        System.out.println("Largest number in an array is " + max);
        System.out.println("Smallest number in an array is " + min);
    }
}
