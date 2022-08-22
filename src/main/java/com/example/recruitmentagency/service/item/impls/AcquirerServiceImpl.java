package com.example.recruitmentagency.service.item.impls;


import com.example.recruitmentagency.model.Acquirer;
import com.example.recruitmentagency.model.Acquirer;
import com.example.recruitmentagency.repository.AcquirerFakeRepository;
import com.example.recruitmentagency.service.item.interfaces.IAcquirerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AcquirerServiceImpl implements IAcquirerService {


    @Autowired
    AcquirerFakeRepository repository;

    @Override
    public Acquirer create(Acquirer acquirer) {return repository.save(acquirer);}

    @Override
    public Acquirer update(Acquirer acquirer) {
        return repository.update( acquirer);
    }

    @Override
    public Acquirer get(String id) { return repository.findById(id);}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Acquirer> getAll() { return repository.findAll();  }
}

