package Assignment1;

import java.util.Scanner;

class Calculator {
    public static void mul(double a, double b) {
        double ans = a * b;
        System.out.println("multiplication of two number:" + ans);
    }

    public static void add(double a, double b) {
        double ans = a + b;
        System.out.println("addition of two number:" + ans);
    }

    public static void sub(double a, double b) {
        double ans = a - b;
        System.out.println("subtraction of two number:" + ans);
    }

    public static void divide(double a, double b) {
        double ans = a / b;
        System.out.println("division of two number:" + ans);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input your first number :");
        double a = sc.nextDouble();
        System.out.print("Please Input your second number :");
        double b = sc.nextDouble();
        System.out.println("Press [1] for addition ");
        System.out.println("Press [2] for multiplication ");
        System.out.println("Press [3] for division ");
        System.out.println("Press [4] for substraction ");
        System.out.println("Press [5] for all operations ");
        int oper = sc.nextInt();

        if (oper == 1) {
            add(a, b);
        } else if (oper == 4) {
            sub(a, b);
        } else if (oper == 3) {
            divide(a, b);
        } else if (oper == 2) {
            mul(a, b);
        } else {
            add(a, b);
            mul(a, b);
            divide(a, b);
            sub(a, b);
        }

    }
}