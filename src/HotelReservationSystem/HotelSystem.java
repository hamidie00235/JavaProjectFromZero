package HotelReservationSystem;

public class HotelSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ahmat", "+23566000000");
        Customer c2 = new Customer("Fatima", "+23566001111");

        Room r1 = new Room(101, "Single", 5000);
        Room r2 = new Room(202, "Double", 8500);

        Reservation res1 = new Reservation(c1, r1);
        Reservation res2 = new Reservation(c2, r2);

        res1.showReservation();
        res2.showReservation();
    }
}