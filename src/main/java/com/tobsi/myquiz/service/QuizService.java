package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.Question;
import com.tobsi.myquiz.entity.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> findAll();
    Quiz createQuiz(Quiz quiz);
    Quiz findById(Long id);
    void deleteQuiz(Long id);
}
