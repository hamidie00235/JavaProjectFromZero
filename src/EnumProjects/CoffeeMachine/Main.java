package EnumProjects.CoffeeMachine;


import java.util.Scanner;

// 1. Enum for Coffee Sizes
enum CoffeeSize {
    SMALL(2.5, 200),
    MEDIUM(3.5, 300),
    LARGE(4.5, 400);

    private final double price;
    private final int volumeInMl;

    // Constructor
    CoffeeSize(double price, int volumeInMl) {
        this.price = price;
        this.volumeInMl = volumeInMl;
    }

    // Print details method
    public void printDetails() {
        System.out.println(this.name() + " -> Price: $" + price + ", Volume: " + volumeInMl + " ml");
    }

    public double getPrice() {
        return price;
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }
}

// 2. CoffeeMachine class
class CoffeeMachine {
    public void orderCoffee(CoffeeSize size) {
        System.out.println("You chose: " + size.name());
        size.printDetails();
        System.out.println("Enjoy your coffee ☕\n");
    }
}

// 3. Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();

        System.out.println("Welcome to the Coffee Machine!");
        System.out.println("Available sizes: SMALL, MEDIUM, LARGE");

        while (true) {
            System.out.print("Enter your choice (or 'exit' to quit): ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("Thank you! Come again ☕");
                break;
            }

            try {
                CoffeeSize chosenSize = CoffeeSize.valueOf(input);
                machine.orderCoffee(chosenSize);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice! Please enter SMALL, MEDIUM, or LARGE.");
            }
        }


    }
}
