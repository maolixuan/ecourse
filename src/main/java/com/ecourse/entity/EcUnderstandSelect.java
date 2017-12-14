package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_understand_select", schema = "ecourse")
@IdClass(EcUnderstandSelectPK.class)
public class EcUnderstandSelect {
    private int undId;
    private int userId;
    private int undType;

    @Id
    @Column(name = "Und_Id", nullable = false)
    public int getUndId() {
        return undId;
    }

    public void setUndId(int undId) {
        this.undId = undId;
    }

    @Id
    @Column(name = "User_Id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Und_Type", nullable = false)
    public int getUndType() {
        return undType;
    }

    public void setUndType(int undType) {
        this.undType = undType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcUnderstandSelect that = (EcUnderstandSelect) o;

        if (undId != that.undId) return false;
        if (userId != that.userId) return false;
        if (undType != that.undType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = undId;
        result = 31 * result + userId;
        result = 31 * result + undType;
        return result;
    }
}
