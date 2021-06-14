package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36_solutionTest {

    @Test
    void testing_average_function_with_example_output_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        double expected = 400.0;

        double output = app.average(numberList);

        assertEquals(expected, output);
    }
    @Test
    void testing_average_function_with_own_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        double expected = 3.0;

        double output = app.average(numberList);

        assertEquals(expected, output);
    }



    @Test
    void testing_max_with_example_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        int expected = 1000;

        double output = app.max(numberList);

        assertEquals(expected, output);
    }

    @Test
    void testing_max_function_with_own_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        int expected = 5;

        double output = app.max(numberList);

        assertEquals(expected, output);
    }

    @Test
    void testing_min_with_example_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        int expected = 100;

        double output = app.min(numberList);

        assertEquals(expected, output);
    }

    @Test
    void testing_min_function_with_own_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        int expected = 1;

        double output = app.min(numberList);

        assertEquals(expected, output);
    }

    @Test
    void testing_std_with_example_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        double expected = 353.55;

        double output = app.std(numberList,400.0);

        assertEquals(expected, output);
    }
    @Test

    void testing_std_function_with_own_numbers() {
        ex36_solution app = new ex36_solution();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        double expected = 1.41;

        double output = app.std(numberList, 3.0);

        assertEquals(expected, output);
    }
}