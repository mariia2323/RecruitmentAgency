package com.example.recruitmentagency.repository.employer;

import com.example.recruitmentagency.model.Employer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface EmployerMongoRepository extends MongoRepository<Employer, String> {

    List<Employer> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
