package ru.vsu.cs.kulinchenko.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    private int numberOfEmployees = 0;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        numberOfEmployees++;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", faculties=" + faculties +
                '}';
    }
}
