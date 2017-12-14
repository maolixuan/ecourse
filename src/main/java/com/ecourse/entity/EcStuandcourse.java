package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_stuandcourse", schema = "ecourse")
@IdClass(EcStuandcoursePK.class)
public class EcStuandcourse {
    private int courseId;
    private int userId;

    @Id
    @Column(name = "Course_Id", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "User_Id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcStuandcourse that = (EcStuandcourse) o;

        if (courseId != that.courseId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + userId;
        return result;
    }
}
