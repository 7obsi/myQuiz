package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee createEmployee(Employee employee);

    Employee findById(Long id);

    void deleteEmployee(Long id);

}
