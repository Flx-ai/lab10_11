package ru.vsu.cs.kulinchenko.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String name;
    private List<Institute> institutes;

    public Faculty(String name) {
        this.name = name;
        institutes = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(getInstitutes(), faculty.getInstitutes()) && Objects.equals(getName(), faculty.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstitutes(), getName());
    }
}
