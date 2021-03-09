package com.tobsi.myquiz.endpoint;


import com.tobsi.myquiz.endpoint.dto.AnswerDto;
import com.tobsi.myquiz.endpoint.dto.QuestionDto;
import com.tobsi.myquiz.endpoint.mapper.QuestionMapper;
import com.tobsi.myquiz.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class QuestionController {

    private final QuestionService service;
    private final QuestionMapper mapper;


    public QuestionController(QuestionService service, QuestionMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/questions")
    List<QuestionDto> all() {
        return mapper.entityListToDto(service.findAll());
    }

    @PostMapping("/questions")
    QuestionDto newQuestion(@RequestBody QuestionDto newQuestion) {
        return mapper.entityToDto(service.createQuestion(mapper.dtoToEntity(newQuestion)));
    }

    // Single item
    @GetMapping("/questions/{id}")
    QuestionDto one(@PathVariable Long id) {
        return mapper.entityToDto(service.findById(id));
    }

    /*
    @PutMapping("/answers/{id}")
    EmployeeDto replaceEmployee(@RequestBody EmployeeDto newEmployee, @PathVariable Long id) {
        return mapper.entityToDto(service.replaceEmployee(mapper.dtoToEntity(newEmployee), id));
    }

     */

    @DeleteMapping("/questions/{id}")
    void deleteAnswer(@PathVariable Long id) {
        service.deleteQuestion(id);
    }

}
