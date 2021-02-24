package com.tobsi.myquiz.service.implementation;

import com.tobsi.myquiz.entity.Employee;
import com.tobsi.myquiz.repository.EmployeeRepository;
import com.tobsi.myquiz.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.delete(findById(id));
    }
}
