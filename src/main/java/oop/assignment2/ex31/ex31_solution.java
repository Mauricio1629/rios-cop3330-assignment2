package oop.assignment2.ex31;

import java.util.Scanner;

public class ex31_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        oop.assignment2.ex31.ex31_solution app = new oop.assignment2.ex31.ex31_solution();
        int restingPulse = app.getPulse();
        int age = app.getAge();
        app.printTable(restingPulse, age);
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

    public void printTable(int restingPulse, int age) {
        int rate;
        System.out.printf("Resting Pulse: %d\tAge: %d\n", restingPulse, age);
        System.out.printf("%1s %5s %1s\n", "Intensity","|","Rate");
        System.out.println("--------------|----------");
        for(int intensity = 55; intensity<= 95; intensity +=5) {
            rate = (((220 - age) - restingPulse) *intensity/100) +restingPulse;
            System.out.printf("%s%s  %10s %1s bpm\n", intensity,"%","|", rate);
        }
    }
}
