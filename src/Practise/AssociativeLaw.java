package Practise;

import java.util.Arrays;

public class AssociativeLaw {


    static boolean isAssociative(int[] group, char operation) {
        boolean flag = true;


        for (int i = 0; i < group.length - 2; i++) {
            int a = group[i];
            int b = group[i + 1];
            int c = group[i + 2];

            if (operation == '+') {
                if (a + (b + c) != (a + b) + c) {
                    flag = false;
                    break;
                }
            } else if (operation == '-') {
                if (a - (b - c) != (a - b) - c) {
                    flag = false;
                    break;
                }
            } else if (operation == '*') {
                if (a * (b * c) != (a * b) * c) {
                    flag = false;
                    break;
                }
            } else {

                System.err.println("choose correct operation");
            }
        }

        return flag;

    }

    public static void main(String[] args) {
        int[] group = new int[]{1, 2, 3};
        char operation = '-';
        if (isAssociative(group, operation))
            System.out.println("The given group " + Arrays.toString(group) + " is Associative on operation " + operation);
        else
            System.err.println("The given group " + Arrays.toString(group) + " is not Associative on operation " + operation);
    }
}
