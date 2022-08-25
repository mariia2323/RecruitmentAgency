package com.example.recruitmentagency.service.item.impls;


import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.repository.item.ItemFakeRepository;
import com.example.recruitmentagency.repository.item.ItemMongoRepository;
import com.example.recruitmentagency.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("1","item1"," desc1", now, now),
                    new Item("2","item2"," desc2", now, now),
                    new Item("3","item3"," desc3", now, now),
                    new Item("4","item4"," desc4", now, now)
            ));

    @Autowired
    //ItemFakeRepository repository;
    ItemMongoRepository repository;

    @PostConstruct
    void init() {
           repository.saveAll(items);
       }

    @Override
    public Item create(Item item) {
        item.setCreatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    //public Item update(Item item) {return repository.update(item);}
    public Item update(Item item) {
        item.setUpdatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    //public Item get(String id) { return repository.findById(id);}
    public Item get(String id) { return repository.findById(id).get();}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() { return repository.findAll();}
}
