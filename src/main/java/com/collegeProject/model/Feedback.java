package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "feedback")
@NoArgsConstructor
@Getter
@Setter
public class Feedback implements Serializable {
    @Id
    private int feedback_id;
    private int Student_id;
    private int feedback_course_id;
    private String feedback_text;
}
