package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "portfolio")
@NoArgsConstructor
@Getter
@Setter
public class Portfolio implements Serializable {
    @Id
    private int portfolio_id;
    private int student_id;
    private String portfolio_name;
    private String portfolio_description;
}
