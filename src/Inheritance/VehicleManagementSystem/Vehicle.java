package Inheritance.VehicleManagementSystem;

public class Vehicle {
    private String brand ;
    private String model;
    private double year;

    public Vehicle(String brand, String model, double year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(double year) {
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Vehicle's infos:");
        System.out.println("brand:"+brand+"\n model:"+model+"\n year:"+year);
    }
}
