package com.example.recruitmentagency.service.item.impls;


import com.example.recruitmentagency.model.*;
import com.example.recruitmentagency.repository.agreement.AgreementMongoRepository;
import com.example.recruitmentagency.service.item.interfaces.IAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AgreementServiceImpl implements IAgreementService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Agreement> agreements = new ArrayList<>(
            Arrays.asList(
                    new Agreement("1", "name1", "description1",
                            new Employer("1", "name1", "description1", "company1", "address1", "phone1", now, now),
                            new Acquirer("1","name1"," desc1","surname1","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                            new Offer("1", "name1", "description1", now, now, WorkType.MANAGEMENT, "manager", WorkExperience.LESS_THAN_3_YEARS, 8, "summer school"), "commission1", "the_date1", now, now)
            ));
    @Autowired
    //AgreementFakeRepository repository;
    AgreementMongoRepository repository;
    @PostConstruct
    void init() {
        repository.saveAll(agreements);
    }

    @Override
    public Agreement create(Agreement agreement) {
        agreement.setCreatedAt(LocalDateTime.now());
        return repository.save(agreement);
    }

    @Override
    //public Agreement update(Agreement agreement) {return repository.update(agreement);}
    public Agreement update(Agreement agreement) {
        agreement.setUpdatedAt(LocalDateTime.now());
        return repository.save(agreement);
    }

    @Override
    //public Agreement get(String id) { return repository.findById(id);}
    public Agreement get(String id) { return repository.findById(id).get();}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Agreement> getAll() { return repository.findAll();}
}
