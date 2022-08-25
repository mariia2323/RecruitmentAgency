package com.example.recruitmentagency.forms;

import com.example.recruitmentagency.model.Education;
import com.example.recruitmentagency.model.WorkExperience;
import com.example.recruitmentagency.model.WorkType;

import java.time.LocalDateTime;

public class AcquirerForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private String surname;
    private String patronymic;
    private WorkExperience workExperience;
    private WorkType workType;
    private String other_data;
    private String date_of_birth;
    private Education education;

    public AcquirerForm() {
    }

    public AcquirerForm(String name, String description, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education) {
        this.name = name;
        this.description = description;
        this.surname = surname;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.workType = workType;
        this.other_data = other_data;
        this.date_of_birth = date_of_birth;
        this.education = education;
    }

    public AcquirerForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updateAt, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.surname = surname;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.workType = workType;
        this.other_data = other_data;
        this.date_of_birth = date_of_birth;
        this.education = education;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public String getOther_data() {
        return other_data;
    }

    public void setOther_data(String other_data) {
        this.other_data = other_data;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "AcquirerForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", workExperience=" + workExperience +
                ", workType=" + workType +
                ", other_data='" + other_data + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", education=" + education +
                '}';
    }
}
