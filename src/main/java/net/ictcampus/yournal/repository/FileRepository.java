package net.ictcampus.yournal.repository;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.model.FileNameAndId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FileRepository extends MongoRepository<File, String> {
    @Query("{'group_id': ?0}")
    List<File> getFilesByGroupId(String group_id);
}
