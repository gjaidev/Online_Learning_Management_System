package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "admin")
@NoArgsConstructor
@Getter
@Setter
public class Admin implements Serializable {
    @Id
    private int admin_id;
    private String admin_name;
    private String admin_email;
    private String admin_password;
}
