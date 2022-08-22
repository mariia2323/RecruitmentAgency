package com.example.recruitmentagency.controller.api;


import com.example.recruitmentagency.model.*;
import com.example.recruitmentagency.service.item.impls.ItemServiceImpl;
import com.example.recruitmentagency.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/items/")
@RestController
public class ItemRestController {


    @Autowired
    ItemServiceImpl service;

    @GetMapping("")
    public List<Item> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Item showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Item insertOne(@RequestBody Item item){
        return service.create(item);
    }
    @PutMapping()
    public Item updateOne(@RequestBody Item item){
        return service.update(item);
    }


}
