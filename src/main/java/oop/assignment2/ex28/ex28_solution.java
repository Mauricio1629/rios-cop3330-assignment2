/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex28;

import java.util.Scanner;

public class ex28_solution {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex28_solution myApp = new ex28_solution();
        double num1 = myApp.getNumber();
        double num2 = myApp.getNumber();
        double num3 = myApp.getNumber();
        double num4 = myApp.getNumber();
        double num5 = myApp.getNumber();
        double sum = myApp.addNumbers(num1, num2, num3, num4, num5);
        String outputString = myApp.generateOutputString(sum);
        myApp.printOutput(outputString);
    }

    public double getNumber() {
        System.out.print("Enter a number: ");
        double number;
        while(true){
            try{
                number =  in.nextDouble();
                break;
            }catch (Exception e) {
                System.out.print("Try again - Enter a number: ");
                in.next();
            }
        }
        return number;

    }

    public double addNumbers(double num1,double num2,double num3,double num4,double num5) {
        return num1+ num2 + num3 + num4 + num5;
    }

    public String generateOutputString(double number) {
        return "The total is "+number;
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}