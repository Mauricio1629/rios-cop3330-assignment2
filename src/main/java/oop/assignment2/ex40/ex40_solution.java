/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mauricio Rios
 */
package oop.assignment2.ex40;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex40_solution {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex40_solution app = new ex40_solution();
        List<Employee> list = app.getList();
        app.printList(list);
        String searchString = app.getSearchString();
        String searchedList = app.printSortList(list, searchString);
        app.printSearchedList(searchedList);
    }

    public List<Employee> getList() {
        Employee[] employees = {
                new Employee("John", "Johnson", "Manager", "2016-12-31"),
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employee("Jake", "Jacobson", "Programmer", ""),
                new Employee("Jackquelyn", "Jackson", "DBA", ""),
                new Employee("Sally", "Webber", "Web Developer", "2015-12-18")
        };
        return Arrays.asList(employees);
    }

    public void printList(List<Employee> list) {
        System.out.printf("Name %18s Position %10sSeparation Date\n", "|", "|");
        System.out.println("----------------------|-------------------|------------------");
        list.forEach(System.out::println);
    }

    public String getSearchString() {
        System.out.print("\nEnter a search string: ");
        return in.next();
    }

    public String printSortList(List<Employee> list, String searchString) {
        StringBuilder output = new StringBuilder();
        output.append(String.format("Name %18s Position %10sSeparation Date\n", "|", "|"));
        output.append("----------------------|-------------------|------------------\n");
        for (Employee employee : list) {
            if (employee.getFirstName().contains(searchString) || employee.getLastName().contains(searchString)) {
                output.append(String.format("%-10s %-10s %-1s %-17s %-1s %-10s\n", employee.getFirstName(),
                        employee.getLastName(), "|", employee.getPosition(),
                        "|", employee.getSeparationDate()));
            }
        }
        return output.toString();
    }

    public void printSearchedList(String searchedList) {
        System.out.print(searchedList);
    }
}

