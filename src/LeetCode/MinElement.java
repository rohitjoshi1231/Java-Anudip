package LeetCode;

import java.util.Arrays;

public class MinElement {

    public static int min(int[] nums) {
        int min = nums[nums.length - 1];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static int splitAndSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Extract the last digit
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {999, 19, 199};

        int index = 0;
        for (int num : nums) {
            nums[index] = splitAndSum(num);
            index++;
        }

        min(nums);
    }
}
