package Inheritance.VehicleManagementSystem.PaymentSystem;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void makePayment();

    public void paymentInfo() {
        System.out.println("Amount to be paid: $" + amount);
    }
}

