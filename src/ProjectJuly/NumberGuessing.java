package ProjectJuly;

import java.util.Scanner;

public class NumberGuessing {
    public  static void  main ( String[] args){

        Scanner input =new Scanner(System.in);
        int secret =7;
        int guess=-1;

        System.out.println("Welcome to guessing game:");
        System.out.println("I'm thinking of a number between 1 and 10. Try to guess it!");




        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = input.nextInt();

            if (guess < secret) {
                System.out.println("Too low. Try again.");
            } else if (guess > secret) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number.");
            }
        }


    }
}