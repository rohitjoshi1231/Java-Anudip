package Assignment2;


//4. Count Even and Odd Numbers:
//        • Count how many even and odd numbers are in an array.
//Example Input: [1, 2, 3, 4, 5]
//Output: Even: 2, Odd: 3

public class CountEvenOrOdd {

    public static void main(String[] args) {
        int[] inp = new int[]{1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;

        for (int ele : inp) {
            if (ele % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount + ", Odd: " + oddCount);


    }
}

