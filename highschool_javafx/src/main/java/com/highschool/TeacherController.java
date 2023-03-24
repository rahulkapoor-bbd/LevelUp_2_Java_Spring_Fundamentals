package com.highschool;

import java.io.IOException;
import java.sql.SQLException;

import com.highschool.model.Teacher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class TeacherController {

    private static Teacher currenTeacher;

    public static void setCurrentTeacher(Teacher t) {
        currenTeacher = t;
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
        String details = "ID: " + currenTeacher.getId() + "\nName: " + currenTeacher.getName();;
        lblStudentDetails.setText(details);
    }

    @FXML
    private void showEnrollmenttDetails() throws IOException, SQLException {
        DbConnection c = new DbConnection();
        currenTeacher.setEnrolledSubjects(c.selectTeacherSubjects(currenTeacher.getId()));
        String enrollmentDetails = "No activities registered";
        if (currenTeacher.getEnrolledSubjects() != null) {
            enrollmentDetails = "";
            for (int i = 0; i < currenTeacher.getEnrolledSubjects().size(); i++) {
                enrollmentDetails += currenTeacher.getEnrolledSubjects().get(i).getName() + "\n";
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