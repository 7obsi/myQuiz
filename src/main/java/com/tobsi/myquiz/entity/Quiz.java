package com.tobsi.myquiz.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String quizTitle;
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Question> questions;



    public Quiz(String quizTitle, String description, List<Question> questions){
        this.quizTitle = quizTitle;
        this.description=description;
        this.questions=questions;
    }

    public Quiz() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        this.quizTitle = quizTitle;
    }
}
