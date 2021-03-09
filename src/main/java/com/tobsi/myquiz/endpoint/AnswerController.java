package com.tobsi.myquiz.endpoint;

import com.tobsi.myquiz.endpoint.dto.AnswerDto;
import com.tobsi.myquiz.endpoint.dto.EmployeeDto;
import com.tobsi.myquiz.endpoint.mapper.AnswerMapper;
import com.tobsi.myquiz.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class AnswerController {

    private final AnswerService service;
    private final AnswerMapper mapper;

    public AnswerController(AnswerService service, AnswerMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/answers")
    List<AnswerDto> all() {
        return mapper.entityListToDto(service.findAll());
    }

    @PostMapping("/answers")
    AnswerDto newAnswer(@RequestBody AnswerDto newAnswer) {
        return mapper.entityToDto(service.createAnswer(mapper.dtoToEntity(newAnswer)));
    }

    // Single item
    @GetMapping("/answers/{id}")
    AnswerDto one(@PathVariable Long id) {
        return mapper.entityToDto(service.findById(id));
    }

    /*
    @PutMapping("/answers/{id}")
    EmployeeDto replaceEmployee(@RequestBody EmployeeDto newEmployee, @PathVariable Long id) {
        return mapper.entityToDto(service.replaceEmployee(mapper.dtoToEntity(newEmployee), id));
    }

     */

    @DeleteMapping("/answers/{id}")
    void deleteAnswer(@PathVariable Long id) {
        service.deleteAnswer(id);
    }

}
