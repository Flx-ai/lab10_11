package ru.vsu.cs.kulinchenko.models;

import java.util.Date;

public class Project {
    private String name;
    private int hours;
    private Date startingDate;
    private Date endingDate;
    private ResearchAssociate researchAssociate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public ResearchAssociate getResearchAssociate() {
        return researchAssociate;
    }

    public void setResearchAssociate(ResearchAssociate researchAssociate) {
        this.researchAssociate = researchAssociate;
    }

    public Project(String name, int hours, Date startingDate, Date endingDate, ResearchAssociate researchAssociate) {
        this.name = name;
        this.hours = Math.max(hours, 0);
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.researchAssociate = researchAssociate;
    }
}
