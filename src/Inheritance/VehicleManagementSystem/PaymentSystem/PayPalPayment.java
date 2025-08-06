package Inheritance.VehicleManagementSystem.PaymentSystem;
public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Email: " + email);
        paymentInfo();
    }
    public class Main {
        public static void main(String[] args) {
            Payment p1 = new CreditCardPayment(100.0, "1234-5678-9012-3456");
            Payment p2 = new PayPalPayment(75.5, "user@example.com");

            p1.makePayment();
            System.out.println("----------------------");
            p2.makePayment();
        }
    }

}
