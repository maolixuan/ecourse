package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_notice_view", schema = "ecourse")
@IdClass(EcNoticeViewPK.class)
public class EcNoticeView {
    private int notId;
    private int userId;

    @Id
    @Column(name = "Not_Id", nullable = false)
    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
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

        EcNoticeView that = (EcNoticeView) o;

        if (notId != that.notId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notId;
        result = 31 * result + userId;
        return result;
    }
}
