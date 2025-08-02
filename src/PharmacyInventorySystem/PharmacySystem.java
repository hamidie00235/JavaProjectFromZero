package PharmacyInventorySystem;

public class PharmacySystem {
    public static  void main(String[] args){

Medicine m=new Medicine("Paracetamol",34,100);
Supplier s=new Supplier("PharmaTchad","0023567454554");
Medicine m1=new Medicine("Ibuprofen",15,200);
Supplier s1=new Supplier("MediSupplier","0023565326445");


//inventory object
        InventoryEntry ie=new InventoryEntry(m,s,20);
        InventoryEntry ie1=new InventoryEntry(m1,s1,50);
        ie.showEntry();
        ie1.showEntry();


    }
}
