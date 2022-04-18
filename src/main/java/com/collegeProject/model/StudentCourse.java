package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student_course")
@NoArgsConstructor
@Getter
@Setter
public class StudentCourse implements Serializable {
    @Id
    private int student_course_id;
    private int student_id;
    private int course_id;
}
