package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_question", schema = "ecourse")
public class EcQuestion {
    private int queId;
    private Integer testId;
    private String queQuestion;
    private int queType;
    private String queA;
    private String queB;
    private String queC;
    private String queD;
    private int queAns;

    @Id
    @Column(name = "Que_Id", nullable = false)
    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
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
    @Column(name = "Que_Question", nullable = true, length = 255)
    public String getQueQuestion() {
        return queQuestion;
    }

    public void setQueQuestion(String queQuestion) {
        this.queQuestion = queQuestion;
    }

    @Basic
    @Column(name = "Que_Type", nullable = true)
    public int getQueType() {
        return queType;
    }

    public void setQueType(int queType) {
        this.queType = queType;
    }

    @Basic
    @Column(name = "Que_A", nullable = true, length = 255)
    public String getQueA() {
        return queA;
    }

    public void setQueA(String queA) {
        this.queA = queA;
    }

    @Basic
    @Column(name = "Que_B", nullable = true, length = 255)
    public String getQueB() {
        return queB;
    }

    public void setQueB(String queB) {
        this.queB = queB;
    }

    @Basic
    @Column(name = "Que_C", nullable = true, length = 255)
    public String getQueC() {
        return queC;
    }

    public void setQueC(String queC) {
        this.queC = queC;
    }

    @Basic
    @Column(name = "Que_D", nullable = true, length = 255)
    public String getQueD() {
        return queD;
    }

    public void setQueD(String queD) {
        this.queD = queD;
    }

    @Basic
    @Column(name = "Que_Ans", nullable = true)
    public int getQueAns() {
        return queAns;
    }

    public void setQueAns(int queAns) {
        this.queAns = queAns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcQuestion that = (EcQuestion) o;

        if (queId != that.queId) return false;
        if (queType != that.queType) return false;
        if (queAns != that.queAns) return false;
        if (testId != null ? !testId.equals(that.testId) : that.testId != null) return false;
        if (queQuestion != null ? !queQuestion.equals(that.queQuestion) : that.queQuestion != null) return false;
        if (queA != null ? !queA.equals(that.queA) : that.queA != null) return false;
        if (queB != null ? !queB.equals(that.queB) : that.queB != null) return false;
        if (queC != null ? !queC.equals(that.queC) : that.queC != null) return false;
        if (queD != null ? !queD.equals(that.queD) : that.queD != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = queId;
        result = 31 * result + (testId != null ? testId.hashCode() : 0);
        result = 31 * result + (queQuestion != null ? queQuestion.hashCode() : 0);
        result = 31 * result + queType;
        result = 31 * result + (queA != null ? queA.hashCode() : 0);
        result = 31 * result + (queB != null ? queB.hashCode() : 0);
        result = 31 * result + (queC != null ? queC.hashCode() : 0);
        result = 31 * result + (queD != null ? queD.hashCode() : 0);
        result = 31 * result + queAns;
        return result;
    }
}
