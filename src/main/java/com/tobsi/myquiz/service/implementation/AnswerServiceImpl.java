package com.tobsi.myquiz.service.implementation;

import com.tobsi.myquiz.entity.Answer;
import com.tobsi.myquiz.repository.AnswerRepository;
import com.tobsi.myquiz.service.AnswerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer createAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public Answer findById(Long id) {
        return answerRepository.findById(id).get();
    }

    @Override
    public void deleteAnswer(Long id) {
        answerRepository.delete(findById(id));
    }
}
