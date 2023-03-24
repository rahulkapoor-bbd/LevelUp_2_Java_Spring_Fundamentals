package com.highschool.model;

import java.util.ArrayList;

public class Student extends Person {
    private String studentNumber;

    public Student(String name, int id, String surname,String studentNumber) {
        super(name, id, surname);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    // public int getGrade() {
    //     return grade;
    // }

    // public void setGrade(int grade) {
    //     this.grade = grade;
    // }

    public double calculateTotalAverage() {
        double totalAverage = 0;
        for (int i = 0; i < enrolledSubjects.size(); i++) {
            totalAverage += enrolledSubjects.get(i).getFinalMark();
        }
        totalAverage /= enrolledSports.size();
        return totalAverage;
    }

}
