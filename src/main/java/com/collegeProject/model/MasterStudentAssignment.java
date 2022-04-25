package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "master_student_assignment")
@NoArgsConstructor
@Getter
@Setter
public class MasterStudentAssignment implements Serializable {
    @Id
    private int student_assignment_id;
    private int student_id;
    private int assignment_id;
}
