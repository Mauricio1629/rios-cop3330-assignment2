package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24_solutionTest {

    @Test
    void isAnagram_returns_the_right_answer() {

        ex24_solution detector = new ex24_solution();

        boolean actual = detector.isAnagram("NoTe","TONE");

        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_the_right_answer_set2() {

        ex24_solution detector = new ex24_solution();

        boolean actual = detector.isAnagram("Discriminator","Doctrinairism");

        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_the_wrong_answer_set() {

        ex24_solution detector = new ex24_solution();

        boolean actual = detector.isAnagram("difo","god");

        assertFalse(actual);
    }

}