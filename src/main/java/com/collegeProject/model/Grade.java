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
@Table(name = "grade")
@NoArgsConstructor
@Getter
@Setter
public class Grade implements Serializable {
    @Id
    private int grade_id;
    private int exam_no;
    private int marks;
    private String grade;
}
