package net.ictcampus.yournal.repository;

import net.ictcampus.yournal.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
    //
}
