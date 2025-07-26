package ProjectJuly;

public class BankAccount {
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public double deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
        return balance;
    }

    // Method to withdraw money
    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        return balance;
    }

    // Method to display account info
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Hamidie", 1000);

        ba.displayAccount();
        ba.deposit(500);
        ba.withdraw(300);
        ba.withdraw(1500); // too much
        ba.displayAccount();
    }
}
