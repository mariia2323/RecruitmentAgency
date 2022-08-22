package com.example.recruitmentagency.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Offer {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private WorkType workType;
    private String jobTitle;
    private WorkExperience workExperience;
    private Integer rate;
    private String ProjectDescription;

    public Offer() {
    }

    public Offer(String name, String description, WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription) {
        this.name = name;
        this.description = description;
        this.workType = workType;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
        this.rate = rate;
        ProjectDescription = projectDescription;
    }

    public Offer(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updateAt, WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                ", description='" + description + '\'' +
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
