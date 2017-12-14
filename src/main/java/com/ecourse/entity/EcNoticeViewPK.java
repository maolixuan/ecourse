package com.ecourse.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
public class EcNoticeViewPK implements Serializable {
    private int notId;
    private int userId;

    @Column(name = "Not_Id", nullable = false)
    @Id
    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
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

        EcNoticeViewPK that = (EcNoticeViewPK) o;

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
