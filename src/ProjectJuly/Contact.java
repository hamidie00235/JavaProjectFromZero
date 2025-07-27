package ProjectJuly;

public class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void displayInfo(){
        System.out.println("name:"+name);
        System.out.println("phoneNumber:"+phoneNumber);
        System.out.println("email:"+email);
    }
    public static void main(String[] args){
        Contact c=new Contact("ali maya kaya","0555343","alimayak@gmail.com");
        Contact c1=new Contact(" maya kaya","05455322","mayak@gmail.com");
        c.displayInfo();
        c1.displayInfo();
    }
}
