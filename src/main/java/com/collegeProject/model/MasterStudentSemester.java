package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "master_student_semster")
@NoArgsConstructor
@Getter
@Setter
public class MasterStudentSemester implements Serializable {
    @Id
    private int student_semester_id;
    private int student_id;
    private int semester_id;
}
