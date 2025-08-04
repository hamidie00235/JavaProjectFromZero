package StudentAttendanceTracker;

import java.util.ArrayList;

public class AttendanceManager {
    private ArrayList<Attendance> attendanceList;

    public AttendanceManager() {
        attendanceList = new ArrayList<>();
    }

    public void addAttendance(Student student, String date, boolean present) {
        Attendance attendance = new Attendance(student, date, present);
        attendanceList.add(attendance);
        System.out.println("Attendance recorded for " + student.getName());
    }

    public void showAllAttendance() {
        System.out.println("===== All Attendance Records =====");
        for (Attendance record : attendanceList) {
            record.displayAttendance();
        }
    }

    // ✅ main method correctly placed outside showAllAttendance
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ahmat");
        Student s2 = new Student(2, "Noura");

        AttendanceManager manager = new AttendanceManager();

        manager.addAttendance(s1, "2025-07-29", true);
        manager.addAttendance(s2, "2025-07-29", false);
        manager.addAttendance(s1, "2025-07-30", true);

        manager.showAllAttendance();
    }
}
