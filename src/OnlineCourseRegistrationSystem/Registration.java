package OnlineCourseRegistrationSystem;

public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student,Course course) {
        this.student= student;
        this.course = course;
    }
    public  void displayRegistrationInfo(){
        System.out.println("Registration details:");
        student.displayInfo();
        course.displayInfo();
    }
}
