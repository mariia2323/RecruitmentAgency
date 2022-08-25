package com.example.recruitmentagency.repository.acquirer;


import com.example.recruitmentagency.model.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class AcquirerFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Acquirer> acquirers = new ArrayList<>(
            Arrays.asList(
                    new Acquirer("1","name1"," desc1","surname1","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("2","name2"," desc2","surname2","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("3","name3"," desc3","surname3","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("4","name4"," desc4","surname4","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now)
            ));

    public List<Acquirer> findAll(){
        return this.acquirers;
    }

    public Acquirer findById(String id) {
        return this.acquirers.stream().filter(acquirer -> acquirer.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Acquirer update(Acquirer acquirer) {
        this.deleteById(acquirer.getId());
        acquirer.setUpdatedAt(LocalDateTime.now());
        this.acquirers.add(acquirer);
        return  acquirer;
    }

    public void deleteById(String id) {
        Acquirer acquirer = this.findById(id);
        int index = acquirers.indexOf(acquirer);
        this.acquirers.remove(index);
    }


    public Acquirer get(String id) {
        return acquirers.stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .get();
    }

    public Acquirer save(Acquirer acquirer) {
        acquirer.setId(UUID.randomUUID().toString());
        acquirer.setCreatedAt(LocalDateTime.now());
        acquirer.setUpdatedAt(LocalDateTime.now());
        this.acquirers.add(acquirer);
        return acquirer;
    }
}
