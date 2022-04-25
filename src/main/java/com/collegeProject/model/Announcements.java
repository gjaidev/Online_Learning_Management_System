package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "announcements")
@NoArgsConstructor
@Getter
@Setter
public class Announcements implements Serializable {
    @Id
    private int announcement_id;
    private String announcement_text ;
    private Boolean announcement_Active ;
    private int admin_id;
}
