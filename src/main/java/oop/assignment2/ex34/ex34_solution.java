package oop.assignment2.ex34;

import java.util.Scanner;

public class ex34_solution {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex34_solution app = new ex34_solution();
        String[] array = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        app.showList(array);
        array = app.editArray(array);
        app.showList(array);
    }

    public void showList(String[] array1) {
        int size = array1.length;
        System.out.print("There are "+size+" employees:\n");
        for(String s : array1) {
            System.out.print(s + "\n");
        }
    }

    public String[] editArray(String[] array) {
        int size = array.length;
        int index = size;
        String name;
        System.out.print("\nEnter an employee name to remove: ");
        name = in.nextLine();
        System.out.print("\n");

        for(int i=0; i<size; i++) {
            if(array[i].equals(name)) {
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