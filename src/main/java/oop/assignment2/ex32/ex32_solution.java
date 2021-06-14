/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
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
            int randomNumber = getNumber(input);
            Again = playGame(randomNumber);

            if (Again.equalsIgnoreCase("N"))
                System.exit(0);

            } while (Again.equalsIgnoreCase("y"));

    }

    public int getNumber(int difficulty) {
        int myNumber;
        if (difficulty == 1) {
            Random rand = new Random();
            myNumber = rand.nextInt(11-1)+1;
        } else if (difficulty == 2) {
            Random rand = new Random();
            myNumber = rand.nextInt(101-1)+1;
        } else {
            Random rand = new Random();
            myNumber = rand.nextInt(1001-1)+1;
        }
        return myNumber;
    }

    public String playGame(int randomNumber) {
        System.out.print("I have my number. What's your guess? ");
        String again;
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
            } else if (guess < randomNumber) {
                System.out.print("Too low. Guess again: ");
                count++;
                guessRight = false;
            } else if (guess > randomNumber) {
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

        do {
            System.out.print("\nDo you wish to play again (Y/N)? ");
            again = in.next();
        } while (!again.equalsIgnoreCase("y") && !again.equalsIgnoreCase("n"));
        return again;
    }
}