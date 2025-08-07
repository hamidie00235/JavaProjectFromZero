package Inheritance.VehicleManagementSystem.ECommerceShippingSystem;
public class FedEx extends ShippingProvider {

    public FedEx(String trackingNumber, String address) {
        super();
    }

    @Override
    public void deliverPackage() {
        System.out.println("FedEx dispatching to: " + address + " using tracking number: " + trackingNumber);
    }
    public class Main {
        public static void main(String[] args) {
            DHL dhl = new DHL("TR12345", "Istanbul, Sokak 45");
            FedEx fedEx = new FedEx("FD98765", "Avcılar, Sokak 53");

            dhl.deliverPackage();
            fedEx.deliverPackage();
        }
    }
}

