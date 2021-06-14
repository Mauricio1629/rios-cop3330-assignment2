/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex39;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex39_solution {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex39_solution app = new ex39_solution();
        List<Employee> list = app.getList();
        app.printList(list);
        String sortMethod = app.howToSort();
        List<Employee> sortedlist = app.getSortList(list, sortMethod);
        app.printList(sortedlist);

    }

    public List<Employee> getList() {
        Employee[] employees = {
                new Employee("John","Johnson","Manager","2016-12-31"),
                new Employee("Tou","Xiong","Software Engineer","2016-10-05"),
                new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employee("Jake","Jacobson","Programmer",""),
                new Employee("Jackquelyn", "Jackson", "DBA",""),
                new Employee("Sally","Webber","Web Developer","2015-12-18")
        };
        return Arrays.asList(employees);
    }

    public void printList(List<Employee> list) {
        System.out.printf("Name %18s Position %10sSeparation Date\n", "|", "|");
        System.out.println("----------------------|-------------------|------------------");
        list.forEach(System.out::println);
    }

    public String howToSort() {
        System.out.print("\nHow would you like to sort by?\n-FirstName\n-LastName\n-Position\n-SeparationDate\ninput: ");
        return in.next();
    }

    public List<Employee> getSortList(List<Employee> list, String sortMethod) {
        if(sortMethod.equalsIgnoreCase("FirstName")){
            list.sort(new Employee.firstNameSorter());
        }
        if(sortMethod.equalsIgnoreCase("LastName")){
            list.sort(new Employee.lastNameSorter());
        }
        if(sortMethod.equalsIgnoreCase("Position")){
            list.sort(new Employee.positionSorter());
        }
        if(sortMethod.equalsIgnoreCase("SeparationDate")){
            list.sort(new Employee.separationDateSorter());
        }
        return list;
    }
}