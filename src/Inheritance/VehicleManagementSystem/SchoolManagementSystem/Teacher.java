package Inheritance.VehicleManagementSystem.SchoolManagementSystem;

public class Teacher extends Person {
    private int teacherId;
    private String subject;

    public Teacher(String name, int age, int teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("teacher infos:");
        super.displayInfo();
        System.out.println("Teacher id:" + teacherId + "\n Teacher subject:" + subject);
    }

public static void main(String[] args){
        Student s=new Student("ahmed",25,2,"85");
        Teacher t=new Teacher("Mht Nour",27,23,"OOP");
        s.displayInfo();
        t.displayInfo();




    }
}
