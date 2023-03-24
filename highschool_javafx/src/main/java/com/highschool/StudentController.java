package com.highschool;

import java.io.IOException;
import java.sql.SQLException;

import com.highschool.model.Student;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class StudentController {

    private static Student currentStudent;

    public static void setCurrentStudent(Student c) {
        currentStudent = c;
    }

    @FXML
    private Label lblStudentDetails;

    @FXML
    private TextArea txtaEntolledActivities;

    @FXML
    private TextArea txtaNotEnrolledActivities;

    @FXML
    private ComboBox<String> cmbNotEnrolledActivities;
    
    @FXML
    private Button btnEnrollForActivity;

    @FXML
    private Button btnLogout;

    @FXML
    private void showStudentDetails() throws IOException {
        String details = "ID: " + currentStudent.getId() + "\nName: " + currentStudent.getName();
        lblStudentDetails.setText(details);
    }

    @FXML
    private void showEnrollmenttDetails() throws IOException, SQLException {
        DbConnection c = new DbConnection();
        currentStudent.setEnrolledSubjects(c.selectStudentSubjects(currentStudent.getId()));
        String enrollmentDetails = "No activities registered";
        if (currentStudent.getEnrolledSubjects() != null) {
            enrollmentDetails = "";
            for (int i = 0; i < currentStudent.getEnrolledSubjects().size(); i++) {
                enrollmentDetails += currentStudent.getEnrolledSubjects().get(i).getName() + "\n";
            }
        }
        txtaEntolledActivities.setText(enrollmentDetails);
        txtaEntolledActivities.setEditable(false);
    }

    @FXML
    private void showNotEnrollmenttDetails() throws IOException {
        String notEnrollmentDetails = "No activities available";
        cmbNotEnrolledActivities.setPromptText(notEnrollmentDetails);
        cmbNotEnrolledActivities.setEditable(false);
        btnEnrollForActivity.setDisable(true);
    }

    @FXML
    private void logout() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void initialize() throws IOException, SQLException {
        showStudentDetails();
        showEnrollmenttDetails();
        // showNotEnrollmenttDetails();
    }
}