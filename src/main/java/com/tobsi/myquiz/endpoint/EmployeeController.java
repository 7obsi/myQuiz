package com.tobsi.myquiz.endpoint;

import java.util.List;

import com.tobsi.myquiz.endpoint.dto.EmployeeDto;
import com.tobsi.myquiz.endpoint.mapper.EmployeeMapper;
import com.tobsi.myquiz.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
class EmployeeController {

    private final EmployeeService service;
    private final EmployeeMapper mapper;

    EmployeeController(EmployeeService service, EmployeeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<EmployeeDto> all() {
        return mapper.entityListToDto(service.findAll());
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    EmployeeDto newEmployee(@RequestBody EmployeeDto newEmployee) {
        return mapper.entityToDto(service.createEmployee(mapper.dtoToEntity(newEmployee)));
    }

    // Single item
    @GetMapping("/employees/{id}")
    EmployeeDto one(@PathVariable Long id) {
        return mapper.entityToDto(service.findById(id));
    }

    /*
    @PutMapping("/employees/{id}")
    EmployeeDto replaceEmployee(@RequestBody EmployeeDto newEmployee, @PathVariable Long id) {
        return mapper.entityToDto(service.replaceEmployee(mapper.dtoToEntity(newEmployee), id));
    }

     */

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }


}
