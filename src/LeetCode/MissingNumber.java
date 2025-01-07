package LeetCode;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of the first n natural numbers
        int arraySum = 0;

//        for (int num : nums) {
//            arraySum += num;
//        }

        // The missing number is the difference between the expected total sum and the array sum
        return totalSum ;
    }


    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));
    }
}
