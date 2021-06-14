package oop.assignment2.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex38_solutionTest {

    @Test
    void testing_filterEvenNumbers_with_numbers_1_through_8() {
        ex38_solution app = new ex38_solution();

        String[] list = {"1","2","3","4","5","6","7","8"};
        Integer[] expected = {2,4,6,8};

        Integer[] output = app.filterEvenNumbers(list);

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_filterEvenNumbers_with_only_odd_numbers() {
        ex38_solution app = new ex38_solution();

        String[] list = {"1","3","5","7","9","11","13","15"};
        Integer[] expected = {};

        Integer[] output = app.filterEvenNumbers(list);

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_filterEvenNumbers_with_only_even_numbers() {
        ex38_solution app = new ex38_solution();

        String[] list = {"2","4","6","8","10","12","14","16"};
        Integer[] expected = {2,4,6,8,10,12,14,16};

        Integer[] output = app.filterEvenNumbers(list);

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_filterEvenNumbers_with_large_numbers() {
        ex38_solution app = new ex38_solution();

        String[] list = {"2342352","4578458","5434353","83573463","9324524"};
        Integer[] expected = {2342352,4578458,9324524};

        Integer[] output = app.filterEvenNumbers(list);

        assertArrayEquals(expected, output);
    }
}