package net.ictcampus.yournal.repository;

import net.ictcampus.yournal.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
    //
}
