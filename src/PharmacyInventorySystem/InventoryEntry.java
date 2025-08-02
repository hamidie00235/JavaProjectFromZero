package PharmacyInventorySystem;

public class InventoryEntry {
    private Medicine medicine;
    private Supplier supplier;
    private int quantityDelivered;

    public InventoryEntry( Medicine medicine,Supplier supplier ,int quantityDelivered) {
        this.medicine = medicine;
        this.supplier = supplier;
        this.quantityDelivered = quantityDelivered;
    }
    public void showEntry(){
        System.out.println("Inventory Entry:");
         medicine.displayInfo();
         supplier.displayInfo();
        System.out.println("Quantity delivered:" +quantityDelivered);
    }
}
