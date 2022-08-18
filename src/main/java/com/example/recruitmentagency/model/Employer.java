package com.example.recruitmentagency.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Employer {
    private String id;
    private String name;
    private String company;
    private String address;
    private String phone_number;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Employer(String id) {
        this.id = id;
    }

    public Employer(String name, String company, String address, String phone_number) {
        this.name = name;
        this.company = company;
        this.address = address;
        this.phone_number = phone_number;
    }

    public Employer(String id, String name, String company, String address, String phone_number, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.address = address;
        this.phone_number = phone_number;
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

    public String getString() {
        return company;
    }

    public void setString(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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
        Employer employer = (Employer) o;
        return getId().equals(employer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
