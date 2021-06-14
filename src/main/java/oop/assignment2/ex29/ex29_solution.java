/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex29;

import java.util.Scanner;

public class ex29_solution {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex29_solution myApp = new ex29_solution();
        double years = myApp.getYears();
        int rate = myApp.getRate(years);
        String outputString = myApp.generateOutputString(rate);
        myApp.printOutput(outputString);
    }

    public double getYears() {
        double rate = 0;
        boolean isNumber;
        do {
            System.out.print("What is the rate of return? ");
            if (in.hasNextDouble()) {
                rate = in.nextDouble();
                if(rate == 0) {
                    System.out.println("Sorry. You can't enter 0");
                    isNumber = false;
                    rate = 0;
                } else {
                    isNumber = true;
                }
            } else {
                System.out.println("Sorry. That's not a valid input");
                isNumber = false;
                in.next();
            }
        } while(!(isNumber));
        return rate;
    }
    public int getRate(double years) {
        double rate = 72.0/years;
        rate = Math.ceil(rate);
        return (int) rate;
    }

    public String generateOutputString(int years) {
        return "It will take "+years+" years to double your initial investment.";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}