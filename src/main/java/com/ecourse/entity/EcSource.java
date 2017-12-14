package com.ecourse.entity;

import javax.persistence.*;

/**
 * @author tomato
 * @create 2017-12-13 下午11:32
 */
@Entity
@Table(name = "ec_source", schema = "ecourse")
public class EcSource {
    private int sourceId;
    private Integer courseId;
    private String sourceTitle;
    private String sourceLink;
    private String sourcePassword;
    private String sourceUnit;
    private int sourceType;
    private String sourceNote;
    private Integer sourceShare;

    @Id
    @Column(name = "Source_Id", nullable = false)
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "Course_Id", nullable = true)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Source_Title", nullable = true, length = 255)
    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    @Basic
    @Column(name = "Source_Link", nullable = true, length = 255)
    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    @Basic
    @Column(name = "Source_Password", nullable = true, length = 255)
    public String getSourcePassword() {
        return sourcePassword;
    }

    public void setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
    }

    @Basic
    @Column(name = "Source_Unit", nullable = true, length = 255)
    public String getSourceUnit() {
        return sourceUnit;
    }

    public void setSourceUnit(String sourceUnit) {
        this.sourceUnit = sourceUnit;
    }

    @Basic
    @Column(name = "Source_Type", nullable = true)
    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "Source_Note", nullable = true, length = 1000)
    public String getSourceNote() {
        return sourceNote;
    }

    public void setSourceNote(String sourceNote) {
        this.sourceNote = sourceNote;
    }

    @Basic
    @Column(name = "Source_Share", nullable = true)
    public Integer getSourceShare() {
        return sourceShare;
    }

    public void setSourceShare(Integer sourceShare) {
        this.sourceShare = sourceShare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcSource ecSource = (EcSource) o;

        if (sourceId != ecSource.sourceId) return false;
        if (sourceType != ecSource.sourceType) return false;
        if (courseId != null ? !courseId.equals(ecSource.courseId) : ecSource.courseId != null) return false;
        if (sourceTitle != null ? !sourceTitle.equals(ecSource.sourceTitle) : ecSource.sourceTitle != null)
            return false;
        if (sourceLink != null ? !sourceLink.equals(ecSource.sourceLink) : ecSource.sourceLink != null) return false;
        if (sourcePassword != null ? !sourcePassword.equals(ecSource.sourcePassword) : ecSource.sourcePassword != null)
            return false;
        if (sourceUnit != null ? !sourceUnit.equals(ecSource.sourceUnit) : ecSource.sourceUnit != null) return false;
        if (sourceNote != null ? !sourceNote.equals(ecSource.sourceNote) : ecSource.sourceNote != null) return false;
        if (sourceShare != null ? !sourceShare.equals(ecSource.sourceShare) : ecSource.sourceShare != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceId;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (sourceTitle != null ? sourceTitle.hashCode() : 0);
        result = 31 * result + (sourceLink != null ? sourceLink.hashCode() : 0);
        result = 31 * result + (sourcePassword != null ? sourcePassword.hashCode() : 0);
        result = 31 * result + (sourceUnit != null ? sourceUnit.hashCode() : 0);
        result = 31 * result + sourceType;
        result = 31 * result + (sourceNote != null ? sourceNote.hashCode() : 0);
        result = 31 * result + (sourceShare != null ? sourceShare.hashCode() : 0);
        return result;
    }
}
