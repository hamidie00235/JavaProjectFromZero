package Inheritance.VehicleManagementSystem.ECommerceShippingSystem;
public class DHL extends ShippingProvider {

    public DHL(String trackingNumber, String address) {
        super(trackingNumber, address);
    }

    @Override
    public void deliverPackage() {
        System.out.println("DHL delivering to: " + address + " with tracking number: " + trackingNumber);
    }
}
