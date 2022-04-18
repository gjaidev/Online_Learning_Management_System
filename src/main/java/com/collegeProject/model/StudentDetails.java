package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class StudentDetails implements Serializable {
    private int student_id;
    private String student_name;
    private String student_phone_number;
    private String student_email;
    private String student_address;
    private List<Course> student_courses;
    private Fees student_fee;
    private Semester student_semester;
    private List<Exam> student_exams;
    private List<Assignment> student_assignments;
    private List<Grade> student_grades;
    private List<Instructor> student_instructors;
    private List<Forum> student_forums;
}
