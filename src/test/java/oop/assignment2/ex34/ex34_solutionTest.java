package oop.assignment2.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex34_solutionTest {

    @Test
    void testing_editArray_removing_John_from_array() {
        ex34_solution app = new ex34_solution();

        String[] array = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[] {"Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] output = app.editArray(array, "John Smith");

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_editArray_removing_Jackie_from_array_with_lowercase() {
        ex34_solution app = new ex34_solution();

        String[] array = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[] {"John Smith", "Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] output = app.editArray(array, "jackie jackson");

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_editArray_removing_Chris_from_array_with_all_uppercase() {
        ex34_solution app = new ex34_solution();

        String[] array = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[] {"John Smith","Jackie Jackson", "Amanda Cullen","Jeremy Goodwin"};
        String[] output = app.editArray(array, "CHRIS JONES");

        assertArrayEquals(expected, output);
    }

    @Test
    void testing_editArray_inputting_no_name() {
        ex34_solution app = new ex34_solution();

        String[] array = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[] {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] output = app.editArray(array, "");

        assertArrayEquals(expected, output);
    }
}