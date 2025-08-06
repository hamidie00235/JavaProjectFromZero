package Inheritance.VehicleManagementSystem.SchoolManagementSystem;

public class Student extends Person{
    private int studentId;
    private String grade;

    public Student(String name, int age,int studentId,String grade ) {
        super(name, age);
        this.studentId=studentId;
        this.grade=grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student infos:");
        super.displayInfo();
        System.out.println("Student Id:" +studentId+ "\n Student grade:"+grade);
    }
}
