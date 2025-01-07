package Practise.StudentMarkSheet;

import java.util.Arrays;

public interface StudentData {
    String name = "";
    String year = "";
    char section = 0;
    int size = 0;
    int[] marks = new int[size];

    default void message() {
        System.out.println("Welcome to Student Marks sheet Generator!!!");
    }

    default void getData() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Section: " + section);
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    void setData(String name, String year, char section, int[] marks);

}
