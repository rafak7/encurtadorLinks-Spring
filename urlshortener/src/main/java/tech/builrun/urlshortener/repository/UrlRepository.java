package tech.builrun.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.builrun.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
