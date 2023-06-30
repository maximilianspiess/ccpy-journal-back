package net.ictcampus.yournal.web;

import lombok.Getter;
import net.ictcampus.yournal.model.Question;
import net.ictcampus.yournal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5555"})
@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/getQuestionById/{id}")
    public Optional<Question> getQuestionById(@PathVariable String id) {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/getRandomQuestion")
    public Question getRandomQuestion() {
        return questionService.getRandomQuestion();
    }


}
