package LabAssignment2;

import java.util.Scanner;

/*

Assignment-I
Write a Java program named Car
The Car class should have the following attributes: make (String), model
(String) , year (short) , and price(int) .
The car class should have a constructor that takes all the attributes.
Add a main method to instantiate car objects.
The program should allow the user to create and display objects of each

 */

public class Car {

    //    Car Attributes
    String make, model;
    short year;
    int price;

    Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //    This function displays the Car Attributes
    void display() {
        System.out.print("Car: " + make);
        System.out.print(" Model: " + model);
        System.out.print(" of Year: " + year);
        System.out.print(" of Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company name: ");
        String company = sc.nextLine();
        System.out.println("Enter Model name: ");
        String model = sc.nextLine();
        System.out.println("Enter Year: ");
        short year = sc.nextShort();
        System.out.println("Enter Price: ");
        int price = sc.nextInt();


        Car car = new Car(company, model, year, price);

        car.display();
    }


}
