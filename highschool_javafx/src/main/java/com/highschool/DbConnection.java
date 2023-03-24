package com.highschool;

import java.sql.*;
import java.util.ArrayList;

import com.highschool.model.Student;
import com.highschool.model.Subject;
import com.highschool.model.Teacher;

public class DbConnection {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private Connection con;

    public DbConnection() {
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HighSchoolDB", "username", "password");
            // Statement stmt = con.createStatement();
            // ResultSet rs = stmt.executeQuery("SELECT * from subject");
            // while (rs.next())
            // System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
            // rs.getString(3));
            // con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectAllStudents() throws SQLException {
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student");
        int id = 0;
        String studentNumber = null;
        String name = null;
        String surname = null;
        while (rs.next()) {
            id = rs.getInt(1);
            studentNumber = rs.getString(2);
            name = rs.getString(3);
            surname = rs.getString(4);
            students.add(new Student(name, id, surname, studentNumber));
        }

    }

    public void selectAllTeachers() throws SQLException {
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM teacher");
        int id = 0;
        String name = null;
        String surname = null;
        while (rs.next()) {
            id = rs.getInt(1);
            name = rs.getString(2);
            surname = rs.getString(2);
            teachers.add(new Teacher(name, id, surname));
        }

    }

    public ArrayList<Subject> selectStudentSubjects(int id) throws SQLException {
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        ResultSet rs = con.createStatement().executeQuery(
                "select s.*, c.* from student s inner join StudentSubject u on s.student_id = u.student_id inner join Subject c on c.subject_id = u.subject_id;");
        String name = "";
        while (rs.next()) {
            name = rs.getString(7);
            if (id == rs.getInt(1)) {
                subjects.add(new Subject(name, 0, null, 0));
            }
        }
        return subjects;
    }

    public ArrayList<Subject> selectTeacherSubjects(int id) throws SQLException {
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        ResultSet rs = con.createStatement().executeQuery(
                "select * from subject where teacher_id = "+ id +";");
        String name = "";
        while (rs.next()) {
            name = rs.getString(2);
            if (id == rs.getInt(5)) {
                subjects.add(new Subject(name, 0, null, 0));
            }
        }
        return subjects;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

}
