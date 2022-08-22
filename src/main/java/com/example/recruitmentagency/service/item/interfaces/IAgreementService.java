package com.example.recruitmentagency.service.item.interfaces;


import com.example.recruitmentagency.model.Agreement;

import java.util.List;

public interface IAgreementService {
    Agreement create(Agreement agreement);
    Agreement update(Agreement agreement);
    Agreement get(String id);
    void delete(String id);
    List<Agreement> getAll();



}
