package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "questions")

public class Question {
    @Id
    private String id;
    private String question_text;
}
