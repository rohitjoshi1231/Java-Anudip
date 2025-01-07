package LeetCode;

import java.util.Arrays;

public class PlusOne {


    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Agar digit 9 se kam hai, toh bas increment kar do
                return digits;  // Fir result return kar do
            }
            digits[i] = 0;  // Agar digit 9 hai, toh usse 0 set kar do aur carry ko next digit pe propagate kar do
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {0, 10, 209, 9, 8, };  // Number 9876543210

        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
