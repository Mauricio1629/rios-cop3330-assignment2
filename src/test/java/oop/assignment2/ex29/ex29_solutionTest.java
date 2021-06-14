package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex29_solutionTest {

    @Test
    void getRate_expected_right_answer() {
        ex29_solution app = new ex29_solution();

        int output = app.getRate(4);

        assertEquals(18, output);
    }

    @Test
    void getRate_with_an_input_bigger_than_72() {
        ex29_solution app = new ex29_solution();

        int output = app.getRate(100);

        assertEquals(1, output);
    }

    @Test
    void getRate_using_a_decimal() {
        ex29_solution app = new ex29_solution();

        int output = app.getRate(5.2);

        assertEquals(14, output);
    }
}