package LeetCode;

import java.util.Arrays;

public class RemoveElement {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println(k);
    }

}
