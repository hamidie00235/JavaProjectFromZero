package HotelReservationSystem;

public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void displayInfo(){
        System.out.println("name:"+name+"\n phone:"+phone);
    }
}
