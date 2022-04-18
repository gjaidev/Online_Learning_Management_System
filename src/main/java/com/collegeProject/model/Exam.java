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
@Table(name = "exam")
@NoArgsConstructor
@Getter
@Setter
public class Exam implements Serializable {
    @Id
    private int exam_no;
    private Date exam_date;
    private String exam_name;
    private int student_id;
}
