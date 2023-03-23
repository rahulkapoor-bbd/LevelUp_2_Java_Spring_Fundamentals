package com.highschool.model;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int credits;
    private ArrayList<Double> testMarks;
    private double finalMark;
    
    public Subject() {
    }
    
    public Subject(String name, int credits, ArrayList<Double> testMarks, double finalMark) {
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

    public ArrayList<Double> getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(ArrayList<Double> testMarks) {
        this.testMarks = testMarks;
    }

    public double getFinalMark() {
        return finalMark;
    }
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }
   
}
