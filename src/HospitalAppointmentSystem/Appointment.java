package HospitalAppointmentSystem;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date= date;
    }

    public void displayAppointmentDetails(){
        System.out.println("Appointment's details:");
       patient.displayInfo();
       doctor.displayInfo();
        System.out.println("date:"+date);
    }

    public static void main(String[] args){
        Patient p =new Patient("leyla omar",28,"P101");
        Doctor d =new Doctor("Dr. Nihat Kaya","Cardiologist");
        Appointment a=new Appointment(p,d,"2025-08-01");

                a.displayAppointmentDetails();

    }
}
