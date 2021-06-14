package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex27_solutionTest {

    @Test
    void validateInput_test_no_errors_found() {
        ex27_solution app = new ex27_solution();

        String output = app.validateInput("Jarad","Higgins","99999","JW-1234");

        assertEquals("There were no errors found.", output);
    }

    @Test
    void validateInput_test_no_input_for_fname() {
        ex27_solution app = new ex27_solution();

        String output = app.validateInput("","Higgins","99999","JW-1234");

        assertEquals("The first name must be filled in.\nThe first name must be at least 2 characters long.\n"
                ,output);
    }

    @Test
    void validateInput_test_wrong_input_for_lname() {
        ex27_solution app = new ex27_solution();

        String output = app.validateInput("Jarad","h","99999","JW-1234");

        assertEquals("The last name must be at least 2 characters long.\n",output);
    }

    @Test
    void validateInput_test_wrong_input_for_zipcode() {
        ex27_solution app = new ex27_solution();

        String output = app.validateInput("Jarad","Higgins","23df43","JW-1234");

        assertEquals("The zipcode must be a 5 digit number.\n",output);
    }

    @Test
    void validateInput_test_wrong_input_for_ID() {
        ex27_solution app = new ex27_solution();

        String output = app.validateInput("Jarad","Higgins","99999","J1-Ab42");

        assertEquals("The employee ID must be in the format of AA-1234.\n",output);
    }

    @Test
    void validateInput_test_no_input_for_anything() {
        ex27_solution app = new ex27_solution();

        String expected = """
                The first name must be filled in.
                The first name must be at least 2 characters long.
                The last name must be filled in.
                The last name must be at least 2 characters long.
                The zipcode must be a 5 digit number.
                The employee ID must be in the format of AA-1234.
                """;

        String output = app.validateInput("","","","");

        assertEquals(expected,output);
    }
}