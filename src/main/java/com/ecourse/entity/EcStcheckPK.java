package com.ecourse.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
public class EcStcheckPK implements Serializable {
    private int checkId;
    private int userId;

    @Column(name = "Check_Id", nullable = false)
    @Id
    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
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

        EcStcheckPK that = (EcStcheckPK) o;

        if (checkId != that.checkId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkId;
        result = 31 * result + userId;
        return result;
    }
}
