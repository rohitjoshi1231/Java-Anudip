package Assignment2;

import java.util.Arrays;

/*
Check for Palindrome Array:
• Determine if an array is the same forward and backward.
Example Input: [1, 2, 3, 2, 1]
Output: True
*/
public class Palindrome {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        int[] reversedArr = new int[arr.length];
        int index = 0;

        for (int i = arr.length; i > 0; i--) {
            reversedArr[index] = arr[i - 1];
            index++;
        }

        System.out.println(Arrays.equals(arr, reversedArr));
    }
}
