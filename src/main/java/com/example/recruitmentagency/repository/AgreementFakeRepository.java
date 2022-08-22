package com.example.recruitmentagency.repository;


import com.example.recruitmentagency.model.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class AgreementFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Agreement> agreements = new ArrayList<>(
            Arrays.asList(
                    new Agreement("1", "name1", "description1",
                            new Employer("1", "name1", "description1", "company1", "address1", "phone1", now, now),
                            new Acquirer("1","name1"," desc1","surname1","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                             new Offer("1", "name1", "description1", now, now, WorkType.MANAGEMENT, "manager", WorkExperience.LESS_THAN_3_YEARS, 8, "summer school"), "commission1", "the_date1", now, now)
            ));

    public List<Agreement> findAll(){
        return this.agreements;
    }

    public Agreement findById(String id) {
        return this.agreements.stream().filter(agreement -> agreement.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Agreement update(Agreement agreement) {
        this.deleteById(agreement.getId());
        agreement.setUpdateAt(LocalDateTime.now());
        this.agreements.add(agreement);
        return  agreement;
    }

    public void deleteById(String id) {
        Agreement agreement = this.findById(id);
        int index = agreements.indexOf(agreement);
        this.agreements.remove(index);
    }


    public Agreement get(String id) {
        return agreements.stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .get();
    }

    public Agreement save(Agreement agreement) {
        agreement.setId(UUID.randomUUID().toString());
        agreement.setCreatedAt(LocalDateTime.now());
        agreement.setUpdateAt(LocalDateTime.now());
        this.agreements.add(agreement);
        return agreement;
    }
}