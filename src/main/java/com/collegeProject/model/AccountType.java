package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "accountType")
@NoArgsConstructor
@Getter
@Setter
public class AccountType implements Serializable {
    @Id
    private int account_id;
    private String account_Password;
    private String account_email;
}
