package com.example.recruitmentagency.repository.acquirer;

import com.example.recruitmentagency.model.Acquirer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AcquirerMongoRepository extends MongoRepository<Acquirer, String> {

        List<Acquirer> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
        }
