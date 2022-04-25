package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "master_survey_instructor")
@NoArgsConstructor
@Getter
@Setter
public class MasterSurveyInstructor implements Serializable {
    @Id
    private int sur_ins_id;
    private int instructor_id;
    private int survey_id;
}
