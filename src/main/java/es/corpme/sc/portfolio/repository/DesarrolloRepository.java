package es.corpme.sc.portfolio.repository;

import es.corpme.sc.portfolio.entity.Desarrollo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "desarrollo", path = "desarrollo")
public interface DesarrolloRepository extends MongoRepository<Desarrollo, String> {
}
