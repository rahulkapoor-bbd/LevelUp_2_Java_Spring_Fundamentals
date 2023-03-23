package com.highschool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollStudentDTO {
    
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
}
