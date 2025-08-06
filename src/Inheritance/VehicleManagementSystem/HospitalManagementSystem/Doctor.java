package Inheritance.VehicleManagementSystem.HospitalManagementSystem;

public class Doctor extends Person {
    private String specialization;
    private int doctorId;

    public Doctor(String name, int age, String specialization, int doctorId) {
        super(name, age);
        this.specialization = specialization;
        this.doctorId = doctorId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor's Infos:");
        super.displayInfo();
        System.out.println("Specialization:"+specialization);
        System.out.println("Doctor id:"+doctorId);
    }
}

