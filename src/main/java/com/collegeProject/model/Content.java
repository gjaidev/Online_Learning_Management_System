package com.collegeProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "content")
@NoArgsConstructor
@Getter
@Setter
public class Content implements Serializable {
    @Id
    private int content_id;
    private String content_type;
    private String content_description;
    private int course_id;
}
