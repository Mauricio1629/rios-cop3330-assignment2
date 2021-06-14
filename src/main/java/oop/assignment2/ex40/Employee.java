package oop.assignment2.ex40;

import java.util.Comparator;

public class Employee {

    public String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-1s %-17s %-1s %-10s",
                getFirstName(), getLastName(), "|", getPosition(), "|", getSeparationDate());
    }

    public static class firstNameSorter implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        }
    }

    public static class lastNameSorter implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getLastName().compareToIgnoreCase(e2.getLastName());
        }
    }

    public static class positionSorter implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getPosition().compareToIgnoreCase(e2.getPosition());
        }
    }

    public static class separationDateSorter implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getSeparationDate().compareToIgnoreCase(e2.getSeparationDate());
        }
    }
}
