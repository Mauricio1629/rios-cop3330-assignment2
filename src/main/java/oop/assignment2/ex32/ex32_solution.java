package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class ex32_solution {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex32_solution app = new ex32_solution();
        app.playGame();
    }

    public void playGame() {
        String Again;
        do {
            System.out.print("Let's play Guess the Number!\n\nEnter the difficulty level (1, 2, or 3): ");
            int input = 0;
            boolean isCorrect;
            do {
                try {
                    input = in.nextInt();
                } catch (Exception e) {
                    System.out.print("Please input only numbers: ");
                    in.next();
                }
                    if (input == 1 || input == 2 || input == 3) {
                        isCorrect = true;
                    } else {
                        System.out.print("Input only 1 2 or 3- Try again: ");
                        isCorrect = false;
                    }
            } while (!(isCorrect));

            int myNumber;
            if (input == 1) {
                Random rand = new Random();
                myNumber = rand.nextInt(10);
            } else if (input == 2) {
                Random rand = new Random();
                myNumber = rand.nextInt(100);
            } else {
                Random rand = new Random();
                myNumber = rand.nextInt(1000);
            }
            System.out.print("I have my number. What's your guess? ");
            int guess = 0;
            int count = 0;
            boolean guessRight;
            do {
                try {
                    guess = in.nextInt();
                } catch (Exception e) {
                    System.out.print("Error - Enter only integers - Try again: ");
                }
                if (guess == 0) {
                    count++;
                    guessRight = false;
                } else if (guess < myNumber) {
                    System.out.print("Too low. Guess again: ");
                    count++;
                    guessRight = false;
                } else if (guess > myNumber) {
                    System.out.print("Too high. Guess again: ");
                    count++;
                    guessRight = false;
                } else {
                    count++;
                    System.out.print("You got it in " + count + " guesses!\n");
                    guessRight = true;
                }
                in.nextLine();
            } while (!(guessRight));

            System.out.print("\nDo you wish to play again (Y/N)? ");
            Again = in.next();
            if (Again.equalsIgnoreCase("N"))
                System.exit(0);

            } while (Again.equalsIgnoreCase("y"));

    }
}

