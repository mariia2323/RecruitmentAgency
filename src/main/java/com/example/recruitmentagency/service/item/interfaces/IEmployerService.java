package com.example.recruitmentagency.service.item.interfaces;

import com.example.recruitmentagency.model.Employer;

import java.util.List;


public interface IEmployerService {
    Employer create(Employer employer);
    Employer update(Employer employer);
    Employer get(String id);
    void delete(String id);
    List<Employer> getAll();



}