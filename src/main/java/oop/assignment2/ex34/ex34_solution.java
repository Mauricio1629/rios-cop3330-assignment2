/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex34;

import java.util.Scanner;

public class ex34_solution {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex34_solution app = new ex34_solution();
        String[] nameList = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        app.showList(nameList);
        String name = app.getNameToRemove();
        nameList = app.editArray(nameList, name);
        app.showList(nameList);
    }

    public String getNameToRemove() {
        System.out.print("\nEnter an employee name to remove: ");
        return in.nextLine();
    }

    public void showList(String[] array1) {
        int size = array1.length;
        System.out.print("There are "+size+" employees:\n");
        for(String s : array1) {
            System.out.print(s + "\n");
        }
    }

    public String[] editArray(String[] array, String name) {
        int size = array.length;
        int index = size;

        for(int i=0; i<size; i++) {
            if(array[i].equalsIgnoreCase(name)) {
                index = i;
            }
        }
        if(index==size) {
            return array;
        }
        String [] copyArray = new String[array.length -1];
        System.arraycopy(array, 0, copyArray,0, index);
        System.arraycopy(array, index+1, copyArray, index, size-index-1);
        return copyArray;
    }
}