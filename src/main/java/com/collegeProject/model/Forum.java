package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "forum")
@NoArgsConstructor
@Getter
@Setter
public class Forum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int forum_id;
    private int student_id;
    private String forum_text;
}
