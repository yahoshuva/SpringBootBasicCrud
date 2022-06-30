package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.entity.Employee;

@Repository
public interface EmployeeRepositoryInterface  extends JpaRepository<Employee, Integer>{

}
