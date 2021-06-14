package oop.assignment2.ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex37_solutionTest {

    @Test
    void testing_generated_password_with_a_size_of_8() {
        ex37_solution app = new ex37_solution();

        String specialStr = "!@#$%^&*()-+~`?=<>.,{}[]\\|;:\"'";
        String numbersStr = "1234567890";
        boolean special = false;
        boolean numbers = false;
        boolean size = false;
        int specialCount = 0;
        int numbersCount = 0;
        int sizeCount = 0;
        String output = app.generatePassword(8, 3, 3);

        for (int i = 0; i < output.length(); i++) {
            sizeCount++;
        }
        if (sizeCount == 8)
            size = true;

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < numbersStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = numbersStr.charAt(j);
                if (check == check2)
                    numbersCount++;
            }
            if (numbersCount == 3)
                numbers = true;
        }

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < specialStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = specialStr.charAt(j);
                if (check == check2)
                    specialCount++;
            }
            if (specialCount == 3)
                special = true;
        }

        System.out.print("The password was " + output);
        assertTrue(special);
        assertTrue(numbers);
        assertTrue(size);

    }

    @Test
    void testing_generated_password_with_a_size_of_15() {
        ex37_solution app = new ex37_solution();

        String specialStr = "!@#$%^&*()-+~`?=<>.,{}[]\\|;:\"'";
        String numbersStr = "1234567890";
        boolean special = false;
        boolean numbers = false;
        boolean size = false;
        int specialCount = 0;
        int numbersCount = 0;
        int sizeCount = 0;
        String output = app.generatePassword(15, 7, 5);

        for (int i = 0; i < output.length(); i++) {
            sizeCount++;
        }
        if (sizeCount == 15)
            size = true;

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < numbersStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = numbersStr.charAt(j);
                if (check == check2)
                    numbersCount++;
            }
            if (numbersCount == 5)
                numbers = true;
        }

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < specialStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = specialStr.charAt(j);
                if (check == check2)
                    specialCount++;
            }
            if (specialCount == 7)
                special = true;
        }

        System.out.print("The password was " + output);
        assertTrue(special);
        assertTrue(numbers);
        assertTrue(size);

    }

    @Test
    void testing_generated_password_with_a_big_size() {
        ex37_solution app = new ex37_solution();

        String specialStr = "!@#$%^&*()-+~`?=<>.,{}[]\\|;:\"'";
        String numbersStr = "1234567890";
        boolean special = false;
        boolean numbers = false;
        boolean size = false;
        int specialCount = 0;
        int numbersCount = 0;
        int sizeCount = 0;
        String output = app.generatePassword(50, 20, 15);

        for (int i = 0; i < output.length(); i++) {
            sizeCount++;
        }
        if (sizeCount == 50)
            size = true;

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < numbersStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = numbersStr.charAt(j);
                if (check == check2)
                    numbersCount++;
            }
            if (numbersCount == 15)
                numbers = true;
        }

        for (int i = 0; i < output.length(); i++) {
            for (int j = 0; j < specialStr.length(); j++) {
                char check = output.charAt(i);
                char check2 = specialStr.charAt(j);
                if (check == check2)
                    specialCount++;
            }
            if (specialCount == 20)
                special = true;
        }

        System.out.print("The password was " + output);
        assertTrue(special);
        assertTrue(numbers);
        assertTrue(size);

    }
}