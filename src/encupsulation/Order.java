package encupsulation;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("------ ORDER DETAILS ------");
        customer.displayInfo();
        product.displayInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotal());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Customer customer = new Customer("john@example.com", "John Doe");
        Product product = new Product("Wireless Mouse", 25.5);
        Order order = new Order(customer, product, 3);

        order.displayOrder();
    }
}
