package OnlineCourseRegistrationSystem;

public class RegistrationSystem {
    public static void main(String[]args){
        Student s=new Student("Abdelhamid",4);
        Student s1=new Student("wardougou",5);
        Student s2 =new Student("rozi",7);

        Course c=new Course("computer ingineering","p342");
        Course c1=new Course("civil engineering","p352");
        Course c2=new Course("Medecine","M532");

        Registration r=new Registration(s,c);
        Registration r1=new Registration(s1,c1);
        Registration r2=new Registration(s2,c2);

        r.displayRegistrationInfo();
        r1.displayRegistrationInfo();
        r2.displayRegistrationInfo();


    }
}
