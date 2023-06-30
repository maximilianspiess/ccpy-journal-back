package net.ictcampus.yournal.repository;

import net.ictcampus.yournal.model.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface OwnerRepository extends MongoRepository<Owner, String> {

    @Query("{'user_name': ?0}")
    Optional<Owner> findByUsername(String user_name);

}
