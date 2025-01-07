package com.anudip.learning;

public class Person {
    String name = "Rohit";
    int age = 22, salary = 10_000;


    public static void main(String[] args) {
        System.out.println("Test Successful");
    }

    /*
    Output

        >>> Error: Could not find or load main class Person
        >>> Caused by: java.lang.NoClassDefFoundError: Person (wrong name: com/anudip/learning/Person)

    */
}
