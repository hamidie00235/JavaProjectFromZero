package Inheritance.VehicleManagementSystem.PaymentSystem;
public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number: " + cardNumber);
        paymentInfo();
    }
}
