package com.example.recruitmentagency.service.item.interfaces;

import com.example.recruitmentagency.model.Offer;

import java.util.List;

public interface IOfferService {

    Offer create(Offer offer);
    Offer update(Offer offer);
    Offer get(String id);
    void delete(String id);
    List<Offer> getAll();



}