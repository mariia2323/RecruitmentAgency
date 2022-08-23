package com.example.recruitmentagency.service.item.impls;


import com.example.recruitmentagency.model.*;
import com.example.recruitmentagency.repository.acquirer.AcquirerFakeRepository;
import com.example.recruitmentagency.repository.acquirer.AcquirerMongoRepository;
import com.example.recruitmentagency.repository.item.ItemMongoRepository;
import com.example.recruitmentagency.service.item.interfaces.IAcquirerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AcquirerServiceImpl implements IAcquirerService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Acquirer> acquirers = new ArrayList<>(
            Arrays.asList(
                    new Acquirer("1","name1"," desc1","surname1","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("2","name2"," desc2","surname2","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("3","name3"," desc3","surname3","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now),
                    new Acquirer("4","name4"," desc4","surname4","patronymic1", WorkExperience.LESS_THAN_3_YEARS, WorkType.MANAGEMENT,"other_data","date_of_birth", Education.MASTERS_DEGREE, now, now)
            ));


    @Autowired
    //AcquirerFakeRepository repository;
    AcquirerMongoRepository repository;

   // @PostConstruct
    void init() {
        repository.saveAll(acquirers);
    }

    @Override
    public Acquirer create(Acquirer acquirer) {
        acquirer.setCreatedAt(LocalDateTime.now());
        return repository.save(acquirer);
    }

    @Override
    //public Acquirer update(Acquirer acquirer) {return repository.update(acquirer);}
    public Acquirer update(Acquirer acquirer) {
        acquirer.setUpdateAt(LocalDateTime.now());
        return repository.save(acquirer);
    }

    @Override
    //public Acquirer get(String id) { return repository.findById(id);}
    public Acquirer get(String id) { return repository.findById(id).get();}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Acquirer> getAll() { return repository.findAll();}
}

