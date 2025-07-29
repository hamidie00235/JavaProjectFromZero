package ProjectJuly;

import java.util.ArrayList;

public class Course {
    String title;
    String teacherName;
    ArrayList<Student> students;

    public Course(String title, String teacherName) {
        this.title = title;
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayInfo() {
        System.out.println("Course Title: " + title);
        System.out.println("Teacher: " + teacherName);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s);
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Maths", "Nihat");

        Student s1 = new Student("Hamidie", 1);
        Student s2 = new Student("Yakoub", 2);
        Student s3 = new Student("Maya", 3);

        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);

        course.displayInfo();
    }
}
