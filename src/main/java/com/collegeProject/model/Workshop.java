package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "workshop")
@NoArgsConstructor
@Getter
@Setter
public class Workshop implements Serializable {
    @Id
    private int workshop_id;
    private String workshop_subject;
    private Date workshop_date;
    private int instructor_id;
}
