package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "semester")
@NoArgsConstructor
@Getter
@Setter
public class Semester implements Serializable {
    @Id
    private int semester_id;
    private int semester_no;
    private String semester_name;
    private int student_id;
}
