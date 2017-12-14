package com.ecourse.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_notice", schema = "ecourse")
public class EcNotice {
    private int notId;
    private int courseId;
    private int notType;
    private Date notTime;
    private String notContent;
    private String notTitle;

    @Id
    @Column(name = "Not_Id", nullable = false)
    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
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
    @Column(name = "Not_Type", nullable = true)
    public int getNotType() {
        return notType;
    }

    public void setNotType(int notType) {
        this.notType = notType;
    }

    @Basic
    @Column(name = "Not_Time", nullable = true)
    public Date getNotTime() {
        return notTime;
    }

    public void setNotTime(Date notTime) {
        this.notTime = notTime;
    }

    @Basic
    @Column(name = "Not_Content", nullable = true, length = 1000)
    public String getNotContent() {
        return notContent;
    }

    public void setNotContent(String notContent) {
        this.notContent = notContent;
    }

    @Basic
    @Column(name = "Not_Title", nullable = true, length = 255)
    public String getNotTitle() {
        return notTitle;
    }

    public void setNotTitle(String notTitle) {
        this.notTitle = notTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EcNotice)) return false;

        EcNotice ecNotice = (EcNotice) o;

        if (notId != ecNotice.notId) return false;
        if (courseId != ecNotice.courseId) return false;
        if (notType != ecNotice.notType) return false;
        if (notTime != null ? !notTime.equals(ecNotice.notTime) : ecNotice.notTime != null) return false;
        if (notContent != null ? !notContent.equals(ecNotice.notContent) : ecNotice.notContent != null) return false;
        return notTitle != null ? notTitle.equals(ecNotice.notTitle) : ecNotice.notTitle == null;
    }

    @Override
    public int hashCode() {
        int result = notId;
        result = 31 * result + courseId;
        result = 31 * result + notType;
        result = 31 * result + (notTime != null ? notTime.hashCode() : 0);
        result = 31 * result + (notContent != null ? notContent.hashCode() : 0);
        result = 31 * result + (notTitle != null ? notTitle.hashCode() : 0);
        return result;
    }
}
