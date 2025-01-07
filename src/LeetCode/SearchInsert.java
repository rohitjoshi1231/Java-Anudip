package LeetCode;

import java.util.Arrays;


public class SearchInsert {

    public static int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int searchInsert(int[] nums, int target) {
        int resultIndex = 0;
        int index = -1;
        int[] temp = new int[max(nums)];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                resultIndex = i;
            }
        }

        for (int i = 0; i < max(nums); i++) {
            temp[++index] = i;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != target) {
            } else {
                resultIndex = i;
            }
        }

        return resultIndex;
    }

    public static void main(String[] args) {
        int result = searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(result);
    }
}
