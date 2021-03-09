package com.tobsi.myquiz.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String answerText;

    private boolean correct;

    public Answer(String answerText, boolean correct){
        this.answerText = answerText;
        this.correct = correct;
    }

    public Answer() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean isCorrect() {
        return correct;
    }
}
