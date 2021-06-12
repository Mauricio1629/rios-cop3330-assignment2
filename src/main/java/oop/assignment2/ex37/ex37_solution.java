package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ex37_solution {
    public Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex37_solution app = new ex37_solution();
        int size = app.getNumber("Whats the minimum length? ");
        int special = app.getNumber("How many special characters? ");
        int numbers = app.getNumber("How many numbers? ");
        String password = app.generatePassword(size, special, numbers);
        app.printPassword(password);
    }

    public int getNumber(String prompt) {
        int number;
        while(true) {
            try {
                System.out.print(prompt);
                number = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error enter only numbers");
                in.next();
            }
        }
        return number;
    }

    public String generatePassword(int size, int special, int numbers) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()-+~`?=<>.,{}[]\\|;:\"'";
        String digits = "1234567890";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        ArrayList<Character> passwordString = new ArrayList<>();

        for(int i=0; i<special; i++) {
            passwordString.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
        for(int i=0; i<numbers; i++) {
            passwordString.add(digits.charAt(random.nextInt(digits.length())));
        }
        for(int i=passwordString.size()-1; i<size-1; i++) {
            passwordString.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(passwordString);

        for(int i=0; i<size; i++) {
            password.append(passwordString.get(i));
        }

        return password.toString();
    }

    public void printPassword(String password) {
        System.out.println("Your password is "+password);
    }
}