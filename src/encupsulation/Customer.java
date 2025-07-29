package encupsulation;

public class Customer {
    private String name;
    private String email;

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
    }
}


