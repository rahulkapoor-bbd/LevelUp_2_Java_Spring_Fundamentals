package com.highschool.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollTeacherDTO {
    
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String phoneNumber;
}
