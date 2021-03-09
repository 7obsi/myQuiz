package com.tobsi.myquiz.repository;

import com.tobsi.myquiz.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
