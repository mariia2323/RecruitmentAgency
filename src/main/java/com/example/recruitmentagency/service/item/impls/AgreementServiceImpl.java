package com.example.recruitmentagency.service.item.impls;


import com.example.recruitmentagency.model.Agreement;
import com.example.recruitmentagency.model.Agreement;
import com.example.recruitmentagency.repository.AgreementFakeRepository;
import com.example.recruitmentagency.service.item.interfaces.IAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AgreementServiceImpl implements IAgreementService {


    @Autowired
    AgreementFakeRepository repository;

    @Override
    public Agreement create(Agreement agreement) {return repository.save(agreement);}

    @Override
    public Agreement update(Agreement agreement) {
        return repository.update(agreement);
    }

    @Override
    public Agreement get(String id) { return repository.findById(id);}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Agreement> getAll() { return repository.findAll();  }
}
