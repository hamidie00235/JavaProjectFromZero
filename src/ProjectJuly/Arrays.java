package ProjectJuly;

import java.util.Scanner;


public class Arrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration du tableau
        int[] notes = new int[5];

        // Saisie des 5 notes
        System.out.println("📝 Entrez 5 notes d'un élève :");
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            notes[i] = scanner.nextInt();
        }

        // Affichage des notes
        System.out.println("\n📋 Notes saisies :");
        for (int note : notes) {
            System.out.println(note);
        }

        // Calcul somme, moyenne, min et max
        int somme = 0;
        int min = notes[0];
        int max = notes[0];

        for (int note : notes) {
            somme += note;

            if (note < min) {
                min = note;
            }
            if (note > max) {
                max = note;
            }
        }

        double moyenne = (double) somme / notes.length;

        // Résultat
        System.out.println("\n📊 Résultats :");
        System.out.println("➤ Somme : " + somme);
        System.out.println("➤ Moyenne : " + moyenne);
        System.out.println("➤ Note min : " + min);
        System.out.println("➤ Note max : " + max);

        if (moyenne >= 10) {
            System.out.println("✅ L’élève est admis !");
        } else {
            System.out.println("❌ L’élève est refusé.");
        }

    }
}



