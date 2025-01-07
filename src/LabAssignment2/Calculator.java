package LabAssignment2;

import java.util.Scanner;

/**
 * Assignment-2.
 * A Java program that demonstrates method overloading by creating a class called Calculator.
 * The Calculator class has three overloaded `add` methods:
 * 1. Adds two integers and returns their sum.
 * 2. Adds three integers and returns their sum.
 * 3. Adds two doubles and returns their sum.
 * The program also allows the user to interact with these methods.
 */
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating a Calculator object to access the methods
        Calculator calculator = new Calculator();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation to test:");
        System.out.println("1: Add two integers");
        System.out.println("2: Add three integers");
        System.out.println("3: Add two doubles");

        int choice = scanner.nextInt(); // User selects an operation

        switch (choice) {
            case 1:
                System.out.println("Enter two integers:");
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                int resultInt2 = calculator.add(int1, int2);
                System.out.println("Sum of two integers: " + resultInt2);
                break;

            case 2:
                System.out.println("Enter three integers:");
                int int3 = scanner.nextInt();
                int int4 = scanner.nextInt();
                int int5 = scanner.nextInt();
                int resultInt3 = calculator.add(int3, int4, int5);
                System.out.println("Sum of three integers: " + resultInt3);
                break;

            case 3:
                System.out.println("Enter two double values:");
                double double1 = scanner.nextDouble();
                double double2 = scanner.nextDouble();
                double resultDouble = calculator.add(double1, double2);
                System.out.println("Sum of two doubles: " + resultDouble);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close(); // Closing the scanner
    }
}
