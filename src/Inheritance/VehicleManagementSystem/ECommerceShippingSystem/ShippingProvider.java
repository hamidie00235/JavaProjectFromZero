package Inheritance.VehicleManagementSystem.ECommerceShippingSystem;

public abstract class ShippingProvider {
    protected String trackingNumber;
    protected String address;

    public ShippingProvider(String trackingNumber, String address) {
        this.trackingNumber = trackingNumber;
        this.address = address;
    }

    public ShippingProvider() {

    }

    public abstract void deliverPackage();

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
