package com.highschool.model;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.JOptionPane;

public class Teacher extends Person {
    private List<Subject> assignedSubjects;
    
    public Teacher(String name, String id, String surname) {
        super(name, id, surname);
        assignedSubjects = new ArrayList<>();
    }
    
    @Override
    public void registerToSubject(Subject subject) {
	
		if(assignedSubjects.contains(subject)){
			assignedSubjects.add(subject);
		}
		else{
			//JOptionPane.showMessageDialog(this, "Subject already registered!");
		}
    }
    
    @Override
    public List<Subject> getAssignedSubjects() {
        return assignedSubjects;
    }
}





