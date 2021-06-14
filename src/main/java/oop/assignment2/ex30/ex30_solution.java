/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex30;

import java.util.Scanner;

public class ex30_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex30_solution app = new ex30_solution();
        int number = app.getNumber();
        String table = app.createTable(number);
        app.generateOutput(table);
    }

    public int getNumber() {
        boolean flag = true;
        int number = 0;
        do {
            System.out.print("Input any number from 1 to 12 to print multiplication table: ");
            try {
                number = in.nextInt();
                flag = false;
            } catch (Exception e) {
                in.next();
            }

        } while (flag);
        return number;
    }

    public String createTable(int number) {
        StringBuilder table = new StringBuilder();
        for(int i=1; i<=number; i++)
        {
            for(int j=1;j<=number; j++ ) {
                int number2 = i*j;
                table.append(String.format("%5s",number2));
            }
            table.append("\n");
        }
        return table.toString();
    }

    public void generateOutput(String table) {
        System.out.print(table);
    }

}