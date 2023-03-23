package com.highschool.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.highschool.dto.EnrollStudentDTO;
import com.highschool.dto.EnrollTeacherDTO;
import com.highschool.model.Student;
import com.highschool.model.Subject;
import com.highschool.model.Teacher;
import com.highschool.repository.StudentRepository;
import com.highschool.repository.SubjectRespository;
import com.highschool.repository.TeacherRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HighSchoolController {
    
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectRespository subjectRespository;

    @Autowired
    ModelMapper modelMapper;

    //Students

    @PostMapping("/students")
    @Operation(summary = "Enroll a new student.", description = "Enroll a new student and return the newly created student.")
    public ResponseEntity<Student> enrollStudent(@RequestBody EnrollStudentDTO enrollStudentDTO)
    {
        Student student = modelMapper.map(enrollStudentDTO, Student.class);
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    @Operation(summary = "Get all students at the school.", description = "Returns all the students enrolled at the school.")
    public ResponseEntity<List<Student>> allStudents()
    {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    //Teachers

    @PostMapping("/teachers")
    @Operation(summary = "Enroll a new teacher.", description = "Enroll a new teacher and return the newly created teacher.")
    public ResponseEntity<Teacher> enrollTeacher(@RequestBody EnrollTeacherDTO enrollTeacherDTO)
    {
        Teacher teacher = modelMapper.map(enrollTeacherDTO, Teacher.class);
        return new ResponseEntity<>(teacherRepository.save(teacher), HttpStatus.CREATED);
    }

    //Subjects
    
    @GetMapping("subjects/{teacherId}")
    public ResponseEntity<List<Subject>> getTeacherSubjects(@PathVariable int teacherId)
    {
        return new ResponseEntity<List<Subject>>(subjectRespository.getByTeacherId(teacherId), HttpStatus.OK);
    }

}
