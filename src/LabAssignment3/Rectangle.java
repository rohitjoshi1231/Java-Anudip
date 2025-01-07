package LabAssignment3;

/**
 * Write a Java program that uses a method to calculate the area of a rectangle and
 * compare them using Relational Operator
 * Steps:
 * Create a class Rectangle.
 * The Rectangle class should have two attributes length and width of type int.
 * Create a constructor that accepts length and width as parameters.
 * Area should be calculated as length•area.
 * Instantiate two Rectangle classes with random values.
 * Compare the areas of the two rectangles using the Relational Operator.
 * If the first one is bigger than the second one, print •Rectangle1 > Rectangle2".
 * If the first one is smaller print *Rectangle1 < Rectangle2.
 * Otherwise, print "They are equal".
 */

public class Rectangle {
    private int length;
    private int breadth;

    // Constructor that accepts length and breadth as parameters
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // This function calculates the area of a Rectangle
    public int areaOfRectangle() {
        return length * breadth;
    }

    // This function gets the length
    public int getLength() {
        return length;
    }

    // This function sets the length
    public void setLength(int length) {
        this.length = length;
    }

    // This function gets the breadth
    public int getBreadth() {
        return breadth;
    }

    // This function sets the breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        // Instantiating Rectangle class
        Rectangle rect1 = new Rectangle(30, 10);
        Rectangle rect2 = new Rectangle(20, 10);

        int rectangle1Area = rect1.areaOfRectangle();
        int rectangle2Area = rect2.areaOfRectangle();

        // Comparing the areas and printing the result
        if (rectangle2Area > rectangle1Area) {
            System.out.println("Rectangle1  > Rectangle2");
        } else if (rectangle2Area < rectangle1Area) {
            System.out.println("Rectangle1  > Rectangle2 ");
        } else {
            System.out.println("They are equal");
        }

    }
}
