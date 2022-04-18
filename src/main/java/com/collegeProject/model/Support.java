package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "support")
@NoArgsConstructor
@Getter
@Setter
public class Support implements Serializable {
    @Id
    private int support_id;
    private String support_name;
    private String support_division;
}
