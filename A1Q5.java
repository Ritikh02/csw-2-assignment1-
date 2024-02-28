/*Developing a Simple College Management System in Java */

class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName());
        System.out.println("Location: " + college.getCollegeLoc());
    }
}

public class A1Q5 {
    public static void main(String[] args) {
        College college = new College("ITER ", "Bhubhaneswar");
        Student student = new Student(100, "Ritikh", college);
        student.displayStudentInfo();
    }
}
