package ru.vsu.cs.kulinchenko.models;

public class Course {
    private final int uniqueNumber;
    private String name;
    private int weeklyDuration;

    public Course(int uniqueNumber, String name, int weeklyDuration) {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeeklyDuration() {
        return weeklyDuration;
    }

    public void setWeeklyDuration(int weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }
}
