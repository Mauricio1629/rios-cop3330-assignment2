package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex32_solutionTest {

    @Test
    void testing_random_number_generator_for_difficulty_1() {
        ex32_solution app = new ex32_solution();

        boolean foundNumber = false;

        int randomNumber = app.getNumber(1);

        for(int i=0;i<=10;i++) {
            if(i==randomNumber){
                foundNumber = true;
                break;
            }
        }
        System.out.print("The random number was "+randomNumber);
        assertTrue(foundNumber);
    }

    @Test
    void testing_random_number_generator_for_difficulty_2() {
        ex32_solution app = new ex32_solution();

        boolean foundNumber = false;

        int randomNumber = app.getNumber(2);

        for(int i=0;i<=100;i++) {
            if(i==randomNumber){
                foundNumber = true;
                break;
            }
        }
        System.out.print("The random number was "+randomNumber);
        assertTrue(foundNumber);
    }

    @Test
    void testing_random_number_generator_for_difficulty_3() {
        ex32_solution app = new ex32_solution();

        boolean foundNumber = false;

        int randomNumber = app.getNumber(3);

        for(int i=0;i<=1000;i++) {
            if(i==randomNumber){
                foundNumber = true;
                break;
            }
        }
        System.out.print("The random number was "+randomNumber);
        assertTrue(foundNumber);
    }
}