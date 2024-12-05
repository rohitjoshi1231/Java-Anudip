package Assignment1;

import java.util.Scanner;

class Nested {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur age");
        int age = sc.nextInt();
        boolean isCriminal = false;
        boolean isEducated = false;


        if (age >= 21) {
            if (!isCriminal) {
                if (isEducated) {
                    System.out.print("you are  eligible to take part in election");
                } else {
                    System.out.print("you are not eligible to take part in election");

                }

            } else {
                System.out.print("you are not eligible to take part in election");
            }
            //System.out.print("you are eligible to take part in election");
        } else if (age >= 18) {
            System.out.print("You can vote");
        } else {
            System.out.print("You can not vote");
        }
    }

}
