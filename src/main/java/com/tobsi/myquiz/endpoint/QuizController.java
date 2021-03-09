package com.tobsi.myquiz.endpoint;

import com.tobsi.myquiz.endpoint.dto.AnswerDto;
import com.tobsi.myquiz.endpoint.dto.QuizDto;
import com.tobsi.myquiz.endpoint.mapper.QuizMapper;
import com.tobsi.myquiz.service.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class QuizController {

    private final QuizService service;
    private final QuizMapper mapper;

    Logger logger = LoggerFactory.getLogger(QuizController.class);


    public QuizController(QuizService service, QuizMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/quizzes")
    List<QuizDto> all() {
        logger.info("GET /api/quizzes");
        return mapper.entityListToDto(service.findAll());
    }

    @PostMapping("/quizzes")
    QuizDto newAnswer(@RequestBody QuizDto newQuiz) {
        logger.info("POST /api/quizzes");
        return mapper.entityToDto(service.createQuiz(mapper.dtoToEntity(newQuiz)));
    }

    // Single item
    @GetMapping("/quizzes/{id}")
    QuizDto one(@PathVariable Long id) {
        logger.info("GET /api/" + id);
        return mapper.entityToDto(service.findById(id));
    }

    /*
    @PutMapping("/answers/{id}")
    EmployeeDto replaceEmployee(@RequestBody EmployeeDto newEmployee, @PathVariable Long id) {
        return mapper.entityToDto(service.replaceEmployee(mapper.dtoToEntity(newEmployee), id));
    }

     */

    @DeleteMapping("/quizzes/{id}")
    void deleteAnswer(@PathVariable Long id) {
        service.deleteQuiz(id);
    }
}
