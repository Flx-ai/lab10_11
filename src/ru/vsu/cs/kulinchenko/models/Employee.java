package ru.vsu.cs.kulinchenko.models;

public abstract class Employee {

    private int socialSecurityNumber;
    private String name;
    private String email;

    public Employee(int socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}