package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex28_solutionTest {

    @Test
    void addNumbers_testing_small_numbers() {
        ex28_solution app = new ex28_solution();

        double output = app.addNumbers(1,2,3,4,5);

        assertEquals(15, output);
    }

    @Test
    void addNumbers_testing_huge_numbers() {
        ex28_solution app = new ex28_solution();

        double output = app.addNumbers(1000000,2000000,3000000,40000000,500000);

        assertEquals(4.65E7, output);
    }

    @Test
    void addNumbers_testing_decimals() {
        ex28_solution app = new ex28_solution();

        double output = app.addNumbers(534.2324,23424.23424,3.2342342,4.234232,5.79604);

        assertEquals(23971.731146200003, output);
    }

    @Test
    void addNumbers_testing_with_input_as_only_zero() {
        ex28_solution app = new ex28_solution();


        double output = app.addNumbers(0,0,0,0,0);

        assertEquals(0, output);
    }
}