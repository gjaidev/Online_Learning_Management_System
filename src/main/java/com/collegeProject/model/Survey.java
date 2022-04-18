package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "survey")
@NoArgsConstructor
@Getter
@Setter
public class Survey implements Serializable {
    @Id
    private int survey_id;
    private String survey_topic;
    private boolean survey_active;
    private int instructor_id;
}
