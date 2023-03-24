package com.highschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.highschool.dto.EnrollStudentDTO;
import com.highschool.dto.EnrollTeacherDTO;
import com.highschool.dto.UpdateTeacherDTO;
import com.highschool.model.Student;
import com.highschool.model.Subject;
import com.highschool.model.Teacher;
import com.highschool.service.HighSchoolService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HighSchoolController {

    @Autowired
    HighSchoolService highSchoolService;

    //Students

    @PostMapping("/students")
    @Operation(summary = "Enroll a new student.", description = "Enroll a new student and return the newly created student.")
    public ResponseEntity<Student> enrollStudent(@RequestBody EnrollStudentDTO enrollStudentDTO)
    {
        return new ResponseEntity<>(highSchoolService.enrollStudent(enrollStudentDTO), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    @Operation(summary = "Get all students at the school.", description = "Returns all the students enrolled at the school.")
    public ResponseEntity<List<Student>> allStudents()
    {
        return new ResponseEntity<>(highSchoolService.allStudents(), HttpStatus.OK);
    }

    //Teachers

    @PostMapping("/teachers")
    @Operation(summary = "Enroll a new teacher.", description = "Enroll a new teacher and return the newly created teacher.")
    public ResponseEntity<Teacher> enrollTeacher(@RequestBody EnrollTeacherDTO enrollTeacherDTO)
    {
        return new ResponseEntity<>(highSchoolService.enrollTeacher(enrollTeacherDTO), HttpStatus.CREATED);
    }

    @GetMapping("/teachers")
    @Operation(summary = "Get teachers that work at the school.", description = "Returns a list of all teachers working at the school.")
    public ResponseEntity<List<Teacher>> allTeachers()
    {
        return new ResponseEntity<>(highSchoolService.allTeachers(), HttpStatus.OK);
    }

    @PutMapping("/teachers/{teacherId}")
    @Operation(summary = "Update an existing teacher.", description = "Updates and returns an exisiting teacher.")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long teacherId, @RequestBody UpdateTeacherDTO UpdateTeacherDTO)
    {
        return new ResponseEntity<>(highSchoolService.updateTeacher(teacherId, UpdateTeacherDTO), HttpStatus.OK);
    }
    //Subjects

    @PostMapping("subjects/{teacherId}")
    @Operation(summary = "Assign an exisiting teacher to a new subject.", description = "Returns new subject associated with an exisiting teacher.")
    public ResponseEntity<Subject> createSubject(@PathVariable Long teacherId, @RequestBody Subject subject)
    {
        return new ResponseEntity<>(highSchoolService.createSubject(teacherId, subject), HttpStatus.CREATED);
    }
    
    @GetMapping("subjects/{teacherId}")
    @Operation(summary = "Get subjects taught by a specific teacher.", description = "Returns all subjects taught by a teacher.")
    public ResponseEntity<List<Subject>> getTeacherSubjects(@PathVariable Long teacherId)
    {
        return new ResponseEntity<List<Subject>>(highSchoolService.getTeacherSubjects(teacherId), HttpStatus.OK);
    }

    @GetMapping("/subjects")
    @Operation(summary = "Get all subjects offered at the school", description = "Return all subjects taught at the school")
    public ResponseEntity<List<Subject>> getAllSubjects()
    {
        return new ResponseEntity<List<Subject>>(highSchoolService.getAllSubjects(), HttpStatus.OK);
    }

}
