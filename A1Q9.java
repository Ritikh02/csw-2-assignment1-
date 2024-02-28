/*Design a Java program for managing student enrollment in a university, adhering to the
principles of loose coupling and high cohesion. Your program should include classes for
representing students (`Student`), courses (`Course`), and enrollment management
(`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly
through an interface class (`EnrollmentSystem`). Implement methods for enrolling and
dropping students from courses, and displaying enrollment details. Create a `Main` class to
demonstrate the system's functionality, with appropriate error handling and user-friendly output
messages. Provide comments in your code explaining how loose coupling and high cohesion
are maintained throughout the implementation */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}
class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
class Course {
    private String courseId;
    private String courseName;
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}
class Enrollment implements EnrollmentSystem {
    private Map<Course, List<Student>> enrollmentMap;

    public Enrollment() {
        this.enrollmentMap = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        if (!enrollmentMap.containsKey(course)) {
            enrollmentMap.put(course, new ArrayList<>());
        }
        enrollmentMap.get(course).add(student);
        System.out.println("Enrolled student '" + student.getStudentName() + "' in course '" + course.getCourseName() + "'");
    }
    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollmentMap.containsKey(course)) {
            List<Student> students = enrollmentMap.get(course);
            if (students.contains(student)) {
                students.remove(student);
                System.out.println("Dropped student '" + student.getStudentName() + "' from course '" + course.getCourseName() + "'");
            } else {
                System.out.println("Student '" + student.getStudentName() + "' is not enrolled in course '" + course.getCourseName() + "'");
            }
        } else {
            System.out.println("Course '" + course.getCourseName() + "' does not exist");
        }
    }
    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (Map.Entry<Course, List<Student>> entry : enrollmentMap.entrySet()) {
            Course course = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Course: " + course.getCourseName());
            if (students.isEmpty()) {
                System.out.println("No students enrolled");
            } else {
                System.out.println("Enrolled Students:");
                for (Student student : students) {
                    System.out.println("- " + student.getStudentName() + " (" + student.getStudentId() + ")");
                }
            }
        }
    }
}
public class A1Q9 {
    public static void main(String[] args) {
        Student student1 = new Student("001", "Ritikh");
        Student student2 = new Student("002", "Niranjan");
        Course course1 = new Course("001", "Data Structure ");
        Course course2 = new Course("002", "Database Management");
        EnrollmentSystem enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.dropStudent(student2, course1);
        enrollmentSystem.displayEnrollmentDetails();
    }
}