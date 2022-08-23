package com.example.recruitmentagency.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Acquirer {
    @Id
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

    public Acquirer() {
    }

    public Acquirer(String name, String description, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education) {
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

    public Acquirer(String id, String name, String description, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.surname = surname;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.workType = workType;
        this.other_data = other_data;
        this.date_of_birth = date_of_birth;
        this.education = education;
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
        Acquirer acquirer = (Acquirer) o;
        return getId().equals(acquirer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Acquirer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", workExperience=" + workExperience +
                ", workType=" + workType +
                ", other_data='" + other_data + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", education=" + education +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}