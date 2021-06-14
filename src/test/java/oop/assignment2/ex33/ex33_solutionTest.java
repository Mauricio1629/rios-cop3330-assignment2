package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex33_solutionTest {

    @Test
    void looping_returned_string_from_method_and_looping_through_array_and_comparing_strings() {
        ex33_solution app = new ex33_solution();

        String[] array = new String[] {"Yes.","No.","Maybe.","Ask again later."};
        boolean expectedFlag = false;

        String output = app.getResponse();
        for (String s : array) {
            if (s.equals(output)) {
                expectedFlag = true;
                break;
            }
        }
        assertTrue(expectedFlag);
    }
}