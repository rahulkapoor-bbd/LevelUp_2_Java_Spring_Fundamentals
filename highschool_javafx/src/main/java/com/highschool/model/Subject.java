package com.highschool.model;

import java.util.List;

public class Subject {
    private String name;
    private int credits;
    private List<Double> testMarks;
    private double finalMark;
    
    public Subject() {
    }
    
    public Subject(String name, int credits, List<Double> testMarks, double finalMark) {
        this.name = name;
        this.credits = credits;
        this.testMarks = testMarks;
        this.finalMark = finalMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Double> getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(List<Double> testMarks) {
        this.testMarks = testMarks;
    }

    public double getFinalMark() {
        return finalMark;
    }
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }
   
}
