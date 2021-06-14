/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex33;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ex33_solution {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex33_solution app = new ex33_solution();
        app.getQuestion();
        String response = app.getResponse();
        app.printOutput(response);
    }

    public void getQuestion() {
        System.out.print("What's your question? \n> ");
        in.nextLine();
    }

    public String getResponse() {
        String[] array = new String[] {"Yes.","No.","Maybe.","Ask again later."};
        int length = Array.getLength(array);
        Random rand = new Random();
        int int_random = rand.nextInt(length);
        return array[int_random];
    }

    public void printOutput(String response) {
        System.out.print(response);
    }
}