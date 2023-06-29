package net.ictcampus.yournal.repository;

import net.ictcampus.yournal.model.File;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<File, String> {
    //
}
