package com.example.recruitmentagency.repository.employer;


        import com.example.recruitmentagency.model.*;
        import org.springframework.stereotype.Repository;

        import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.UUID;

@Repository
public class EmployerFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Employer> employers = new ArrayList<>(
            Arrays.asList(
                    new Employer("1", "name1", "description1", "company", "address", "phone_number", now, now),
                    new Employer("2", "name2", "description2", "company", "address", "phone_number", now, now),
                    new Employer("3", "name3", "description3", "company", "address", "phone_number", now, now),
                    new Employer("4", "name4", "description4", "company", "address", "phone_number", now, now)

            ));


    public List<Employer> findAll(){
        return this.employers;
    }

    public Employer findById(String id) {
        return this.employers.stream().filter(employer -> employer.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Employer update(Employer employer) {
        this.deleteById(employer.getId());
        employer.setUpdateAt(LocalDateTime.now());
        this.employers.add(employer);
        return  employer;
    }

    public void deleteById(String id) {
        Employer employer = this.findById(id);
        int index = employers.indexOf(employer);
        this.employers.remove(index);
    }


    public Employer get(String id) {
        return employers.stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .get();
    }

    public Employer save(Employer employer) {
        employer.setId(UUID.randomUUID().toString());
        employer.setCreatedAt(LocalDateTime.now());
        employer.setUpdateAt(LocalDateTime.now());
        this.employers.add(employer);
        return employer;
    }
}