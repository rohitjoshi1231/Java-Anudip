package LeetCode;

import java.util.Arrays;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                index2 = -1;
            } else {
                index2 = i;
                break;
            }
        }

        return index2;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
