package OnlineStoreSystem;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addProduct(Product product){
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public double calculateTotal(){
        double total = 0;
        for(Product p : items){
            total += p.getPrice();
        }
        return total;
    }

    public void showCart(){
        System.out.println("\n🛒 Cart Contents:");
        for(Product p : items){
            p.displayInfo();
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
