package com.highschool;

import java.io.IOException;
import java.sql.SQLException;

import com.highschool.model.Student;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private Button btnLogout;

    @FXML
    private ComboBox<String> cmbStudents;

    @FXML
    private ComboBox<String> cmbTeachers;

    @FXML
    private void switchToStudentView() throws IOException {
        System.out.println(cmbStudents.getValue());
        StudentController.setCurrentStudent(new Student(null, Integer.parseInt(cmbStudents.getValue().substring(0, cmbStudents.getValue().indexOf(","))), null, null));
        App.setRoot("student");
    }

    @FXML
    private void switchToTeacherView() throws IOException {
        App.setRoot("teacher");
    }

    @FXML
    private void getData() throws SQLException {
        DbConnection connection = new DbConnection();
        connection.selectAllStudents();
        connection.selectAllTeachers();
        for (int i = 0; i < connection.getStudents().size(); i++) {
            cmbStudents.getItems().add(connection.getStudents().get(i).getId() + ", " + connection.getStudents().get(i).getName());
        }
        for (int i = 0; i < connection.getStudents().size(); i++) {
            cmbTeachers.getItems().add(connection.getTeachers().get(i).getId() + ", " + connection.getStudents().get(i).getName());
        }
    }

    @FXML
    private void initialize() throws Exception {
        getData();
    }


}
