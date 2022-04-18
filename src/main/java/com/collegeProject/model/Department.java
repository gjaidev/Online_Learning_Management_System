package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "department")
@NoArgsConstructor
@Getter
@Setter
public class Department implements Serializable {
    @Id
    private int department_id;
    private String department_name;
    private int instructor_id;
}
