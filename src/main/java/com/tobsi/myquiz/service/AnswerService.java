package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> findAll();
    Answer createAnswer(Answer answer);
    Answer findById(Long id);
    void deleteAnswer(Long id);
}
