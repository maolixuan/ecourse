package com.ecourse.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_test", schema = "ecourse")
public class EcTest {
    private int testId;
    private Date testTime;
    private String testUnit;

    @Id
    @Column(name = "Test_Id", nullable = false)
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "Test_Time", nullable = true)
    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    @Basic
    @Column(name = "Test_Unit", nullable = true, length = 255)
    public String getTestUnit() {
        return testUnit;
    }

    public void setTestUnit(String testUnit) {
        this.testUnit = testUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcTest ecTest = (EcTest) o;

        if (testId != ecTest.testId) return false;
        if (testTime != null ? !testTime.equals(ecTest.testTime) : ecTest.testTime != null) return false;
        if (testUnit != null ? !testUnit.equals(ecTest.testUnit) : ecTest.testUnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testId;
        result = 31 * result + (testTime != null ? testTime.hashCode() : 0);
        result = 31 * result + (testUnit != null ? testUnit.hashCode() : 0);
        return result;
    }
}
