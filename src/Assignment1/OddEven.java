package Assignment1;

import java.util.Scanner;

class OddEven {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur num : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("even");

        } else {
            System.out.print("Odd");
        }
    }
}