package HotelReservationSystem;
public class Reservation {
    private Customer customer;
    private Room room;

    public Reservation(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    public void showReservation() {
        System.out.println("Reservation Details:");
        customer.displayInfo();
        room.displayInfo();
        System.out.println("-----------------------");
    }
}