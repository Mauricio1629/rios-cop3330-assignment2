package oop.assignment2.ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex35_solutionTest {

    @Test
    void testing_random_name_picker_from_ArrayList() {
        ex35_solution app = new ex35_solution();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Difo");
        nameList.add("Fido");
        nameList.add("God");
        nameList.add("Juan");
        nameList.add("SteveFromMinecraft");
        boolean gotName = false;

        String output = app.getWinner(nameList);

        for (String s : nameList) {
            if (s.equals(output)) {
                gotName = true;
                break;
            }
        }
        System.out.print("The winner was "+output);
        assertTrue(gotName);
    }

    @Test
    void testing_random_name_picker_with_numbers() {
        ex35_solution app = new ex35_solution();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("11111");
        nameList.add("22222");
        nameList.add("33333");
        nameList.add("44444");
        nameList.add("55555");
        boolean gotName = false;

        String output = app.getWinner(nameList);

        for (String s : nameList) {
            if (s.equals(output)) {
                gotName = true;
                break;
            }
        }
        System.out.print("The winner was "+output);
        assertTrue(gotName);
    }

    @Test
    void testing_random_name_picker_with_full_names() {
        ex35_solution app = new ex35_solution();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Sir Edward The Third");
        nameList.add("Jarad Higgins");
        nameList.add("Symere Woods");
        nameList.add("Difo the one and only God");
        nameList.add("You the tester win");
        boolean gotName = false;

        String output = app.getWinner(nameList);

        for (String s : nameList) {
            if (s.equals(output)) {
                gotName = true;
                break;
            }
        }
        System.out.print("The winner was "+output);
        assertTrue(gotName);
    }

}