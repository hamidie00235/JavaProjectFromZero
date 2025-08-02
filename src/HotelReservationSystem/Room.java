package HotelReservationSystem;

public class Room {
    private int roomNumber;
    private String type;
    private double price;

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Room #" + roomNumber + " | Type: " + type + " | Price: $" + price);
    }
}