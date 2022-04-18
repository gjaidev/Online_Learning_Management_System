package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "instructor")
@NoArgsConstructor
@Getter
@Setter
public class Instructor implements Serializable {
    @Id
    private int instructor_id;
    private String instuctor_name;
    private String instructor_email;
    private int instructor_experience;
    private String instructor_phone_number;
    private int course_id;
}
