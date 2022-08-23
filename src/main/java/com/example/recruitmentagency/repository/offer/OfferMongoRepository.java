package com.example.recruitmentagency.repository.offer;

import com.example.recruitmentagency.model.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OfferMongoRepository extends MongoRepository<Offer, String> {

    List<Offer> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
