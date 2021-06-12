package oop.assignment2.ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class ex38_solution {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex38_solution app = new ex38_solution();
        app.getNumbers();
    }

    public void getNumbers() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();
        String[] list = data.split(" ");
        Integer[] evenList = filterEvenNumbers(list);
        System.out.print("The even numbers are ");

        for (int i = 0; i < evenList.length; i++) {
            if (i < evenList.length - 1) {
                System.out.print(evenList[i]+" ");
            } else {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    private Integer[] filterEvenNumbers(String[] list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (String s : list) {
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                newList.add(number);
            }
        }
        Integer[] array = new Integer[newList.size()];
        array = newList.toArray(array);
        return array;
    }
}