package com.cse.iitj.application;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(schema = "COURSES", name = "COURSE_DETAILS")
public class Courses {

    @Id
    @Column(name = "course_id")
    private Integer courseId;
    @Column(name = "title")
    private String title;
    @Column(name = "course_url")
    private String courseUrl;
    @Column(name = "catgory")
    private String category;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Courses [courseId=" + courseId + ", title=" + title + ", courseUrl=" + courseUrl + ", category="
                + category + "]";
    }

}
