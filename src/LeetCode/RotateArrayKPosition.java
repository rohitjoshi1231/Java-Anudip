package LeetCode;

import java.util.Arrays;

public class RotateArrayKPosition {


    public static int[] reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;
        System.out.println(Arrays.toString(reverse(arr, 0, n - 1)));
        System.out.println(Arrays.toString(reverse(arr, 0, k - 1)));
        System.out.println(Arrays.toString(reverse(arr, k, n - 1)));

    }

}
