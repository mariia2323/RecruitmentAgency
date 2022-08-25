package com.example.recruitmentagency.service.item.impls;

import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.model.WorkExperience;
import com.example.recruitmentagency.model.WorkType;
import com.example.recruitmentagency.repository.offer.OfferMongoRepository;
import com.example.recruitmentagency.service.item.interfaces.IOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class OfferServiseImpl implements IOfferService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Offer> offers = new ArrayList<>(
            Arrays.asList(
                    new Offer("1", "name1", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("2", "name2", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("3", "name3", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("4", "name4", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription")
            ));
    @Autowired
    //OfferFakeRepository repository;
    OfferMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(offers);
    }

    @Override
    public Offer create(Offer offer) {
        offer.setCreatedAt(LocalDateTime.now());
        return repository.save(offer);
    }

    @Override
    //public Offer update(Offer offer) {return repository.update(offer);}
    public Offer update(Offer offer) {
        offer.setUpdatedAt(LocalDateTime.now());
        return repository.save(offer);
    }

    @Override
    //public Offer get(String id) { return repository.findById(id);}
    public Offer get(String id) { return repository.findById(id).get();}

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Offer> getAll() { return repository.findAll();}
}
