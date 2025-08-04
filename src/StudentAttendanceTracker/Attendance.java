package StudentAttendanceTracker;

public class Attendance {
    private Student student;
    private String date;
    private boolean present;

    public Attendance(Student student, String date, boolean present) {
        this.student = student;
        this.date = date;
        this.present = present;
    }

    public Student getStudent() {
        return student;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void displayAttendance() {
        System.out.println("Date: " + date + " | Student: " + student.getName() + " | Present: " + (present ? "Yes" : "No"));
    }
}
