package Practise.Arrays;

import java.util.Arrays;

public class MultiDimen {

    public static void main(String[] args) {
        int[][] studentMarks = {
                //sem1 sem2 final
                {100, 50, 60}, // student 1
                {60, 40, 80}, // student 2
                {40, 70, 90}, // student 3
        };

//        Traversing studentMarks
        for (int[] studentMark : studentMarks) {
            for (int student : studentMark) {
                System.out.println(student);
            }
        }

    }
}
