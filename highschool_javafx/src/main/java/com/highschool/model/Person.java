package com.highschool.model;

import java.util.ArrayList;

public class Person {
    protected String name;
    protected String surname;
    protected int id;
    protected ArrayList<Subject> enrolledSubjects;
    protected ArrayList<Sport> enrolledSports;
    protected ArrayList<CulturalActivity> enrolledCulturalActivities;

    public Person(String name, int id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.enrolledSubjects = new ArrayList<Subject>();
        this.enrolledSports = new ArrayList<Sport>();
        this.enrolledCulturalActivities = new ArrayList<CulturalActivity>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(ArrayList<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public ArrayList<Sport> getEnrolledSports() {
        return enrolledSports;
    }

    public void setEnrolledSports(ArrayList<Sport> enrolledSports) {
        this.enrolledSports = enrolledSports;
    }

    public ArrayList<CulturalActivity> getEnrolledCulturalActivities() {
        return enrolledCulturalActivities;
    }

    public void setEnrolledCulturalActivities(ArrayList<CulturalActivity> enrolledCulturalActivities) {
        this.enrolledCulturalActivities = enrolledCulturalActivities;
    }

    public void enrollForSubjects(ArrayList<Subject> subjects) {
        enrolledSubjects.addAll(subjects);
    }

    public void enrollForSports(ArrayList<Sport> sports) {
        enrolledSports.addAll(sports);
    }

    public void enrollForCulturalActivities(ArrayList<CulturalActivity> culturals) {
        enrolledCulturalActivities.addAll(culturals);
    }
}
