package com.ecourse.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
public class EcUnderstandSelectPK implements Serializable {
    private int undId;
    private int userId;

    @Column(name = "Und_Id", nullable = false)
    @Id
    public int getUndId() {
        return undId;
    }

    public void setUndId(int undId) {
        this.undId = undId;
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

        EcUnderstandSelectPK that = (EcUnderstandSelectPK) o;

        if (undId != that.undId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = undId;
        result = 31 * result + userId;
        return result;
    }
}
