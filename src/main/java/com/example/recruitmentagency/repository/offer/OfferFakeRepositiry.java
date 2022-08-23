package com.example.recruitmentagency.repository.offer;

import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.model.WorkExperience;
import com.example.recruitmentagency.model.WorkType;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class OfferFakeRepositiry {
    private LocalDateTime now = LocalDateTime.now();
    private List<Offer> offers = new ArrayList<>(
            Arrays.asList(
                    new Offer("1", "name1", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("2", "name2", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("3", "name3", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription"),
                    new Offer("4", "name4", "description1", now, now, WorkType.BEATY, "jobTitle", WorkExperience.LESS_THAN_A_YEAR, 3, "projectDescription")
            ));

    public List<Offer> findAll() {
        return this.offers;
    }

    public Offer findById(String id) {
        return this.offers.stream().filter(offer -> offer.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Offer update(Offer offer) {
        this.deleteById(offer.getId());
        offer.setUpdateAt(LocalDateTime.now());
        this.offers.add(offer);
        return offer;
    }

    public void deleteById(String id) {
        Offer offer = this.findById(id);
        int index = offers.indexOf(offer);
        this.offers.remove(index);
    }


    public Offer get(String id) {
        return offers.stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .get();
    }

    public Offer save(Offer offer) {
        offer.setId(UUID.randomUUID().toString());
        offer.setCreatedAt(LocalDateTime.now());
        offer.setUpdateAt(LocalDateTime.now());
        this.offers.add(offer);
        return offer;
    }
}
