package com.example.recruitmentagency.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Offer {
    private String id;
    private WorkType workType;
    private String jobTitle;
    private WorkExperience workExperience;
    private Integer rate;
    private String ProjectDescription;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Offer(String id) {
        this.id = id;
    }

    public Offer(WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription) {
        this.workType = workType;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
        this.rate = rate;
        ProjectDescription = projectDescription;
    }

    public Offer(String id, WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.workType = workType;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
        this.rate = rate;
        ProjectDescription = projectDescription;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getProjectDescription() {
        return ProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        ProjectDescription = projectDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return getId().equals(offer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id='" + id + '\'' +
                ", workType=" + workType +
                ", jobTitle='" + jobTitle + '\'' +
                ", workExperience=" + workExperience +
                ", rate=" + rate +
                ", ProjectDescription='" + ProjectDescription + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
