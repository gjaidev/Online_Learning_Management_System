package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "master_account")
@NoArgsConstructor
@Getter
@Setter
public class MasterAccount implements Serializable {
    @Id
    private int master_id;
    private int account_type;
    private String role_name;
}
