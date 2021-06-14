/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex26;

import java.util.Scanner;

public class ex26_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex26_solution app = new ex26_solution();
        int months = app.calculateMonthsUntilPaidOff();
        app.printOutput(months);
    }

    public int calculateMonthsUntilPaidOff() {
        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        int APR = in.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        double payments = in.nextDouble();
        return PaymentCalculator.OtherMethod(balance, APR, payments);
    }

    public void printOutput(int months) {
        System.out.format("It will take you %d months to pay off this card", months);
    }
}