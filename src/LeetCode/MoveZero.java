package LeetCode;

import java.util.Arrays;

public class MoveZero {

    public static int[] moveZeroLast(int[] nums) {
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }


        while (index < n) {
            nums[index++] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroLast(nums)));
    }
}
