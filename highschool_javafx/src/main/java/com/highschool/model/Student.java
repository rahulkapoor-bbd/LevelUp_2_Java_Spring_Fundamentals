package com.highschool.model;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private int grade;

    public Student() {
    }

    public Student(String studentNumber, int grade, ArrayList<CulturalActivity> enrolledCulturalActivities) {
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.enrolledCulturalActivities = enrolledCulturalActivities;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<CulturalActivity> getEnrolledCulturalActivities() {
        return enrolledCulturalActivities;
    }

    public void setEnrolledCulturalActivities(ArrayList<CulturalActivity> enrolledCulturalActivities) {
        this.enrolledCulturalActivities = enrolledCulturalActivities;
    }

    // private ArrayList<Subject> enrolledSubjects;
    // private ArrayList<Sport> enrolledSports;
    private ArrayList<CulturalActivity> enrolledCulturalActivities;

    // public void enrollForSubjects(ArrayList<Subject> subjects) {
    //     enrolledCulturalActivities.addAll(subjects);
    // }
    // public void enrollForSports(ArrayList<Sport> sports) {
    //     enrolledCulturalActivities.addAll(sports);
    // }

    public void enrollForCulturalActivities(ArrayList<CulturalActivity> culturals) {
        enrolledCulturalActivities.addAll(culturals);
    }

    public double calculateTotalAverage() {
        double totalAverage = 0;
        // for (int i = 0; i < enrolledSports.size(); i++) {
        //     totalAverage += enrolledSports.get(i).getFinalMark();
        // }
        // totalAverage /= enrolledSports.size();
        return totalAverage;
    }

}
