package Practise.StudentMarkSheet;

public class Student implements StudentData, Computation {
    String name;
    String year;
    char section;
    int[] marks;

    Student(String name, String year, char section, int[] marks) {
        this.name = name;
        this.year = year;
        this.section = section;
        this.marks = marks;
    }

    @Override
    public int percentage(int[] marks, int x) {
        int total = totalMarks(marks);
        int subjects = marks.length;

        return (total * 100) / (subjects * 100);
    }

    @Override
    public int percentage(int[] marks) {
        return 0;
    }


    @Override
    public int totalMarks(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    @Override
    public void message() {
        StudentData.super.message();
    }


    @Override
    public void getData() {
        StudentData.super.getData();
    }

    @Override
    public void setData(String name, String year, char section, int[] marks) {
        name = this.name;
        year = this.year;
        section = this.section;
        marks = this.marks;
    }


    public static void main(String[] args) {
        int[] marks = {60, 30, 40, 80, 93, 47};
        Student student = new Student("rohit", "2018", 'A', marks);
        student.setData("Rohit", "2018", 'A', marks);

        student.getData();
        System.out.println(student.totalMarks(marks));
        System.out.println(student.percentage(marks));
    }

}
