package StudentReportSystem;

import java.util.ArrayList;

public class ReportCard {
    private Student student;
    private ArrayList<Grade> grades;

    public ReportCard(Student student) {
        this.student = student;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
        System.out.println("Grade added: " + grade.getSubject() + " - " + grade.getScore());
    }

    public void displayReport() {
        student.displayInfo();
        for (Grade g : grades) {
            g.displayGrade();
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Ahmed", 3);
        Grade g1 = new Grade("Maths", 90);
        Grade g2 = new Grade("OOP", 75);
        Grade g3 = new Grade("Automata", 50);
        Grade g4 = new Grade("Network", 90);

        ReportCard reportCard = new ReportCard(s);
        reportCard.addGrade(g1);
        reportCard.addGrade(g2);
        reportCard.addGrade(g3);
        reportCard.addGrade(g4);

        System.out.println("\n--- Student Report ---");
        reportCard.displayReport();
    }
}
