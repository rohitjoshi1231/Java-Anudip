package Assignment2;

//Reverse an Array:
//Write a program to reverse an array in-place.
//Example Input: [1, 2, 3, 4, 5]
//Output: [5, 4, 3, 2, 11]


import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 2, 1};

//        boolean isPalindrome = false;
        // Finding reverse without another array
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }


        int[] inp = {2, 0, 2, 1, 1, 0};
        int n = inp.length;
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (inp[j] > inp[j + 1]) {
                    int temp = inp[j + 1];
                    inp[j + 1] = inp[j];
                    inp[j] = temp;
                    swap = 1;
                }
                if (swap == 1) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(inp));
//        while (start < end) {
//            if (arr[start] == arr[end]) {
//                isPalindrome = true;
//            }
//            start++;
//            end--;
//        }


        // Finding reverse
//        int[] reversedArr = new int[arr.length];
//        int index = 0;
//
//        for (int i = arr.length; i > 0; i--) {
//            reversedArr[index] = arr[i - 1];
//            index++;
//
//        }
//
//        System.out.println(Arrays.toString(reversedArr));


    }

}
