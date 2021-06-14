/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex31;

import java.util.Scanner;

public class ex31_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        oop.assignment2.ex31.ex31_solution app = new oop.assignment2.ex31.ex31_solution();
        int restingPulse = app.getPulse();
        int age = app.getAge();
        String output = app.getTable(restingPulse, age);
        app.printOutput(output);
    }

    public int getPulse() {
        int restingPulse;
        while (true) {
            System.out.print("What is your resting heart rate?: ");
            String input = in.next();
            try {
                restingPulse = Integer.parseInt(input);
                break;
            } catch (Exception e){
                System.out.println("Invalid input");
            }
        }
        return restingPulse;
    }

    public int getAge() {
        int age;
        while (true) {
            System.out.print("What is your age?: ");
            String input = in.next();
            try {
                age = Integer.parseInt(input);
                break;
            } catch (Exception e){
                System.out.println("Invalid input");
            }
        }
        return age;
    }

    public String getTable(int restingPulse, int age) {
        int rate;
        StringBuilder table = new StringBuilder();
        table.append(String.format("Resting Pulse: %d\tAge: %d\n", restingPulse, age));
        table.append(String.format("%1s %5s %1s\n", "Intensity","|","Rate"));
        table.append("--------------|----------\n");
        for(int intensity = 55; intensity<= 95; intensity +=5) {
            rate = (((220 - age) - restingPulse) *intensity/100) +restingPulse;
            table.append(String.format("%s%s  %10s %1s bpm\n", intensity,"%","|", rate));
        }
        return table.toString();
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
