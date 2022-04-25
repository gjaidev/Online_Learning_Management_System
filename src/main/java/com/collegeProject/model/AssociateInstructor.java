package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "associate_instructor")
@NoArgsConstructor
@Getter
@Setter
public class AssociateInstructor implements Serializable {
    @Id
    private int associate_instructor_id;
    private String associate_instructor_name;
    private String associate_email;
    private int course_id;
}
