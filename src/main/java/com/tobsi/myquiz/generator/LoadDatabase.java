package com.tobsi.myquiz.generator;

import com.tobsi.myquiz.entity.Answer;
import com.tobsi.myquiz.entity.Question;
import com.tobsi.myquiz.entity.Quiz;
import com.tobsi.myquiz.entity.UserRole;
import com.tobsi.myquiz.service.AnswerService;
import com.tobsi.myquiz.service.QuestionService;
import com.tobsi.myquiz.service.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);



    @Bean
    CommandLineRunner initDatabase(AnswerService answerService, QuestionService questionService, QuizService quizService) {

        return args -> {
            Answer a1 = new Answer("Antwort 1", false);
            answerService.createAnswer(a1);
            Answer a2 = new Answer("Antwort 2", true);
            answerService.createAnswer(a2);
            Answer a3 = new Answer("Antwort 3", false);
            answerService.createAnswer(a3);
            Answer a4 = new Answer("Antwort 4", false);
            answerService.createAnswer(a4);
            List<Answer> qa1= new ArrayList<>();
            qa1.add(a1);
            qa1.add(a2);
            qa1.add(a3);
            qa1.add(a4);
            Question q1 = new Question("Frage 1", qa1);
            questionService.createQuestion(q1);

            Answer a5 = new Answer("Antwort 5", false);
            answerService.createAnswer(a5);
            Answer a6 = new Answer("Antwort 6", true);
            answerService.createAnswer(a6);
            Answer a7 = new Answer("Antwort 7", false);
            answerService.createAnswer(a7);
            Answer a8 = new Answer("Antwort 8", false);
            answerService.createAnswer(a8);
            List<Answer> qa2= new ArrayList<>();
            qa2.add(a5);
            qa2.add(a6);
            qa2.add(a7);
            qa2.add(a8);
            Question q2 = new Question("Frage 2", qa2);
            questionService.createQuestion(q2);

            List<Question> questionList = new ArrayList<>();
            questionList.add(q1);
            questionList.add(q2);

            Quiz quiz = new Quiz("Quiz Title", "Quiz Description", questionList);
            quizService.createQuiz(quiz);
        };
    }


}
