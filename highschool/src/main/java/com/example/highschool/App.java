package com.example.highschool;

import com.example.highschool.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student examplStudent = new Student("216000924");
        System.out.println(examplStudent.getStudentNumber());
    }
}
