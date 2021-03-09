package com.tobsi.myquiz.endpoint.dto;

import com.tobsi.myquiz.entity.Question;

import javax.persistence.ManyToOne;

public class AnswerDto {
    private long id;
    private String answerText;
    private boolean correct;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isCorrect() {
        return correct;
    }
}

