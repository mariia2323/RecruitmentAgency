package com.example.recruitmentagency.service.item.impls;

import com.example.recruitmentagency.model.Employer;
import com.example.recruitmentagency.repository.employer.EmployerMongoRepository;
import com.example.recruitmentagency.service.item.interfaces.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class EmployerServiceImpl implements IEmployerService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Employer> employers = new ArrayList<>(
            Arrays.asList(
                    new Employer("1", "name1", "description1", "company", "address", "phone_number", now, now),
                    new Employer("2", "name2", "description2", "company", "address", "phone_number", now, now),
                    new Employer("3", "name3", "description3", "company", "address", "phone_number", now, now),
                    new Employer("4", "name4", "description4", "company", "address", "phone_number", now, now)

            ));


    @Autowired
    //ItemFakeRepository repository;
    EmployerMongoRepository repository;

   // @PostConstruct
    void init() {
        repository.saveAll(employers);
    }

    @Override
    public Employer create(Employer employer) {
        employer.setCreatedAt(LocalDateTime.now());
        return repository.save(employer);
    }

    @Override
    //public Employer update(Employer employer) {return repository.update(employer);}
    public Employer update(Employer employer) {
        employer.setUpdateAt(LocalDateTime.now());
        return repository.save(employer);
    }

    @Override
    //public Employer get(String id) { return repository.findById(id);}
    public Employer get(String id) { return repository.findById(id).get();}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Employer> getAll() { return repository.findAll();}
}