package com.highschool;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private Button btnLogout;

    @FXML
    private void switchToStudentView() throws IOException {
        App.setRoot("student");
    }

    @FXML
    private void switchToTeacherView() throws IOException {
        App.setRoot("teacher");
    }

    @FXML
    private void getData() {
        DbConnection connection = new DbConnection();
        connection.connect();
    }

    @FXML
    private void initialize() throws IOException {
        getData();
    }
}
