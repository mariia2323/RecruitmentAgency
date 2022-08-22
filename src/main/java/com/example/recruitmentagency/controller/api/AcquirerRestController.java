package com.example.recruitmentagency.controller.api;


import com.example.recruitmentagency.model.*;
import com.example.recruitmentagency.service.item.impls.AcquirerServiceImpl;
import com.example.recruitmentagency.service.item.interfaces.IAcquirerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/acquirers/")
@RestController
public class AcquirerRestController {


    @Autowired
    AcquirerServiceImpl service;

    @GetMapping("")
    public List<Acquirer> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Acquirer showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Acquirer insertOne(@RequestBody Acquirer acquirer){
        return service.create(acquirer);
    }
    @PutMapping()
    public Acquirer updateOne(@RequestBody Acquirer acquirer){
        return service.update(acquirer);
    }


}

