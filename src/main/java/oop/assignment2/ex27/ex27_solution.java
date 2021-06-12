package oop.assignment2.ex27;

import java.util.Scanner;

public class ex27_solution {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex27_solution app = new ex27_solution();
        String fName = app.getInput("Enter the first name: ");
        String lName = app.getInput("Enter the last name: ");
        String zipcode = app.getInput("Enter the ZIP code: ");
        String ID = app.getInput("Enter the employee ID: ");
        String output = app.validateInput(fName, lName, zipcode, ID);
        app.generateOutput(output);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public String validateInput(String fName, String lName, String zipcode, String ID) {
        String output = "";
        if (!fName.isEmpty()) {
            if (fName.length() < 2) {
                output += "The first name must be at least 2 characters long.\n";
            }
            for (int i = 0; i < fName.length(); i++) {
                if (!Character.isLetter(fName.charAt(i))) {
                    output += "First name has numbers or spaces. \n";
                    break;
                }
            }
        } else {
            output += "The first name must be filled in.\n";
            output += "The first name must be at least 2 characters long.\n";
        }

        if (!lName.isEmpty()) {
            if (lName.length() < 2) {
                output += "The last name must be at least 2 characters long.\n";
            }
            for (int i = 0; i < lName.length(); i++) {
                if (!Character.isLetter(lName.charAt(i))) {
                    output += "Last name has numbers or spaces. \n";
                    break;
                }
            }
        } else {
            output += "The last name must be filled in.\n";
            output += "The last name must be at least 2 characters long.\n";
        }
        if (zipcode.length() == 5) {
            for (int i = 0; i < zipcode.length(); i++) {
                if (!Character.isDigit(zipcode.charAt(i))) {
                    output += "The zipcode must be a 5 digit number.\n";
                    break;
                }
            }
        } else {
            output += "The zipcode must be a 5 digit number.\n";
        }
            boolean idFlag = true;
            if (ID.length() == 7) {
                char ch = ID.charAt(2);
                if (ch != '-') {
                    output += "You forgot the - in ID.";
                }
                for (int i = 0; i < 2; i++) {
                    if (!Character.isLetter(ID.charAt(i))) {
                        output += "The employee ID must be in the format of AA-1234.\n";
                        idFlag = false;
                        break;
                    }
                }
                for (int i = 3; i < 7; i++) {
                    if (!Character.isDigit(ID.charAt(i))) {
                        if (!idFlag)
                            break;
                        output += "The employee ID must be in the format of AA-1234.\n";
                        break;
                    }
                }
            } else {
                output += "The employee ID must be in the format of AA-1234.\n";
            }
            if (output.contentEquals(""))
                output += "There were no errors found.";
            return output;
        }

    public void generateOutput(String output) {
        System.out.print(output);
    }
}