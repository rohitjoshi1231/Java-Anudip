package LabAssignment2;

/**
 * Assignment-3.
 * A Java Bean Class to represent a Student.
 * The class includes attributes for name, age, and department,
 * along with a parameterized constructor, and getter and setter methods.
 */
public class Student {

    // Private attributes for encapsulation
    private String name;
    private String department;
    private int age;

    /**
     * Parameterized constructor to initialize all attributes.
     *
     * @param name       The name of the student.
     * @param department The department of the student.
     * @param age        The age of the student.
     */
    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    // Getter and Setter Methods

    /**
     * Gets the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the department of the student.
     *
     * @return The department of the student.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the student.
     *
     * @param department The department to set.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the age of the student.
     *
     * @return The age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }
}


