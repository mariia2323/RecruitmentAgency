package com.example.recruitmentagency.forms;

import com.example.recruitmentagency.model.Acquirer;
import com.example.recruitmentagency.model.Employer;
import com.example.recruitmentagency.model.Offer;

import java.time.LocalDateTime;

public class AgreementForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private Employer employer;
    private Acquirer acquirer;
    private Offer offer;
    private String commission;
    private String the_date;

    public AgreementForm() {
    }

    public AgreementForm(String name, String description, Employer employer, Acquirer acquirer, Offer offer, String commission, String the_date) {
        this.name = name;
        this.description = description;
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
    }

    public AgreementForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updateAt, Employer employer, Acquirer acquirer, Offer offer, String commission, String the_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
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

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Acquirer getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(Acquirer acquirer) {
        this.acquirer = acquirer;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getThe_date() {
        return the_date;
    }

    public void setThe_date(String the_date) {
        this.the_date = the_date;
    }

    @Override
    public String toString() {
        return "AgreementForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", employer=" + employer +
                ", acquirer=" + acquirer +
                ", offer=" + offer +
                ", commission='" + commission + '\'' +
                ", the_date='" + the_date + '\'' +
                '}';
    }
}
