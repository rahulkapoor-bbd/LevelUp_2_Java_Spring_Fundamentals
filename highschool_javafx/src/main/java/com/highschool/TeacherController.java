package com.highschool;

import java.io.IOException;

import com.highschool.model.Teacher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class TeacherController {

    private Teacher currenTeacher;

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
        String details = "";
        lblStudentDetails.setText(details);
    }

    @FXML
    private void showEnrollmenttDetails() throws IOException {
        String enrollmentDetails = "No activities registered";
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
    private void initialize() throws IOException {
        showStudentDetails();
        showEnrollmenttDetails();
        showNotEnrollmenttDetails();
    }
}