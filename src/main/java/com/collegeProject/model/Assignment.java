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
@Table(name = "assignment")
@NoArgsConstructor
@Getter
@Setter
public class Assignment implements Serializable {
    @Id
    private int assignment_id;
    private String assignment_title;
    private Date start_date;
    private Date due_date;
    private int student_id;
}
