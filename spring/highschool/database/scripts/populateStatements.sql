INSERT INTO teacher (first_name, last_name, date_of_birth, phone_number)
VALUES 
        ('James', 'Matthew', '1976-03-12', '0728303365'),
        ('John', 'William', '1976-08-26', '0712343365'),
        ('Sello', 'Mbatha', '1981-05-25', '0816783365'),
        ('Frank', 'Muller', '1983-02-12', '0828303435'),
        ('Zuma', 'Reece', '1969-12-10', '0744433215');

INSERT INTO subject (name, grade, description, teacher_id)
VALUES  
        ('English Home Laungauge', 8, 'English for those that speak it at home', 3),
        ('Mathematics', 12, 'Numbers and more Numbers', 3),
        ('Physical Sciences', 11, 'Complex calculations of matter', 1),
        ('Chemistry', 10, 'Introduction to molecules', 2),
        ('Mathematics', 10, 'Introduction to algebra', 4);

INSERT INTO student (student_number, first_name, last_name, date_of_birth)
VALUES 
        ('0000000001','Sihle','Zwane','1997-03-12'),
        ('0000000002','Bonga','Zulu','1997-03-12'),
        ('0000000003','Ntokozo','Mbambo','1997-03-12'),
        ('0000000004','Mpume','Shazi','1997-03-12'),
        ('0000000005','Naomi','Becker','1997-03-12');