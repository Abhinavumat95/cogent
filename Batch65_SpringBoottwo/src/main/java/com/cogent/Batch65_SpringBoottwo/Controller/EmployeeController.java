package com.cogent.Batch65_SpringBoottwo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBoottwo.Entity.Employee;
import com.cogent.Batch65_SpringBoottwo.Repo.EmployeeRepository;

@RestController
public class EmployeeController {

	// HTTP Methods
	// GET
	// POST
	// DELETE
	// PUT

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("addemp")
	public Employee addEmployee(@RequestBody Employee newEmployee) {
		System.out.println("Adding record to database");
		return employeeRepository.save(newEmployee);

	}

	@GetMapping("getemp")
	public List<Employee> getEmployee() {

		return employeeRepository.findAll();

	}

	@DeleteMapping("deleteemp/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeRepository.deleteById(id);
	}

	@PutMapping
	public void updateEmployee() {

	}

}
