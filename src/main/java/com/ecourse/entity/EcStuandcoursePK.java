package com.ecourse.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
public class EcStuandcoursePK implements Serializable {
    private int courseId;
    private int userId;

    @Column(name = "Course_Id", nullable = false)
    @Id
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Column(name = "User_Id", nullable = false)
    @Id
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

        EcStuandcoursePK that = (EcStuandcoursePK) o;

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
