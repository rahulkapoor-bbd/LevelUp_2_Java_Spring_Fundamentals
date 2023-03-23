package com.highschool.model;

import java.util.ArrayList;

public class Student extends Person {
    private String studentNumber;
    private int grade;

    public Student(String name, String id, String surname,String studentNumber, int grade, ArrayList<CulturalActivity> enrolledCulturalActivities) {
        super(name, id, surname);
        this.studentNumber = studentNumber;
        this.grade = grade;
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

    public double calculateTotalAverage() {
        double totalAverage = 0;
        for (int i = 0; i < enrolledSubjects.size(); i++) {
            totalAverage += enrolledSubjects.get(i).getFinalMark();
        }
        totalAverage /= enrolledSports.size();
        return totalAverage;
    }

}
