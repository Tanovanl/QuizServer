package org.example.quiz.service;


import org.example.quiz.Question;
import org.example.quiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Succes";
    }

    public String deleteQuesitons(int id) {
        questionDao.deleteById(id);
        return "Succes, " + id + " has been deleted.";
    }
}
