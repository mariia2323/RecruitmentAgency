package com.example.recruitmentagency.controller.api;


import com.example.recruitmentagency.model.*;
import com.example.recruitmentagency.service.item.impls.AgreementServiceImpl;
import com.example.recruitmentagency.service.item.interfaces.IAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/agreements/")
@RestController
public class AgreementRestController {


    @Autowired
    AgreementServiceImpl service;

    @GetMapping("")
    public List<Agreement> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Agreement showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Agreement insertOne(@RequestBody Agreement agreement){
        return service.create(agreement);
    }
    @PutMapping()
    public Agreement updateOne(@RequestBody Agreement agreement){
        return service.update(agreement);
    }


}
