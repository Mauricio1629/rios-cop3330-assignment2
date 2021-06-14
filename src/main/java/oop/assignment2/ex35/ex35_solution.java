/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35_solution {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
            ex35_solution app = new ex35_solution();
            ArrayList<String> nameList = app.retrieveNames();
            String winner = app.getWinner(nameList);
            app.declareWinner(winner);
        }

        public String getWinner(ArrayList<String> nameList) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(nameList.size());
            return nameList.get(randomNumber);
        }

        public ArrayList<String> retrieveNames() {
            String name;
            System.out.print("Enter a name: ");
            name = in.nextLine();
            ArrayList<String> nameList = new ArrayList<>();
            while(name.equals(" ")){
                System.out.print("You need to put at least one name to continue: ");
                name = in.nextLine();
            }

            while(!name.equals(" "))
            {
                nameList.add(name);
                System.out.print("Enter a name: ");
                name = in.nextLine();
            }
            return nameList;
        }

        public void declareWinner(String winner) {
            System.out.print("The winner is... "+winner+".");
        }
}