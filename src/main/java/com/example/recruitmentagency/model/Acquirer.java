package com.example.recruitmentagency.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Acquirer {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private WorkExperience workExperience;
    private WorkType workType;
    private String other_data;
    private String date_of_birth;
    private Education education;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Acquirer(String id) {
        this.id = id;
    }

    public Acquirer(String name, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.workType = workType;
        this.other_data = other_data;
        this.date_of_birth = date_of_birth;
        this.education = education;
    }

    public Acquirer(String id, String name, String surname, String patronymic, WorkExperience workExperience, WorkType workType, String other_data, String date_of_birth, Education education, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acquirer acquirer = (Acquirer) o;
        return id.equals(acquirer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Acquirers{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", workType='" + workType + '\'' +
                ", other_data='" + other_data + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", education='" + education + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
