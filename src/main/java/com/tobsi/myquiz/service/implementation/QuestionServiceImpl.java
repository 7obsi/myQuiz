package com.tobsi.myquiz.service.implementation;

import com.tobsi.myquiz.entity.Question;
import com.tobsi.myquiz.repository.QuestionRepository;
import com.tobsi.myquiz.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.delete(findById(id));
    }
}
