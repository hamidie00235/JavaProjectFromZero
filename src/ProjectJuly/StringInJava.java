package ProjectJuly;

import java.util.Scanner;

public class StringInJava {


    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your password:");

        String password = input.nextLine()

        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasNoSpaces = !password.contains(" ");
        boolean isLongEnough = password.length() >= 8;

        // Parcourir chaque caractère du mot de passe
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Affichage du résultat
        if (isLongEnough && hasUpperCase && hasDigit && hasNoSpaces) {
            System.out.println("✅ Password is valid.");
        } else {
            System.out.println("❌ Invalid password. Reasons:");
            if (!isLongEnough) System.out.println("- Must be at least 8 characters long.");
            if (!hasUpperCase) System.out.println("- Must contain at least one uppercase letter.");
            if (!hasDigit) System.out.println("- Must contain at least one digit.");
            if (!hasNoSpaces) System.out.println("- Must not contain spaces.");
        }

    }
}

