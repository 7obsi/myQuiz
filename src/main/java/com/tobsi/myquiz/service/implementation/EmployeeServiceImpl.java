package com.tobsi.myquiz.service.implementation;

import com.tobsi.myquiz.entity.Employee;
import com.tobsi.myquiz.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public Employee replaceEmployee(Employee newEmployee, Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
