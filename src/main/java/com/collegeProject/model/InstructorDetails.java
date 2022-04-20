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
public class InstructorDetails implements Serializable {
    private int instructor_id;
    private String instuctor_name;
    private String instructor_email;
    private int instructor_experience;
    private String instructor_phone_number;
    private int course_id;
    private List<Department> departments;
    private List<Survey> surveys;
    private List<Workshop> workshops;
    private List<Student> students;
}
