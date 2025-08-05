package Inheritance.VehicleManagementSystem;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, double year,int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors=numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors:"+numberOfDoors);
    }


public static  void main(String[] args) {
        Car c=new Car("Toyota","Corrola",2020,4);
        Motorcycle m=new Motorcycle("Harley Davidson","Iron 883",2021,false);
c.displayInfo();
m.displayInfo();

}
}
