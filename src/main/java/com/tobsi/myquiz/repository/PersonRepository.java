package com.tobsi.myquiz.repository;


import com.tobsi.myquiz.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Employee, Long> {

}