/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex24;

import java.util.Arrays;
import java.util.Scanner;

public class ex24_solution {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex24_solution app = new ex24_solution();
        String word1 = readWord("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String word2 = readWord("Enter the second string: ");
        boolean anagram = app.isAnagram(word1, word2);
        String outputString = app.generateOutputString(anagram, word1, word2);
        app.printOutputString(outputString);
    }

    private static String readWord(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        String sorted1 = new String(array1);
        String sorted2 = new String(array2);
        return sorted1.equalsIgnoreCase(sorted2);
    }

    public String generateOutputString(boolean anagram, String word1, String word2) {
        if(anagram) {
            return "\""+word1+"\" and \""+word2+"\" are anagrams";
        } else {
            return "\""+word1+"\" and \""+word2+"\" are not anagrams";
        }
    }

    public void printOutputString(String outputString) {
        System.out.print(outputString);
    }
}