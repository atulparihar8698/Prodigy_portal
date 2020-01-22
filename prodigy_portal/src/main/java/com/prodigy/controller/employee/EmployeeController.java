package com.prodigy.controller.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodigy.model.designasion.Designasion;
import com.prodigy.model.employee.Employee;
import com.prodigy.service.employee.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		System.out.println("EMployee Object"+employee);
		return new ResponseEntity<Employee>(employeeService.createEmployee(employee),HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") String employeeId) {

		employeeService.deleteEmployee(employeeId);

	}

	@GetMapping("/employeeById/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") String employeeId) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getEmployeeAll() {

		return new ResponseEntity<List<Employee>>(employeeService.getEmployeeAll(),HttpStatus.CREATED);
	}
	@GetMapping("/getMaxEmployeeId")
	public String getMaxEmployeeID() {
		return employeeService.getMaxEmployeeID();
	}
}
