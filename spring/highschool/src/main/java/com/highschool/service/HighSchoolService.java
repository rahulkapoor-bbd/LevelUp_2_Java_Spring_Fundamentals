package com.highschool.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highschool.dto.EnrollStudentDTO;
import com.highschool.dto.EnrollTeacherDTO;
import com.highschool.dto.UpdateTeacherDTO;
import com.highschool.exception.ResourceNotFoundException;
import com.highschool.model.Student;
import com.highschool.model.Subject;
import com.highschool.model.Teacher;
import com.highschool.repository.StudentRepository;
import com.highschool.repository.SubjectRespository;
import com.highschool.repository.TeacherRepository;

@Service
public class HighSchoolService {
    
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectRespository subjectRespository;

    @Autowired
    ModelMapper modelMapper;

    //Students
    public Student enrollStudent(EnrollStudentDTO enrollStudentDTO)
    {
        Student student = modelMapper.map(enrollStudentDTO, Student.class);
        return studentRepository.save(student);
    }

    public List<Student> allStudents()
    {
        return studentRepository.findAll();
    }

    //Teacher
    public Teacher enrollTeacher(EnrollTeacherDTO enrollTeacherDTO)
    {
        Teacher teacher = modelMapper.map(enrollTeacherDTO, Teacher.class);
        return teacherRepository.save(teacher);
    }

    public List<Teacher> allTeachers()
    {
        return teacherRepository.findAll();
    }

    public Teacher updateTeacher(Long teacherId, UpdateTeacherDTO updateTeacherDTO)
    {
        Teacher existingTeacher = teacherRepository.findById(teacherId)
            .orElseThrow(() -> new ResourceNotFoundException("Teacher", teacherId));
        existingTeacher.setLastName(updateTeacherDTO.getLastName());
        existingTeacher.setPhoneNumber(updateTeacherDTO.getPhoneNumber());

        return teacherRepository.save(existingTeacher);
    }

    //Subjects
    public Subject createSubject(Long teacherId, Subject subject)
    {
        Teacher existingTeacher = teacherRepository.findById(teacherId)
            .orElseThrow(() -> new ResourceNotFoundException("Teacher", teacherId));
        subject.setTeacherId(existingTeacher.getTeacherId());
        return subjectRespository.save(subject);        
    }

    public List<Subject> getTeacherSubjects(Long teacherId)
    {
        return subjectRespository.getByTeacherId(teacherId);
    }

    public List<Subject> getAllSubjects()
    {
        return subjectRespository.findAll();
    }
}
