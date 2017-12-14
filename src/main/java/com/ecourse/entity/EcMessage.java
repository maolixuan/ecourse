package com.ecourse.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tomato
 * @create 2017-12-13 下午11:31
 */
@Entity
@Table(name = "ec_message", schema = "ecourse")
public class EcMessage {
    private int msgId;
    private int userId;
    private int courseId;
    private Date msgTime;
    private String msgContent;
    private int msgAnonymous;

    @Id
    @Column(name = "Msg_Id", nullable = false)
    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    @Basic
    @Column(name = "User_Id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "Msg_Time", nullable = true)
    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    @Basic
    @Column(name = "Msg_Content", nullable = true, length = 1000)
    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Basic
    @Column(name = "Msg_Anonymous", nullable = false)
    public int getMsgAnonymous() {
        return msgAnonymous;
    }

    public void setMsgAnonymous(int msgAnonymous) {
        this.msgAnonymous = msgAnonymous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcMessage ecMessage = (EcMessage) o;

        if (msgId != ecMessage.msgId) return false;
        if (userId != ecMessage.userId) return false;
        if (courseId != ecMessage.courseId) return false;
        if (msgAnonymous != ecMessage.msgAnonymous) return false;
        if (msgTime != null ? !msgTime.equals(ecMessage.msgTime) : ecMessage.msgTime != null) return false;
        if (msgContent != null ? !msgContent.equals(ecMessage.msgContent) : ecMessage.msgContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = msgId;
        result = 31 * result + userId;
        result = 31 * result + courseId;
        result = 31 * result + (msgTime != null ? msgTime.hashCode() : 0);
        result = 31 * result + (msgContent != null ? msgContent.hashCode() : 0);
        result = 31 * result + msgAnonymous;
        return result;
    }
}
