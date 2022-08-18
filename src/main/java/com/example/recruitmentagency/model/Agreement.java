package com.example.recruitmentagency.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Agreement {
    private String id;
    private Employer employer;
    private Acquirer acquirer;
    private Offer offer;
    private String commission;
    private String the_date;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Agreement(String id) {
        this.id = id;
    }

    public Agreement(Employer employer, Acquirer acquirer,Offer offer, String commission, String the_date) {
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
    }

    public Agreement(String id, Employer employer, Acquirer acquirer, Offer offer, String commission, String the_date, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.employer = employer;
        this.acquirer = acquirer;
        this.offer = offer;
        this.commission = commission;
        this.the_date = the_date;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
