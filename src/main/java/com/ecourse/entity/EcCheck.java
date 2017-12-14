package com.ecourse.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tomato
 * @create 2017-12-13 下午11:31
 */
@Entity
@Table(name = "ec_check", schema = "ecourse")
public class EcCheck {
    private int checkId;
    private Date checkTime;
    private Integer courseId;

    @Id
    @Column(name = "Check_Id", nullable = false)
    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "Check_Time", nullable = true)
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "Course_Id", nullable = true)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcCheck ecCheck = (EcCheck) o;

        if (checkId != ecCheck.checkId) return false;
        if (checkTime != null ? !checkTime.equals(ecCheck.checkTime) : ecCheck.checkTime != null) return false;
        if (courseId != null ? !courseId.equals(ecCheck.courseId) : ecCheck.courseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkId;
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }
}
