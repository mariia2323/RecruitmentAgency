package com.example.recruitmentagency.service.item.interfaces;


import com.example.recruitmentagency.model.Acquirer;

import java.util.List;

public interface IAcquirerService {
    Acquirer create(Acquirer acquirer);
    Acquirer update(Acquirer acquirer);
    Acquirer get(String id);
    void delete(String id);
    List<Acquirer> getAll();



}
