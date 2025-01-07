package LabAssignment1;

public class Employee {
    protected int id, age;
    protected String name;
    protected boolean isPermanent;


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.age = (int) 35.5;

        System.out.println("Successfully started");

        /*
        Output

        >>> Successfully started

         */
    }
}
