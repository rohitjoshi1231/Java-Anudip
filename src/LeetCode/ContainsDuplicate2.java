package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1};

        int singleDigit = 0;
        int doubleDigit = 0;


        for (int num : nums) {
            boolean isDoubleDigit = ((num > 9 && num < 100) || (num < -9 && num > -100));

            if (!isDoubleDigit) {
                singleDigit += num;
            } else if (isDoubleDigit) {
                doubleDigit += num;
            }

        }

        int bobSingleDigitSum = doubleDigit;
        int bobDoubleDigitSum = singleDigit;


        System.out.println(singleDigit > bobSingleDigitSum || doubleDigit > bobDoubleDigitSum);
    }
}
