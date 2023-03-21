package com.example.highschool.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private String name;
    private int credits;
    private List<Double> testMarks;
    private double finalMark;
}
