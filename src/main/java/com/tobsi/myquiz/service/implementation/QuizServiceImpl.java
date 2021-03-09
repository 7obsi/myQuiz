package com.tobsi.myquiz.service.implementation;

import com.tobsi.myquiz.entity.Quiz;
import com.tobsi.myquiz.repository.QuizRepository;
import com.tobsi.myquiz.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz findById(Long id) {
        return quizRepository.findById(id).get();
    }

    @Override
    public void deleteQuiz(Long id) {
        quizRepository.delete(findById(id));
    }
}
