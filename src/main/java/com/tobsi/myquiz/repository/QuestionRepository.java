package com.tobsi.myquiz.repository;

import com.tobsi.myquiz.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
