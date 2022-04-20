package com.cse.iitj.application;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(schema = "COURSES", name = "INSTRUCTOR")
public class Instructor {

    @Id
    @Column(name = "instructor_id")
    private Integer instructorId;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "url")
    private String url;
    @Column(name = "job_title")
    private String jobTitle;

}
