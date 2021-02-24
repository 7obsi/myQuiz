package com.tobsi.myquiz.service;

import com.tobsi.myquiz.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee createEmployee(Employee employee);

    public Employee findById(Long id);

    public Employee replaceEmployee(Employee newEmployee, Long id);

    public void deleteEmployee(Long id);

}
