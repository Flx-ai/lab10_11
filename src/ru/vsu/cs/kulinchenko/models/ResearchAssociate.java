package ru.vsu.cs.kulinchenko.models;

public class ResearchAssociate extends Employee {
    private Institute institute;

    public ResearchAssociate(int socialSecurityNumber, String name, String email, Institute institute) {
        super(socialSecurityNumber, name, email);
        this.institute = institute;
    }
}
