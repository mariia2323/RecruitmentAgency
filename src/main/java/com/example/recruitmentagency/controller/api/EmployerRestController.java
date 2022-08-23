package com.example.recruitmentagency.controller.api;

import com.example.recruitmentagency.model.Employer;
import com.example.recruitmentagency.service.item.impls.EmployerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RequestMapping("/api/v1/employers/")
@RestController

public class EmployerRestController {

    @Autowired
    EmployerServiceImpl service;

    @GetMapping("")
    public List<Employer> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employer showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Employer insertOne(@RequestBody Employer agreement){
        return service.create(agreement);
    }
    @PutMapping()
    public Employer updateOne(@RequestBody Employer agreement){
        return service.update(agreement);
    }


}
