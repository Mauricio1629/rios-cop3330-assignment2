package oop.assignment2.ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ex36_solution {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex36_solution app = new ex36_solution();
        ArrayList<Integer> numberList;
        numberList = app.getNumbers();
        //DO ALL THESE FUNCTIONS
        double avg = app.average(numberList);
        int  maxNumber = app.max(numberList);
        int minNumber = app.min(numberList);
        double sd = app.std(numberList, avg);
        String outputString = app.generateOutput(avg, maxNumber, minNumber, sd);
        app.printOutput(outputString);
    }
    public ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.print("Enter a number: ");
        String input;
        //CLEAN THIS UP SEE IF THERE IS A BETTER WAY
        do{
            input = in.next();
            if(input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numberList.add(number);
                System.out.print("Enter a number: ");
            } catch (Exception e) {
                System.out.print("Please enter only integers: ");
            }
        }while(!input.equalsIgnoreCase("done"));
        return numberList;
    }

    public double average(ArrayList<Integer> numberList) {
        double average = 0;
        for (Integer integer : numberList) {
            average += integer;
        }
        average = average/numberList.size();
        return average;
    }

    public int max(ArrayList<Integer> numberList) {
        int max = numberList.get(0);
        for(int i=1; i<numberList.size();i++) {
            if(max< numberList.get(i)) {
                max = numberList.get(i);
            }
        }
        System.out.print(max);
        return max;
    }

    public int min(ArrayList<Integer> numberList) {
        int min = numberList.get(0);
        for(int i=1; i<numberList.size();i++) {
            if(min> numberList.get(i)) {
                min = numberList.get(i);
            }
        }
        System.out.print(min);
        return min ;
    }

    public double std(ArrayList<Integer> numberList, double avg) {
        double std = 0.0;
        for (Integer integer : numberList) {
            std += Math.pow(integer - avg, 2.0);
        }
        std = std/ numberList.size();
        std = Math.sqrt(std);
        return Math.round(std*100.0)/100.0;
    }

    public String generateOutput(double avg, int maxNumber, int minNumber, double sd) {
        return "The average is "+avg+"\nThe minimum is "+minNumber+"\nThe maximum is "+maxNumber+
                "\nThe standard deviation is "+sd;
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}