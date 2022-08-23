package com.example.recruitmentagency.controller.api;


import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.service.item.impls.OfferServiseImpl;
import com.example.recruitmentagency.service.item.impls.OfferServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/offers/")
@RestController
public class OfferRestController {


    @Autowired
    OfferServiseImpl service;

    @GetMapping("")
    public List<Offer> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Offer showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Offer insertOne(@RequestBody Offer offer){
        return service.create(offer);
    }
    @PutMapping()
    public Offer updateOne(@RequestBody Offer offer){
        return service.update(offer);
    }


}