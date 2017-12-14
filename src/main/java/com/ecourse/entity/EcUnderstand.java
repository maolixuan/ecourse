package com.ecourse.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_understand", schema = "ecourse")
public class EcUnderstand {
    private int undId;
    private int courseId;
    private Date undTime;
    private Integer undMaximum;

    @Id
    @Column(name = "Und_Id", nullable = false)
    public int getUndId() {
        return undId;
    }

    public void setUndId(int undId) {
        this.undId = undId;
    }

    @Basic
    @Column(name = "Course_Id", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Und_Time", nullable = true)
    public Date getUndTime() {
        return undTime;
    }

    public void setUndTime(Date undTime) {
        this.undTime = undTime;
    }

    @Basic
    @Column(name = "Und_Maximum", nullable = true)
    public Integer getUndMaximum() {
        return undMaximum;
    }

    public void setUndMaximum(Integer undMaximum) {
        this.undMaximum = undMaximum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcUnderstand that = (EcUnderstand) o;

        if (undId != that.undId) return false;
        if (courseId != that.courseId) return false;
        if (undTime != null ? !undTime.equals(that.undTime) : that.undTime != null) return false;
        if (undMaximum != null ? !undMaximum.equals(that.undMaximum) : that.undMaximum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = undId;
        result = 31 * result + courseId;
        result = 31 * result + (undTime != null ? undTime.hashCode() : 0);
        result = 31 * result + (undMaximum != null ? undMaximum.hashCode() : 0);
        return result;
    }
}
