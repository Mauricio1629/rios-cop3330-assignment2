package oop.assignment2.ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex25_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex25_solution app = new ex25_solution();
        String password = app.getPassword();
        int passwordLevel = app.passwordValidator(password);
        app.printStrength(passwordLevel);
    }
    public String getPassword() {
        System.out.print("Input your password to test its strength: ");
        return in.next();
    }

    public int passwordValidator(String password) {
        int n = password.length();
        boolean hasLetter = false, hasDigit = false, hasSpecial = false;
        Set<Character> set= new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+', '~',
                '`', '?', '=', '<', '>', '.', ',', '{', '}', '[', ']', '\\', '|', ';', ':', '"', '\''));
        for(char i : password.toCharArray())
        {
            if(Character.isLetter(i)){
                hasLetter = true;
            } if(Character.isDigit(i)){
                hasDigit = true;
            } if(set.contains(i)){
                hasSpecial = true;
            }
        }
        System.out.print("The password '"+password+"' ");
        if(hasDigit && hasLetter && hasSpecial && n>=8)
            return 4;
        else if(hasLetter && hasDigit && n>=8)
            return 3;
        else if(hasLetter && n<8)
            return 2;
        else if(hasDigit && n<8)
            return 1;
        else
            return 0;
    }

    public void printStrength(int passwordLevel) {
        switch(passwordLevel) {
            case 0: System.out.print("ERROR: WHAT DID YOU DO???");
                    break;
            case 1: System.out.print("is a very weak password.");
                    break;
            case 2: System.out.print("is a weak password.");
                    break;
            case 3: System.out.print("is a strong password.");
                    break;
            case 4: System.out.print("is a very strong password.");
        }
    }
}