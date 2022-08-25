package com.example.recruitmentagency.forms;

import java.time.LocalDateTime;

public class EmployerForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private String company;
    private String address;
    private String phone_number;

    public EmployerForm() {
    }

    public EmployerForm(String name, String description, String company, String address, String phone_number) {
        this.name = name;
        this.description = description;
        this.company = company;
        this.address = address;
        this.phone_number = phone_number;
    }

    public EmployerForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updateAt, String company, String address, String phone_number) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.company = company;
        this.address = address;
        this.phone_number = phone_number;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
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

    @Override
    public String toString() {
        return "EmployerForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
