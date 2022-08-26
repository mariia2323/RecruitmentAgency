package com.example.recruitmentagency.forms;
import com.example.recruitmentagency.model.WorkExperience;
import com.example.recruitmentagency.model.WorkType;

import java.time.LocalDateTime;

public class OfferForm {
    private String id;
    private String name;
    private String description;

    private WorkType workType;
    private String jobTitle;
    private WorkExperience workExperience;
    private Integer rate;
    private String ProjectDescription;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public OfferForm() {
    }

    public OfferForm(String name, String description, WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription) {
        this.name = name;
        this.description = description;
        this.workType = workType;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
        this.rate = rate;
        ProjectDescription = projectDescription;
    }

    public OfferForm(String id, String name, String description, WorkType workType, String jobTitle, WorkExperience workExperience, Integer rate, String projectDescription, LocalDateTime createdAt, LocalDateTime updateAt) {
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
    public String toString() {
        return "OfferForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
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

