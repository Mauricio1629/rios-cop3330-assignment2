package oop.assignment2.ex28;

import java.util.Scanner;

public class ex28_solution {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex28_solution myApp = new ex28_solution();
        double number = myApp.addNumbers();
        String outputString = myApp.generateOutputString(number);
        myApp.printOutput(outputString);
    }

    public double addNumbers() {
        int count =0;
        double number =0;
        while(count<5){
            System.out.print("Enter a number: ");
            try {
                number += in.nextDouble();
                count++;
            }
            catch(Exception e) {
                System.out.println("Sorry. That's not a valid input");
            }
            in.nextLine();
        }
        return number;
    }

    public String generateOutputString(double number) {
        return "The total is "+number;
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}