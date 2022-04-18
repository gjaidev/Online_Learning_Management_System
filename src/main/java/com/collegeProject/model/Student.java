package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    @Id
    private int student_id;
    private String student_name;
    private String student_phone_number;
    private String student_email;
    private String student_address;
}
