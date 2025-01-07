package Practise;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class CodeChef {

    public static int max(int[] arr) {
        int max = arr[0];
        for (int ar : arr) {
            if (max < ar) {
                max = ar;
            }
        }
        return max;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int vedHeight = sc.nextInt();
            int varunHeight = sc.nextInt();


            int[] chairs = new int[n];
            for (int i = 0; i < n; i++) {
                chairs[i] = sc.nextInt();
            }


            int highestChair = max(chairs);
            boolean highestChairCounted = false;

            int remainingSum = 0;
            for (int chair : chairs) {
                if (chair == highestChair && !highestChairCounted) {
                    highestChairCounted = true; // Only exclude one tallest chair
                } else {
                    remainingSum += chair;
                }
            }
            int vth = vedHeight + highestChair;
            int vath = varunHeight + remainingSum;
            if (vth > vath) {
                System.out.println("Ved");
            } else if (vth < vath) {
                System.out.println("Varun");
            } else {
                System.out.println("Equal");
            }
        }

    }
}
