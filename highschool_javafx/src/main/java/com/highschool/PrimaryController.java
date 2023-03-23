package com.highschool;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToStudentView() throws IOException {
        App.setRoot("student");
    }

    @FXML
    private void switchToTeacherView() throws IOException {
        App.setRoot("teacher");
    }
}
