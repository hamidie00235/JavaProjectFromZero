package OnlineShoppingSystem;

import OnlineShoppingSystem.Customer;
import OnlineShoppingSystem.Product;

import java.util.ArrayList;

public class ShoppingCart {
    private Customer customer;
    private ArrayList<Product> products;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void displayCart() {
        System.out.println("\n--- Cart Summary ---");
        customer.displayInfo();
        for (Product p : products) {
            p.displayInfo();
        }
        System.out.println("Total: $" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Customer c = new Customer("Hamidie", "hamidie@example.com");

        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Mouse", 25);

        ShoppingCart cart = new ShoppingCart(c);
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.displayCart();
    }
}
