package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "course")
@NoArgsConstructor
@Getter
@Setter
public class Course implements Serializable {
    @Id
    private int course_id;
    private String course_name;
    private String course_duration;
}
