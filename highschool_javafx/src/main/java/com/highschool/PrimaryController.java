package com.highschool;

import java.io.IOException;
import java.sql.SQLException;

import com.highschool.model.Student;
import com.highschool.model.Teacher;

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
    private void switchToStudentView() throws Exception {
        System.out.println(cmbStudents.getValue());
        StudentController.setCurrentStudent(new Student(cmbStudents.getValue().substring(cmbStudents.getValue().indexOf(",")+1, cmbStudents.getValue().length()), Integer.parseInt(cmbStudents.getValue().substring(0, cmbStudents.getValue().indexOf(","))), null, null));
        App.setRoot("student");
    }

    @FXML
    private void switchToTeacherView() throws IOException {
        TeacherController.setCurrentTeacher(new Teacher(cmbTeachers.getValue().substring(cmbTeachers.getValue().indexOf(",")+1, cmbTeachers.getValue().length()), Integer.parseInt(cmbTeachers.getValue().substring(0, cmbTeachers.getValue().indexOf(","))), null));
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
        for (int i = 0; i < connection.getTeachers().size(); i++) {
            cmbTeachers.getItems().add(connection.getTeachers().get(i).getId() + ", " + connection.getTeachers().get(i).getName());
        }
    }

    @FXML
    private void initialize() throws Exception {
        getData();
    }


}
