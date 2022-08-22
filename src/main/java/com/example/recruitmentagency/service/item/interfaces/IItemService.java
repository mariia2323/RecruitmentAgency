package com.example.recruitmentagency.service.item.interfaces;


import com.example.recruitmentagency.model.Item;

import java.util.List;

public interface IItemService {
    Item create(Item item);
    Item update(Item item);
    Item get(String id);
    void delete(String id);
    List<Item> getAll();



}
