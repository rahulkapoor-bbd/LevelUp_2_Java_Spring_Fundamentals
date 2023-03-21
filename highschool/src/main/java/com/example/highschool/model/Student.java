package com.example.highschool.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentNumber;
    private int grade;
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
