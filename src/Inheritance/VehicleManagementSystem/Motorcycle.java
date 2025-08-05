package Inheritance.VehicleManagementSystem;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, double year,boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar=hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("has side car:"+hasSideCar);
    }
}
