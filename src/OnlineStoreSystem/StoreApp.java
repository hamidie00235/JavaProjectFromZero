package OnlineStoreSystem;

public class StoreApp {
    public static void main(String[] args) {
        Product p1 = new Product("Headphones", 29.99);
        Product p2 = new Product("Keyboard", 45.50);
        Product p3 = new Product("Mouse", 15.75);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.showCart();
    }
}
