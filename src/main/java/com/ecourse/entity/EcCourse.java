package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:31
 */
@Entity
@Table(name = "ec_course", schema = "ecourse")
public class EcCourse {
    private int courseId;
    private Integer userId;
    private String courseName;
    private String courseNote;
    private String courseIcode;

    @Id
    @Column(name = "Course_Id", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "User_Id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Course_Name", nullable = true, length = 100)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "Course_Note", nullable = true, length = 200)
    public String getCourseNote() {
        return courseNote;
    }

    public void setCourseNote(String courseNote) {
        this.courseNote = courseNote;
    }

    @Basic
    @Column(name = "Course_Icode", nullable = true, length = 200)
    public String getCourseIcode() {
        return courseIcode;
    }

    public void setCourseIcode(String courseIcode) {
        this.courseIcode = courseIcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcCourse ecCourse = (EcCourse) o;

        if (courseId != ecCourse.courseId) return false;
        if (userId != null ? !userId.equals(ecCourse.userId) : ecCourse.userId != null) return false;
        if (courseName != null ? !courseName.equals(ecCourse.courseName) : ecCourse.courseName != null) return false;
        if (courseNote != null ? !courseNote.equals(ecCourse.courseNote) : ecCourse.courseNote != null) return false;
        if (courseIcode != null ? !courseIcode.equals(ecCourse.courseIcode) : ecCourse.courseIcode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (courseNote != null ? courseNote.hashCode() : 0);
        result = 31 * result + (courseIcode != null ? courseIcode.hashCode() : 0);
        return result;
    }
}
