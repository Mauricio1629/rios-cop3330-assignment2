package oop.assignment2.ex39;

import java.util.*;

public class ex39_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex39_solution app = new ex39_solution();
        app.getWorkers();

    }

    public void getWorkers() {
        //Map<String, String> hMapData = new HashMap<String, String>();
        String[][] employees = new String[4][];

        String[] firstName = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String[] lastName = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] position = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
        String[] sd = {"2016-12-31", "2016-10-05", "2015-12-19", " "," ","2015-12-18"};
        employees[0] = firstName;
        employees[1] = lastName;
        employees[2] = position;
        employees[3] = sd;

        System.out.println("Name\t\t\t\t|Position\t\t\t|Separation Date");
        System.out.println("--------------------|-------------------|--------------------");
        for(int i=0; i< firstName.length;i++) {
            System.out.print("\t|");
            for(int j=0; j< employees.length; j++) {
                System.out.print(employees[j][i]+" ");
            }
            System.out.println("\n");
        }
        //Different way of printing
        for(int i=0; i< firstName.length; i++) {
            System.out.printf("%s %s %-10s %30s %s\n", firstName[i],lastName[i],"|", position[i], sd[i]);
        }




        /*ArrayList<String> firstName = new ArrayList();
        firstName.add("Name");
        firstName.add("John");
        firstName.add("Tou");
        firstName.add("Michaela");
        firstName.add("Jake");
        firstName.add("Jacquelyn");
        firstName.add("Sally");

        ArrayList<String> lastName = new ArrayList();
        lastName.add(null);
        lastName.add("Johnson");
        lastName.add("Xiong");
        lastName.add("Michaelson");
        lastName.add("Jacobson");
        lastName.add("Jackson");
        lastName.add("Webber");

        ArrayList<String> position = new ArrayList();
        position.add("Position");
        position.add("Manager");
        position.add("Software Engineer");
        position.add("District Manager");
        position.add("Programmer");
        position.add("DBA");
        position.add("Web Developer");

        ArrayList<String> sd= new ArrayList();
        sd.add("Separation Date");
        sd.add("2016-12-31");
        sd.add("2016-10-05");
        sd.add("2015-12-19");
        sd.add("");
        sd.add("");
        sd.add("2015-12-18");*/

    }

}
