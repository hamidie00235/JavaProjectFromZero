package Inheritance.VehicleManagementSystem.HospitalManagementSystem;

public class Patient extends Person{
    private int id;
    private String disease;

    public Patient(String name, int age, int id, String disease) {
        super(name, age);
        this.id = id;
        this.disease = disease;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient Infos:");
        super.displayInfo();
        System.out.println("Id:"+id+"\n disease:"+disease);
    }


    public static void main(String[] args){
        Doctor d =new Doctor("Dr moussa oki",27,"Gastro",34);
        Patient p =new Patient("Hamidie",25,8,"Stomach ache");
        Patient p1=new Patient("Yosko",22,4,"Constipation");
        d.displayInfo();
        p.displayInfo();
        p1.displayInfo();
    }
}
