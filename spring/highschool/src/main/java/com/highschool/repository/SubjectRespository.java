package com.highschool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highschool.model.Subject;

public interface SubjectRespository extends JpaRepository<Subject, Long>{
    List<Subject> getByTeacherId(Long teacherId);
}
