package ProjectJuly;

import java.util.Scanner;

public class Methodes {
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static double division(int x, int y) {
        if (y == 0) {
            System.out.println("⚠️ Erreur : Division par zéro !");
            return Double.NaN; // Not a Number
        }
        return (double) x / y;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("✅ Entrez la valeur de A : ");
        int a = input.nextInt();

        System.out.print("✅ Entrez la valeur de B : ");
        int b = input.nextInt();

        System.out.println("\n🔢 Choisissez une opération : ");
        System.out.println("1 ➕ Addition");
        System.out.println("2 ➖ Soustraction");
        System.out.println("3 ✖️ Multiplication");
        System.out.println("4 ➗ Division");

        System.out.print("🎯 Votre choix (1-4) : ");
        int choix = input.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Résultat : " + addition(a, b));
                break;
            case 2:
                System.out.println("Résultat : " + subtraction(a, b));
                break;
            case 3:
                System.out.println("Résultat : " + multiplication(a, b));
                break;
            case 4:
                System.out.println("Résultat : " + division(a, b));
                break;
            default:
                System.out.println("❌ Choix invalide.");
        }

        input.close();
    }
}





