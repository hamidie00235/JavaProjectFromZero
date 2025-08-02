package PharmacyInventorySystem;

public class Medicine {
private String name;
private double price;
private int quantityInStock;

    public Medicine(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void displayInfo(){
        System.out.println("Name:" +name+ "| Price:$"+price + "| Quantity in stock:"+quantityInStock);
    }

}
