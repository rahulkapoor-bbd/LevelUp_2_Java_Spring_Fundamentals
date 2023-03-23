package com.highschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highschool.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
