package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void otherMethod_testing_correct_output() {
        PaymentCalculator app = new PaymentCalculator();

        int output = app.OtherMethod(5000, 12, 100);

        assertEquals(70,output);

    }

    @Test
    void otherMethod_testing_correct_output_set2() {
        PaymentCalculator app = new PaymentCalculator();

        int output = app.OtherMethod(4000, 15, 100);

        assertEquals(56,output);

    }

    @Test
    void otherMethod_testing_correct_output_set3() {
        PaymentCalculator app = new PaymentCalculator();

        int output = app.OtherMethod(12000, 20, 300);

        assertEquals(67,output);

    }


}