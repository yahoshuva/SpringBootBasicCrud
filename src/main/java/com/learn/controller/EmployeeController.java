package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Employee;
import com.learn.repository.EmployeeRepositoryInterface;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeRepositoryInterface employeeRepository;
	
	
	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@PutMapping
	public Employee UpdateEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
		
		@DeleteMapping
		public String deleteEmp(@RequestParam Integer empId) {
			employeeRepository.deleteById(empId);
			return "deleted successfully";
			
		}
			
	@GetMapping("/fetch-all")
	public List<Employee> getAllEmp() {
		return employeeRepository.findAll();
		
	}
	@GetMapping
	public Employee getAllEmp(@RequestParam Integer empId) {
		return employeeRepository.findById(empId).get();
		
		
	}

	
		
}


