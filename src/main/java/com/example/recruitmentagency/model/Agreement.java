package com.example.recruitmentagency.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Agreement {
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

    public Agreement() {
    }

    public Agreement(String name, String description, Employer employer, Acquirer acquirer, Offer offer, String commission, String the_date) {
        this.name = name;
        this.description = description;
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
    }

    public Agreement(String id, String name, String description, Employer employer, Acquirer acquirer, Offer offer, String commission, String the_date, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

   // public Agreement(String s, String description1, String acquirer1, Offer offer, String commission1, String the_date1, LocalDateTime now, LocalDateTime now1) {}

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
        Agreement agreement = (Agreement) o;
        return getId().equals(agreement.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", employer=" + employer +
                ", acquirer=" + acquirer +
                ", offer=" + offer +
                ", commission='" + commission + '\'' +
                ", the_date='" + the_date + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

}
