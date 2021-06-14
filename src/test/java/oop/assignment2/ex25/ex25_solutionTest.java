package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25_solutionTest {

    @Test
    void passwordValidator_test_very_weak_password_returns_1() {
        ex25_solution app = new ex25_solution();

        int output = app.passwordValidator("12345");

        assertEquals(1,output);
    }

    @Test
    void passwordValidator_test_weak_password_returns_2() {
        ex25_solution app = new ex25_solution();

        int output = app.passwordValidator("abcdef");

        assertEquals(2,output);
    }

    @Test
    void passwordValidator_test_strong_password_returns_3() {
        ex25_solution app = new ex25_solution();

        int output = app.passwordValidator("abc123xyz");

        assertEquals(3,output);
    }

    @Test
    void passwordValidator_test_very_strong_password_returns_4() {
        ex25_solution app = new ex25_solution();

        int output = app.passwordValidator("1337h@xor!");

        assertEquals(4,output);
    }

    @Test
    void passwordValidator_test_with_no_input_or_spacebar__will_return_0() {
        ex25_solution app = new ex25_solution();

        int output = app.passwordValidator("");

        assertEquals(0,output);
    }
}