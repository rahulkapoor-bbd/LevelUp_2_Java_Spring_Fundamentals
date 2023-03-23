DROP USER IF EXISTS username@'localhost';
DROP DATABASE IF EXISTS HighSchoolDB;

CREATE DATABASE IF NOT EXISTS HighSchoolDB;

USE HighSchoolDB;

CREATE USER IF NOT EXISTS username@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON HighSchoolDB.* TO username@'localhost';

CREATE TABLE `Student` (
  `student_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `student_number` varchar(10),
  `first_name` varchar(255),
  `last_name` varchar(255),
  `date_of_birth` datetime
);

CREATE TABLE `Teacher` (
  `teacher_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `first_name` varchar(255),
  `last_name` varchar(255),
  `date_of_birth` datetime,
  `phone_number` varchar(255)
);

CREATE TABLE `Subject` (
  `subject_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(255),
  `grade` int,
  `description` varchar(255),
  `teacher_id` int
);

CREATE TABLE `StudentSubject` (
  `student_id` int,
  `subject_id` int
);

CREATE TABLE `Classroom` (
  `class_room_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `teacher_id` int
);

CREATE TABLE `ClassroomStudent` (
  `student_id` int,
  `class_room_id` int,
  PRIMARY KEY (`student_id`, `class_room_id`)
);

CREATE TABLE `Exam` (
  `exam_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `date` datetime,
  `exam_name` varchar(255)
);

CREATE TABLE `Result` (
  `result_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `exam_id` int,
  `student_id` int,
  `subject_id` int,
  `marks` double
);

ALTER TABLE `StudentSubject` ADD FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`);

ALTER TABLE `StudentSubject` ADD FOREIGN KEY (`subject_id`) REFERENCES `Subject` (`subject_id`);

ALTER TABLE `ClassroomStudent` ADD FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`);

ALTER TABLE `ClassroomStudent` ADD FOREIGN KEY (`class_room_id`) REFERENCES `Classroom` (`class_room_id`);

ALTER TABLE `Result` ADD FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`);

ALTER TABLE `Result` ADD FOREIGN KEY (`exam_id`) REFERENCES `Exam` (`exam_id`);

ALTER TABLE `Result` ADD FOREIGN KEY (`subject_id`) REFERENCES `Subject` (`subject_id`);

ALTER TABLE `Classroom` ADD FOREIGN KEY (`teacher_id`) REFERENCES `Teacher` (`teacher_id`);

ALTER TABLE `Subject` ADD FOREIGN KEY (`teacher_id`) REFERENCES `Teacher` (`teacher_id`);
