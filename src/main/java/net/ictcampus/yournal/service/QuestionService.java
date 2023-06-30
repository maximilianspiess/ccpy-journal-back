package net.ictcampus.yournal.service;

import net.ictcampus.yournal.model.Question;
import net.ictcampus.yournal.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Component
public class QuestionService {
    @Autowired
    private QuestionRepository repository;

    public List<Question> getAllQuestions() {
        return repository.findAll();
    }

    public Optional<Question> getQuestionById(String id) {
        return repository.findById(id);
    }

    public Question getRandomQuestion() {
        List<Question> questions = repository.findAll();
        Random rand = new Random();
        return questions.get(rand.nextInt(questions.size()));
    }
}
