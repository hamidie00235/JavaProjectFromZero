package PharmacyInventorySystem;

public class Supplier {
    private String name;
    private String contact;

    public Supplier(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public void displayInfo(){
        System.out.println("Name:"+name+"|Contact:"+contact);
    }

}
