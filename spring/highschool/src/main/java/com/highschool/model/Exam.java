package com.highschool.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "exam")
public class Exam {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id")
    private Long subjectId;

    @Column(name = "exam_date")
    private Date examDate;

    @Column(name = "exam_name")
    private String examName;

    public Exam(Date examDate, String examName) {
        this.examDate = examDate;
        this.examName = examName;
    }
    
}
