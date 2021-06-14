package oop.assignment2.ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex30_solutionTest {

    @Test
    void createTable_using_5_as_input() {
        ex30_solution app = new ex30_solution();

        String expected = """
                1    2    3    4    5
                2    4    6    8   10
                3    6    9   12   15
                4    8   12   16   20
                5   10   15   20   25""".indent(4);

        String output = app.createTable(5);

        assertEquals(expected, output);
    }

    @Test
    void createTable_using_12_as_input_test_2() {
        ex30_solution app = new ex30_solution();

        String expected = """
                 1    2    3    4    5    6    7    8    9   10   11   12
                 2    4    6    8   10   12   14   16   18   20   22   24
                 3    6    9   12   15   18   21   24   27   30   33   36
                 4    8   12   16   20   24   28   32   36   40   44   48
                 5   10   15   20   25   30   35   40   45   50   55   60
                 6   12   18   24   30   36   42   48   54   60   66   72
                 7   14   21   28   35   42   49   56   63   70   77   84
                 8   16   24   32   40   48   56   64   72   80   88   96
                 9   18   27   36   45   54   63   72   81   90   99  108
                10   20   30   40   50   60   70   80   90  100  110  120
                11   22   33   44   55   66   77   88   99  110  121  132
                12   24   36   48   60   72   84   96  108  120  132  144""".indent(3);

        String output = app.createTable(12);

        assertEquals(expected, output);
    }

    @Test
    void createTable_using_1_as_input_test_3() {
        ex30_solution app = new ex30_solution();

        String expected = "    1\n";

        String output = app.createTable(1);

        assertEquals(expected, output);
    }

    @Test
    void createTable_using_13_as_input_test_4() {
        ex30_solution app = new ex30_solution();

        /*The problem states "Create a program that generates a multiplication table for the numbers 1 through 12"
          and my program forces to input a number in that range. But the program can keep generating tables past 12*/

        String expected = """
                    1    2    3    4    5    6    7    8    9   10   11   12   13
                    2    4    6    8   10   12   14   16   18   20   22   24   26
                    3    6    9   12   15   18   21   24   27   30   33   36   39
                    4    8   12   16   20   24   28   32   36   40   44   48   52
                    5   10   15   20   25   30   35   40   45   50   55   60   65
                    6   12   18   24   30   36   42   48   54   60   66   72   78
                    7   14   21   28   35   42   49   56   63   70   77   84   91
                    8   16   24   32   40   48   56   64   72   80   88   96  104
                    9   18   27   36   45   54   63   72   81   90   99  108  117
                   10   20   30   40   50   60   70   80   90  100  110  120  130
                   11   22   33   44   55   66   77   88   99  110  121  132  143
                   12   24   36   48   60   72   84   96  108  120  132  144  156
                   13   26   39   52   65   78   91  104  117  130  143  156  169
                """;

        String output = app.createTable(13);

        assertEquals(expected, output);
    }

    @Test
    void createTable_using_2_as_input_test_5() {
        ex30_solution app = new ex30_solution();

        String expected = """
                    1    2
                    2    4
                """;

        String output = app.createTable(2);

        assertEquals(expected, output);
    }

}