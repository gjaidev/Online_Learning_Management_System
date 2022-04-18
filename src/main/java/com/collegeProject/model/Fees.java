package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "fees")
@NoArgsConstructor
@Getter
@Setter
public class Fees implements Serializable {
    @Id
    private int fee_id;
    private int student_id;
    private int semester_No;
    private float amount;
    private boolean fee_status;
}
