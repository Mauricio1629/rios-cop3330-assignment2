package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31_solutionTest {

    @Test
    void getTable_testing_numbers_from_example_output() {
        ex31_solution app = new ex31_solution();

        String expected = """
                Resting Pulse: 65\tAge: 22
                Intensity     | Rate
                --------------|----------
                55%           | 138 bpm
                60%           | 144 bpm
                65%           | 151 bpm
                70%           | 158 bpm
                75%           | 164 bpm
                80%           | 171 bpm
                85%           | 178 bpm
                90%           | 184 bpm
                95%           | 191 bpm
                """;

        String output = app.getTable(65,22);

        assertEquals(expected, output);
    }

    @Test
    void getTable_testing_high_heart_rate() {
        ex31_solution app = new ex31_solution();

        String expected = """
                Resting Pulse: 120\tAge: 22
                Intensity     | Rate
                --------------|----------
                55%           | 162 bpm
                60%           | 166 bpm
                65%           | 170 bpm
                70%           | 174 bpm
                75%           | 178 bpm
                80%           | 182 bpm
                85%           | 186 bpm
                90%           | 190 bpm
                95%           | 194 bpm
                """;

        String output = app.getTable(120,22);

        assertEquals(expected, output);
    }

    @Test
    void getTable_testing_low_heart_rate() {
        ex31_solution app = new ex31_solution();

        String expected = """
                Resting Pulse: 30\tAge: 22
                Intensity     | Rate
                --------------|----------
                55%           | 122 bpm
                60%           | 130 bpm
                65%           | 139 bpm
                70%           | 147 bpm
                75%           | 156 bpm
                80%           | 164 bpm
                85%           | 172 bpm
                90%           | 181 bpm
                95%           | 189 bpm
                """;

        String output = app.getTable(30,22);

        assertEquals(expected, output);
    }

    @Test
    void getTable_testing_high_age_high_heart_rate() {
        ex31_solution app = new ex31_solution();

        String expected = """
                Resting Pulse: 110\tAge: 80
                Intensity     | Rate
                --------------|----------
                55%           | 126 bpm
                60%           | 128 bpm
                65%           | 129 bpm
                70%           | 131 bpm
                75%           | 132 bpm
                80%           | 134 bpm
                85%           | 135 bpm
                90%           | 137 bpm
                95%           | 138 bpm
                """;

        String output = app.getTable(110,80);

        assertEquals(expected, output);
    }
}