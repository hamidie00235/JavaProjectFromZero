package HospitalAppointmentSystem;

public class Patient {
    private String name;
    private int age;
    private String patientId;

    public Patient(String name, int age, String patientId) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void displayInfo(){
        System.out.println("name:" +name+ "| age:" +age+ "patient Id:" +patientId);
    }
}
