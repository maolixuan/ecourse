package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:31
 */
@Entity
@Table(name = "ec_answer", schema = "ecourse", catalog = "")
public class EcAnswer {
    private int ansId;
    private Integer userId;
    private Integer testId;
    private Integer queId;
    private int ansAnswer;

    @Id
    @Column(name = "Ans_Id", nullable = false)
    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    @Basic
    @Column(name = "User_Id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Test_Id", nullable = true)
    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "Que_Id", nullable = true)
    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    @Basic
    @Column(name = "Ans_Answer", nullable = true)
    public int getAnsAnswer() {
        return ansAnswer;
    }

    public void setAnsAnswer(int ansAnswer) {
        this.ansAnswer = ansAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcAnswer ecAnswer = (EcAnswer) o;

        if (ansId != ecAnswer.ansId) return false;
        if (ansAnswer != ecAnswer.ansAnswer) return false;
        if (userId != null ? !userId.equals(ecAnswer.userId) : ecAnswer.userId != null) return false;
        if (testId != null ? !testId.equals(ecAnswer.testId) : ecAnswer.testId != null) return false;
        if (queId != null ? !queId.equals(ecAnswer.queId) : ecAnswer.queId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ansId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (testId != null ? testId.hashCode() : 0);
        result = 31 * result + (queId != null ? queId.hashCode() : 0);
        result = 31 * result + ansAnswer;
        return result;
    }
}
