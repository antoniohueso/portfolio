package es.corpme.sc.portfolio.repository;

import es.corpme.sc.portfolio.entity.Desarrollo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesarrolloRepository extends MongoRepository<Desarrollo, String> {
}
