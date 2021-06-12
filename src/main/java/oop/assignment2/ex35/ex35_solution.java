package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35_solution {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
            ex35_solution app = new ex35_solution();
            String winner = app.retrieveNames();
            app.declareWinner(winner);
        }

        public String retrieveNames() {
            System.out.print("Enter a name: ");
            ArrayList<String> nameList = new ArrayList<>();
            String name = in.nextLine();
            while(!name.equals(" "))
            {
                nameList.add(name);
                System.out.print("Enter a name: ");
                name = in.nextLine();
            }
            Random rand = new Random();
            int randomNumber = rand.nextInt(nameList.size());
            return nameList.get(randomNumber);
        }

        public void declareWinner(String winner) {
            System.out.print("The winner is... "+winner+".");
        }
}