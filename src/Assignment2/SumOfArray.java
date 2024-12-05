package Assignment2;


//Sum of Array Elements:
//Write a program to calculate the sum of all elements in an array.
//Example Input: [1, 2, 3, 4, 5]
//Output: 15

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4};
        int sum = 0;
        for (int ele : arr) {
            sum = sum + ele;
        }

        System.out.println(sum);
    }
}
