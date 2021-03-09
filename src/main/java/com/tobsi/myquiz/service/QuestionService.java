package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.Answer;
import com.tobsi.myquiz.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
    Question createQuestion(Question question);
    Question findById(Long id);
    void deleteQuestion(Long id);
}
